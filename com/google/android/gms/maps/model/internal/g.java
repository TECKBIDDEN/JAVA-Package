package com.google.android.gms.maps.model.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public abstract interface g extends IInterface
{
  public abstract boolean a(g paramg)
    throws RemoteException;

  public abstract int getFillColor()
    throws RemoteException;

  public abstract List getHoles()
    throws RemoteException;

  public abstract String getId()
    throws RemoteException;

  public abstract List<LatLng> getPoints()
    throws RemoteException;

  public abstract int getStrokeColor()
    throws RemoteException;

  public abstract float getStrokeWidth()
    throws RemoteException;

  public abstract float getZIndex()
    throws RemoteException;

  public abstract int hashCodeRemote()
    throws RemoteException;

  public abstract boolean isGeodesic()
    throws RemoteException;

  public abstract boolean isVisible()
    throws RemoteException;

  public abstract void remove()
    throws RemoteException;

  public abstract void setFillColor(int paramInt)
    throws RemoteException;

  public abstract void setGeodesic(boolean paramBoolean)
    throws RemoteException;

  public abstract void setHoles(List paramList)
    throws RemoteException;

  public abstract void setPoints(List<LatLng> paramList)
    throws RemoteException;

  public abstract void setStrokeColor(int paramInt)
    throws RemoteException;

  public abstract void setStrokeWidth(float paramFloat)
    throws RemoteException;

  public abstract void setVisible(boolean paramBoolean)
    throws RemoteException;

  public abstract void setZIndex(float paramFloat)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.internal.g
 * JD-Core Version:    0.6.0
 */