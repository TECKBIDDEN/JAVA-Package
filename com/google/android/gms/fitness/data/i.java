package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i
  implements Parcelable.Creator<Device>
{
  static void a(Device paramDevice, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramDevice.getManufacturer(), false);
    b.c(paramParcel, 1000, paramDevice.getVersionCode());
    b.a(paramParcel, 2, paramDevice.getModel(), false);
    b.a(paramParcel, 3, paramDevice.getVersion(), false);
    b.a(paramParcel, 4, paramDevice.iN(), false);
    b.c(paramParcel, 5, paramDevice.getType());
    b.H(paramParcel, i);
  }

  public Device bp(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = a.C(paramParcel);
    String str2 = null;
    String str3 = null;
    String str4 = null;
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
        str4 = a.o(paramParcel, m);
        break;
      case 1000:
        k = a.g(paramParcel, m);
        break;
      case 2:
        str3 = a.o(paramParcel, m);
        break;
      case 3:
        str2 = a.o(paramParcel, m);
        break;
      case 4:
        str1 = a.o(paramParcel, m);
        break;
      case 5:
        i = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new Device(k, str4, str3, str2, str1, i);
  }

  public Device[] cG(int paramInt)
  {
    return new Device[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.i
 * JD-Core Version:    0.6.0
 */