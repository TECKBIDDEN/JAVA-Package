package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class of
  implements Parcelable.Creator<ny.d>
{
  static void a(ny.d paramd, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    Set localSet = paramd.alR;
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, paramd.BR);
    if (localSet.contains(Integer.valueOf(2)))
      b.a(paramParcel, 2, paramd.amp, true);
    if (localSet.contains(Integer.valueOf(3)))
      b.a(paramParcel, 3, paramd.anp, true);
    if (localSet.contains(Integer.valueOf(4)))
      b.a(paramParcel, 4, paramd.ams, true);
    if (localSet.contains(Integer.valueOf(5)))
      b.a(paramParcel, 5, paramd.anq, true);
    if (localSet.contains(Integer.valueOf(6)))
      b.a(paramParcel, 6, paramd.anr, true);
    if (localSet.contains(Integer.valueOf(7)))
      b.a(paramParcel, 7, paramd.ans, true);
    b.H(paramParcel, i);
  }

  public ny.d dj(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.C(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
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
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2:
        str6 = a.o(paramParcel, k);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3:
        str5 = a.o(paramParcel, k);
        localHashSet.add(Integer.valueOf(3));
        break;
      case 4:
        str4 = a.o(paramParcel, k);
        localHashSet.add(Integer.valueOf(4));
        break;
      case 5:
        str3 = a.o(paramParcel, k);
        localHashSet.add(Integer.valueOf(5));
        break;
      case 6:
        str2 = a.o(paramParcel, k);
        localHashSet.add(Integer.valueOf(6));
        break;
      case 7:
        str1 = a.o(paramParcel, k);
        localHashSet.add(Integer.valueOf(7));
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ny.d(localHashSet, j, str6, str5, str4, str3, str2, str1);
  }

  public ny.d[] fa(int paramInt)
  {
    return new ny.d[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.of
 * JD-Core Version:    0.6.0
 */