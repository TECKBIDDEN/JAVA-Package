package com.google.android.gms.games.leaderboard;

import android.os.Bundle;

public final class LeaderboardScoreBufferHeader
{
  private final Bundle MZ;

  public LeaderboardScoreBufferHeader(Bundle paramBundle)
  {
    if (paramBundle == null)
      paramBundle = new Bundle();
    this.MZ = paramBundle;
  }

  public Bundle lz()
  {
    return this.MZ;
  }

  public static final class Builder
  {
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader
 * JD-Core Version:    0.6.0
 */