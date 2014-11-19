package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public abstract interface ICameraUpdateFactoryDelegate extends IInterface
{
  public abstract d newCameraPosition(CameraPosition paramCameraPosition)
    throws RemoteException;

  public abstract d newLatLng(LatLng paramLatLng)
    throws RemoteException;

  public abstract d newLatLngBounds(LatLngBounds paramLatLngBounds, int paramInt)
    throws RemoteException;

  public abstract d newLatLngBoundsWithSize(LatLngBounds paramLatLngBounds, int paramInt1, int paramInt2, int paramInt3)
    throws RemoteException;

  public abstract d newLatLngZoom(LatLng paramLatLng, float paramFloat)
    throws RemoteException;

  public abstract d scrollBy(float paramFloat1, float paramFloat2)
    throws RemoteException;

  public abstract d zoomBy(float paramFloat)
    throws RemoteException;

  public abstract d zoomByWithFocus(float paramFloat, int paramInt1, int paramInt2)
    throws RemoteException;

  public abstract d zoomIn()
    throws RemoteException;

  public abstract d zoomOut()
    throws RemoteException;

  public abstract d zoomTo(float paramFloat)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
 * JD-Core Version:    0.6.0
 */