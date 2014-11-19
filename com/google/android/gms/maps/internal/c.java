package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.internal.a;

public abstract interface c extends IInterface
{
  public abstract IMapViewDelegate a(d paramd, GoogleMapOptions paramGoogleMapOptions)
    throws RemoteException;

  public abstract IStreetViewPanoramaViewDelegate a(d paramd, StreetViewPanoramaOptions paramStreetViewPanoramaOptions)
    throws RemoteException;

  public abstract void a(d paramd, int paramInt)
    throws RemoteException;

  public abstract void i(d paramd)
    throws RemoteException;

  public abstract IMapFragmentDelegate j(d paramd)
    throws RemoteException;

  public abstract IStreetViewPanoramaFragmentDelegate k(d paramd)
    throws RemoteException;

  public abstract ICameraUpdateFactoryDelegate mG()
    throws RemoteException;

  public abstract a mH()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.c
 * JD-Core Version:    0.6.0
 */