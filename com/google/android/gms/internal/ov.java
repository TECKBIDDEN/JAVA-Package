package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

public abstract interface ov extends IInterface
{
  public abstract void a(int paramInt, FullWallet paramFullWallet, Bundle paramBundle)
    throws RemoteException;

  public abstract void a(int paramInt, MaskedWallet paramMaskedWallet, Bundle paramBundle)
    throws RemoteException;

  public abstract void a(int paramInt, boolean paramBoolean, Bundle paramBundle)
    throws RemoteException;

  public abstract void a(Status paramStatus, oo paramoo, Bundle paramBundle)
    throws RemoteException;

  public abstract void i(int paramInt, Bundle paramBundle)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ov
 * JD-Core Version:    0.6.0
 */