package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

public abstract interface ic extends IInterface
{
  public abstract void S(int paramInt)
    throws RemoteException;

  public abstract void a(int paramInt, DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void a(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void e(int paramInt1, int paramInt2)
    throws RemoteException;

  public abstract void fq()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ic
 * JD-Core Version:    0.6.0
 */