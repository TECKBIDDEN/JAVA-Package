package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ez
public final class af
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private static final long mK = TimeUnit.MILLISECONDS.toNanos(100L);
  private WeakReference<ViewTreeObserver> mA;
  private final WeakReference<View> mB;
  private final ad mC;
  private final Context mD;
  private final ah mE;
  private boolean mF;
  private final WindowManager mG;
  private final PowerManager mH;
  private final KeyguardManager mI;
  private ag mJ;
  private boolean mL = false;
  private final BlockingQueue<Runnable> mM = new ArrayBlockingQueue(2);
  private long mN = -9223372036854775808L;
  private boolean mO;
  private boolean mP;
  private BroadcastReceiver mQ;
  private final HashSet<ac> mR = new HashSet();
  private boolean mn = false;
  private final Object mw = new Object();
  private final WeakReference<fz> mz;

  public af(Context paramContext, ay paramay, fz paramfz, View paramView, gt paramgt)
  {
    this(paramay, paramfz, paramgt, paramView, new aj(paramContext, paramgt));
  }

  public af(ay paramay, fz paramfz, gt paramgt, View paramView, ah paramah)
  {
    this.mz = new WeakReference(paramfz);
    this.mB = new WeakReference(paramView);
    this.mA = new WeakReference(null);
    this.mO = true;
    this.mC = new ad(UUID.randomUUID().toString(), paramgt, paramay.of, paramfz.vp);
    this.mE = paramah;
    this.mG = ((WindowManager)paramView.getContext().getSystemService("window"));
    this.mH = ((PowerManager)paramView.getContext().getApplicationContext().getSystemService("power"));
    this.mI = ((KeyguardManager)paramView.getContext().getSystemService("keyguard"));
    this.mD = paramView.getContext().getApplicationContext();
    a(paramah);
    this.mE.a(new af.1(this, paramView));
    b(this.mE);
    try
    {
      JSONObject localJSONObject = e(paramView);
      this.mM.add(new af.2(this, localJSONObject));
      label256: this.mM.add(new af.3(this));
      gs.S("Tracking ad unit: " + this.mC.aC());
      return;
    }
    catch (Throwable localThrowable)
    {
      break label256;
    }
  }

  protected int a(int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    float f = paramDisplayMetrics.density;
    return (int)(paramInt / f);
  }

  protected void a(View paramView, Map<String, String> paramMap)
  {
    e(false);
  }

  public void a(ac paramac)
  {
    this.mR.add(paramac);
  }

  public void a(ag paramag)
  {
    synchronized (this.mw)
    {
      this.mJ = paramag;
      return;
    }
  }

  protected void a(ah paramah)
  {
    paramah.f("https://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.html");
  }

  protected void a(JSONObject paramJSONObject)
  {
    try
    {
      JSONArray localJSONArray = new JSONArray();
      JSONObject localJSONObject = new JSONObject();
      localJSONArray.put(paramJSONObject);
      localJSONObject.put("units", localJSONArray);
      this.mE.a("AFMA_updateActiveView", localJSONObject);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        gs.b("Skipping active view message.", localThrowable);
    }
  }

  protected boolean a(Map<String, String> paramMap)
  {
    int i = 0;
    if (paramMap == null)
      return i;
    String str = (String)paramMap.get("hashCode");
    if ((!TextUtils.isEmpty(str)) && (str.equals(this.mC.aC())));
    for (int j = 1; ; j = 0)
    {
      i = j;
      break;
    }
  }

  protected void aD()
  {
    synchronized (this.mw)
    {
      if (this.mQ == null)
      {
        IntentFilter localIntentFilter = new IntentFilter();
        localIntentFilter.addAction("android.intent.action.SCREEN_ON");
        localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.mQ = new af.4(this);
        this.mD.registerReceiver(this.mQ, localIntentFilter);
      }
    }
  }

  protected void aE()
  {
    synchronized (this.mw)
    {
      if (this.mQ != null)
      {
        this.mD.unregisterReceiver(this.mQ);
        this.mQ = null;
      }
      return;
    }
  }

  public void aF()
  {
    synchronized (this.mw)
    {
      if (this.mO)
        this.mP = true;
      try
      {
        a(aL());
        gs.S("Untracking ad unit: " + this.mC.aC());
        return;
      }
      catch (JSONException localJSONException)
      {
        while (true)
          gs.b("JSON Failure while processing active view data.", localJSONException);
      }
    }
  }

  protected void aG()
  {
    if (this.mJ != null)
      this.mJ.a(this);
  }

  public boolean aH()
  {
    synchronized (this.mw)
    {
      boolean bool = this.mO;
      return bool;
    }
  }

  protected void aI()
  {
    View localView = (View)this.mB.get();
    if (localView == null);
    while (true)
    {
      return;
      ViewTreeObserver localViewTreeObserver1 = (ViewTreeObserver)this.mA.get();
      ViewTreeObserver localViewTreeObserver2 = localView.getViewTreeObserver();
      if (localViewTreeObserver2 == localViewTreeObserver1)
        continue;
      this.mA = new WeakReference(localViewTreeObserver2);
      localViewTreeObserver2.addOnScrollChangedListener(this);
      localViewTreeObserver2.addOnGlobalLayoutListener(this);
    }
  }

  protected void aJ()
  {
    ViewTreeObserver localViewTreeObserver = (ViewTreeObserver)this.mA.get();
    if ((localViewTreeObserver == null) || (!localViewTreeObserver.isAlive()));
    while (true)
    {
      return;
      localViewTreeObserver.removeOnScrollChangedListener(this);
      localViewTreeObserver.removeGlobalOnLayoutListener(this);
    }
  }

  protected JSONObject aK()
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("afmaVersion", this.mC.aA()).put("activeViewJSON", this.mC.aB()).put("timestamp", TimeUnit.NANOSECONDS.toMillis(System.nanoTime())).put("adFormat", this.mC.az()).put("hashCode", this.mC.aC());
    return localJSONObject;
  }

  protected JSONObject aL()
    throws JSONException
  {
    JSONObject localJSONObject = aK();
    localJSONObject.put("doneReasonCode", "u");
    return localJSONObject;
  }

  protected void b(ah paramah)
  {
    paramah.a("/updateActiveView", new af.5(this));
    paramah.a("/untrackActiveViewUnit", new af.6(this));
    paramah.a("/visibilityChanged", new af.7(this));
    paramah.a("/viewabilityChanged", bx.pA);
  }

  protected void d(View paramView)
  {
    ArrayList localArrayList = new ArrayList();
    this.mM.drainTo(localArrayList);
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
      ((Runnable)localIterator.next()).run();
  }

  protected void d(boolean paramBoolean)
  {
    Iterator localIterator = this.mR.iterator();
    while (localIterator.hasNext())
      ((ac)localIterator.next()).a(this, paramBoolean);
  }

  protected void destroy()
  {
    synchronized (this.mw)
    {
      aJ();
      aE();
      this.mO = false;
    }
    try
    {
      this.mE.destroy();
      label29: aG();
      monitorexit;
      return;
      localObject2 = finally;
      monitorexit;
      throw localObject2;
    }
    catch (Throwable localThrowable)
    {
      break label29;
    }
  }

  protected JSONObject e(View paramView)
    throws JSONException
  {
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    paramView.getLocationOnScreen(arrayOfInt1);
    paramView.getLocationInWindow(arrayOfInt2);
    JSONObject localJSONObject = aK();
    DisplayMetrics localDisplayMetrics = paramView.getContext().getResources().getDisplayMetrics();
    Rect localRect1 = new Rect();
    localRect1.left = arrayOfInt1[0];
    localRect1.top = arrayOfInt1[1];
    localRect1.right = (localRect1.left + paramView.getWidth());
    localRect1.bottom = (localRect1.top + paramView.getHeight());
    Rect localRect2 = new Rect();
    localRect2.right = this.mG.getDefaultDisplay().getWidth();
    localRect2.bottom = this.mG.getDefaultDisplay().getHeight();
    Rect localRect3 = new Rect();
    boolean bool1 = paramView.getGlobalVisibleRect(localRect3, null);
    Rect localRect4 = new Rect();
    boolean bool2 = paramView.getLocalVisibleRect(localRect4);
    localJSONObject.put("viewBox", new JSONObject().put("top", a(localRect2.top, localDisplayMetrics)).put("bottom", a(localRect2.bottom, localDisplayMetrics)).put("left", a(localRect2.left, localDisplayMetrics)).put("right", a(localRect2.right, localDisplayMetrics))).put("adBox", new JSONObject().put("top", a(localRect1.top, localDisplayMetrics)).put("bottom", a(localRect1.bottom, localDisplayMetrics)).put("left", a(localRect1.left, localDisplayMetrics)).put("right", a(localRect1.right, localDisplayMetrics))).put("globalVisibleBox", new JSONObject().put("top", a(localRect3.top, localDisplayMetrics)).put("bottom", a(localRect3.bottom, localDisplayMetrics)).put("left", a(localRect3.left, localDisplayMetrics)).put("right", a(localRect3.right, localDisplayMetrics))).put("globalVisibleBoxVisible", bool1).put("localVisibleBox", new JSONObject().put("top", a(localRect4.top, localDisplayMetrics)).put("bottom", a(localRect4.bottom, localDisplayMetrics)).put("left", a(localRect4.left, localDisplayMetrics)).put("right", a(localRect4.right, localDisplayMetrics))).put("localVisibleBoxVisible", bool2).put("screenDensity", localDisplayMetrics.density).put("isVisible", f(paramView)).put("isStopped", this.mL).put("isPaused", this.mn);
    return localJSONObject;
  }

  protected void e(boolean paramBoolean)
  {
    while (true)
    {
      long l;
      fz localfz;
      View localView;
      synchronized (this.mw)
      {
        if ((this.mF) && (!this.mO))
          continue;
        l = System.nanoTime();
        if ((!paramBoolean) || (this.mN + mK <= l))
          continue;
      }
      int i = 1;
    }
  }

  protected boolean f(View paramView)
  {
    if ((paramView.getVisibility() == 0) && (paramView.isShown()) && (this.mH.isScreenOn()) && (!this.mI.inKeyguardRestrictedInputMode()));
    for (int i = 1; ; i = 0)
      return i;
  }

  public void onGlobalLayout()
  {
    e(false);
  }

  public void onScrollChanged()
  {
    e(true);
  }

  public void pause()
  {
    synchronized (this.mw)
    {
      this.mn = true;
      e(false);
      this.mE.pause();
      return;
    }
  }

  public void resume()
  {
    synchronized (this.mw)
    {
      this.mE.resume();
      this.mn = false;
      e(false);
      return;
    }
  }

  public void stop()
  {
    synchronized (this.mw)
    {
      this.mL = true;
      e(false);
      this.mE.pause();
      return;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.af
 * JD-Core Version:    0.6.0
 */