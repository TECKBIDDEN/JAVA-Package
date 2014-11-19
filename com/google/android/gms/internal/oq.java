package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public abstract interface oq extends IInterface
{
  public abstract void a(d paramd, WalletFragmentOptions paramWalletFragmentOptions, Bundle paramBundle)
    throws RemoteException;

  public abstract int getState()
    throws RemoteException;

  public abstract void initialize(WalletFragmentInitParams paramWalletFragmentInitParams)
    throws RemoteException;

  public abstract void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    throws RemoteException;

  public abstract void onCreate(Bundle paramBundle)
    throws RemoteException;

  public abstract d onCreateView(d paramd1, d paramd2, Bundle paramBundle)
    throws RemoteException;

  public abstract void onPause()
    throws RemoteException;

  public abstract void onResume()
    throws RemoteException;

  public abstract void onSaveInstanceState(Bundle paramBundle)
    throws RemoteException;

  public abstract void onStart()
    throws RemoteException;

  public abstract void onStop()
    throws RemoteException;

  public abstract void setEnabled(boolean paramBoolean)
    throws RemoteException;

  public abstract void updateMaskedWallet(MaskedWallet paramMaskedWallet)
    throws RemoteException;

  public abstract void updateMaskedWalletRequest(MaskedWalletRequest paramMaskedWalletRequest)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.oq
 * JD-Core Version:    0.6.0
 */