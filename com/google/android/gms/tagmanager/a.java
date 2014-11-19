package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.jw;

class a
{
  private static a anF;
  private static Object xz = new Object();
  private volatile long anB = 900000L;
  private volatile long anC = 30000L;
  private volatile long anD;
  private a anE = new a.1(this);
  private volatile boolean mClosed = false;
  private final Context mContext;
  private final Thread wf;
  private volatile AdvertisingIdClient.Info xB;
  private final ju yD;

  private a(Context paramContext)
  {
    this(paramContext, null, jw.hA());
  }

  a(Context paramContext, a parama, ju paramju)
  {
    this.yD = paramju;
    if (paramContext != null);
    for (this.mContext = paramContext.getApplicationContext(); ; this.mContext = paramContext)
    {
      if (parama != null)
        this.anE = parama;
      this.wf = new Thread(new Runnable()
      {
        public void run()
        {
          a.b(a.this);
        }
      });
      return;
    }
  }

  static a V(Context paramContext)
  {
    if (anF == null);
    synchronized (xz)
    {
      if (anF == null)
      {
        anF = new a(paramContext);
        anF.start();
      }
      return anF;
    }
  }

  private void nI()
  {
    Process.setThreadPriority(10);
    while (!this.mClosed)
      try
      {
        this.xB = this.anE.nK();
        Thread.sleep(this.anB);
      }
      catch (InterruptedException localInterruptedException)
      {
        bh.U("sleep interrupted in AdvertiserDataPoller thread; continuing");
      }
  }

  private void nJ()
  {
    if (this.yD.currentTimeMillis() - this.anD < this.anC);
    while (true)
    {
      return;
      interrupt();
      this.anD = this.yD.currentTimeMillis();
    }
  }

  void interrupt()
  {
    this.wf.interrupt();
  }

  public boolean isLimitAdTrackingEnabled()
  {
    nJ();
    if (this.xB == null);
    for (boolean bool = true; ; bool = this.xB.isLimitAdTrackingEnabled())
      return bool;
  }

  public String nH()
  {
    nJ();
    if (this.xB == null);
    for (String str = null; ; str = this.xB.getId())
      return str;
  }

  void start()
  {
    this.wf.start();
  }

  public static abstract interface a
  {
    public abstract AdvertisingIdClient.Info nK();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.a
 * JD-Core Version:    0.6.0
 */