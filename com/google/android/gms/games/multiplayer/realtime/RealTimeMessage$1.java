package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class RealTimeMessage$1
  implements Parcelable.Creator<RealTimeMessage>
{
  public RealTimeMessage cn(Parcel paramParcel)
  {
    return new RealTimeMessage(paramParcel, null);
  }

  public RealTimeMessage[] dU(int paramInt)
  {
    return new RealTimeMessage[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RealTimeMessage.1
 * JD-Core Version:    0.6.0
 */