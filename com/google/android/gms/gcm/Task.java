package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class Task
  implements Parcelable
{
  private final String adq = null;
  private final boolean adr = false;
  private final boolean ads = false;
  private final String mTag = null;

  public int describeContents()
  {
    return 0;
  }

  public String getServiceName()
  {
    return this.adq;
  }

  public String getTag()
  {
    return this.mTag;
  }

  public boolean isPersisted()
  {
    return this.ads;
  }

  public boolean isUpdateCurrent()
  {
    return this.adr;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.adq);
    paramParcel.writeString(this.mTag);
    int j;
    if (this.adr)
    {
      j = i;
      paramParcel.writeInt(j);
      if (!this.ads)
        break label53;
    }
    while (true)
    {
      paramParcel.writeInt(i);
      return;
      j = 0;
      break;
      label53: i = 0;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.Task
 * JD-Core Version:    0.6.0
 */