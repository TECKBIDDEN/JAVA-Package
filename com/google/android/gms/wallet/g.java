package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g
  implements Parcelable.Creator<FullWalletRequest>
{
  static void a(FullWalletRequest paramFullWalletRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramFullWalletRequest.getVersionCode());
    b.a(paramParcel, 2, paramFullWalletRequest.asq, false);
    b.a(paramParcel, 3, paramFullWalletRequest.asr, false);
    b.a(paramParcel, 4, paramFullWalletRequest.asA, paramInt, false);
    b.H(paramParcel, i);
  }

  public FullWalletRequest ds(Parcel paramParcel)
  {
    Cart localCart = null;
    int i = a.C(paramParcel);
    int j = 0;
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
        j = a.g(paramParcel, k);
        break;
      case 2:
        str2 = a.o(paramParcel, k);
        break;
      case 3:
        str1 = a.o(paramParcel, k);
        break;
      case 4:
        localCart = (Cart)a.a(paramParcel, k, Cart.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new FullWalletRequest(j, str2, str1, localCart);
  }

  public FullWalletRequest[] fs(int paramInt)
  {
    return new FullWalletRequest[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.g
 * JD-Core Version:    0.6.0
 */