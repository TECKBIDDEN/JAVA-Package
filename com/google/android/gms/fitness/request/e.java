package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSet;

public class e
  implements Parcelable.Creator<DataInsertRequest>
{
  static void a(DataInsertRequest paramDataInsertRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramDataInsertRequest.iP(), paramInt, false);
    b.c(paramParcel, 1000, paramDataInsertRequest.getVersionCode());
    b.H(paramParcel, i);
  }

  public DataInsertRequest bC(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    DataSet localDataSet = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localDataSet = (DataSet)a.a(paramParcel, k, DataSet.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new DataInsertRequest(j, localDataSet);
  }

  public DataInsertRequest[] cT(int paramInt)
  {
    return new DataInsertRequest[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.e
 * JD-Core Version:    0.6.0
 */