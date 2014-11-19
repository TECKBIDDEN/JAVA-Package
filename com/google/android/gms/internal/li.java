package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSource;

public class li
  implements Parcelable.Creator<lh>
{
  static void a(lh paramlh, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramlh.getDataSource(), paramInt, false);
    b.c(paramParcel, 1000, paramlh.getVersionCode());
    b.H(paramParcel, i);
  }

  public lh bz(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    DataSource localDataSource = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localDataSource = (DataSource)a.a(paramParcel, k, DataSource.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new lh(j, localDataSource);
  }

  public lh[] cQ(int paramInt)
  {
    return new lh[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.li
 * JD-Core Version:    0.6.0
 */