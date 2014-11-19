package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.m.a;

public final class ConnectionResult
{
  public static final int API_UNAVAILABLE = 16;
  public static final int CANCELED = 13;
  public static final int DEVELOPER_ERROR = 10;

  @Deprecated
  public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
  public static final ConnectionResult HE = new ConnectionResult(0, null);
  public static final int INTERNAL_ERROR = 8;
  public static final int INTERRUPTED = 15;
  public static final int INVALID_ACCOUNT = 5;
  public static final int LICENSE_CHECK_FAILED = 11;
  public static final int NETWORK_ERROR = 7;
  public static final int RESOLUTION_REQUIRED = 6;
  public static final int SERVICE_DISABLED = 3;
  public static final int SERVICE_INVALID = 9;
  public static final int SERVICE_MISSING = 1;
  public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
  public static final int SIGN_IN_REQUIRED = 4;
  public static final int SUCCESS = 0;
  public static final int TIMEOUT = 14;
  private final int HF;
  private final PendingIntent mPendingIntent;

  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent)
  {
    this.HF = paramInt;
    this.mPendingIntent = paramPendingIntent;
  }

  private String fY()
  {
    String str;
    switch (this.HF)
    {
    case 12:
    default:
      str = "unknown status code " + this.HF;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 13:
    case 14:
    case 15:
    }
    while (true)
    {
      return str;
      str = "SUCCESS";
      continue;
      str = "SERVICE_MISSING";
      continue;
      str = "SERVICE_VERSION_UPDATE_REQUIRED";
      continue;
      str = "SERVICE_DISABLED";
      continue;
      str = "SIGN_IN_REQUIRED";
      continue;
      str = "INVALID_ACCOUNT";
      continue;
      str = "RESOLUTION_REQUIRED";
      continue;
      str = "NETWORK_ERROR";
      continue;
      str = "INTERNAL_ERROR";
      continue;
      str = "SERVICE_INVALID";
      continue;
      str = "DEVELOPER_ERROR";
      continue;
      str = "LICENSE_CHECK_FAILED";
      continue;
      str = "CANCELED";
      continue;
      str = "TIMEOUT";
      continue;
      str = "INTERRUPTED";
    }
  }

  public int getErrorCode()
  {
    return this.HF;
  }

  public PendingIntent getResolution()
  {
    return this.mPendingIntent;
  }

  public boolean hasResolution()
  {
    if ((this.HF != 0) && (this.mPendingIntent != null));
    for (int i = 1; ; i = 0)
      return i;
  }

  public boolean isSuccess()
  {
    if (this.HF == 0);
    for (int i = 1; ; i = 0)
      return i;
  }

  public void startResolutionForResult(Activity paramActivity, int paramInt)
    throws IntentSender.SendIntentException
  {
    if (!hasResolution());
    while (true)
    {
      return;
      paramActivity.startIntentSenderForResult(this.mPendingIntent.getIntentSender(), paramInt, null, 0, 0, 0);
    }
  }

  public String toString()
  {
    return m.h(this).a("statusCode", fY()).a("resolution", this.mPendingIntent).toString();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.ConnectionResult
 * JD-Core Version:    0.6.0
 */