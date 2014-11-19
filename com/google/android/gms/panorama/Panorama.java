package com.google.android.gms.panorama;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.nb;
import com.google.android.gms.internal.nc;

public final class Panorama
{
  public static final Api<Api.ApiOptions.NoOptions> API;
  public static final Api.c<nc> CU = new Api.c();
  static final Api.b<nc, Api.ApiOptions.NoOptions> CV = new Panorama.1();
  public static final PanoramaApi PanoramaApi;

  static
  {
    API = new Api(CV, CU, new Scope[0]);
    PanoramaApi = new nb();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.panorama.Panorama
 * JD-Core Version:    0.6.0
 */