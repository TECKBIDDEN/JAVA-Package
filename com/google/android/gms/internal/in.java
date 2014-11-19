package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;

public abstract interface in extends IInterface
{
  public abstract void a(double paramDouble1, double paramDouble2, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(String paramString, LaunchOptions paramLaunchOptions)
    throws RemoteException;

  public abstract void a(String paramString1, String paramString2, long paramLong)
    throws RemoteException;

  public abstract void a(String paramString, byte[] paramArrayOfByte, long paramLong)
    throws RemoteException;

  public abstract void a(boolean paramBoolean1, double paramDouble, boolean paramBoolean2)
    throws RemoteException;

  public abstract void aH(String paramString)
    throws RemoteException;

  public abstract void aI(String paramString)
    throws RemoteException;

  public abstract void aJ(String paramString)
    throws RemoteException;

  public abstract void disconnect()
    throws RemoteException;

  public abstract void f(String paramString, boolean paramBoolean)
    throws RemoteException;

  public abstract void fE()
    throws RemoteException;

  public abstract void fQ()
    throws RemoteException;

  public abstract void l(String paramString1, String paramString2)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.in
 * JD-Core Version:    0.6.0
 */