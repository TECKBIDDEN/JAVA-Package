package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.a;
import com.google.android.gms.location.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

public abstract interface lw extends IInterface
{
  public abstract void a(long paramLong, boolean paramBoolean, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(PendingIntent paramPendingIntent, lv paramlv, String paramString)
    throws RemoteException;

  public abstract void a(Location paramLocation, int paramInt)
    throws RemoteException;

  public abstract void a(lv paramlv, String paramString)
    throws RemoteException;

  public abstract void a(lz paramlz, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(lz paramlz, a parama)
    throws RemoteException;

  public abstract void a(mg parammg, mw parammw, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(mi parammi, mw parammw, mu parammu)
    throws RemoteException;

  public abstract void a(mk parammk, mw parammw)
    throws RemoteException;

  public abstract void a(mm parammm, mw parammw, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(mq parammq, mw parammw, mu parammu)
    throws RemoteException;

  public abstract void a(ms paramms, LatLngBounds paramLatLngBounds, List<String> paramList, mw parammw, mu parammu)
    throws RemoteException;

  public abstract void a(mw parammw, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(LocationRequest paramLocationRequest, a parama)
    throws RemoteException;

  public abstract void a(LocationRequest paramLocationRequest, a parama, String paramString)
    throws RemoteException;

  public abstract void a(a parama)
    throws RemoteException;

  public abstract void a(LatLng paramLatLng, mi parammi, mw parammw, mu parammu)
    throws RemoteException;

  public abstract void a(LatLngBounds paramLatLngBounds, int paramInt, mi parammi, mw parammw, mu parammu)
    throws RemoteException;

  public abstract void a(LatLngBounds paramLatLngBounds, int paramInt, String paramString, mi parammi, mw parammw, mu parammu)
    throws RemoteException;

  public abstract void a(String paramString, mw parammw, mu parammu)
    throws RemoteException;

  public abstract void a(String paramString, LatLngBounds paramLatLngBounds, me paramme, mw parammw, mu parammu)
    throws RemoteException;

  public abstract void a(List<mb> paramList, PendingIntent paramPendingIntent, lv paramlv, String paramString)
    throws RemoteException;

  public abstract void a(String[] paramArrayOfString, lv paramlv, String paramString)
    throws RemoteException;

  public abstract void b(mw parammw, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void b(String paramString, mw parammw, mu parammu)
    throws RemoteException;

  public abstract Location bT(String paramString)
    throws RemoteException;

  public abstract c bU(String paramString)
    throws RemoteException;

  public abstract Location lT()
    throws RemoteException;

  public abstract IBinder lU()
    throws RemoteException;

  public abstract IBinder lV()
    throws RemoteException;

  public abstract void removeActivityUpdates(PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void setMockLocation(Location paramLocation)
    throws RemoteException;

  public abstract void setMockMode(boolean paramBoolean)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lw
 * JD-Core Version:    0.6.0
 */