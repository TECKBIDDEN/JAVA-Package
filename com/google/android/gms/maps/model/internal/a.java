package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

public abstract interface a extends IInterface
{
  public abstract d b(Bitmap paramBitmap)
    throws RemoteException;

  public abstract d bX(String paramString)
    throws RemoteException;

  public abstract d bY(String paramString)
    throws RemoteException;

  public abstract d bZ(String paramString)
    throws RemoteException;

  public abstract d c(float paramFloat)
    throws RemoteException;

  public abstract d eM(int paramInt)
    throws RemoteException;

  public abstract d mQ()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.internal.a
 * JD-Core Version:    0.6.0
 */