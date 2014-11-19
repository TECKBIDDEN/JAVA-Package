package com.google.android.gms.games.internal;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

public abstract interface IGamesSignInCallbacks extends IInterface
{
  public abstract void T(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void U(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void b(int paramInt, Intent paramIntent)
    throws RemoteException;

  public abstract void dD(int paramInt)
    throws RemoteException;

  public abstract void dE(int paramInt)
    throws RemoteException;

  public abstract void g(DataHolder paramDataHolder)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.IGamesSignInCallbacks
 * JD-Core Version:    0.6.0
 */