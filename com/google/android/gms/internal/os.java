package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.d;

public abstract interface os extends IInterface
{
  public abstract void a(Bundle paramBundle, ov paramov)
    throws RemoteException;

  public abstract void a(om paramom, Bundle paramBundle, ov paramov)
    throws RemoteException;

  public abstract void a(FullWalletRequest paramFullWalletRequest, Bundle paramBundle, ov paramov)
    throws RemoteException;

  public abstract void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, ou paramou)
    throws RemoteException;

  public abstract void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, ov paramov)
    throws RemoteException;

  public abstract void a(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest, Bundle paramBundle)
    throws RemoteException;

  public abstract void a(d paramd, Bundle paramBundle, ov paramov)
    throws RemoteException;

  public abstract void a(String paramString1, String paramString2, Bundle paramBundle, ov paramov)
    throws RemoteException;

  public abstract void p(Bundle paramBundle)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.os
 * JD-Core Version:    0.6.0
 */