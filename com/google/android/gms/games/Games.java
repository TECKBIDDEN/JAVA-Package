package com.google.android.gms.games;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.api.AchievementsImpl;
import com.google.android.gms.games.internal.api.AclsImpl;
import com.google.android.gms.games.internal.api.EventsImpl;
import com.google.android.gms.games.internal.api.GamesMetadataImpl;
import com.google.android.gms.games.internal.api.InvitationsImpl;
import com.google.android.gms.games.internal.api.LeaderboardsImpl;
import com.google.android.gms.games.internal.api.MultiplayerImpl;
import com.google.android.gms.games.internal.api.NotificationsImpl;
import com.google.android.gms.games.internal.api.PlayersImpl;
import com.google.android.gms.games.internal.api.QuestsImpl;
import com.google.android.gms.games.internal.api.RealTimeMultiplayerImpl;
import com.google.android.gms.games.internal.api.RequestsImpl;
import com.google.android.gms.games.internal.api.SnapshotsImpl;
import com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.Snapshots;

public final class Games
{
  public static final Api<Games.GamesOptions> API;
  public static final Achievements Achievements;
  static final Api.c<GamesClientImpl> CU = new Api.c();
  private static final Api.b<GamesClientImpl, Games.GamesOptions> CV = new Games.1();
  public static final String EXTRA_PLAYER_IDS = "players";
  public static final Events Events;
  public static final GamesMetadata GamesMetadata;
  public static final Invitations Invitations;
  public static final Leaderboards Leaderboards;
  public static final Notifications Notifications;
  public static final Players Players;
  public static final Quests Quests;
  public static final RealTimeMultiplayer RealTimeMultiplayer;
  public static final Requests Requests;
  public static final Scope SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
  public static final Snapshots Snapshots;
  public static final TurnBasedMultiplayer TurnBasedMultiplayer;
  public static final Scope Vo;
  public static final Api<Games.GamesOptions> Vp;
  public static final Multiplayer Vq;
  public static final Acls Vr;

  static
  {
    Api.b localb1 = CV;
    Api.c localc1 = CU;
    Scope[] arrayOfScope1 = new Scope[1];
    arrayOfScope1[0] = SCOPE_GAMES;
    API = new Api(localb1, localc1, arrayOfScope1);
    Vo = new Scope("https://www.googleapis.com/auth/games.firstparty");
    Api.b localb2 = CV;
    Api.c localc2 = CU;
    Scope[] arrayOfScope2 = new Scope[1];
    arrayOfScope2[0] = Vo;
    Vp = new Api(localb2, localc2, arrayOfScope2);
    GamesMetadata = new GamesMetadataImpl();
    Achievements = new AchievementsImpl();
    Events = new EventsImpl();
    Leaderboards = new LeaderboardsImpl();
    Invitations = new InvitationsImpl();
    TurnBasedMultiplayer = new TurnBasedMultiplayerImpl();
    RealTimeMultiplayer = new RealTimeMultiplayerImpl();
    Vq = new MultiplayerImpl();
    Players = new PlayersImpl();
    Notifications = new NotificationsImpl();
    Quests = new QuestsImpl();
    Requests = new RequestsImpl();
    Snapshots = new SnapshotsImpl();
    Vr = new AclsImpl();
  }

  public static GamesClientImpl c(GoogleApiClient paramGoogleApiClient)
  {
    if (paramGoogleApiClient != null);
    for (boolean bool = true; ; bool = false)
    {
      n.b(bool, "GoogleApiClient parameter is required.");
      n.a(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      return d(paramGoogleApiClient);
    }
  }

  public static GamesClientImpl d(GoogleApiClient paramGoogleApiClient)
  {
    GamesClientImpl localGamesClientImpl = (GamesClientImpl)paramGoogleApiClient.a(CU);
    if (localGamesClientImpl != null);
    for (boolean bool = true; ; bool = false)
    {
      n.a(bool, "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
      return localGamesClientImpl;
    }
  }

  public static String getAppId(GoogleApiClient paramGoogleApiClient)
  {
    return c(paramGoogleApiClient).km();
  }

  public static String getCurrentAccountName(GoogleApiClient paramGoogleApiClient)
  {
    return c(paramGoogleApiClient).jX();
  }

  public static int getSdkVariant(GoogleApiClient paramGoogleApiClient)
  {
    return c(paramGoogleApiClient).kl();
  }

  public static Intent getSettingsIntent(GoogleApiClient paramGoogleApiClient)
  {
    return c(paramGoogleApiClient).kk();
  }

  public static void setGravityForPopups(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    c(paramGoogleApiClient).dB(paramInt);
  }

  public static void setViewForPopups(GoogleApiClient paramGoogleApiClient, View paramView)
  {
    n.i(paramView);
    c(paramGoogleApiClient).k(paramView);
  }

  public static PendingResult<Status> signOut(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.b(new Games.2());
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.Games
 * JD-Core Version:    0.6.0
 */