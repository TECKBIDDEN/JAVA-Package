package com.google.android.gms.games.event;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Events
{
  public abstract void increment(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt);

  public abstract PendingResult<Events.LoadEventsResult> load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);

  public abstract PendingResult<Events.LoadEventsResult> loadByIds(GoogleApiClient paramGoogleApiClient, boolean paramBoolean, String[] paramArrayOfString);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.event.Events
 * JD-Core Version:    0.6.0
 */