package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;

public abstract interface io extends IInterface
{
  public abstract void a(ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(String paramString, double paramDouble, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(String paramString, long paramLong)
    throws RemoteException;

  public abstract void a(String paramString, long paramLong, int paramInt)
    throws RemoteException;

  public abstract void ac(int paramInt)
    throws RemoteException;

  public abstract void ad(int paramInt)
    throws RemoteException;

  public abstract void ae(int paramInt)
    throws RemoteException;

  public abstract void af(int paramInt)
    throws RemoteException;

  public abstract void b(ig paramig)
    throws RemoteException;

  public abstract void b(il paramil)
    throws RemoteException;

  public abstract void b(String paramString, byte[] paramArrayOfByte)
    throws RemoteException;

  public abstract void k(String paramString1, String paramString2)
    throws RemoteException;

  public abstract void onApplicationDisconnected(int paramInt)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.io
 * JD-Core Version:    0.6.0
 */