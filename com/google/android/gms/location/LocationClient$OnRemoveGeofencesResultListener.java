package com.google.android.gms.location;

import android.app.PendingIntent;

public abstract interface LocationClient$OnRemoveGeofencesResultListener
{
  public abstract void onRemoveGeofencesByPendingIntentResult(int paramInt, PendingIntent paramPendingIntent);

  public abstract void onRemoveGeofencesByRequestIdsResult(int paramInt, String[] paramArrayOfString);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener
 * JD-Core Version:    0.6.0
 */