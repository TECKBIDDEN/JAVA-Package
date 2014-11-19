package com.google.android.gms.games.multiplayer;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Invitations
{
  public abstract Intent getInvitationInboxIntent(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<Invitations.LoadInvitationsResult> loadInvitations(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<Invitations.LoadInvitationsResult> loadInvitations(GoogleApiClient paramGoogleApiClient, int paramInt);

  public abstract void registerInvitationListener(GoogleApiClient paramGoogleApiClient, OnInvitationReceivedListener paramOnInvitationReceivedListener);

  public abstract void unregisterInvitationListener(GoogleApiClient paramGoogleApiClient);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.Invitations
 * JD-Core Version:    0.6.0
 */