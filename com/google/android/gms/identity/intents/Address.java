package com.google.android.gms.identity.intents;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.ll;

public final class Address
{
  public static final Api<Address.AddressOptions> API;
  static final Api.c<ll> CU = new Api.c();
  private static final Api.b<ll, Address.AddressOptions> CV = new Address.1();

  static
  {
    API = new Api(CV, CU, new Scope[0]);
  }

  public static void requestUserAddress(GoogleApiClient paramGoogleApiClient, UserAddressRequest paramUserAddressRequest, int paramInt)
  {
    paramGoogleApiClient.a(new Address.2(paramUserAddressRequest, paramInt));
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.identity.intents.Address
 * JD-Core Version:    0.6.0
 */