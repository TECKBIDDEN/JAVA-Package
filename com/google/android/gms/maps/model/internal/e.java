package com.google.android.gms.maps.model.internal;

import android.os.IInterface;
import android.os.RemoteException;

public abstract interface e extends IInterface
{
  public abstract boolean a(e parame)
    throws RemoteException;

  public abstract void activate()
    throws RemoteException;

  public abstract String getName()
    throws RemoteException;

  public abstract String getShortName()
    throws RemoteException;

  public abstract int hashCodeRemote()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.internal.e
 * JD-Core Version:    0.6.0
 */