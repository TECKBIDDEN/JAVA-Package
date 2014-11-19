package com.google.android.gms.internal;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;

public abstract interface ei extends IInterface
{
  public abstract void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    throws RemoteException;

  public abstract void onCreate()
    throws RemoteException;

  public abstract void onDestroy()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ei
 * JD-Core Version:    0.6.0
 */