package com.google.android.gms.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface GamesMetadata
{
  public abstract Game getCurrentGame(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<GamesMetadata.LoadGamesResult> loadGame(GoogleApiClient paramGoogleApiClient);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.GamesMetadata
 * JD-Core Version:    0.6.0
 */