package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class jk
  implements Parcelable.Creator<ji.a>
{
  static void a(ji.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, parama.getVersionCode());
    b.c(paramParcel, 2, parama.hd());
    b.a(paramParcel, 3, parama.hj());
    b.c(paramParcel, 4, parama.he());
    b.a(paramParcel, 5, parama.hk());
    b.a(paramParcel, 6, parama.hl(), false);
    b.c(paramParcel, 7, parama.hm());
    b.a(paramParcel, 8, parama.ho(), false);
    b.a(paramParcel, 9, parama.hq(), paramInt, false);
    b.H(paramParcel, i);
  }

  public ji.a I(Parcel paramParcel)
  {
    jd localjd = null;
    int i = 0;
    int j = a.C(paramParcel);
    String str1 = null;
    String str2 = null;
    boolean bool1 = false;
    int k = 0;
    boolean bool2 = false;
    int m = 0;
    int n = 0;
    while (paramParcel.dataPosition() < j)
    {
      int i1 = a.B(paramParcel);
      switch (a.aD(i1))
      {
      default:
        a.b(paramParcel, i1);
        break;
      case 1:
        n = a.g(paramParcel, i1);
        break;
      case 2:
        m = a.g(paramParcel, i1);
        break;
      case 3:
        bool2 = a.c(paramParcel, i1);
        break;
      case 4:
        k = a.g(paramParcel, i1);
        break;
      case 5:
        bool1 = a.c(paramParcel, i1);
        break;
      case 6:
        str2 = a.o(paramParcel, i1);
        break;
      case 7:
        i = a.g(paramParcel, i1);
        break;
      case 8:
        str1 = a.o(paramParcel, i1);
        break;
      case 9:
        localjd = (jd)a.a(paramParcel, i1, jd.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new ji.a(n, m, bool2, k, bool1, str2, i, str1, localjd);
  }

  public ji.a[] aI(int paramInt)
  {
    return new ji.a[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jk
 * JD-Core Version:    0.6.0
 */