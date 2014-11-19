package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;

public abstract interface bc extends IInterface
{
  public abstract void onAdClosed()
    throws RemoteException;

  public abstract void onAdFailedToLoad(int paramInt)
    throws RemoteException;

  public abstract void onAdLeftApplication()
    throws RemoteException;

  public abstract void onAdLoaded()
    throws RemoteException;

  public abstract void onAdOpened()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bc
 * JD-Core Version:    0.6.0
 */