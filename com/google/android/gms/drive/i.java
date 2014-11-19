package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.n;

public abstract class i
  implements Parcelable
{
  private volatile transient boolean ND = false;

  protected abstract void I(Parcel paramParcel, int paramInt);

  public final boolean hT()
  {
    return this.ND;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!hT());
    for (boolean bool = true; ; bool = false)
    {
      n.I(bool);
      this.ND = true;
      I(paramParcel, paramInt);
      return;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.i
 * JD-Core Version:    0.6.0
 */