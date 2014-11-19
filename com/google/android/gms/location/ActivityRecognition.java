package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.lq;
import com.google.android.gms.internal.ly;

public class ActivityRecognition
{
  public static final Api<Api.ApiOptions.NoOptions> API;
  public static ActivityRecognitionApi ActivityRecognitionApi;
  public static final String CLIENT_NAME = "activity_recognition";
  private static final Api.c<ly> CU = new Api.c();
  private static final Api.b<ly, Api.ApiOptions.NoOptions> CV = new ActivityRecognition.1();

  static
  {
    API = new Api(CV, CU, new Scope[0]);
    ActivityRecognitionApi = new lq();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.ActivityRecognition
 * JD-Core Version:    0.6.0
 */