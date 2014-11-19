package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

public class bc
  implements Parcelable.Creator<TrashResourceRequest>
{
  static void a(TrashResourceRequest paramTrashResourceRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramTrashResourceRequest.BR);
    b.a(paramParcel, 2, paramTrashResourceRequest.NV, paramInt, false);
    b.H(paramParcel, i);
  }

  public TrashResourceRequest aC(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    DriveId localDriveId = null;
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
        localDriveId = (DriveId)a.a(paramParcel, k, DriveId.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new TrashResourceRequest(j, localDriveId);
  }

  public TrashResourceRequest[] bO(int paramInt)
  {
    return new TrashResourceRequest[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.bc
 * JD-Core Version:    0.6.0
 */