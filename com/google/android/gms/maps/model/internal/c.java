package com.google.android.gms.maps.model.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public abstract interface c extends IInterface
{
  public abstract void a(float paramFloat1, float paramFloat2)
    throws RemoteException;

  public abstract boolean a(c paramc)
    throws RemoteException;

  public abstract float getBearing()
    throws RemoteException;

  public abstract LatLngBounds getBounds()
    throws RemoteException;

  public abstract float getHeight()
    throws RemoteException;

  public abstract String getId()
    throws RemoteException;

  public abstract LatLng getPosition()
    throws RemoteException;

  public abstract float getTransparency()
    throws RemoteException;

  public abstract float getWidth()
    throws RemoteException;

  public abstract float getZIndex()
    throws RemoteException;

  public abstract int hashCodeRemote()
    throws RemoteException;

  public abstract boolean isVisible()
    throws RemoteException;

  public abstract void m(d paramd)
    throws RemoteException;

  public abstract void remove()
    throws RemoteException;

  public abstract void setBearing(float paramFloat)
    throws RemoteException;

  public abstract void setDimensions(float paramFloat)
    throws RemoteException;

  public abstract void setPosition(LatLng paramLatLng)
    throws RemoteException;

  public abstract void setPositionFromBounds(LatLngBounds paramLatLngBounds)
    throws RemoteException;

  public abstract void setTransparency(float paramFloat)
    throws RemoteException;

  public abstract void setVisible(boolean paramBoolean)
    throws RemoteException;

  public abstract void setZIndex(float paramFloat)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.internal.c
 * JD-Core Version:    0.6.0
 */