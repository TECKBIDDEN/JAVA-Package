package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

public abstract interface cu extends IInterface
{
  public abstract void a(d paramd, av paramav, String paramString, cv paramcv)
    throws RemoteException;

  public abstract void a(d paramd, av paramav, String paramString1, String paramString2, cv paramcv)
    throws RemoteException;

  public abstract void a(d paramd, ay paramay, av paramav, String paramString, cv paramcv)
    throws RemoteException;

  public abstract void a(d paramd, ay paramay, av paramav, String paramString1, String paramString2, cv paramcv)
    throws RemoteException;

  public abstract void destroy()
    throws RemoteException;

  public abstract d getView()
    throws RemoteException;

  public abstract void pause()
    throws RemoteException;

  public abstract void resume()
    throws RemoteException;

  public abstract void showInterstitial()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cu
 * JD-Core Version:    0.6.0
 */