package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class mh
  implements Parcelable.Creator<mg>
{
  static void a(mg parammg, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, parammg.ma());
    b.c(paramParcel, 1000, parammg.getVersionCode());
    b.c(paramParcel, 2, parammg.me());
    b.a(paramParcel, 3, parammg.mf(), paramInt, false);
    b.H(paramParcel, i);
  }

  public mg cy(Parcel paramParcel)
  {
    int i = 0;
    int j = a.C(paramParcel);
    int k = -1;
    mi localmi = null;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.B(paramParcel);
      switch (a.aD(n))
      {
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        i = a.g(paramParcel, n);
        break;
      case 1000:
        m = a.g(paramParcel, n);
        break;
      case 2:
        k = a.g(paramParcel, n);
        break;
      case 3:
        localmi = (mi)a.a(paramParcel, n, mi.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new mg(m, i, k, localmi);
  }

  public mg[] en(int paramInt)
  {
    return new mg[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mh
 * JD-Core Version:    0.6.0
 */