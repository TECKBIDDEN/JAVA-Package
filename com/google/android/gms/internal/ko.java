package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ac;
import com.google.android.gms.fitness.request.ae;
import com.google.android.gms.fitness.request.ah;
import com.google.android.gms.fitness.request.b;
import com.google.android.gms.fitness.request.i;
import com.google.android.gms.fitness.request.l;
import com.google.android.gms.fitness.request.n;
import com.google.android.gms.fitness.request.p;
import com.google.android.gms.fitness.request.t;
import com.google.android.gms.fitness.request.v;
import com.google.android.gms.fitness.request.x;
import com.google.android.gms.fitness.request.z;

public abstract interface ko extends IInterface
{
  public abstract void a(DataDeleteRequest paramDataDeleteRequest, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(DataInsertRequest paramDataInsertRequest, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(DataReadRequest paramDataReadRequest, kl paramkl, String paramString)
    throws RemoteException;

  public abstract void a(DataSourcesRequest paramDataSourcesRequest, km paramkm, String paramString)
    throws RemoteException;

  public abstract void a(DataTypeCreateRequest paramDataTypeCreateRequest, kn paramkn, String paramString)
    throws RemoteException;

  public abstract void a(SessionInsertRequest paramSessionInsertRequest, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(SessionReadRequest paramSessionReadRequest, kq paramkq, String paramString)
    throws RemoteException;

  public abstract void a(StartBleScanRequest paramStartBleScanRequest, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(UnclaimBleDeviceRequest paramUnclaimBleDeviceRequest, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(ac paramac, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(ae paramae, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(ah paramah, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(b paramb, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(i parami, kn paramkn, String paramString)
    throws RemoteException;

  public abstract void a(l paraml, kp paramkp, String paramString)
    throws RemoteException;

  public abstract void a(n paramn, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(p paramp, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(t paramt, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(v paramv, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(x paramx, kr paramkr, String paramString)
    throws RemoteException;

  public abstract void a(z paramz, ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(ks paramks, String paramString)
    throws RemoteException;

  public abstract void a(le paramle, String paramString)
    throws RemoteException;

  public abstract void b(ks paramks, String paramString)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ko
 * JD-Core Version:    0.6.0
 */