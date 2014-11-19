package com.google.android.gms.drive.realtime.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract interface o extends IInterface
{
  public abstract void o(Status paramStatus)
    throws RemoteException;

  public abstract void onSuccess()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.o
 * JD-Core Version:    0.6.0
 */