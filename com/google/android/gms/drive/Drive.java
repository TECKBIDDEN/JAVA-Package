package com.google.android.gms.drive;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.drive.internal.o;
import com.google.android.gms.drive.internal.q;
import com.google.android.gms.drive.internal.t;
import com.google.android.gms.drive.internal.x;

public final class Drive
{
  public static final Api<Api.ApiOptions.NoOptions> API;
  public static final Api.c<q> CU = new Api.c();
  public static final DriveApi DriveApi;
  public static final Scope MU;
  public static final Scope MV;
  public static final Api<Drive.b> MW;
  public static final b MX;
  public static final e MY;
  public static final Scope SCOPE_APPFOLDER;
  public static final Scope SCOPE_FILE = new Scope("https://www.googleapis.com/auth/drive.file");

  static
  {
    SCOPE_APPFOLDER = new Scope("https://www.googleapis.com/auth/drive.appdata");
    MU = new Scope("https://www.googleapis.com/auth/drive");
    MV = new Scope("https://www.googleapis.com/auth/drive.apps");
    API = new Api(new Drive.1(), CU, new Scope[0]);
    MW = new Api(new Drive.2(), CU, new Scope[0]);
    DriveApi = new o();
    MX = new t();
    MY = new x();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.Drive
 * JD-Core Version:    0.6.0
 */