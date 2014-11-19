package com.google.android.gms.games.achievement;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Achievements
{
  public abstract Intent getAchievementsIntent(GoogleApiClient paramGoogleApiClient);

  public abstract void increment(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt);

  public abstract PendingResult<Achievements.UpdateAchievementResult> incrementImmediate(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt);

  public abstract PendingResult<Achievements.LoadAchievementsResult> load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);

  public abstract void reveal(GoogleApiClient paramGoogleApiClient, String paramString);

  public abstract PendingResult<Achievements.UpdateAchievementResult> revealImmediate(GoogleApiClient paramGoogleApiClient, String paramString);

  public abstract void setSteps(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt);

  public abstract PendingResult<Achievements.UpdateAchievementResult> setStepsImmediate(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt);

  public abstract void unlock(GoogleApiClient paramGoogleApiClient, String paramString);

  public abstract PendingResult<Achievements.UpdateAchievementResult> unlockImmediate(GoogleApiClient paramGoogleApiClient, String paramString);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.achievement.Achievements
 * JD-Core Version:    0.6.0
 */