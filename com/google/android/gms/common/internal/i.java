package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.RemoteException;

public abstract interface i extends IInterface
{
  public abstract void cancel()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.i
 * JD-Core Version:    0.6.0
 */