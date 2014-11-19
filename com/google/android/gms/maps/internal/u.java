package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class u
{
  private static Context ajm;
  private static c ajn;

  public static c R(Context paramContext)
    throws GooglePlayServicesNotAvailableException
  {
    n.i(paramContext);
    c localc;
    if (ajn != null)
      localc = ajn;
    while (true)
    {
      return localc;
      S(paramContext);
      ajn = T(paramContext);
      try
      {
        ajn.a(e.k(getRemoteContext(paramContext).getResources()), 6111000);
        localc = ajn;
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  private static void S(Context paramContext)
    throws GooglePlayServicesNotAvailableException
  {
    int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext);
    switch (i)
    {
    default:
      throw new GooglePlayServicesNotAvailableException(i);
    case 0:
    }
  }

  private static c T(Context paramContext)
  {
    if (mI())
      Log.i(u.class.getSimpleName(), "Making Creator statically");
    for (c localc = (c)c(mJ()); ; localc = c.a.aP((IBinder)a(getRemoteContext(paramContext).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl")))
    {
      return localc;
      Log.i(u.class.getSimpleName(), "Making Creator dynamically");
    }
  }

  private static <T> T a(ClassLoader paramClassLoader, String paramString)
  {
    try
    {
      Object localObject = c(((ClassLoader)n.i(paramClassLoader)).loadClass(paramString));
      return localObject;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    throw new IllegalStateException("Unable to find dynamic class " + paramString);
  }

  private static <T> T c(Class<?> paramClass)
  {
    try
    {
      Object localObject = paramClass.newInstance();
      return localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new IllegalStateException("Unable to instantiate the dynamic class " + paramClass.getName());
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    throw new IllegalStateException("Unable to call the default constructor of " + paramClass.getName());
  }

  private static Context getRemoteContext(Context paramContext)
  {
    if (ajm == null)
    {
      if (!mI())
        break label23;
      ajm = paramContext.getApplicationContext();
    }
    while (true)
    {
      return ajm;
      label23: ajm = GooglePlayServicesUtil.getRemoteContext(paramContext);
    }
  }

  private static boolean mI()
  {
    return false;
  }

  private static Class<?> mJ()
  {
    Object localObject;
    try
    {
      if (Build.VERSION.SDK_INT < 15)
      {
        localObject = Class.forName("com.google.android.gms.maps.internal.CreatorImplGmm6");
      }
      else
      {
        Class localClass = Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        localObject = localClass;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new RuntimeException(localClassNotFoundException);
    }
    return (Class<?>)localObject;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.u
 * JD-Core Version:    0.6.0
 */