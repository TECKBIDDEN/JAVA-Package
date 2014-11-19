package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.games.Player;
import java.util.ArrayList;

public final class ParticipantUtils
{
  public static boolean bS(String paramString)
  {
    n.b(paramString, "Participant ID must not be null");
    return paramString.startsWith("p_");
  }

  public static String getParticipantId(ArrayList<Participant> paramArrayList, String paramString)
  {
    int i = paramArrayList.size();
    int j = 0;
    Participant localParticipant;
    if (j < i)
    {
      localParticipant = (Participant)paramArrayList.get(j);
      Player localPlayer = localParticipant.getPlayer();
      if ((localPlayer == null) || (!localPlayer.getPlayerId().equals(paramString)));
    }
    for (String str = localParticipant.getParticipantId(); ; str = null)
    {
      return str;
      j++;
      break;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.ParticipantUtils
 * JD-Core Version:    0.6.0
 */