package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

public abstract interface ds extends IInterface
{
  public abstract void U()
    throws RemoteException;

  public abstract void onCreate(Bundle paramBundle)
    throws RemoteException;

  public abstract void onDestroy()
    throws RemoteException;

  public abstract void onPause()
    throws RemoteException;

  public abstract void onRestart()
    throws RemoteException;

  public abstract void onResume()
    throws RemoteException;

  public abstract void onSaveInstanceState(Bundle paramBundle)
    throws RemoteException;

  public abstract void onStart()
    throws RemoteException;

  public abstract void onStop()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ds
 * JD-Core Version:    0.6.0
 */