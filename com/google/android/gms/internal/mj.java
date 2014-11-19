package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class mj
  implements Parcelable.Creator<mi>
{
  static void a(mi parammi, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, parammi.afg, false);
    b.c(paramParcel, 1000, parammi.BR);
    b.a(paramParcel, 2, parammi.mg(), false);
    b.a(paramParcel, 3, parammi.mh());
    b.c(paramParcel, 4, parammi.afj, false);
    b.b(paramParcel, 6, parammi.afk, false);
    b.H(paramParcel, i);
  }

  public mi cz(Parcel paramParcel)
  {
    boolean bool = false;
    ArrayList localArrayList1 = null;
    int i = a.C(paramParcel);
    ArrayList localArrayList2 = null;
    String str = null;
    ArrayList localArrayList3 = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localArrayList3 = a.c(paramParcel, k, mo.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        str = a.o(paramParcel, k);
        break;
      case 3:
        bool = a.c(paramParcel, k);
        break;
      case 4:
        localArrayList2 = a.c(paramParcel, k, ms.CREATOR);
        break;
      case 6:
        localArrayList1 = a.C(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new mi(j, localArrayList3, str, bool, localArrayList2, localArrayList1);
  }

  public mi[] eo(int paramInt)
  {
    return new mi[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mj
 * JD-Core Version:    0.6.0
 */