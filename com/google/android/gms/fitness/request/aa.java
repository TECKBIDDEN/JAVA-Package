package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class aa
  implements Parcelable.Creator<z>
{
  static void a(z paramz, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramz.jl(), paramInt, false);
    b.c(paramParcel, 1000, paramz.getVersionCode());
    b.H(paramParcel, i);
  }

  public z bP(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    PendingIntent localPendingIntent = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localPendingIntent = (PendingIntent)a.a(paramParcel, k, PendingIntent.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new z(j, localPendingIntent);
  }

  public z[] dh(int paramInt)
  {
    return new z[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.aa
 * JD-Core Version:    0.6.0
 */