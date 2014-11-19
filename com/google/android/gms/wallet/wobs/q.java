package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class q
  implements Parcelable.Creator<p>
{
  static void a(p paramp, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramp.getVersionCode());
    b.a(paramParcel, 2, paramp.auy, false);
    b.a(paramParcel, 3, paramp.tG, false);
    b.a(paramParcel, 4, paramp.auC, paramInt, false);
    b.a(paramParcel, 5, paramp.auD, paramInt, false);
    b.a(paramParcel, 6, paramp.auE, paramInt, false);
    b.H(paramParcel, i);
  }

  public p dO(Parcel paramParcel)
  {
    n localn1 = null;
    int i = a.C(paramParcel);
    int j = 0;
    n localn2 = null;
    l locall = null;
    String str1 = null;
    String str2 = null;
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
        str2 = a.o(paramParcel, k);
        break;
      case 3:
        str1 = a.o(paramParcel, k);
        break;
      case 4:
        locall = (l)a.a(paramParcel, k, l.CREATOR);
        break;
      case 5:
        localn2 = (n)a.a(paramParcel, k, n.CREATOR);
        break;
      case 6:
        localn1 = (n)a.a(paramParcel, k, n.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new p(j, str2, str1, locall, localn2, localn1);
  }

  public p[] fQ(int paramInt)
  {
    return new p[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.q
 * JD-Core Version:    0.6.0
 */