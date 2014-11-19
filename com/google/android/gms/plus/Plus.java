package com.google.android.gms.plus;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.no;
import com.google.android.gms.internal.np;
import com.google.android.gms.internal.nq;
import com.google.android.gms.internal.nr;
import com.google.android.gms.internal.ns;
import com.google.android.gms.plus.internal.e;

public final class Plus
{
  public static final Api<Plus.PlusOptions> API;
  public static final Account AccountApi;
  public static final Api.c<e> CU = new Api.c();
  static final Api.b<e, Plus.PlusOptions> CV = new Plus.1();
  public static final Moments MomentsApi;
  public static final People PeopleApi;
  public static final Scope SCOPE_PLUS_LOGIN;
  public static final Scope SCOPE_PLUS_PROFILE;
  public static final b akO;
  public static final a akP;

  static
  {
    API = new Api(CV, CU, new Scope[0]);
    SCOPE_PLUS_LOGIN = new Scope("https://www.googleapis.com/auth/plus.login");
    SCOPE_PLUS_PROFILE = new Scope("https://www.googleapis.com/auth/plus.me");
    MomentsApi = new nr();
    PeopleApi = new ns();
    AccountApi = new no();
    akO = new nq();
    akP = new np();
  }

  public static e a(GoogleApiClient paramGoogleApiClient, Api.c<e> paramc)
  {
    boolean bool1 = true;
    boolean bool2;
    e locale;
    if (paramGoogleApiClient != null)
    {
      bool2 = bool1;
      n.b(bool2, "GoogleApiClient parameter is required.");
      n.a(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      locale = (e)paramGoogleApiClient.a(paramc);
      if (locale == null)
        break label56;
    }
    while (true)
    {
      n.a(bool1, "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
      return locale;
      bool2 = false;
      break;
      label56: bool1 = false;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.Plus
 * JD-Core Version:    0.6.0
 */