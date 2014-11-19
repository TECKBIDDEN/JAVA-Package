package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ez
public class fo
  implements Callable<fz>
{
  private final Context mContext;
  private final Object mw = new Object();
  private final u pw;
  private final go tX;
  private final ai tY;
  private boolean tZ;
  private int tc;
  private final fz.a tn;
  private List<String> ua;

  public fo(Context paramContext, u paramu, ai paramai, go paramgo, fz.a parama)
  {
    this.mContext = paramContext;
    this.pw = paramu;
    this.tX = paramgo;
    this.tY = paramai;
    this.tn = parama;
    this.tZ = false;
    this.tc = -2;
    this.ua = null;
  }

  private bq.a a(ah paramah, a parama, JSONObject paramJSONObject)
    throws ExecutionException, InterruptedException, JSONException
  {
    Object localObject = null;
    if (cI());
    while (true)
    {
      return localObject;
      String[] arrayOfString = b(paramJSONObject.getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
      if (arrayOfString == null);
      bq.a locala;
      for (List localList = null; ; localList = Arrays.asList(arrayOfString))
      {
        this.ua = localList;
        locala = parama.a(this, paramJSONObject);
        if (locala != null)
          break label74;
        gs.T("Failed to retrieve ad assets.");
        break;
      }
      label74: locala.a(new bq(this.pw, paramah, paramJSONObject));
      localObject = locala;
    }
  }

  private fz a(bq.a parama)
  {
    while (true)
    {
      synchronized (this.mw)
      {
        int i = this.tc;
        if ((parama != null) || (this.tc != -2))
          continue;
        i = 0;
        if (i != -2)
        {
          locala = null;
          return new fz(this.tn.vv.tx, null, this.tn.vw.qf, i, this.tn.vw.qg, this.ua, this.tn.vw.orientation, this.tn.vw.qj, this.tn.vv.tA, false, null, null, null, null, null, 0L, this.tn.lH, this.tn.vw.tH, this.tn.vs, this.tn.vt, this.tn.vw.tN, this.tn.vp, locala);
        }
      }
      bq.a locala = parama;
    }
  }

  private String[] b(JSONObject paramJSONObject, String paramString)
    throws JSONException
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    if (localJSONArray == null);
    String[] arrayOfString;
    for (Object localObject = null; ; localObject = arrayOfString)
    {
      return localObject;
      arrayOfString = new String[localJSONArray.length()];
      for (int i = 0; i < localJSONArray.length(); i++)
        arrayOfString[i] = localJSONArray.getString(i);
    }
  }

  private JSONObject c(ah paramah)
    throws TimeoutException, JSONException
  {
    if (cI());
    gk localgk;
    for (JSONObject localJSONObject = null; ; localJSONObject = (JSONObject)localgk.get())
    {
      return localJSONObject;
      localgk = new gk();
      paramah.a("/nativeAdPreProcess", new fo.1(this, paramah, localgk));
      paramah.a("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(this.tn.vw.tG));
    }
  }

  private ah cH()
    throws CancellationException, ExecutionException, InterruptedException, TimeoutException
  {
    ah localah;
    if (cI())
      localah = null;
    while (true)
    {
      return localah;
      localah = (ah)this.tY.a(this.mContext, this.tn.vv.lD, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html").get();
      localah.a(this.pw, this.pw, this.pw, this.pw, false, this.pw);
    }
  }

  public Future<Drawable> a(JSONObject paramJSONObject, String paramString, boolean paramBoolean)
    throws JSONException
  {
    JSONObject localJSONObject;
    String str;
    if (paramBoolean)
    {
      localJSONObject = paramJSONObject.getJSONObject(paramString);
      if (localJSONObject == null)
        localJSONObject = new JSONObject();
      if (!paramBoolean)
        break label75;
      str = localJSONObject.getString("url");
      label38: if (!TextUtils.isEmpty(str))
        break label87;
      a(0, paramBoolean);
    }
    label75: label87: for (Object localObject = new gl(null); ; localObject = this.tX.a(str, new fo.2(this, paramBoolean)))
    {
      return localObject;
      localJSONObject = paramJSONObject.optJSONObject(paramString);
      break;
      str = localJSONObject.optString("url");
      break label38;
    }
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
      s(paramInt);
  }

  protected a b(JSONObject paramJSONObject)
    throws JSONException
  {
    Object localObject = null;
    if (cI());
    while (true)
    {
      return localObject;
      String str = paramJSONObject.getString("template_id");
      if ("2".equals(str))
      {
        localObject = new fp();
        continue;
      }
      if ("1".equals(str))
      {
        localObject = new fq();
        continue;
      }
      s(0);
    }
  }

  public fz cG()
  {
    try
    {
      ah localah = cH();
      JSONObject localJSONObject = c(localah);
      fz localfz2 = a(a(localah, b(localJSONObject), localJSONObject));
      localfz1 = localfz2;
      return localfz1;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        gs.d("Malformed native JSON response.", localJSONException);
        if (!this.tZ)
          s(0);
        fz localfz1 = a(null);
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      while (true)
        gs.d("Timeout when loading native ad.", localTimeoutException);
    }
    catch (InterruptedException localInterruptedException)
    {
      break label49;
    }
    catch (ExecutionException localExecutionException)
    {
      break label49;
    }
    catch (CancellationException localCancellationException)
    {
      label49: break label49;
    }
  }

  public boolean cI()
  {
    synchronized (this.mw)
    {
      boolean bool = this.tZ;
      return bool;
    }
  }

  public void s(int paramInt)
  {
    synchronized (this.mw)
    {
      this.tZ = true;
      this.tc = paramInt;
      return;
    }
  }

  public static abstract interface a<T extends bq.a>
  {
    public abstract T a(fo paramfo, JSONObject paramJSONObject)
      throws JSONException, InterruptedException, ExecutionException;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fo
 * JD-Core Version:    0.6.0
 */