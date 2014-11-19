package com.google.android.gms.plus.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

public abstract interface c extends IInterface
{
  public abstract d a(d paramd, int paramInt1, int paramInt2, String paramString, int paramInt3)
    throws RemoteException;

  public abstract d a(d paramd, int paramInt1, int paramInt2, String paramString1, String paramString2)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.c
 * JD-Core Version:    0.6.0
 */