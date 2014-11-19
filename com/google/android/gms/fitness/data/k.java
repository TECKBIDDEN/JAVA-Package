package com.google.android.gms.fitness.data;

import android.os.IInterface;
import android.os.RemoteException;

public abstract interface k extends IInterface
{
  public abstract void onEvent(DataPoint paramDataPoint)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.k
 * JD-Core Version:    0.6.0
 */