package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.d;

public abstract interface f extends IInterface
{
  public abstract void a(d paramd)
    throws RemoteException;

  public abstract void onIndoorBuildingFocused()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.f
 * JD-Core Version:    0.6.0
 */