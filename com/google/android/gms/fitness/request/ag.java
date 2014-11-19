package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ag
  implements Parcelable.Creator<UnclaimBleDeviceRequest>
{
  static void a(UnclaimBleDeviceRequest paramUnclaimBleDeviceRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1000, paramUnclaimBleDeviceRequest.getVersionCode());
    b.a(paramParcel, 2, paramUnclaimBleDeviceRequest.getDeviceAddress(), false);
    b.H(paramParcel, i);
  }

  public UnclaimBleDeviceRequest bT(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        str = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new UnclaimBleDeviceRequest(j, str);
  }

  public UnclaimBleDeviceRequest[] dl(int paramInt)
  {
    return new UnclaimBleDeviceRequest[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.ag
 * JD-Core Version:    0.6.0
 */