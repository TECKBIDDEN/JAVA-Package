package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Subscription;

public class af
  implements Parcelable.Creator<ae>
{
  static void a(ae paramae, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramae.jB(), paramInt, false);
    b.c(paramParcel, 1000, paramae.getVersionCode());
    b.a(paramParcel, 2, paramae.jC());
    b.H(paramParcel, i);
  }

  public ae bS(Parcel paramParcel)
  {
    boolean bool1 = false;
    int i = a.C(paramParcel);
    Object localObject1 = null;
    int j = 0;
    if (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      boolean bool2;
      Object localObject2;
      int m;
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        bool2 = bool1;
        localObject2 = localObject1;
        m = j;
      case 1:
      case 1000:
      case 2:
      }
      while (true)
      {
        j = m;
        localObject1 = localObject2;
        bool1 = bool2;
        break;
        Subscription localSubscription = (Subscription)a.a(paramParcel, k, Subscription.CREATOR);
        m = j;
        bool2 = bool1;
        localObject2 = localSubscription;
        continue;
        int n = a.g(paramParcel, k);
        boolean bool3 = bool1;
        localObject2 = localObject1;
        m = n;
        bool2 = bool3;
        continue;
        bool2 = a.c(paramParcel, k);
        localObject2 = localObject1;
        m = j;
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ae(j, localObject1, bool1);
  }

  public ae[] dk(int paramInt)
  {
    return new ae[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.af
 * JD-Core Version:    0.6.0
 */