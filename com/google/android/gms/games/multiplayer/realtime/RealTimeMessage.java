package com.google.android.gms.games.multiplayer.realtime;

import B;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;

public final class RealTimeMessage
  implements Parcelable
{
  public static final Parcelable.Creator<RealTimeMessage> CREATOR = new RealTimeMessage.1();
  public static final int RELIABLE = 1;
  public static final int UNRELIABLE;
  private final String aca;
  private final byte[] acb;
  private final int acc;

  private RealTimeMessage(Parcel paramParcel)
  {
    this(paramParcel.readString(), paramParcel.createByteArray(), paramParcel.readInt());
  }

  public RealTimeMessage(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    this.aca = ((String)n.i(paramString));
    this.acb = ((byte[])((byte[])n.i(paramArrayOfByte)).clone());
    this.acc = paramInt;
  }

  public int describeContents()
  {
    return 0;
  }

  public byte[] getMessageData()
  {
    return this.acb;
  }

  public String getSenderParticipantId()
  {
    return this.aca;
  }

  public boolean isReliable()
  {
    int i = 1;
    if (this.acc == i);
    while (true)
    {
      return i;
      i = 0;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.aca);
    paramParcel.writeByteArray(this.acb);
    paramParcel.writeInt(this.acc);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RealTimeMessage
 * JD-Core Version:    0.6.0
 */