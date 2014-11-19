package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

public abstract interface s extends IInterface
{
  public abstract void h(d paramd)
    throws RemoteException;

  public abstract void onSnapshotReady(Bitmap paramBitmap)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.s
 * JD-Core Version:    0.6.0
 */