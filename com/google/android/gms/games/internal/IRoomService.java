package com.google.android.gms.games.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

public abstract interface IRoomService extends IInterface
{
  public abstract void Q(boolean paramBoolean)
    throws RemoteException;

  public abstract void a(IBinder paramIBinder, IRoomServiceCallbacks paramIRoomServiceCallbacks)
    throws RemoteException;

  public abstract void a(DataHolder paramDataHolder, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(byte[] paramArrayOfByte, String paramString, int paramInt)
    throws RemoteException;

  public abstract void a(byte[] paramArrayOfByte, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void bK(String paramString)
    throws RemoteException;

  public abstract void bL(String paramString)
    throws RemoteException;

  public abstract void c(String paramString1, String paramString2, String paramString3)
    throws RemoteException;

  public abstract void kD()
    throws RemoteException;

  public abstract void kE()
    throws RemoteException;

  public abstract void kF()
    throws RemoteException;

  public abstract void kG()
    throws RemoteException;

  public abstract void t(String paramString, int paramInt)
    throws RemoteException;

  public abstract void u(String paramString, int paramInt)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.IRoomService
 * JD-Core Version:    0.6.0
 */