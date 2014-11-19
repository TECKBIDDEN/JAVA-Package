package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f
  implements Parcelable.Creator<DataHolder>
{
  static void a(DataHolder paramDataHolder, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramDataHolder.gC(), false);
    b.c(paramParcel, 1000, paramDataHolder.getVersionCode());
    b.a(paramParcel, 2, paramDataHolder.gD(), paramInt, false);
    b.c(paramParcel, 3, paramDataHolder.getStatusCode());
    b.a(paramParcel, 4, paramDataHolder.gz(), false);
    b.H(paramParcel, i);
  }

  public DataHolder[] at(int paramInt)
  {
    return new DataHolder[paramInt];
  }

  public DataHolder z(Parcel paramParcel)
  {
    int i = 0;
    Bundle localBundle = null;
    int j = a.C(paramParcel);
    CursorWindow[] arrayOfCursorWindow = null;
    String[] arrayOfString = null;
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
        arrayOfString = a.A(paramParcel, m);
        break;
      case 1000:
        k = a.g(paramParcel, m);
        break;
      case 2:
        arrayOfCursorWindow = (CursorWindow[])a.b(paramParcel, m, CursorWindow.CREATOR);
        break;
      case 3:
        i = a.g(paramParcel, m);
        break;
      case 4:
        localBundle = a.q(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    DataHolder localDataHolder = new DataHolder(k, arrayOfString, arrayOfCursorWindow, i, localBundle);
    localDataHolder.gB();
    return localDataHolder;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.f
 * JD-Core Version:    0.6.0
 */