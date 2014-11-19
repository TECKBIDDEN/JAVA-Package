package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract interface hw extends IInterface
{
  public abstract void a(Status paramStatus)
    throws RemoteException;

  public abstract void a(Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor)
    throws RemoteException;

  public abstract void a(Status paramStatus, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(hm.b paramb)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hw
 * JD-Core Version:    0.6.0
 */