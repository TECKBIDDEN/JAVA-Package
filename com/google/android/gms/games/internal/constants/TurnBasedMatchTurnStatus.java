package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class TurnBasedMatchTurnStatus
{
  public static String dH(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      GamesLog.q("MatchTurnStatus", "Unknown match turn status: " + paramInt);
      str = "TURN_STATUS_UNKNOWN";
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return str;
      str = "TURN_STATUS_INVITED";
      continue;
      str = "TURN_STATUS_MY_TURN";
      continue;
      str = "TURN_STATUS_THEIR_TURN";
      continue;
      str = "TURN_STATUS_COMPLETE";
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.constants.TurnBasedMatchTurnStatus
 * JD-Core Version:    0.6.0
 */