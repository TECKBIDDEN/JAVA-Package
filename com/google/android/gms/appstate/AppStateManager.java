package com.google.android.gms.appstate;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ib;

public final class AppStateManager
{
  public static final Api<Api.ApiOptions.NoOptions> API;
  static final Api.c<ib> CU = new Api.c();
  private static final Api.b<ib, Api.ApiOptions.NoOptions> CV = new AppStateManager.1();
  public static final Scope SCOPE_APP_STATE = new Scope("https://www.googleapis.com/auth/appstate");

  static
  {
    Api.b localb = CV;
    Api.c localc = CU;
    Scope[] arrayOfScope = new Scope[1];
    arrayOfScope[0] = SCOPE_APP_STATE;
    API = new Api(localb, localc, arrayOfScope);
  }

  public static ib a(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool1 = true;
    boolean bool2;
    ib localib;
    if (paramGoogleApiClient != null)
    {
      bool2 = bool1;
      n.b(bool2, "GoogleApiClient parameter is required.");
      n.a(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      localib = (ib)paramGoogleApiClient.a(CU);
      if (localib == null)
        break label55;
    }
    while (true)
    {
      n.a(bool1, "GoogleApiClient is not configured to use the AppState API. Pass AppStateManager.API into GoogleApiClient.Builder#addApi() to use this feature.");
      return localib;
      bool2 = false;
      break;
      label55: bool1 = false;
    }
  }

  public static PendingResult<AppStateManager.StateDeletedResult> delete(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    return paramGoogleApiClient.b(new AppStateManager.5(paramInt));
  }

  private static AppStateManager.StateResult e(Status paramStatus)
  {
    return new AppStateManager.2(paramStatus);
  }

  public static int getMaxNumKeys(GoogleApiClient paramGoogleApiClient)
  {
    return a(paramGoogleApiClient).fs();
  }

  public static int getMaxStateSize(GoogleApiClient paramGoogleApiClient)
  {
    return a(paramGoogleApiClient).fr();
  }

  public static PendingResult<AppStateManager.StateListResult> list(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new AppStateManager.7());
  }

  public static PendingResult<AppStateManager.StateResult> load(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    return paramGoogleApiClient.a(new AppStateManager.6(paramInt));
  }

  public static PendingResult<AppStateManager.StateResult> resolve(GoogleApiClient paramGoogleApiClient, int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    return paramGoogleApiClient.b(new AppStateManager.8(paramInt, paramString, paramArrayOfByte));
  }

  public static PendingResult<Status> signOut(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.b(new AppStateManager.9());
  }

  public static void update(GoogleApiClient paramGoogleApiClient, int paramInt, byte[] paramArrayOfByte)
  {
    paramGoogleApiClient.b(new AppStateManager.3(paramInt, paramArrayOfByte));
  }

  public static PendingResult<AppStateManager.StateResult> updateImmediate(GoogleApiClient paramGoogleApiClient, int paramInt, byte[] paramArrayOfByte)
  {
    return paramGoogleApiClient.b(new AppStateManager.4(paramInt, paramArrayOfByte));
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.AppStateManager
 * JD-Core Version:    0.6.0
 */