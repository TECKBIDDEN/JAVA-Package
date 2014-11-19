package com.google.android.gms.identity.intents;

import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class UserAddressRequest$Builder
{
  private UserAddressRequest$Builder(UserAddressRequest paramUserAddressRequest)
  {
  }

  public Builder addAllowedCountrySpecification(CountrySpecification paramCountrySpecification)
  {
    if (this.adA.adz == null)
      this.adA.adz = new ArrayList();
    this.adA.adz.add(paramCountrySpecification);
    return this;
  }

  public Builder addAllowedCountrySpecifications(Collection<CountrySpecification> paramCollection)
  {
    if (this.adA.adz == null)
      this.adA.adz = new ArrayList();
    this.adA.adz.addAll(paramCollection);
    return this;
  }

  public UserAddressRequest build()
  {
    if (this.adA.adz != null)
      this.adA.adz = Collections.unmodifiableList(this.adA.adz);
    return this.adA;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.identity.intents.UserAddressRequest.Builder
 * JD-Core Version:    0.6.0
 */