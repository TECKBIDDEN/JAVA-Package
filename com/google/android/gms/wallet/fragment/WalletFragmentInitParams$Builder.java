package com.google.android.gms.wallet.fragment;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragmentInitParams$Builder
{
  private WalletFragmentInitParams$Builder(WalletFragmentInitParams paramWalletFragmentInitParams)
  {
  }

  public WalletFragmentInitParams build()
  {
    boolean bool1 = true;
    boolean bool2;
    if (((WalletFragmentInitParams.a(this.aua) != null) && (WalletFragmentInitParams.b(this.aua) == null)) || ((WalletFragmentInitParams.a(this.aua) == null) && (WalletFragmentInitParams.b(this.aua) != null)))
    {
      bool2 = bool1;
      n.a(bool2, "Exactly one of MaskedWallet or MaskedWalletRequest is required");
      if (WalletFragmentInitParams.c(this.aua) < 0)
        break label76;
    }
    while (true)
    {
      n.a(bool1, "masked wallet request code is required and must be non-negative");
      return this.aua;
      bool2 = false;
      break;
      label76: bool1 = false;
    }
  }

  public Builder setAccountName(String paramString)
  {
    WalletFragmentInitParams.a(this.aua, paramString);
    return this;
  }

  public Builder setMaskedWallet(MaskedWallet paramMaskedWallet)
  {
    WalletFragmentInitParams.a(this.aua, paramMaskedWallet);
    return this;
  }

  public Builder setMaskedWalletRequest(MaskedWalletRequest paramMaskedWalletRequest)
  {
    WalletFragmentInitParams.a(this.aua, paramMaskedWalletRequest);
    return this;
  }

  public Builder setMaskedWalletRequestCode(int paramInt)
  {
    WalletFragmentInitParams.a(this.aua, paramInt);
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentInitParams.Builder
 * JD-Core Version:    0.6.0
 */