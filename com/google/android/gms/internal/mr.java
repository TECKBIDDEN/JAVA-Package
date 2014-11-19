package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public class mr
  implements Parcelable.Creator<mq>
{
  static void a(mq parammq, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, parammq.getName(), false);
    b.c(paramParcel, 1000, parammq.BR);
    b.a(paramParcel, 2, parammq.mj(), paramInt, false);
    b.a(paramParcel, 3, parammq.getAddress(), false);
    b.c(paramParcel, 4, parammq.mk(), false);
    b.a(paramParcel, 5, parammq.getPhoneNumber(), false);
    b.a(paramParcel, 6, parammq.ml(), false);
    b.H(paramParcel, i);
  }

  public mq cD(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.C(paramParcel);
    int j = 0;
    String str2 = null;
    ArrayList localArrayList = null;
    String str3 = null;
    LatLng localLatLng = null;
    String str4 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        str4 = a.o(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localLatLng = (LatLng)a.a(paramParcel, k, LatLng.CREATOR);
        break;
      case 3:
        str3 = a.o(paramParcel, k);
        break;
      case 4:
        localArrayList = a.c(paramParcel, k, mo.CREATOR);
        break;
      case 5:
        str2 = a.o(paramParcel, k);
        break;
      case 6:
        str1 = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new mq(j, str4, localLatLng, str3, localArrayList, str2, str1);
  }

  public mq[] es(int paramInt)
  {
    return new mq[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mr
 * JD-Core Version:    0.6.0
 */