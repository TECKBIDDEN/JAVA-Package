package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;

public abstract interface s extends IInterface
{
  public abstract boolean a(boolean paramBoolean)
    throws RemoteException;

  public abstract void b(String paramString, boolean paramBoolean)
    throws RemoteException;

  public abstract String c(String paramString)
    throws RemoteException;

  public abstract String getId()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.s
 * JD-Core Version:    0.6.0
 */