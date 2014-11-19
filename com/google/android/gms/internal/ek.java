package com.google.android.gms.internal;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;

public abstract interface ek extends IInterface
{
  public abstract void finishPurchase()
    throws RemoteException;

  public abstract String getProductId()
    throws RemoteException;

  public abstract Intent getPurchaseData()
    throws RemoteException;

  public abstract int getResultCode()
    throws RemoteException;

  public abstract boolean isVerified()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ek
 * JD-Core Version:    0.6.0
 */