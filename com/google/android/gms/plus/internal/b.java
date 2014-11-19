package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.ny;

public abstract interface b extends IInterface
{
  public abstract void a(int paramInt, Bundle paramBundle1, Bundle paramBundle2)
    throws RemoteException;

  public abstract void a(int paramInt, Bundle paramBundle, ParcelFileDescriptor paramParcelFileDescriptor)
    throws RemoteException;

  public abstract void a(int paramInt, Bundle paramBundle, jp paramjp)
    throws RemoteException;

  public abstract void a(int paramInt, ny paramny)
    throws RemoteException;

  public abstract void a(DataHolder paramDataHolder, String paramString)
    throws RemoteException;

  public abstract void a(DataHolder paramDataHolder, String paramString1, String paramString2)
    throws RemoteException;

  public abstract void aB(Status paramStatus)
    throws RemoteException;

  public abstract void cb(String paramString)
    throws RemoteException;

  public abstract void cc(String paramString)
    throws RemoteException;

  public abstract void h(int paramInt, Bundle paramBundle)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.b
 * JD-Core Version:    0.6.0
 */