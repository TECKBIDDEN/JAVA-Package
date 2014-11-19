package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.u;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class MapsInitializer
{
  public static void a(c paramc)
  {
    try
    {
      CameraUpdateFactory.a(paramc.mG());
      BitmapDescriptorFactory.a(paramc.mH());
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static int initialize(Context paramContext)
  {
    n.i(paramContext);
    try
    {
      c localc = u.R(paramContext);
      a(localc);
      i = 0;
      return i;
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      while (true)
        int i = localGooglePlayServicesNotAvailableException.errorCode;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.MapsInitializer
 * JD-Core Version:    0.6.0
 */