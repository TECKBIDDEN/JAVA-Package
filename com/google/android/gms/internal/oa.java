package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class oa
  implements Parcelable.Creator<ny.a>
{
  static void a(ny.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    Set localSet = parama.alR;
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, parama.BR);
    if (localSet.contains(Integer.valueOf(2)))
      b.c(paramParcel, 2, parama.ani);
    if (localSet.contains(Integer.valueOf(3)))
      b.c(paramParcel, 3, parama.anj);
    b.H(paramParcel, i);
  }

  public ny.a de(Parcel paramParcel)
  {
    int i = 0;
    int j = a.C(paramParcel);
    HashSet localHashSet = new HashSet();
    int k = 0;
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
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2:
        k = a.g(paramParcel, n);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3:
        i = a.g(paramParcel, n);
        localHashSet.add(Integer.valueOf(3));
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new ny.a(localHashSet, m, k, i);
  }

  public ny.a[] eV(int paramInt)
  {
    return new ny.a[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.oa
 * JD-Core Version:    0.6.0
 */