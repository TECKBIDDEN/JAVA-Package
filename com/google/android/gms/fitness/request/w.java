package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Session;

public class w
  implements Parcelable.Creator<v>
{
  static void a(v paramv, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramv.getSession(), paramInt, false);
    b.c(paramParcel, 1000, paramv.getVersionCode());
    b.H(paramParcel, i);
  }

  public v bN(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    Session localSession = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localSession = (Session)a.a(paramParcel, k, Session.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new v(j, localSession);
  }

  public v[] df(int paramInt)
  {
    return new v[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.w
 * JD-Core Version:    0.6.0
 */