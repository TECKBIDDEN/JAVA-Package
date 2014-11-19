package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class CameraUpdateFactory
{
  private static ICameraUpdateFactoryDelegate aib;

  static void a(ICameraUpdateFactoryDelegate paramICameraUpdateFactoryDelegate)
  {
    if (aib != null);
    while (true)
    {
      return;
      aib = (ICameraUpdateFactoryDelegate)n.i(paramICameraUpdateFactoryDelegate);
    }
  }

  private static ICameraUpdateFactoryDelegate mn()
  {
    return (ICameraUpdateFactoryDelegate)n.b(aib, "CameraUpdateFactory is not initialized");
  }

  public static CameraUpdate newCameraPosition(CameraPosition paramCameraPosition)
  {
    try
    {
      CameraUpdate localCameraUpdate = new CameraUpdate(mn().newCameraPosition(paramCameraPosition));
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static CameraUpdate newLatLng(LatLng paramLatLng)
  {
    try
    {
      CameraUpdate localCameraUpdate = new CameraUpdate(mn().newLatLng(paramLatLng));
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static CameraUpdate newLatLngBounds(LatLngBounds paramLatLngBounds, int paramInt)
  {
    try
    {
      CameraUpdate localCameraUpdate = new CameraUpdate(mn().newLatLngBounds(paramLatLngBounds, paramInt));
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static CameraUpdate newLatLngBounds(LatLngBounds paramLatLngBounds, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      CameraUpdate localCameraUpdate = new CameraUpdate(mn().newLatLngBoundsWithSize(paramLatLngBounds, paramInt1, paramInt2, paramInt3));
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static CameraUpdate newLatLngZoom(LatLng paramLatLng, float paramFloat)
  {
    try
    {
      CameraUpdate localCameraUpdate = new CameraUpdate(mn().newLatLngZoom(paramLatLng, paramFloat));
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static CameraUpdate scrollBy(float paramFloat1, float paramFloat2)
  {
    try
    {
      CameraUpdate localCameraUpdate = new CameraUpdate(mn().scrollBy(paramFloat1, paramFloat2));
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static CameraUpdate zoomBy(float paramFloat)
  {
    try
    {
      CameraUpdate localCameraUpdate = new CameraUpdate(mn().zoomBy(paramFloat));
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static CameraUpdate zoomBy(float paramFloat, Point paramPoint)
  {
    try
    {
      CameraUpdate localCameraUpdate = new CameraUpdate(mn().zoomByWithFocus(paramFloat, paramPoint.x, paramPoint.y));
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static CameraUpdate zoomIn()
  {
    try
    {
      CameraUpdate localCameraUpdate = new CameraUpdate(mn().zoomIn());
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static CameraUpdate zoomOut()
  {
    try
    {
      CameraUpdate localCameraUpdate = new CameraUpdate(mn().zoomOut());
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static CameraUpdate zoomTo(float paramFloat)
  {
    try
    {
      CameraUpdate localCameraUpdate = new CameraUpdate(mn().zoomTo(paramFloat));
      return localCameraUpdate;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.CameraUpdateFactory
 * JD-Core Version:    0.6.0
 */