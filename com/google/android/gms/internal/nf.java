package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

public class nf
{
  private final nn aku;
  private nl akv;

  public nf(Context paramContext, int paramInt, String paramString1, String paramString2, a parama, boolean paramBoolean)
  {
    String str = paramContext.getPackageName();
    try
    {
      i = paramContext.getPackageManager().getPackageInfo(str, 0).versionCode;
      this.akv = new nl(str, i, paramInt, paramString1, paramString2, paramBoolean);
      this.aku = new nn(paramContext, new nk(parama));
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        Log.wtf("PlayLogger", "This can't happen.");
    }
  }

  public void a(long paramLong, String paramString, byte[] paramArrayOfByte, String[] paramArrayOfString)
  {
    this.aku.b(this.akv, new nh(paramLong, paramString, paramArrayOfByte, paramArrayOfString));
  }

  public void b(String paramString, byte[] paramArrayOfByte, String[] paramArrayOfString)
  {
    a(System.currentTimeMillis(), paramString, paramArrayOfByte, paramArrayOfString);
  }

  public void start()
  {
    this.aku.start();
  }

  public void stop()
  {
    this.aku.stop();
  }

  public static abstract interface a
  {
    public abstract void b(PendingIntent paramPendingIntent);

    public abstract void mS();

    public abstract void mT();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nf
 * JD-Core Version:    0.6.0
 */