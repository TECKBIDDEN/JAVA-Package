package com.google.android.gms.wallet;

public final class FullWalletRequest$Builder
{
  private FullWalletRequest$Builder(FullWalletRequest paramFullWalletRequest)
  {
  }

  public FullWalletRequest build()
  {
    return this.asB;
  }

  public Builder setCart(Cart paramCart)
  {
    this.asB.asA = paramCart;
    return this;
  }

  public Builder setGoogleTransactionId(String paramString)
  {
    this.asB.asq = paramString;
    return this;
  }

  public Builder setMerchantTransactionId(String paramString)
  {
    this.asB.asr = paramString;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.FullWalletRequest.Builder
 * JD-Core Version:    0.6.0
 */