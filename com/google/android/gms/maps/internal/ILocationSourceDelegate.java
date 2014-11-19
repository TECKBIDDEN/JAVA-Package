package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;

public abstract interface ILocationSourceDelegate extends IInterface
{
  public abstract void activate(h paramh)
    throws RemoteException;

  public abstract void deactivate()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.ILocationSourceDelegate
 * JD-Core Version:    0.6.0
 */