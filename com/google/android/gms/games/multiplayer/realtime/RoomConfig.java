package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.n;
import java.util.ArrayList;
import java.util.Arrays;

public final class RoomConfig
{
  private final String WD;
  private final int abS;
  private final RoomUpdateListener acd;
  private final RoomStatusUpdateListener ace;
  private final RealTimeMessageReceivedListener acf;
  private final String[] acg;
  private final Bundle ach;
  private final boolean aci;

  private RoomConfig(Builder paramBuilder)
  {
    this.acd = paramBuilder.acd;
    this.ace = paramBuilder.ace;
    this.acf = paramBuilder.acf;
    this.WD = paramBuilder.acj;
    this.abS = paramBuilder.abS;
    this.ach = paramBuilder.ach;
    this.aci = paramBuilder.aci;
    int i = paramBuilder.ack.size();
    this.acg = ((String[])paramBuilder.ack.toArray(new String[i]));
    if (this.acf == null)
      n.a(this.aci, "Must either enable sockets OR specify a message listener");
  }

  public static Builder builder(RoomUpdateListener paramRoomUpdateListener)
  {
    return new Builder(paramRoomUpdateListener, null);
  }

  public static Bundle createAutoMatchCriteria(int paramInt1, int paramInt2, long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("min_automatch_players", paramInt1);
    localBundle.putInt("max_automatch_players", paramInt2);
    localBundle.putLong("exclusive_bit_mask", paramLong);
    return localBundle;
  }

  public Bundle getAutoMatchCriteria()
  {
    return this.ach;
  }

  public String getInvitationId()
  {
    return this.WD;
  }

  public String[] getInvitedPlayerIds()
  {
    return this.acg;
  }

  public RealTimeMessageReceivedListener getMessageReceivedListener()
  {
    return this.acf;
  }

  public RoomStatusUpdateListener getRoomStatusUpdateListener()
  {
    return this.ace;
  }

  public RoomUpdateListener getRoomUpdateListener()
  {
    return this.acd;
  }

  public int getVariant()
  {
    return this.abS;
  }

  public boolean isSocketEnabled()
  {
    return this.aci;
  }

  public static final class Builder
  {
    int abS = -1;
    final RoomUpdateListener acd;
    RoomStatusUpdateListener ace;
    RealTimeMessageReceivedListener acf;
    Bundle ach;
    boolean aci = false;
    String acj = null;
    ArrayList<String> ack = new ArrayList();

    private Builder(RoomUpdateListener paramRoomUpdateListener)
    {
      this.acd = ((RoomUpdateListener)n.b(paramRoomUpdateListener, "Must provide a RoomUpdateListener"));
    }

    public Builder addPlayersToInvite(ArrayList<String> paramArrayList)
    {
      n.i(paramArrayList);
      this.ack.addAll(paramArrayList);
      return this;
    }

    public Builder addPlayersToInvite(String[] paramArrayOfString)
    {
      n.i(paramArrayOfString);
      this.ack.addAll(Arrays.asList(paramArrayOfString));
      return this;
    }

    public RoomConfig build()
    {
      return new RoomConfig(this, null);
    }

    public Builder setAutoMatchCriteria(Bundle paramBundle)
    {
      this.ach = paramBundle;
      return this;
    }

    public Builder setInvitationIdToAccept(String paramString)
    {
      n.i(paramString);
      this.acj = paramString;
      return this;
    }

    public Builder setMessageReceivedListener(RealTimeMessageReceivedListener paramRealTimeMessageReceivedListener)
    {
      this.acf = paramRealTimeMessageReceivedListener;
      return this;
    }

    public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener paramRoomStatusUpdateListener)
    {
      this.ace = paramRoomStatusUpdateListener;
      return this;
    }

    public Builder setSocketCommunicationEnabled(boolean paramBoolean)
    {
      this.aci = paramBoolean;
      return this;
    }

    public Builder setVariant(int paramInt)
    {
      if ((paramInt == -1) || (paramInt > 0));
      for (boolean bool = true; ; bool = false)
      {
        n.b(bool, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
        this.abS = paramInt;
        return this;
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RoomConfig
 * JD-Core Version:    0.6.0
 */