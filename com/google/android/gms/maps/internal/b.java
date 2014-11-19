package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;

public abstract interface b extends IInterface
{
  public abstract void onCancel()
    throws RemoteException;

  public abstract void onFinish()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.b
 * JD-Core Version:    0.6.0
 */