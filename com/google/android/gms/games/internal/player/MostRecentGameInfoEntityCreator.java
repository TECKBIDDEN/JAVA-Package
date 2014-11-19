package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class MostRecentGameInfoEntityCreator
  implements Parcelable.Creator<MostRecentGameInfoEntity>
{
  static void a(MostRecentGameInfoEntity paramMostRecentGameInfoEntity, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramMostRecentGameInfoEntity.ln(), false);
    b.c(paramParcel, 1000, paramMostRecentGameInfoEntity.getVersionCode());
    b.a(paramParcel, 2, paramMostRecentGameInfoEntity.lo(), false);
    b.a(paramParcel, 3, paramMostRecentGameInfoEntity.lp());
    b.a(paramParcel, 4, paramMostRecentGameInfoEntity.lq(), paramInt, false);
    b.a(paramParcel, 5, paramMostRecentGameInfoEntity.lr(), paramInt, false);
    b.a(paramParcel, 6, paramMostRecentGameInfoEntity.ls(), paramInt, false);
    b.H(paramParcel, i);
  }

  public MostRecentGameInfoEntity cj(Parcel paramParcel)
  {
    Uri localUri1 = null;
    int i = a.C(paramParcel);
    int j = 0;
    long l = 0L;
    Uri localUri2 = null;
    Uri localUri3 = null;
    String str1 = null;
    String str2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        str2 = a.o(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        str1 = a.o(paramParcel, k);
        break;
      case 3:
        l = a.i(paramParcel, k);
        break;
      case 4:
        localUri3 = (Uri)a.a(paramParcel, k, Uri.CREATOR);
        break;
      case 5:
        localUri2 = (Uri)a.a(paramParcel, k, Uri.CREATOR);
        break;
      case 6:
        localUri1 = (Uri)a.a(paramParcel, k, Uri.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new MostRecentGameInfoEntity(j, str2, str1, l, localUri3, localUri2, localUri1);
  }

  public MostRecentGameInfoEntity[] dP(int paramInt)
  {
    return new MostRecentGameInfoEntity[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.player.MostRecentGameInfoEntityCreator
 * JD-Core Version:    0.6.0
 */