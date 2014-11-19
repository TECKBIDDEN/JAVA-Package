package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.jr;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public class a
  implements Parcelable.Creator<CommonWalletObject>
{
  static void a(CommonWalletObject paramCommonWalletObject, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramCommonWalletObject.getVersionCode());
    b.a(paramParcel, 2, paramCommonWalletObject.fl, false);
    b.a(paramParcel, 3, paramCommonWalletObject.asP, false);
    b.a(paramParcel, 4, paramCommonWalletObject.name, false);
    b.a(paramParcel, 5, paramCommonWalletObject.asJ, false);
    b.a(paramParcel, 6, paramCommonWalletObject.asL, false);
    b.a(paramParcel, 7, paramCommonWalletObject.asM, false);
    b.a(paramParcel, 8, paramCommonWalletObject.asN, false);
    b.a(paramParcel, 9, paramCommonWalletObject.asO, false);
    b.c(paramParcel, 10, paramCommonWalletObject.state);
    b.c(paramParcel, 11, paramCommonWalletObject.asQ, false);
    b.a(paramParcel, 12, paramCommonWalletObject.asR, paramInt, false);
    b.c(paramParcel, 13, paramCommonWalletObject.asS, false);
    b.a(paramParcel, 14, paramCommonWalletObject.asT, false);
    b.a(paramParcel, 15, paramCommonWalletObject.asU, false);
    b.a(paramParcel, 17, paramCommonWalletObject.asW);
    b.c(paramParcel, 16, paramCommonWalletObject.asV, false);
    b.c(paramParcel, 19, paramCommonWalletObject.asY, false);
    b.c(paramParcel, 18, paramCommonWalletObject.asX, false);
    b.c(paramParcel, 20, paramCommonWalletObject.asZ, false);
    b.H(paramParcel, i);
  }

  public CommonWalletObject dG(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.a.C(paramParcel);
    int j = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
    String str8 = null;
    int k = 0;
    ArrayList localArrayList1 = jr.hz();
    l locall = null;
    ArrayList localArrayList2 = jr.hz();
    String str9 = null;
    String str10 = null;
    ArrayList localArrayList3 = jr.hz();
    boolean bool = false;
    ArrayList localArrayList4 = jr.hz();
    ArrayList localArrayList5 = jr.hz();
    ArrayList localArrayList6 = jr.hz();
    while (paramParcel.dataPosition() < i)
    {
      int m = com.google.android.gms.common.internal.safeparcel.a.B(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.aD(m))
      {
      default:
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, m);
        break;
      case 1:
        j = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
        break;
      case 2:
        str1 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, m);
        break;
      case 3:
        str2 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, m);
        break;
      case 4:
        str3 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, m);
        break;
      case 5:
        str4 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, m);
        break;
      case 6:
        str5 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, m);
        break;
      case 7:
        str6 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, m);
        break;
      case 8:
        str7 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, m);
        break;
      case 9:
        str8 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, m);
        break;
      case 10:
        k = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
        break;
      case 11:
        localArrayList1 = com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, m, p.CREATOR);
        break;
      case 12:
        locall = (l)com.google.android.gms.common.internal.safeparcel.a.a(paramParcel, m, l.CREATOR);
        break;
      case 13:
        localArrayList2 = com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, m, LatLng.CREATOR);
        break;
      case 14:
        str9 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, m);
        break;
      case 15:
        str10 = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, m);
        break;
      case 17:
        bool = com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, m);
        break;
      case 16:
        localArrayList3 = com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, m, d.CREATOR);
        break;
      case 19:
        localArrayList5 = com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, m, j.CREATOR);
        break;
      case 18:
        localArrayList4 = com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, m, n.CREATOR);
        break;
      case 20:
        localArrayList6 = com.google.android.gms.common.internal.safeparcel.a.c(paramParcel, m, n.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new CommonWalletObject(j, str1, str2, str3, str4, str5, str6, str7, str8, k, localArrayList1, locall, localArrayList2, str9, str10, localArrayList3, bool, localArrayList4, localArrayList5, localArrayList6);
  }

  public CommonWalletObject[] fI(int paramInt)
  {
    return new CommonWalletObject[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.a
 * JD-Core Version:    0.6.0
 */