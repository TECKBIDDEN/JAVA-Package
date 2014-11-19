package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class on
  implements Parcelable.Creator<om>
{
  static void a(om paramom, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramom.getVersionCode());
    b.a(paramParcel, 2, paramom.atC, false);
    b.H(paramParcel, i);
  }

  public om dB(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    int[] arrayOfInt = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        j = a.g(paramParcel, k);
        break;
      case 2:
        arrayOfInt = a.u(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new om(j, arrayOfInt);
  }

  public om[] fB(int paramInt)
  {
    return new om[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.on
 * JD-Core Version:    0.6.0
 */