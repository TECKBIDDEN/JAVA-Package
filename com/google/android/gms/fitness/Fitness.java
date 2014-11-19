package com.google.android.gms.fitness;

import android.os.Build.VERSION;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.kj;
import com.google.android.gms.internal.ku;
import com.google.android.gms.internal.kw;
import com.google.android.gms.internal.kx;
import com.google.android.gms.internal.ky;
import com.google.android.gms.internal.kz;
import com.google.android.gms.internal.la;
import com.google.android.gms.internal.lb;
import com.google.android.gms.internal.lc;
import com.google.android.gms.internal.ld;

public class Fitness
{
  public static final Api<Api.ApiOptions.NoOptions> API;
  public static final BleApi BleApi;
  public static final Api.c<kj> CU = new Api.c();
  private static final Api.b<kj, Api.ApiOptions.NoOptions> CV = new Fitness.1();
  public static final ConfigApi ConfigApi;
  public static final HistoryApi HistoryApi;
  public static final RecordingApi RecordingApi;
  public static final SensorsApi SensorsApi;
  public static final SessionsApi SessionsApi;
  public static final ku Sf;

  static
  {
    API = new Api(CV, CU, new Scope[0]);
    SensorsApi = new lb();
    RecordingApi = new la();
    SessionsApi = new lc();
    HistoryApi = new ky();
    ConfigApi = new kx();
    BleApi = iy();
    Sf = new kz();
  }

  private static BleApi iy()
  {
    if (Build.VERSION.SDK_INT >= 18);
    for (Object localObject = new kw(); ; localObject = new ld())
      return localObject;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.Fitness
 * JD-Core Version:    0.6.0
 */