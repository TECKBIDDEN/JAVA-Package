package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

public abstract interface bd extends IInterface
{
  public abstract d X()
    throws RemoteException;

  public abstract ay Y()
    throws RemoteException;

  public abstract void a(ay paramay)
    throws RemoteException;

  public abstract void a(bc parambc)
    throws RemoteException;

  public abstract void a(bf parambf)
    throws RemoteException;

  public abstract void a(eh parameh)
    throws RemoteException;

  public abstract void a(el paramel, String paramString)
    throws RemoteException;

  public abstract void a(et paramet)
    throws RemoteException;

  public abstract void a(eu parameu)
    throws RemoteException;

  public abstract boolean a(av paramav)
    throws RemoteException;

  public abstract void aj()
    throws RemoteException;

  public abstract void destroy()
    throws RemoteException;

  public abstract String getMediationAdapterClassName()
    throws RemoteException;

  public abstract boolean isReady()
    throws RemoteException;

  public abstract void pause()
    throws RemoteException;

  public abstract void resume()
    throws RemoteException;

  public abstract void showInterstitial()
    throws RemoteException;

  public abstract void stopLoading()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bd
 * JD-Core Version:    0.6.0
 */