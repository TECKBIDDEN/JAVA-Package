package com.google.android.gms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.n;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Tracker
{
  private final TrackerHandler Bm;
  private ac Bn;
  private final h Bo;
  private final ad Bp;
  private final g Bq;
  private boolean Br;
  private Tracker.a Bs;
  private ai Bt;
  private ExceptionReporter Bu;
  private Context mContext;
  private final Map<String, String> qM = new HashMap();

  Tracker(String paramString, TrackerHandler paramTrackerHandler, Context paramContext)
  {
    this(paramString, paramTrackerHandler, h.dR(), ad.eR(), g.dQ(), new y("tracking"), paramContext);
  }

  Tracker(String paramString, TrackerHandler paramTrackerHandler, h paramh, ad paramad, g paramg, ac paramac, Context paramContext)
  {
    this.Bm = paramTrackerHandler;
    if (paramContext != null)
      this.mContext = paramContext.getApplicationContext();
    if (paramString != null)
      this.qM.put("&tid", paramString);
    this.qM.put("useSecure", "1");
    this.Bo = paramh;
    this.Bp = paramad;
    this.Bq = paramg;
    this.qM.put("&a", Integer.toString(1 + new Random().nextInt(2147483647)));
    this.Bn = paramac;
    this.Bs = new Tracker.a(this);
    enableAdvertisingIdCollection(false);
  }

  void a(ai paramai)
  {
    z.V("Loading Tracker config values.");
    this.Bt = paramai;
    if (this.Bt.fa())
    {
      String str2 = this.Bt.fb();
      set("&tid", str2);
      z.V("[Tracker] trackingId loaded: " + str2);
    }
    if (this.Bt.fc())
    {
      String str1 = Double.toString(this.Bt.fd());
      set("&sf", str1);
      z.V("[Tracker] sample frequency loaded: " + str1);
    }
    if (this.Bt.fe())
    {
      setSessionTimeout(this.Bt.getSessionTimeout());
      z.V("[Tracker] session timeout loaded: " + eU());
    }
    if (this.Bt.ff())
    {
      enableAutoActivityTracking(this.Bt.fg());
      z.V("[Tracker] auto activity tracking loaded: " + eV());
    }
    if (this.Bt.fh())
    {
      if (this.Bt.fi())
      {
        set("&aip", "1");
        z.V("[Tracker] anonymize ip loaded: true");
      }
      z.V("[Tracker] anonymize ip loaded: false");
    }
    enableExceptionReporting(this.Bt.fj());
  }

  long eU()
  {
    return this.Bs.eU();
  }

  boolean eV()
  {
    return this.Bs.eV();
  }

  public void enableAdvertisingIdCollection(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.qM.put("&ate", null);
      this.qM.put("&adid", null);
    }
    while (true)
    {
      return;
      if (this.qM.containsKey("&ate"))
        this.qM.remove("&ate");
      if (!this.qM.containsKey("&adid"))
        continue;
      this.qM.remove("&adid");
    }
  }

  public void enableAutoActivityTracking(boolean paramBoolean)
  {
    this.Bs.enableAutoActivityTracking(paramBoolean);
  }

  public void enableExceptionReporting(boolean paramBoolean)
  {
    if (this.Br == paramBoolean);
    while (true)
    {
      return;
      this.Br = paramBoolean;
      if (!paramBoolean)
        break;
      this.Bu = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), this.mContext);
      Thread.setDefaultUncaughtExceptionHandler(this.Bu);
      z.V("Uncaught exceptions will be reported to Google Analytics.");
    }
    if (this.Bu != null)
      Thread.setDefaultUncaughtExceptionHandler(this.Bu.dZ());
    while (true)
    {
      z.V("Uncaught exceptions will not be reported to Google Analytics.");
      break;
      Thread.setDefaultUncaughtExceptionHandler(null);
    }
  }

  public String get(String paramString)
  {
    String str = null;
    t.eq().a(t.a.zo);
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return str;
      if (this.qM.containsKey(paramString))
      {
        str = (String)this.qM.get(paramString);
        continue;
      }
      if (paramString.equals("&ul"))
      {
        str = aj.a(Locale.getDefault());
        continue;
      }
      if ((this.Bo != null) && (this.Bo.ac(paramString)))
      {
        str = this.Bo.getValue(paramString);
        continue;
      }
      if ((this.Bp != null) && (this.Bp.ac(paramString)))
      {
        str = this.Bp.getValue(paramString);
        continue;
      }
      if ((this.Bq == null) || (!this.Bq.ac(paramString)))
        continue;
      str = this.Bq.getValue(paramString);
    }
  }

  public void send(Map<String, String> paramMap)
  {
    t.eq().a(t.a.zq);
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(this.qM);
    if (paramMap != null)
      localHashMap.putAll(paramMap);
    if (TextUtils.isEmpty((CharSequence)localHashMap.get("&tid")))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = "&tid";
      z.W(String.format("Missing tracking id (%s) parameter.", arrayOfObject2));
    }
    String str1 = (String)localHashMap.get("&t");
    if (TextUtils.isEmpty(str1))
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = "&t";
      z.W(String.format("Missing hit type (%s) parameter.", arrayOfObject1));
      str1 = "";
    }
    if (this.Bs.eW())
      localHashMap.put("&sc", "start");
    String str2 = str1.toLowerCase();
    if (("screenview".equals(str2)) || ("pageview".equals(str2)) || ("appview".equals(str2)) || (TextUtils.isEmpty(str2)))
    {
      int i = 1 + Integer.parseInt((String)this.qM.get("&a"));
      if (i >= 2147483647)
        i = 1;
      this.qM.put("&a", Integer.toString(i));
    }
    if ((!str2.equals("transaction")) && (!str2.equals("item")) && (!this.Bn.eK()))
      z.W("Too many hits sent too quickly, rate limiting invoked.");
    while (true)
    {
      return;
      this.Bm.u(localHashMap);
    }
  }

  public void set(String paramString1, String paramString2)
  {
    n.b(paramString1, "Key should be non-null");
    t.eq().a(t.a.zp);
    this.qM.put(paramString1, paramString2);
  }

  public void setAnonymizeIp(boolean paramBoolean)
  {
    set("&aip", aj.C(paramBoolean));
  }

  public void setAppId(String paramString)
  {
    set("&aid", paramString);
  }

  public void setAppInstallerId(String paramString)
  {
    set("&aiid", paramString);
  }

  public void setAppName(String paramString)
  {
    set("&an", paramString);
  }

  public void setAppVersion(String paramString)
  {
    set("&av", paramString);
  }

  public void setClientId(String paramString)
  {
    set("&cid", paramString);
  }

  public void setEncoding(String paramString)
  {
    set("&de", paramString);
  }

  public void setHostname(String paramString)
  {
    set("&dh", paramString);
  }

  public void setLanguage(String paramString)
  {
    set("&ul", paramString);
  }

  public void setLocation(String paramString)
  {
    set("&dl", paramString);
  }

  public void setPage(String paramString)
  {
    set("&dp", paramString);
  }

  public void setReferrer(String paramString)
  {
    set("&dr", paramString);
  }

  public void setSampleRate(double paramDouble)
  {
    set("&sf", Double.toHexString(paramDouble));
  }

  public void setScreenColors(String paramString)
  {
    set("&sd", paramString);
  }

  public void setScreenName(String paramString)
  {
    set("&cd", paramString);
  }

  public void setScreenResolution(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) && (paramInt2 < 0))
      z.W("Invalid width or height. The values should be non-negative.");
    while (true)
    {
      return;
      set("&sr", paramInt1 + "x" + paramInt2);
    }
  }

  public void setSessionTimeout(long paramLong)
  {
    this.Bs.setSessionTimeout(1000L * paramLong);
  }

  public void setTitle(String paramString)
  {
    set("&dt", paramString);
  }

  public void setUseSecure(boolean paramBoolean)
  {
    set("useSecure", aj.C(paramBoolean));
  }

  public void setViewportSize(String paramString)
  {
    set("&vp", paramString);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.Tracker
 * JD-Core Version:    0.6.0
 */