package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class mn
  implements Parcelable.Creator<mm>
{
  static void a(mm parammm, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1000, parammm.BR);
    b.a(paramParcel, 2, parammm.mf(), paramInt, false);
    b.a(paramParcel, 3, parammm.getInterval());
    b.c(paramParcel, 4, parammm.getPriority());
    b.H(paramParcel, i);
  }

  public mm cB(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    mi localmi = null;
    long l = mm.afp;
    int k = 102;
    while (paramParcel.dataPosition() < i)
    {
      int m = a.B(paramParcel);
      switch (a.aD(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1000:
        j = a.g(paramParcel, m);
        break;
      case 2:
        localmi = (mi)a.a(paramParcel, m, mi.CREATOR);
        break;
      case 3:
        l = a.i(paramParcel, m);
        break;
      case 4:
        k = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new mm(j, localmi, l, k);
  }

  public mm[] eq(int paramInt)
  {
    return new mm[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mn
 * JD-Core Version:    0.6.0
 */