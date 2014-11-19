package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class oh
  implements Parcelable.Creator<ny.g>
{
  static void a(ny.g paramg, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    Set localSet = paramg.alR;
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, paramg.BR);
    if (localSet.contains(Integer.valueOf(2)))
      b.a(paramParcel, 2, paramg.anv);
    if (localSet.contains(Integer.valueOf(3)))
      b.a(paramParcel, 3, paramg.mValue, true);
    b.H(paramParcel, i);
  }

  public ny.g dl(Parcel paramParcel)
  {
    boolean bool = false;
    int i = a.C(paramParcel);
    HashSet localHashSet = new HashSet();
    String str = null;
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
        j = a.g(paramParcel, k);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2:
        bool = a.c(paramParcel, k);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3:
        str = a.o(paramParcel, k);
        localHashSet.add(Integer.valueOf(3));
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ny.g(localHashSet, j, bool, str);
  }

  public ny.g[] fc(int paramInt)
  {
    return new ny.g[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.oh
 * JD-Core Version:    0.6.0
 */