package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class nj
  implements Parcelable.Creator<nh>
{
  static void a(nh paramnh, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramnh.versionCode);
    b.a(paramParcel, 2, paramnh.akw);
    b.a(paramParcel, 3, paramnh.tag, false);
    b.a(paramParcel, 4, paramnh.akx, false);
    b.a(paramParcel, 5, paramnh.aky, false);
    b.H(paramParcel, i);
  }

  public nh cX(Parcel paramParcel)
  {
    Bundle localBundle = null;
    int i = a.C(paramParcel);
    int j = 0;
    long l = 0L;
    byte[] arrayOfByte = null;
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
        break;
      case 2:
        l = a.i(paramParcel, k);
        break;
      case 3:
        str = a.o(paramParcel, k);
        break;
      case 4:
        arrayOfByte = a.r(paramParcel, k);
        break;
      case 5:
        localBundle = a.q(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new nh(j, l, str, arrayOfByte, localBundle);
  }

  public nh[] eN(int paramInt)
  {
    return new nh[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nj
 * JD-Core Version:    0.6.0
 */