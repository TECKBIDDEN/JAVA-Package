package com.google.android.gms.games.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

public abstract interface IRoomServiceCallbacks extends IInterface
{
  public abstract void a(ParcelFileDescriptor paramParcelFileDescriptor, int paramInt)
    throws RemoteException;

  public abstract void a(ConnectionInfo paramConnectionInfo)
    throws RemoteException;

  public abstract void a(String paramString, byte[] paramArrayOfByte, int paramInt)
    throws RemoteException;

  public abstract void a(String paramString, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void aD(IBinder paramIBinder)
    throws RemoteException;

  public abstract void b(String paramString, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void bM(String paramString)
    throws RemoteException;

  public abstract void bN(String paramString)
    throws RemoteException;

  public abstract void bO(String paramString)
    throws RemoteException;

  public abstract void bP(String paramString)
    throws RemoteException;

  public abstract void bQ(String paramString)
    throws RemoteException;

  public abstract void bR(String paramString)
    throws RemoteException;

  public abstract void c(int paramInt1, int paramInt2, String paramString)
    throws RemoteException;

  public abstract void c(String paramString, byte[] paramArrayOfByte)
    throws RemoteException;

  public abstract void c(String paramString, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void d(String paramString, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void dF(int paramInt)
    throws RemoteException;

  public abstract void e(String paramString, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void f(String paramString, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void g(String paramString, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void i(String paramString, boolean paramBoolean)
    throws RemoteException;

  public abstract void kH()
    throws RemoteException;

  public abstract void kI()
    throws RemoteException;

  public abstract void onP2PConnected(String paramString)
    throws RemoteException;

  public abstract void onP2PDisconnected(String paramString)
    throws RemoteException;

  public abstract void v(String paramString, int paramInt)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.IRoomServiceCallbacks
 * JD-Core Version:    0.6.0
 */