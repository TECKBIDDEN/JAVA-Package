package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;

public abstract interface eg extends IInterface
{
  public abstract String getProductId()
    throws RemoteException;

  public abstract void recordPlayBillingResolution(int paramInt)
    throws RemoteException;

  public abstract void recordResolution(int paramInt)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eg
 * JD-Core Version:    0.6.0
 */