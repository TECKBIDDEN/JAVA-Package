package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public abstract interface IProjectionDelegate extends IInterface
{
  public abstract LatLng fromScreenLocation(d paramd)
    throws RemoteException;

  public abstract VisibleRegion getVisibleRegion()
    throws RemoteException;

  public abstract d toScreenLocation(LatLng paramLatLng)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IProjectionDelegate
 * JD-Core Version:    0.6.0
 */