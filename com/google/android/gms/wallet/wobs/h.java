package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h
  implements Parcelable.Creator<g>
{
  static void a(g paramg, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramg.getVersionCode());
    b.c(paramParcel, 2, paramg.aus);
    b.a(paramParcel, 3, paramg.aut, false);
    b.a(paramParcel, 4, paramg.auu);
    b.a(paramParcel, 5, paramg.auv, false);
    b.a(paramParcel, 6, paramg.auw);
    b.c(paramParcel, 7, paramg.aux);
    b.H(paramParcel, i);
  }

  public g dJ(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int j = a.C(paramParcel);
    double d = 0.0D;
    long l = 0L;
    int k = -1;
    String str2 = null;
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
        m = a.g(paramParcel, n);
        break;
      case 2:
        i = a.g(paramParcel, n);
        break;
      case 3:
        str2 = a.o(paramParcel, n);
        break;
      case 4:
        d = a.m(paramParcel, n);
        break;
      case 5:
        str1 = a.o(paramParcel, n);
        break;
      case 6:
        l = a.i(paramParcel, n);
        break;
      case 7:
        k = a.g(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new g(m, i, str2, d, str1, l, k);
  }

  public g[] fL(int paramInt)
  {
    return new g[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.h
 * JD-Core Version:    0.6.0
 */