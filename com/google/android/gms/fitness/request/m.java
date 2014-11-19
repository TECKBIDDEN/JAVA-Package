package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataType;

public class m
  implements Parcelable.Creator<l>
{
  static void a(l paraml, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paraml.getDataType(), paramInt, false);
    b.c(paramParcel, 1000, paraml.getVersionCode());
    b.H(paramParcel, i);
  }

  public l bH(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    DataType localDataType = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localDataType = (DataType)a.a(paramParcel, k, DataType.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new l(j, localDataType);
  }

  public l[] cY(int paramInt)
  {
    return new l[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.m
 * JD-Core Version:    0.6.0
 */