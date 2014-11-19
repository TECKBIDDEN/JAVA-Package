package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;

@ez
public class gc
{
  private final Object mw = new Object();
  private final String vL;
  private int vX = 0;
  private long vY = -1L;
  private long vZ = -1L;
  private int wa = 0;
  private int wb = -1;

  public gc(String paramString)
  {
    this.vL = paramString;
  }

  public static boolean m(Context paramContext)
  {
    int i = 0;
    int j = paramContext.getResources().getIdentifier("Theme.Translucent", "style", "android");
    if (j == 0)
      gs.U("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
    while (true)
    {
      return i;
      ComponentName localComponentName = new ComponentName(paramContext.getPackageName(), "com.google.android.gms.ads.AdActivity");
      try
      {
        if (j == paramContext.getPackageManager().getActivityInfo(localComponentName, 0).theme)
        {
          i = 1;
          continue;
        }
        gs.U("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        gs.W("Fail to fetch AdActivity theme");
        gs.U("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      }
    }
  }

  public Bundle b(Context paramContext, String paramString)
  {
    synchronized (this.mw)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("session_id", this.vL);
      localBundle.putLong("basets", this.vZ);
      localBundle.putLong("currts", this.vY);
      localBundle.putString("seq_num", paramString);
      localBundle.putInt("preqs", this.wb);
      localBundle.putInt("pclick", this.vX);
      localBundle.putInt("pimp", this.wa);
      localBundle.putBoolean("support_transparent_background", m(paramContext));
      return localBundle;
    }
  }

  // ERROR //
  public void b(av paramav, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	com/google/android/gms/internal/gc:mw	Ljava/lang/Object;
    //   4: astore 4
    //   6: aload 4
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 31	com/google/android/gms/internal/gc:vZ	J
    //   13: ldc2_w 26
    //   16: lcmp
    //   17: ifne +43 -> 60
    //   20: aload_0
    //   21: lload_2
    //   22: putfield 31	com/google/android/gms/internal/gc:vZ	J
    //   25: aload_0
    //   26: aload_0
    //   27: getfield 31	com/google/android/gms/internal/gc:vZ	J
    //   30: putfield 29	com/google/android/gms/internal/gc:vY	J
    //   33: aload_1
    //   34: getfield 142	com/google/android/gms/internal/av:extras	Landroid/os/Bundle;
    //   37: ifnull +39 -> 76
    //   40: aload_1
    //   41: getfield 142	com/google/android/gms/internal/av:extras	Landroid/os/Bundle;
    //   44: ldc 144
    //   46: iconst_2
    //   47: invokevirtual 148	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   50: iconst_1
    //   51: if_icmpne +25 -> 76
    //   54: aload 4
    //   56: monitorexit
    //   57: goto +32 -> 89
    //   60: aload_0
    //   61: lload_2
    //   62: putfield 29	com/google/android/gms/internal/gc:vY	J
    //   65: goto -32 -> 33
    //   68: astore 5
    //   70: aload 4
    //   72: monitorexit
    //   73: aload 5
    //   75: athrow
    //   76: aload_0
    //   77: iconst_1
    //   78: aload_0
    //   79: getfield 35	com/google/android/gms/internal/gc:wb	I
    //   82: iadd
    //   83: putfield 35	com/google/android/gms/internal/gc:wb	I
    //   86: aload 4
    //   88: monitorexit
    //   89: return
    //
    // Exception table:
    //   from	to	target	type
    //   9	73	68	finally
    //   76	89	68	finally
  }

  public void cP()
  {
    synchronized (this.mw)
    {
      this.wa = (1 + this.wa);
      return;
    }
  }

  public void cQ()
  {
    synchronized (this.mw)
    {
      this.vX = (1 + this.vX);
      return;
    }
  }

  public long di()
  {
    return this.vZ;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gc
 * JD-Core Version:    0.6.0
 */