package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.wearable.internal.ag;
import com.google.android.gms.wearable.internal.aj;
import com.google.android.gms.wearable.internal.aw;
import com.google.android.gms.wearable.internal.e;
import com.google.android.gms.wearable.internal.f;

public class Wearable
{
  public static final Api<Wearable.WearableOptions> API;
  public static final Api.c<aw> CU;
  private static final Api.b<aw, Wearable.WearableOptions> CV;
  public static final DataApi DataApi = new f();
  public static final MessageApi MessageApi = new ag();
  public static final NodeApi NodeApi = new aj();
  public static final b auQ = new e();

  static
  {
    CU = new Api.c();
    CV = new Wearable.1();
    API = new Api(CV, CU, new Scope[0]);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.Wearable
 * JD-Core Version:    0.6.0
 */