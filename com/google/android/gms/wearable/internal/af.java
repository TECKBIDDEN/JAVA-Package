package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c;

public abstract interface af extends IInterface
{
  public abstract void a(ad paramad)
    throws RemoteException;

  public abstract void a(ad paramad, Uri paramUri)
    throws RemoteException;

  public abstract void a(ad paramad, Asset paramAsset)
    throws RemoteException;

  public abstract void a(ad paramad, PutDataRequest paramPutDataRequest)
    throws RemoteException;

  public abstract void a(ad paramad, c paramc)
    throws RemoteException;

  public abstract void a(ad paramad, aq paramaq)
    throws RemoteException;

  public abstract void a(ad paramad, b paramb)
    throws RemoteException;

  public abstract void a(ad paramad, String paramString)
    throws RemoteException;

  public abstract void a(ad paramad, String paramString1, String paramString2, byte[] paramArrayOfByte)
    throws RemoteException;

  public abstract void b(ad paramad)
    throws RemoteException;

  public abstract void b(ad paramad, Uri paramUri)
    throws RemoteException;

  public abstract void b(ad paramad, c paramc)
    throws RemoteException;

  public abstract void b(ad paramad, String paramString)
    throws RemoteException;

  public abstract void c(ad paramad)
    throws RemoteException;

  public abstract void c(ad paramad, Uri paramUri)
    throws RemoteException;

  public abstract void c(ad paramad, String paramString)
    throws RemoteException;

  public abstract void d(ad paramad)
    throws RemoteException;

  public abstract void e(ad paramad)
    throws RemoteException;

  public abstract void f(ad paramad)
    throws RemoteException;

  public abstract void g(ad paramad)
    throws RemoteException;

  public abstract void h(ad paramad)
    throws RemoteException;

  public abstract void i(ad paramad)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.af
 * JD-Core Version:    0.6.0
 */