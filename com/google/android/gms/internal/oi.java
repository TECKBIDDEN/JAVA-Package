package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class oi
  implements Parcelable.Creator<ny.h>
{
  static void a(ny.h paramh, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    Set localSet = paramh.alR;
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, paramh.BR);
    if (localSet.contains(Integer.valueOf(3)))
      b.c(paramParcel, 3, paramh.nB());
    if (localSet.contains(Integer.valueOf(4)))
      b.a(paramParcel, 4, paramh.mValue, true);
    if (localSet.contains(Integer.valueOf(5)))
      b.a(paramParcel, 5, paramh.anw, true);
    if (localSet.contains(Integer.valueOf(6)))
      b.c(paramParcel, 6, paramh.FD);
    b.H(paramParcel, i);
  }

  public ny.h dm(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int j = a.C(paramParcel);
    HashSet localHashSet = new HashSet();
    int k = 0;
    String str2 = null;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.B(paramParcel);
      switch (a.aD(n))
      {
      case 2:
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        m = a.g(paramParcel, n);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 3:
        i = a.g(paramParcel, n);
        localHashSet.add(Integer.valueOf(3));
        break;
      case 4:
        str1 = a.o(paramParcel, n);
        localHashSet.add(Integer.valueOf(4));
        break;
      case 5:
        str2 = a.o(paramParcel, n);
        localHashSet.add(Integer.valueOf(5));
        break;
      case 6:
        k = a.g(paramParcel, n);
        localHashSet.add(Integer.valueOf(6));
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new ny.h(localHashSet, m, str2, k, str1, i);
  }

  public ny.h[] fd(int paramInt)
  {
    return new ny.h[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.oi
 * JD-Core Version:    0.6.0
 */