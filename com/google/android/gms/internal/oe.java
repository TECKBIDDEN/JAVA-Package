package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class oe
  implements Parcelable.Creator<ny.c>
{
  static void a(ny.c paramc, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    Set localSet = paramc.alR;
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, paramc.BR);
    if (localSet.contains(Integer.valueOf(2)))
      b.a(paramParcel, 2, paramc.uR, true);
    b.H(paramParcel, i);
  }

  public ny.c di(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    String str = null;
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
        str = a.o(paramParcel, k);
        localHashSet.add(Integer.valueOf(2));
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ny.c(localHashSet, j, str);
  }

  public ny.c[] eZ(int paramInt)
  {
    return new ny.c[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.oe
 * JD-Core Version:    0.6.0
 */