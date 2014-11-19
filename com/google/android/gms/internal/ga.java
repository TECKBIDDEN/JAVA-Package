package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.LinkedList;

@ez
public class ga
{
  private final Object mw = new Object();
  private boolean uC = false;
  private final String vA;
  private long vB = -1L;
  private long vC = -1L;
  private long vD = -1L;
  private long vE = 0L;
  private long vF = -1L;
  private long vG = -1L;
  private final gb vx;
  private final LinkedList<a> vy;
  private final String vz;

  public ga(gb paramgb, String paramString1, String paramString2)
  {
    this.vx = paramgb;
    this.vz = paramString1;
    this.vA = paramString2;
    this.vy = new LinkedList();
  }

  public ga(String paramString1, String paramString2)
  {
    this(gb.cV(), paramString1, paramString2);
  }

  public void cP()
  {
    synchronized (this.mw)
    {
      if ((this.vG != -1L) && (this.vC == -1L))
      {
        this.vC = SystemClock.elapsedRealtime();
        this.vx.a(this);
      }
      gb.cZ().cP();
      return;
    }
  }

  public void cQ()
  {
    synchronized (this.mw)
    {
      if (this.vG != -1L)
      {
        a locala = new a();
        locala.cU();
        this.vy.add(locala);
        this.vE = (1L + this.vE);
        gb.cZ().cQ();
        this.vx.a(this);
      }
      return;
    }
  }

  public void cR()
  {
    synchronized (this.mw)
    {
      if ((this.vG != -1L) && (!this.vy.isEmpty()))
      {
        a locala = (a)this.vy.getLast();
        if (locala.cS() == -1L)
        {
          locala.cT();
          this.vx.a(this);
        }
      }
      return;
    }
  }

  public void e(av paramav)
  {
    synchronized (this.mw)
    {
      this.vF = SystemClock.elapsedRealtime();
      gb.cZ().b(paramav, this.vF);
      return;
    }
  }

  public void j(long paramLong)
  {
    synchronized (this.mw)
    {
      this.vG = paramLong;
      if (this.vG != -1L)
        this.vx.a(this);
      return;
    }
  }

  public void k(long paramLong)
  {
    synchronized (this.mw)
    {
      if (this.vG != -1L)
      {
        this.vB = paramLong;
        this.vx.a(this);
      }
      return;
    }
  }

  public void t(boolean paramBoolean)
  {
    synchronized (this.mw)
    {
      if (this.vG != -1L)
      {
        this.vD = SystemClock.elapsedRealtime();
        if (!paramBoolean)
        {
          this.vC = this.vD;
          this.vx.a(this);
        }
      }
      return;
    }
  }

  // ERROR //
  public Bundle toBundle()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/google/android/gms/internal/ga:mw	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: new 129	android/os/Bundle
    //   10: dup
    //   11: invokespecial 130	android/os/Bundle:<init>	()V
    //   14: astore_2
    //   15: aload_2
    //   16: ldc 132
    //   18: aload_0
    //   19: getfield 54	com/google/android/gms/internal/ga:vz	Ljava/lang/String;
    //   22: invokevirtual 135	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: aload_2
    //   26: ldc 137
    //   28: aload_0
    //   29: getfield 56	com/google/android/gms/internal/ga:vA	Ljava/lang/String;
    //   32: invokevirtual 135	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   35: aload_2
    //   36: ldc 139
    //   38: aload_0
    //   39: getfield 42	com/google/android/gms/internal/ga:uC	Z
    //   42: invokevirtual 143	android/os/Bundle:putBoolean	(Ljava/lang/String;Z)V
    //   45: aload_2
    //   46: ldc 145
    //   48: aload_0
    //   49: getfield 48	com/google/android/gms/internal/ga:vF	J
    //   52: invokevirtual 149	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   55: aload_2
    //   56: ldc 151
    //   58: aload_0
    //   59: getfield 50	com/google/android/gms/internal/ga:vG	J
    //   62: invokevirtual 149	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   65: aload_2
    //   66: ldc 153
    //   68: aload_0
    //   69: getfield 40	com/google/android/gms/internal/ga:vC	J
    //   72: invokevirtual 149	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   75: aload_2
    //   76: ldc 155
    //   78: aload_0
    //   79: getfield 44	com/google/android/gms/internal/ga:vD	J
    //   82: invokevirtual 149	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   85: aload_2
    //   86: ldc 157
    //   88: aload_0
    //   89: getfield 46	com/google/android/gms/internal/ga:vE	J
    //   92: invokevirtual 149	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   95: aload_2
    //   96: ldc 159
    //   98: aload_0
    //   99: getfield 38	com/google/android/gms/internal/ga:vB	J
    //   102: invokevirtual 149	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   105: new 161	java/util/ArrayList
    //   108: dup
    //   109: invokespecial 162	java/util/ArrayList:<init>	()V
    //   112: astore 4
    //   114: aload_0
    //   115: getfield 61	com/google/android/gms/internal/ga:vy	Ljava/util/LinkedList;
    //   118: invokevirtual 166	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   121: astore 5
    //   123: aload 5
    //   125: invokeinterface 171 1 0
    //   130: ifeq +30 -> 160
    //   133: aload 4
    //   135: aload 5
    //   137: invokeinterface 174 1 0
    //   142: checkcast 7	com/google/android/gms/internal/ga$a
    //   145: invokevirtual 176	com/google/android/gms/internal/ga$a:toBundle	()Landroid/os/Bundle;
    //   148: invokevirtual 177	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   151: pop
    //   152: goto -29 -> 123
    //   155: astore_3
    //   156: aload_1
    //   157: monitorexit
    //   158: aload_3
    //   159: athrow
    //   160: aload_2
    //   161: ldc 179
    //   163: aload 4
    //   165: invokevirtual 183	android/os/Bundle:putParcelableArrayList	(Ljava/lang/String;Ljava/util/ArrayList;)V
    //   168: aload_1
    //   169: monitorexit
    //   170: aload_2
    //   171: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   7	158	155	finally
    //   160	170	155	finally
  }

  public void u(boolean paramBoolean)
  {
    synchronized (this.mw)
    {
      if (this.vG != -1L)
      {
        this.uC = paramBoolean;
        this.vx.a(this);
      }
      return;
    }
  }

  @ez
  private static final class a
  {
    private long vH = -1L;
    private long vI = -1L;

    public long cS()
    {
      return this.vI;
    }

    public void cT()
    {
      this.vI = SystemClock.elapsedRealtime();
    }

    public void cU()
    {
      this.vH = SystemClock.elapsedRealtime();
    }

    public Bundle toBundle()
    {
      Bundle localBundle = new Bundle();
      localBundle.putLong("topen", this.vH);
      localBundle.putLong("tclose", this.vI);
      return localBundle;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ga
 * JD-Core Version:    0.6.0
 */