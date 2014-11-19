package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@ez
public class gv extends WebView
  implements DownloadListener
{
  private final WindowManager mG;
  private final Object mw = new Object();
  private ay qr;
  private final gt qs;
  private final k sX;
  private final gw wH;
  private final a wI;
  private dk wJ;
  private boolean wK;
  private boolean wL;
  private boolean wM;
  private boolean wN;

  private gv(a parama, ay paramay, boolean paramBoolean1, boolean paramBoolean2, k paramk, gt paramgt)
  {
    super(parama);
    this.wI = parama;
    this.qr = paramay;
    this.wK = paramBoolean1;
    this.sX = paramk;
    this.qs = paramgt;
    this.mG = ((WindowManager)getContext().getSystemService("window"));
    setBackgroundColor(0);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setSavePassword(false);
    localWebSettings.setSupportMultipleWindows(true);
    localWebSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    gj.a(parama, paramgt.wD, localWebSettings);
    if (Build.VERSION.SDK_INT >= 17)
    {
      gp.a(getContext(), localWebSettings);
      setDownloadListener(this);
      if (Build.VERSION.SDK_INT < 11)
        break label202;
      this.wH = new gy(this, paramBoolean2);
      label149: setWebViewClient(this.wH);
      if (Build.VERSION.SDK_INT < 14)
        break label219;
      setWebChromeClient(new gz(this));
    }
    while (true)
    {
      dB();
      return;
      if (Build.VERSION.SDK_INT < 11)
        break;
      gn.a(getContext(), localWebSettings);
      break;
      label202: this.wH = new gw(this, paramBoolean2);
      break label149;
      label219: if (Build.VERSION.SDK_INT < 11)
        continue;
      setWebChromeClient(new gx(this));
    }
  }

  public static gv a(Context paramContext, ay paramay, boolean paramBoolean1, boolean paramBoolean2, k paramk, gt paramgt)
  {
    return new gv(new a(paramContext), paramay, paramBoolean1, paramBoolean2, paramk, paramgt);
  }

  // ERROR //
  private void dB()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 43	com/google/android/gms/internal/gv:mw	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 49	com/google/android/gms/internal/gv:wK	Z
    //   11: ifne +13 -> 24
    //   14: aload_0
    //   15: getfield 47	com/google/android/gms/internal/gv:qr	Lcom/google/android/gms/internal/ay;
    //   18: getfield 159	com/google/android/gms/internal/ay:og	Z
    //   21: ifeq +40 -> 61
    //   24: getstatic 109	android/os/Build$VERSION:SDK_INT	I
    //   27: bipush 14
    //   29: if_icmpge +15 -> 44
    //   32: ldc 161
    //   34: invokestatic 167	com/google/android/gms/internal/gs:S	(Ljava/lang/String;)V
    //   37: aload_0
    //   38: invokespecial 170	com/google/android/gms/internal/gv:dC	()V
    //   41: aload_1
    //   42: monitorexit
    //   43: return
    //   44: ldc 172
    //   46: invokestatic 167	com/google/android/gms/internal/gs:S	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: invokespecial 175	com/google/android/gms/internal/gv:dD	()V
    //   53: goto -12 -> 41
    //   56: astore_2
    //   57: aload_1
    //   58: monitorexit
    //   59: aload_2
    //   60: athrow
    //   61: getstatic 109	android/os/Build$VERSION:SDK_INT	I
    //   64: bipush 18
    //   66: if_icmpge +15 -> 81
    //   69: ldc 177
    //   71: invokestatic 167	com/google/android/gms/internal/gs:S	(Ljava/lang/String;)V
    //   74: aload_0
    //   75: invokespecial 170	com/google/android/gms/internal/gv:dC	()V
    //   78: goto -37 -> 41
    //   81: ldc 179
    //   83: invokestatic 167	com/google/android/gms/internal/gs:S	(Ljava/lang/String;)V
    //   86: aload_0
    //   87: invokespecial 175	com/google/android/gms/internal/gv:dD	()V
    //   90: goto -49 -> 41
    //
    // Exception table:
    //   from	to	target	type
    //   7	59	56	finally
    //   61	90	56	finally
  }

  private void dC()
  {
    synchronized (this.mw)
    {
      if ((!this.wL) && (Build.VERSION.SDK_INT >= 11))
        gn.i(this);
      this.wL = true;
      return;
    }
  }

  private void dD()
  {
    synchronized (this.mw)
    {
      if ((this.wL) && (Build.VERSION.SDK_INT >= 11))
        gn.j(this);
      this.wL = false;
      return;
    }
  }

  protected void X(String paramString)
  {
    synchronized (this.mw)
    {
      if (!isDestroyed())
      {
        loadUrl(paramString);
        return;
      }
      gs.W("The webview is destroyed. Ignoring action.");
    }
  }

  public ay Y()
  {
    synchronized (this.mw)
    {
      ay localay = this.qr;
      return localay;
    }
  }

  public void a(Context paramContext, ay paramay)
  {
    synchronized (this.mw)
    {
      this.wI.setBaseContext(paramContext);
      this.wJ = null;
      this.qr = paramay;
      this.wK = false;
      this.wN = false;
      gj.b(this);
      loadUrl("about:blank");
      this.wH.reset();
      setOnTouchListener(null);
      setOnClickListener(null);
      return;
    }
  }

  public void a(ay paramay)
  {
    synchronized (this.mw)
    {
      this.qr = paramay;
      requestLayout();
      return;
    }
  }

  public void a(dk paramdk)
  {
    synchronized (this.mw)
    {
      this.wJ = paramdk;
      return;
    }
  }

  public void a(String paramString, Map<String, ?> paramMap)
  {
    try
    {
      JSONObject localJSONObject = gj.t(paramMap);
      b(paramString, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        gs.W("Could not convert parameters to JSON.");
    }
  }

  public void a(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
      paramJSONObject = new JSONObject();
    String str = paramJSONObject.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("javascript:" + paramString + "(");
    localStringBuilder.append(str);
    localStringBuilder.append(");");
    X(localStringBuilder.toString());
  }

  public void b(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
      paramJSONObject = new JSONObject();
    String str = paramJSONObject.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("javascript:AFMA_ReceiveMessage('");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    localStringBuilder.append(",");
    localStringBuilder.append(str);
    localStringBuilder.append(");");
    gs.V("Dispatching AFMA event: " + localStringBuilder);
    X(localStringBuilder.toString());
  }

  public void bT()
  {
    if (!dv().dF());
    while (true)
    {
      return;
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      Display localDisplay = this.mG.getDefaultDisplay();
      localDisplay.getMetrics(localDisplayMetrics);
      int i = gj.s(getContext());
      float f = 160.0F / localDisplayMetrics.densityDpi;
      int j = Math.round(f * localDisplayMetrics.widthPixels);
      int k = Math.round(f * (localDisplayMetrics.heightPixels - i));
      try
      {
        b("onScreenInfoChanged", new JSONObject().put("width", j).put("height", k).put("density", localDisplayMetrics.density).put("rotation", localDisplay.getRotation()));
      }
      catch (JSONException localJSONException)
      {
        gs.b("Error occured while obtaining screen information.", localJSONException);
      }
    }
  }

  public void ca()
  {
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.qs.wD);
    a("onshow", localHashMap);
  }

  public void cb()
  {
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.qs.wD);
    a("onhide", localHashMap);
  }

  public Context dA()
  {
    return this.wI.dA();
  }

  public void destroy()
  {
    synchronized (this.mw)
    {
      super.destroy();
      this.wM = true;
      return;
    }
  }

  public dk du()
  {
    synchronized (this.mw)
    {
      dk localdk = this.wJ;
      return localdk;
    }
  }

  public gw dv()
  {
    return this.wH;
  }

  public boolean dw()
  {
    return this.wN;
  }

  public k dx()
  {
    return this.sX;
  }

  public gt dy()
  {
    return this.qs;
  }

  public boolean dz()
  {
    synchronized (this.mw)
    {
      boolean bool = this.wK;
      return bool;
    }
  }

  public void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    synchronized (this.mw)
    {
      if (isDestroyed())
      {
        gs.W("The webview is destroyed. Ignoring action.");
        if (paramValueCallback != null)
          paramValueCallback.onReceiveValue(null);
      }
      else
      {
        super.evaluateJavascript(paramString, paramValueCallback);
      }
    }
  }

  public boolean isDestroyed()
  {
    synchronized (this.mw)
    {
      boolean bool = this.wM;
      return bool;
    }
  }

  public void o(boolean paramBoolean)
  {
    synchronized (this.mw)
    {
      if (this.wJ != null)
      {
        this.wJ.o(paramBoolean);
        return;
      }
      this.wN = paramBoolean;
    }
  }

  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.parse(paramString1), paramString4);
      getContext().startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      while (true)
        gs.S("Couldn't find an Activity to view url/mimetype: " + paramString1 + " / " + paramString4);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int n;
    for (int i = 2147483647; ; i = n)
    {
      int m;
      label289: 
      do
      {
        int k;
        synchronized (this.mw)
        {
          if ((isInEditMode()) || (this.wK))
          {
            super.onMeasure(paramInt1, paramInt2);
          }
          else
          {
            int j = View.MeasureSpec.getMode(paramInt1);
            k = View.MeasureSpec.getSize(paramInt1);
            m = View.MeasureSpec.getMode(paramInt2);
            n = View.MeasureSpec.getSize(paramInt2);
            if (j == -2147483648)
              break label289;
            if (j == 1073741824)
            {
              break label289;
              if ((this.qr.widthPixels > i1) || (this.qr.heightPixels > i))
              {
                float f = this.wI.getResources().getDisplayMetrics().density;
                gs.W("Not enough space to show ad. Needs " + (int)(this.qr.widthPixels / f) + "x" + (int)(this.qr.heightPixels / f) + " dp, but only has " + (int)(k / f) + "x" + (int)(n / f) + " dp.");
                if (getVisibility() != 8)
                  setVisibility(4);
                setMeasuredDimension(0, 0);
              }
            }
          }
        }
        int i1 = k;
      }
      while ((m != -2147483648) && (m != 1073741824));
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.sX != null)
      this.sX.a(paramMotionEvent);
    return super.onTouchEvent(paramMotionEvent);
  }

  public void setContext(Context paramContext)
  {
    this.wI.setBaseContext(paramContext);
  }

  public void x(boolean paramBoolean)
  {
    synchronized (this.mw)
    {
      this.wK = paramBoolean;
      dB();
      return;
    }
  }

  @ez
  private static class a extends MutableContextWrapper
  {
    private Context mD;
    private Activity wO;

    public a(Context paramContext)
    {
      super();
      setBaseContext(paramContext);
    }

    public Context dA()
    {
      return this.wO;
    }

    public void setBaseContext(Context paramContext)
    {
      this.mD = paramContext.getApplicationContext();
      if ((paramContext instanceof Activity));
      for (Activity localActivity = (Activity)paramContext; ; localActivity = null)
      {
        this.wO = localActivity;
        super.setBaseContext(this.mD);
        return;
      }
    }

    public void startActivity(Intent paramIntent)
    {
      if (this.wO != null)
        this.wO.startActivity(paramIntent);
      while (true)
      {
        return;
        paramIntent.setFlags(268435456);
        this.mD.startActivity(paramIntent);
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gv
 * JD-Core Version:    0.6.0
 */