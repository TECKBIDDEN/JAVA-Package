package com.google.android.gms.fitness.request;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.fitness.data.BleDevice;

public abstract interface k extends IInterface
{
  public abstract void onDeviceFound(BleDevice paramBleDevice)
    throws RemoteException;

  public abstract void onScanStopped()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.k
 * JD-Core Version:    0.6.0
 */