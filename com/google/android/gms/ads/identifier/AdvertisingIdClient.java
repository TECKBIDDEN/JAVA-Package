package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.s;
import com.google.android.gms.internal.s.a;
import java.io.IOException;

public final class AdvertisingIdClient
{
  a lk;
  s ll;
  boolean lm;
  final Context mContext;

  public AdvertisingIdClient(Context paramContext)
  {
    n.i(paramContext);
    this.mContext = paramContext;
    this.lm = false;
  }

  static s a(Context paramContext, a parama)
    throws IOException
  {
    try
    {
      s locals = s.a.b(parama.fX());
      return locals;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    throw new IOException("Interrupted exception");
  }

  public static Info getAdvertisingIdInfo(Context paramContext)
    throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    AdvertisingIdClient localAdvertisingIdClient = new AdvertisingIdClient(paramContext);
    try
    {
      localAdvertisingIdClient.start();
      Info localInfo = localAdvertisingIdClient.W();
      return localInfo;
    }
    finally
    {
      localAdvertisingIdClient.finish();
    }
    throw localObject;
  }

  // ERROR //
  static a i(Context paramContext)
    throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 82	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   4: ldc 84
    //   6: iconst_0
    //   7: invokevirtual 90	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   10: pop
    //   11: aload_0
    //   12: invokestatic 95	com/google/android/gms/common/GooglePlayServicesUtil:D	(Landroid/content/Context;)V
    //   15: new 38	com/google/android/gms/common/a
    //   18: dup
    //   19: invokespecial 96	com/google/android/gms/common/a:<init>	()V
    //   22: astore 4
    //   24: new 98	android/content/Intent
    //   27: dup
    //   28: ldc 100
    //   30: invokespecial 101	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   33: astore 5
    //   35: aload 5
    //   37: ldc 103
    //   39: invokevirtual 107	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   42: pop
    //   43: aload_0
    //   44: aload 5
    //   46: aload 4
    //   48: iconst_1
    //   49: invokevirtual 111	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   52: ifeq +27 -> 79
    //   55: aload 4
    //   57: areturn
    //   58: astore_1
    //   59: new 59	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   62: dup
    //   63: bipush 9
    //   65: invokespecial 114	com/google/android/gms/common/GooglePlayServicesNotAvailableException:<init>	(I)V
    //   68: athrow
    //   69: astore_3
    //   70: new 34	java/io/IOException
    //   73: dup
    //   74: aload_3
    //   75: invokespecial 117	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   78: athrow
    //   79: new 34	java/io/IOException
    //   82: dup
    //   83: ldc 119
    //   85: invokespecial 53	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   88: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	11	58	android/content/pm/PackageManager$NameNotFoundException
    //   11	15	69	com/google/android/gms/common/GooglePlayServicesNotAvailableException
  }

  public Info W()
    throws IOException
  {
    n.aU("Calling this from your main thread can lead to deadlock");
    n.i(this.lk);
    n.i(this.ll);
    if (!this.lm)
      throw new IOException("AdvertisingIdService is not connected.");
    try
    {
      Info localInfo = new Info(this.ll.getId(), this.ll.a(true));
      return localInfo;
    }
    catch (RemoteException localRemoteException)
    {
      Log.i("AdvertisingIdClient", "GMS remote exception ", localRemoteException);
    }
    throw new IOException("Remote exception");
  }

  public void finish()
  {
    n.aU("Calling this from your main thread can lead to deadlock");
    if ((this.mContext == null) || (this.lk == null));
    while (true)
    {
      return;
      try
      {
        if (this.lm)
          this.mContext.unbindService(this.lk);
        this.lm = false;
        this.ll = null;
        this.lk = null;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        while (true)
          Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", localIllegalArgumentException);
      }
    }
  }

  public void start()
    throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    n.aU("Calling this from your main thread can lead to deadlock");
    if (this.lm)
      finish();
    this.lk = i(this.mContext);
    this.ll = a(this.mContext, this.lk);
    this.lm = true;
  }

  public static final class Info
  {
    private final String ln;
    private final boolean lo;

    public Info(String paramString, boolean paramBoolean)
    {
      this.ln = paramString;
      this.lo = paramBoolean;
    }

    public String getId()
    {
      return this.ln;
    }

    public boolean isLimitAdTrackingEnabled()
    {
      return this.lo;
    }

    public String toString()
    {
      return "{" + this.ln + "}" + this.lo;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.AdvertisingIdClient
 * JD-Core Version:    0.6.0
 */