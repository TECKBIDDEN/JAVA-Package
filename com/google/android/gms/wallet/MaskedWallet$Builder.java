package com.google.android.gms.wallet;

import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet$Builder
{
  private MaskedWallet$Builder(MaskedWallet paramMaskedWallet)
  {
  }

  public MaskedWallet build()
  {
    return this.atd;
  }

  public Builder setBillingAddress(Address paramAddress)
  {
    this.atd.asu = paramAddress;
    return this;
  }

  public Builder setBuyerBillingAddress(UserAddress paramUserAddress)
  {
    this.atd.asx = paramUserAddress;
    return this;
  }

  public Builder setBuyerShippingAddress(UserAddress paramUserAddress)
  {
    this.atd.asy = paramUserAddress;
    return this;
  }

  public Builder setEmail(String paramString)
  {
    this.atd.ast = paramString;
    return this;
  }

  public Builder setGoogleTransactionId(String paramString)
  {
    this.atd.asq = paramString;
    return this;
  }

  public Builder setInstrumentInfos(InstrumentInfo[] paramArrayOfInstrumentInfo)
  {
    this.atd.asz = paramArrayOfInstrumentInfo;
    return this;
  }

  public Builder setLoyaltyWalletObjects(LoyaltyWalletObject[] paramArrayOfLoyaltyWalletObject)
  {
    this.atd.atb = paramArrayOfLoyaltyWalletObject;
    return this;
  }

  public Builder setMerchantTransactionId(String paramString)
  {
    this.atd.asr = paramString;
    return this;
  }

  public Builder setOfferWalletObjects(OfferWalletObject[] paramArrayOfOfferWalletObject)
  {
    this.atd.atc = paramArrayOfOfferWalletObject;
    return this;
  }

  public Builder setPaymentDescriptions(String[] paramArrayOfString)
  {
    this.atd.asw = paramArrayOfString;
    return this;
  }

  public Builder setShippingAddress(Address paramAddress)
  {
    this.atd.asv = paramAddress;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.MaskedWallet.Builder
 * JD-Core Version:    0.6.0
 */