package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class aj
  implements Parcelable.Creator<OnDownloadProgressResponse>
{
  static void a(OnDownloadProgressResponse paramOnDownloadProgressResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramOnDownloadProgressResponse.BR);
    b.a(paramParcel, 2, paramOnDownloadProgressResponse.Ph);
    b.a(paramParcel, 3, paramOnDownloadProgressResponse.Pi);
    b.H(paramParcel, i);
  }

  public OnDownloadProgressResponse al(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = a.C(paramParcel);
    int j = 0;
    long l2 = l1;
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
        l2 = a.i(paramParcel, k);
        break;
      case 3:
        l1 = a.i(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new OnDownloadProgressResponse(j, l2, l1);
  }

  public OnDownloadProgressResponse[] bx(int paramInt)
  {
    return new OnDownloadProgressResponse[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.aj
 * JD-Core Version:    0.6.0
 */