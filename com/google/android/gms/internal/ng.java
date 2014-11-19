package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

public abstract interface ng extends IInterface
{
  public abstract void a(String paramString, nl paramnl, nh paramnh)
    throws RemoteException;

  public abstract void a(String paramString, nl paramnl, List<nh> paramList)
    throws RemoteException;

  public abstract void a(String paramString, nl paramnl, byte[] paramArrayOfByte)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ng
 * JD-Core Version:    0.6.0
 */