package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

public class ma
  implements Parcelable.Creator<lz>
{
  static void a(lz paramlz, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramlz.Ux, paramInt, false);
    b.c(paramParcel, 1000, paramlz.getVersionCode());
    b.a(paramParcel, 2, paramlz.aeX);
    b.a(paramParcel, 3, paramlz.aeY);
    b.a(paramParcel, 4, paramlz.aeZ);
    b.c(paramParcel, 5, paramlz.afa, false);
    b.a(paramParcel, 6, paramlz.mTag, false);
    b.H(paramParcel, i);
  }

  public lz cv(Parcel paramParcel)
  {
    String str = null;
    boolean bool1 = true;
    boolean bool2 = false;
    int i = a.C(paramParcel);
    Object localObject = lz.aeW;
    boolean bool3 = bool1;
    LocationRequest localLocationRequest = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localLocationRequest = (LocationRequest)a.a(paramParcel, k, LocationRequest.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        bool2 = a.c(paramParcel, k);
        break;
      case 3:
        bool3 = a.c(paramParcel, k);
        break;
      case 4:
        bool1 = a.c(paramParcel, k);
        break;
      case 5:
        localObject = a.c(paramParcel, k, lr.CREATOR);
        break;
      case 6:
        str = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return (lz)new lz(j, localLocationRequest, bool2, bool3, bool1, (List)localObject, str);
  }

  public lz[] ei(int paramInt)
  {
    return new lz[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ma
 * JD-Core Version:    0.6.0
 */