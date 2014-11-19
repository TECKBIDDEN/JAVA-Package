package com.google.android.gms.wallet.fragment;

public final class WalletFragmentOptions$Builder
{
  private WalletFragmentOptions$Builder(WalletFragmentOptions paramWalletFragmentOptions)
  {
  }

  public WalletFragmentOptions build()
  {
    return this.auc;
  }

  public Builder setEnvironment(int paramInt)
  {
    WalletFragmentOptions.a(this.auc, paramInt);
    return this;
  }

  public Builder setFragmentStyle(int paramInt)
  {
    WalletFragmentOptions.a(this.auc, new WalletFragmentStyle().setStyleResourceId(paramInt));
    return this;
  }

  public Builder setFragmentStyle(WalletFragmentStyle paramWalletFragmentStyle)
  {
    WalletFragmentOptions.a(this.auc, paramWalletFragmentStyle);
    return this;
  }

  public Builder setMode(int paramInt)
  {
    WalletFragmentOptions.c(this.auc, paramInt);
    return this;
  }

  public Builder setTheme(int paramInt)
  {
    WalletFragmentOptions.b(this.auc, paramInt);
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentOptions.Builder
 * JD-Core Version:    0.6.0
 */