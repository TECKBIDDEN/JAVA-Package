package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ez
public class an extends Thread
{
  private boolean mStarted = false;
  private final Object mw;
  private final int nf;
  private final int nh;
  private boolean ns = false;
  private boolean nt = false;
  private final am nu;
  private final al nv;
  private final ey nw;
  private final int nx;
  private final int ny;
  private final int nz;

  public an(am paramam, al paramal, Bundle paramBundle, ey paramey)
  {
    this.nu = paramam;
    this.nv = paramal;
    this.nw = paramey;
    this.mw = new Object();
    this.nf = paramBundle.getInt(bn.pe.getKey());
    this.ny = paramBundle.getInt(bn.pf.getKey());
    this.nh = paramBundle.getInt(bn.pg.getKey());
    this.nz = paramBundle.getInt(bn.ph.getKey());
    this.nx = paramBundle.getInt(bn.pi.getKey(), 10);
    setName("ContentFetchTask");
  }

  private void a(Activity paramActivity)
  {
    if (paramActivity == null);
    while (true)
    {
      return;
      View localView = null;
      if ((paramActivity.getWindow() != null) && (paramActivity.getWindow().getDecorView() != null))
        localView = paramActivity.getWindow().getDecorView().findViewById(16908290);
      if (localView == null)
        continue;
      g(localView);
    }
  }

  private boolean a(WebView paramWebView, ak paramak)
  {
    if (!kc.hI());
    for (int i = 0; ; i = 1)
    {
      return i;
      paramak.aR();
      paramWebView.post(new Runnable(paramak, paramWebView)
      {
        ValueCallback<String> nC = new an.2.1(this);

        public void run()
        {
          if (this.nE.getSettings().getJavaScriptEnabled())
            this.nE.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.nC);
        }
      });
    }
  }

  private boolean aW()
  {
    int i;
    try
    {
      Context localContext = this.nu.getContext();
      if (localContext == null)
      {
        i = 0;
      }
      else
      {
        ActivityManager localActivityManager = (ActivityManager)localContext.getSystemService("activity");
        KeyguardManager localKeyguardManager = (KeyguardManager)localContext.getSystemService("keyguard");
        PowerManager localPowerManager = (PowerManager)localContext.getSystemService("power");
        if ((localActivityManager == null) || (localKeyguardManager == null) || (localPowerManager == null))
          break label172;
        List localList = localActivityManager.getRunningAppProcesses();
        if (localList == null)
        {
          i = 0;
        }
        else
        {
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext())
          {
            ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
            if (Process.myPid() != localRunningAppProcessInfo.pid)
              continue;
            if ((localRunningAppProcessInfo.importance != 100) || (localKeyguardManager.inKeyguardRestrictedInputMode()))
              break;
            boolean bool = localPowerManager.isScreenOn();
            if (!bool)
              break;
            i = 1;
            break label170;
          }
          i = 0;
        }
      }
    }
    catch (Throwable localThrowable)
    {
      i = 0;
    }
    while (true)
    {
      label170: return i;
      label172: i = 0;
    }
  }

  a a(View paramView, ak paramak)
  {
    int i = 0;
    a locala1;
    if (paramView == null)
      locala1 = new a(0, 0);
    while (true)
    {
      return locala1;
      if (((paramView instanceof TextView)) && (!(paramView instanceof EditText)))
      {
        paramak.i(((TextView)paramView).getText().toString());
        locala1 = new a(1, 0);
        continue;
      }
      if (((paramView instanceof WebView)) && (!(paramView instanceof gv)))
      {
        paramak.aR();
        if (a((WebView)paramView, paramak))
        {
          locala1 = new a(0, 1);
          continue;
        }
        locala1 = new a(0, 0);
        continue;
      }
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int j = 0;
        int k = 0;
        while (i < localViewGroup.getChildCount())
        {
          a locala2 = a(localViewGroup.getChildAt(i), paramak);
          k += locala2.nG;
          j += locala2.nH;
          i++;
        }
        locala1 = new a(k, j);
        continue;
      }
      locala1 = new a(0, 0);
    }
  }

  void a(ak paramak, WebView paramWebView, String paramString)
  {
    paramak.aQ();
    try
    {
      String str;
      if (!TextUtils.isEmpty(paramString))
      {
        str = new JSONObject(paramString).optString("text");
        if (TextUtils.isEmpty(paramWebView.getTitle()))
          break label88;
        paramak.h(paramWebView.getTitle() + "\n" + str);
      }
      while (paramak.aN())
      {
        this.nv.b(paramak);
        break;
        label88: paramak.h(str);
      }
    }
    catch (JSONException localJSONException)
    {
      gs.S("Json string may be malformed.");
    }
    catch (Throwable localThrowable)
    {
      gs.a("Failed to get webview content.", localThrowable);
      this.nw.b(localThrowable);
    }
  }

  public void aV()
  {
    synchronized (this.mw)
    {
      if (this.mStarted)
      {
        gs.S("Content hash thread already started, quiting...");
      }
      else
      {
        this.mStarted = true;
        start();
      }
    }
  }

  public ak aX()
  {
    return this.nv.aU();
  }

  public void aY()
  {
    synchronized (this.mw)
    {
      this.ns = true;
      gs.S("ContentFetchThread: paused, mPause = " + this.ns);
      return;
    }
  }

  public boolean aZ()
  {
    return this.ns;
  }

  boolean g(View paramView)
  {
    if (paramView == null);
    for (int i = 0; ; i = 1)
    {
      return i;
      paramView.post(new Runnable(paramView)
      {
        public void run()
        {
          an.this.h(this.nA);
        }
      });
    }
  }

  void h(View paramView)
  {
    try
    {
      ak localak = new ak(this.nf, this.ny, this.nh, this.nz);
      a locala = a(paramView, localak);
      localak.aS();
      if (((locala.nG != 0) || (locala.nH != 0)) && ((locala.nH != 0) || (localak.aT() != 0)) && ((locala.nH != 0) || (!this.nv.a(localak))))
        this.nv.c(localak);
    }
    catch (Exception localException)
    {
      gs.b("Exception in fetchContentOnUIThread", localException);
      this.nw.b(localException);
    }
  }

  public void run()
  {
    while (!this.nt)
      try
      {
        if (aW())
        {
          localActivity = this.nu.getActivity();
          if (localActivity == null)
            gs.S("ContentFetchThread: no activity");
        }
      }
      catch (Throwable localThrowable)
      {
        Activity localActivity;
        gs.b("Error in ContentFetchTask", localThrowable);
        this.nw.b(localThrowable);
        synchronized (this.mw)
        {
          while (true)
          {
            boolean bool = this.ns;
            if (!bool)
              break;
            try
            {
              gs.S("ContentFetchTask: waiting");
              this.mw.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
            }
            continue;
            a(localActivity);
            while (true)
            {
              Thread.sleep(1000 * this.nx);
              break;
              gs.S("ContentFetchTask: sleeping");
              aY();
            }
          }
        }
      }
  }

  public void wakeup()
  {
    synchronized (this.mw)
    {
      this.ns = false;
      this.mw.notifyAll();
      gs.S("ContentFetchThread: wakeup");
      return;
    }
  }

  @ez
  class a
  {
    final int nG;
    final int nH;

    a(int paramInt1, int arg3)
    {
      this.nG = paramInt1;
      int i;
      this.nH = i;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.an
 * JD-Core Version:    0.6.0
 */