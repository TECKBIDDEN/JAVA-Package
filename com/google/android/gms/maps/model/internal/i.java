package com.google.android.gms.maps.model.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

public abstract interface i extends IInterface
{
  public abstract Tile getTile(int paramInt1, int paramInt2, int paramInt3)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.internal.i
 * JD-Core Version:    0.6.0
 */