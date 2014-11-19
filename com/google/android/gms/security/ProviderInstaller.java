package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.n;
import java.lang.reflect.Method;

public class ProviderInstaller
{
  public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
  private static Method anz;
  private static final Object uf = new Object();

  static
  {
    anz = null;
  }

  private static void U(Context paramContext)
    throws ClassNotFoundException, NoSuchMethodException
  {
    Class localClass = paramContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl");
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
    anz = localClass.getMethod("insertProvider", arrayOfClass);
  }

  public static void installIfNeeded(Context paramContext)
    throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
  {
    n.b(paramContext, "Context must not be null");
    GooglePlayServicesUtil.D(paramContext);
    Context localContext = GooglePlayServicesUtil.getRemoteContext(paramContext);
    if (localContext == null)
    {
      Log.e("ProviderInstaller", "Failed to get remote context");
      throw new GooglePlayServicesNotAvailableException(8);
    }
    synchronized (uf)
    {
      try
      {
        if (anz == null)
          U(localContext);
        Method localMethod = anz;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localContext;
        localMethod.invoke(null, arrayOfObject);
        return;
      }
      catch (Exception localException)
      {
        Log.e("ProviderInstaller", "Failed to install provider: " + localException.getMessage());
        throw new GooglePlayServicesNotAvailableException(8);
      }
    }
  }

  public static void installIfNeededAsync(Context paramContext, ProviderInstallListener paramProviderInstallListener)
  {
    n.b(paramContext, "Context must not be null");
    n.b(paramProviderInstallListener, "Listener must not be null");
    n.aT("Must be called on the UI thread");
    new AsyncTask(paramContext, paramProviderInstallListener)
    {
      protected Integer b(Void[] paramArrayOfVoid)
      {
        try
        {
          ProviderInstaller.installIfNeeded(this.mV);
          localInteger = Integer.valueOf(0);
          return localInteger;
        }
        catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
        {
          while (true)
            localInteger = Integer.valueOf(localGooglePlayServicesRepairableException.getConnectionStatusCode());
        }
        catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
        {
          while (true)
            Integer localInteger = Integer.valueOf(localGooglePlayServicesNotAvailableException.errorCode);
        }
      }

      protected void d(Integer paramInteger)
      {
        if (paramInteger.intValue() == 0)
          this.anA.onProviderInstalled();
        while (true)
        {
          return;
          Intent localIntent = GooglePlayServicesUtil.ai(paramInteger.intValue());
          this.anA.onProviderInstallFailed(paramInteger.intValue(), localIntent);
        }
      }
    }
    .execute(new Void[0]);
  }

  public static abstract interface ProviderInstallListener
  {
    public abstract void onProviderInstallFailed(int paramInt, Intent paramIntent);

    public abstract void onProviderInstalled();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.security.ProviderInstaller
 * JD-Core Version:    0.6.0
 */