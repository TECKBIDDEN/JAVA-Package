package com.google.android.gms.location;

import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;

public abstract interface a extends IInterface
{
  public abstract void onLocationChanged(Location paramLocation)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.a
 * JD-Core Version:    0.6.0
 */