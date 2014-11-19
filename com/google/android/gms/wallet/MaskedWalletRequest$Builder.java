package com.google.android.gms.wallet;

import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;

public final class MaskedWalletRequest$Builder
{
  private MaskedWalletRequest$Builder(MaskedWalletRequest paramMaskedWalletRequest)
  {
  }

  public Builder addAllowedCountrySpecificationForShipping(CountrySpecification paramCountrySpecification)
  {
    if (this.atp.ato == null)
      this.atp.ato = new ArrayList();
    this.atp.ato.add(paramCountrySpecification);
    return this;
  }

  public Builder addAllowedCountrySpecificationsForShipping(Collection<CountrySpecification> paramCollection)
  {
    if (paramCollection != null)
    {
      if (this.atp.ato == null)
        this.atp.ato = new ArrayList();
      this.atp.ato.addAll(paramCollection);
    }
    return this;
  }

  public MaskedWalletRequest build()
  {
    return this.atp;
  }

  public Builder setAllowDebitCard(boolean paramBoolean)
  {
    this.atp.atn = paramBoolean;
    return this;
  }

  public Builder setAllowPrepaidCard(boolean paramBoolean)
  {
    this.atp.atm = paramBoolean;
    return this;
  }

  public Builder setCart(Cart paramCart)
  {
    this.atp.asA = paramCart;
    return this;
  }

  public Builder setCurrencyCode(String paramString)
  {
    this.atp.asl = paramString;
    return this;
  }

  public Builder setEstimatedTotalPrice(String paramString)
  {
    this.atp.ath = paramString;
    return this;
  }

  public Builder setIsBillingAgreement(boolean paramBoolean)
  {
    this.atp.atk = paramBoolean;
    return this;
  }

  public Builder setMerchantName(String paramString)
  {
    this.atp.ati = paramString;
    return this;
  }

  public Builder setMerchantTransactionId(String paramString)
  {
    this.atp.asr = paramString;
    return this;
  }

  public Builder setPhoneNumberRequired(boolean paramBoolean)
  {
    this.atp.ate = paramBoolean;
    return this;
  }

  public Builder setShippingAddressRequired(boolean paramBoolean)
  {
    this.atp.atf = paramBoolean;
    return this;
  }

  public Builder setShouldRetrieveWalletObjects(boolean paramBoolean)
  {
    this.atp.atj = paramBoolean;
    return this;
  }

  public Builder setUseMinimalBillingAddress(boolean paramBoolean)
  {
    this.atp.atg = paramBoolean;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.MaskedWalletRequest.Builder
 * JD-Core Version:    0.6.0
 */