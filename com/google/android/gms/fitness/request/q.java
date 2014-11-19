package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class q
  implements Parcelable.Creator<p>
{
  static void a(p paramp, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramp.jq(), false);
    b.c(paramParcel, 1000, paramp.getVersionCode());
    b.a(paramParcel, 2, paramp.jl(), paramInt, false);
    b.H(paramParcel, i);
  }

  public p bJ(Parcel paramParcel)
  {
    PendingIntent localPendingIntent = null;
    int i = a.C(paramParcel);
    int j = 0;
    IBinder localIBinder = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localIBinder = a.p(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localPendingIntent = (PendingIntent)a.a(paramParcel, k, PendingIntent.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new p(j, localIBinder, localPendingIntent);
  }

  public p[] db(int paramInt)
  {
    return new p[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.q
 * JD-Core Version:    0.6.0
 */