package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

@Deprecated
public final class LocationStatusCodes
{
  public static final int ERROR = 1;
  public static final int GEOFENCE_NOT_AVAILABLE = 1000;
  public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
  public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
  public static final int SUCCESS;

  public static int ee(int paramInt)
  {
    if (((paramInt >= 0) && (paramInt <= 1)) || ((1000 <= paramInt) && (paramInt <= 1002)));
    while (true)
    {
      return paramInt;
      paramInt = 1;
    }
  }

  public static Status ef(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 1:
    }
    while (true)
    {
      return new Status(paramInt);
      paramInt = 13;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationStatusCodes
 * JD-Core Version:    0.6.0
 */