package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.BleDevice;

public abstract interface BleScanCallback
{
  public abstract void onDeviceFound(BleDevice paramBleDevice);

  public abstract void onScanStopped();
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.BleScanCallback
 * JD-Core Version:    0.6.0
 */