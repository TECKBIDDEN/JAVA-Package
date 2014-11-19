package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;

public final class Projection
{
  private final IProjectionDelegate aiP;

  Projection(IProjectionDelegate paramIProjectionDelegate)
  {
    this.aiP = paramIProjectionDelegate;
  }

  public LatLng fromScreenLocation(Point paramPoint)
  {
    try
    {
      LatLng localLatLng = this.aiP.fromScreenLocation(e.k(paramPoint));
      return localLatLng;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public VisibleRegion getVisibleRegion()
  {
    try
    {
      VisibleRegion localVisibleRegion = this.aiP.getVisibleRegion();
      return localVisibleRegion;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public Point toScreenLocation(LatLng paramLatLng)
  {
    try
    {
      Point localPoint = (Point)e.f(this.aiP.toScreenLocation(paramLatLng));
      return localPoint;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.Projection
 * JD-Core Version:    0.6.0
 */