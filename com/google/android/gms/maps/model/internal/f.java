package com.google.android.gms.maps.model.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;

public abstract interface f extends IInterface
{
  public abstract float getAlpha()
    throws RemoteException;

  public abstract String getId()
    throws RemoteException;

  public abstract LatLng getPosition()
    throws RemoteException;

  public abstract float getRotation()
    throws RemoteException;

  public abstract String getSnippet()
    throws RemoteException;

  public abstract String getTitle()
    throws RemoteException;

  public abstract boolean h(f paramf)
    throws RemoteException;

  public abstract int hashCodeRemote()
    throws RemoteException;

  public abstract void hideInfoWindow()
    throws RemoteException;

  public abstract boolean isDraggable()
    throws RemoteException;

  public abstract boolean isFlat()
    throws RemoteException;

  public abstract boolean isInfoWindowShown()
    throws RemoteException;

  public abstract boolean isVisible()
    throws RemoteException;

  public abstract void n(d paramd)
    throws RemoteException;

  public abstract void remove()
    throws RemoteException;

  public abstract void setAlpha(float paramFloat)
    throws RemoteException;

  public abstract void setAnchor(float paramFloat1, float paramFloat2)
    throws RemoteException;

  public abstract void setDraggable(boolean paramBoolean)
    throws RemoteException;

  public abstract void setFlat(boolean paramBoolean)
    throws RemoteException;

  public abstract void setInfoWindowAnchor(float paramFloat1, float paramFloat2)
    throws RemoteException;

  public abstract void setPosition(LatLng paramLatLng)
    throws RemoteException;

  public abstract void setRotation(float paramFloat)
    throws RemoteException;

  public abstract void setSnippet(String paramString)
    throws RemoteException;

  public abstract void setTitle(String paramString)
    throws RemoteException;

  public abstract void setVisible(boolean paramBoolean)
    throws RemoteException;

  public abstract void showInfoWindow()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.internal.f
 * JD-Core Version:    0.6.0
 */