package com.google.android.gms.maps.model.internal;

import android.os.IInterface;
import android.os.RemoteException;

public abstract interface h extends IInterface
{
  public abstract boolean a(h paramh)
    throws RemoteException;

  public abstract void clearTileCache()
    throws RemoteException;

  public abstract boolean getFadeIn()
    throws RemoteException;

  public abstract String getId()
    throws RemoteException;

  public abstract float getZIndex()
    throws RemoteException;

  public abstract int hashCodeRemote()
    throws RemoteException;

  public abstract boolean isVisible()
    throws RemoteException;

  public abstract void remove()
    throws RemoteException;

  public abstract void setFadeIn(boolean paramBoolean)
    throws RemoteException;

  public abstract void setVisible(boolean paramBoolean)
    throws RemoteException;

  public abstract void setZIndex(float paramFloat)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.internal.h
 * JD-Core Version:    0.6.0
 */