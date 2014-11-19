package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.lt;
import com.google.android.gms.internal.lu;
import com.google.android.gms.internal.ly;

public class LocationServices
{
  public static final Api<Api.ApiOptions.NoOptions> API;
  private static final Api.c<ly> CU = new Api.c();
  private static final Api.b<ly, Api.ApiOptions.NoOptions> CV = new LocationServices.1();
  public static FusedLocationProviderApi FusedLocationApi;
  public static GeofencingApi GeofencingApi;

  static
  {
    API = new Api(CV, CU, new Scope[0]);
    FusedLocationApi = new lt();
    GeofencingApi = new lu();
  }

  public static ly e(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool1 = true;
    boolean bool2;
    ly locally;
    if (paramGoogleApiClient != null)
    {
      bool2 = bool1;
      n.b(bool2, "GoogleApiClient parameter is required.");
      locally = (ly)paramGoogleApiClient.a(CU);
      if (locally == null)
        break label44;
    }
    while (true)
    {
      n.a(bool1, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
      return locally;
      bool2 = false;
      break;
      label44: bool1 = false;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationServices
 * JD-Core Version:    0.6.0
 */