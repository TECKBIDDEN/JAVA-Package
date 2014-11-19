package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

public abstract interface IMapViewDelegate extends IInterface
{
  public abstract IGoogleMapDelegate getMap()
    throws RemoteException;

  public abstract d getView()
    throws RemoteException;

  public abstract void onCreate(Bundle paramBundle)
    throws RemoteException;

  public abstract void onDestroy()
    throws RemoteException;

  public abstract void onLowMemory()
    throws RemoteException;

  public abstract void onPause()
    throws RemoteException;

  public abstract void onResume()
    throws RemoteException;

  public abstract void onSaveInstanceState(Bundle paramBundle)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IMapViewDelegate
 * JD-Core Version:    0.6.0
 */