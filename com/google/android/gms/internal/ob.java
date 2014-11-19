package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class ob
  implements Parcelable.Creator<ny.b>
{
  static void a(ny.b paramb, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    Set localSet = paramb.alR;
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, paramb.BR);
    if (localSet.contains(Integer.valueOf(2)))
      b.a(paramParcel, 2, paramb.ank, paramInt, true);
    if (localSet.contains(Integer.valueOf(3)))
      b.a(paramParcel, 3, paramb.anl, paramInt, true);
    if (localSet.contains(Integer.valueOf(4)))
      b.c(paramParcel, 4, paramb.anm);
    b.H(paramParcel, i);
  }

  public ny.b df(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    int j = a.C(paramParcel);
    HashSet localHashSet = new HashSet();
    Object localObject2 = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.B(paramParcel);
      switch (a.aD(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        k = a.g(paramParcel, m);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2:
        ny.b.a locala = (ny.b.a)a.a(paramParcel, m, ny.b.a.CREATOR);
        localHashSet.add(Integer.valueOf(2));
        localObject2 = locala;
        break;
      case 3:
        ny.b.b localb = (ny.b.b)a.a(paramParcel, m, ny.b.b.CREATOR);
        localHashSet.add(Integer.valueOf(3));
        localObject1 = localb;
        break;
      case 4:
        i = a.g(paramParcel, m);
        localHashSet.add(Integer.valueOf(4));
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new ny.b(localHashSet, k, localObject2, localObject1, i);
  }

  public ny.b[] eW(int paramInt)
  {
    return new ny.b[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ob
 * JD-Core Version:    0.6.0
 */