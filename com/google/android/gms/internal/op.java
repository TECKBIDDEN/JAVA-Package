package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class op
  implements Parcelable.Creator<oo>
{
  static void a(oo paramoo, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramoo.getVersionCode());
    b.a(paramParcel, 2, paramoo.atD, false);
    b.a(paramParcel, 3, paramoo.atE, false);
    b.H(paramParcel, i);
  }

  public oo dC(Parcel paramParcel)
  {
    String[] arrayOfString = null;
    int i = a.C(paramParcel);
    int j = 0;
    byte[][] arrayOfByte = (byte[][])null;
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
        arrayOfString = a.A(paramParcel, k);
        break;
      case 3:
        arrayOfByte = a.s(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new oo(j, arrayOfString, arrayOfByte);
  }

  public oo[] fC(int paramInt)
  {
    return new oo[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.op
 * JD-Core Version:    0.6.0
 */