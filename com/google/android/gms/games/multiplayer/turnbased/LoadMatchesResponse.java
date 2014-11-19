package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.TurnBasedMatchTurnStatus;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

public final class LoadMatchesResponse
{
  private final InvitationBuffer aco;
  private final TurnBasedMatchBuffer acp;
  private final TurnBasedMatchBuffer acq;
  private final TurnBasedMatchBuffer acr;

  public LoadMatchesResponse(Bundle paramBundle)
  {
    DataHolder localDataHolder1 = a(paramBundle, 0);
    label48: label73: DataHolder localDataHolder4;
    if (localDataHolder1 != null)
    {
      this.aco = new InvitationBuffer(localDataHolder1);
      DataHolder localDataHolder2 = a(paramBundle, 1);
      if (localDataHolder2 == null)
        break label107;
      this.acp = new TurnBasedMatchBuffer(localDataHolder2);
      DataHolder localDataHolder3 = a(paramBundle, 2);
      if (localDataHolder3 == null)
        break label115;
      this.acq = new TurnBasedMatchBuffer(localDataHolder3);
      localDataHolder4 = a(paramBundle, 3);
      if (localDataHolder4 == null)
        break label123;
    }
    label107: label115: label123: for (this.acr = new TurnBasedMatchBuffer(localDataHolder4); ; this.acr = null)
    {
      return;
      this.aco = null;
      break;
      this.acp = null;
      break label48;
      this.acq = null;
      break label73;
    }
  }

  private static DataHolder a(Bundle paramBundle, int paramInt)
  {
    String str = TurnBasedMatchTurnStatus.dH(paramInt);
    if (!paramBundle.containsKey(str));
    for (DataHolder localDataHolder = null; ; localDataHolder = (DataHolder)paramBundle.getParcelable(str))
      return localDataHolder;
  }

  public void close()
  {
    if (this.aco != null)
      this.aco.close();
    if (this.acp != null)
      this.acp.close();
    if (this.acq != null)
      this.acq.close();
    if (this.acr != null)
      this.acr.close();
  }

  public TurnBasedMatchBuffer getCompletedMatches()
  {
    return this.acr;
  }

  public InvitationBuffer getInvitations()
  {
    return this.aco;
  }

  public TurnBasedMatchBuffer getMyTurnMatches()
  {
    return this.acp;
  }

  public TurnBasedMatchBuffer getTheirTurnMatches()
  {
    return this.acq;
  }

  public boolean hasData()
  {
    int i = 1;
    if ((this.aco != null) && (this.aco.getCount() > 0));
    while (true)
    {
      return i;
      if (((this.acp != null) && (this.acp.getCount() > 0)) || ((this.acq != null) && (this.acq.getCount() > 0)) || ((this.acr != null) && (this.acr.getCount() > 0)))
        continue;
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse
 * JD-Core Version:    0.6.0
 */