package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d
  implements Parcelable.Creator<c>
{
  static void a(c paramc, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramc.aem);
    b.c(paramParcel, 1000, paramc.getVersionCode());
    b.c(paramParcel, 2, paramc.aen);
    b.a(paramParcel, 3, paramc.aeo);
    b.H(paramParcel, i);
  }

  public c ct(Parcel paramParcel)
  {
    int i = 1;
    int j = a.C(paramParcel);
    int k = 0;
    long l = 0L;
    int m = i;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.B(paramParcel);
      switch (a.aD(n))
      {
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        m = a.g(paramParcel, n);
        break;
      case 1000:
        k = a.g(paramParcel, n);
        break;
      case 2:
        i = a.g(paramParcel, n);
        break;
      case 3:
        l = a.i(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new c(k, m, i, l);
  }

  public c[] eg(int paramInt)
  {
    return new c[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.d
 * JD-Core Version:    0.6.0
 */