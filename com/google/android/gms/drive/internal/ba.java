package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

public class ba
  implements Parcelable.Creator<SetResourceParentsRequest>
{
  static void a(SetResourceParentsRequest paramSetResourceParentsRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramSetResourceParentsRequest.BR);
    b.a(paramParcel, 2, paramSetResourceParentsRequest.Pr, paramInt, false);
    b.c(paramParcel, 3, paramSetResourceParentsRequest.Ps, false);
    b.H(paramParcel, i);
  }

  public SetResourceParentsRequest aB(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = a.C(paramParcel);
    int j = 0;
    Object localObject2 = null;
    if (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      Object localObject3;
      Object localObject4;
      int m;
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        localObject3 = localObject1;
        localObject4 = localObject2;
        m = j;
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        j = m;
        localObject2 = localObject4;
        localObject1 = localObject3;
        break;
        int n = a.g(paramParcel, k);
        Object localObject5 = localObject1;
        localObject4 = localObject2;
        m = n;
        localObject3 = localObject5;
        continue;
        DriveId localDriveId = (DriveId)a.a(paramParcel, k, DriveId.CREATOR);
        m = j;
        localObject3 = localObject1;
        localObject4 = localDriveId;
        continue;
        localObject3 = a.c(paramParcel, k, DriveId.CREATOR);
        localObject4 = localObject2;
        m = j;
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return (SetResourceParentsRequest)new SetResourceParentsRequest(j, localObject2, localObject1);
  }

  public SetResourceParentsRequest[] bN(int paramInt)
  {
    return new SetResourceParentsRequest[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.ba
 * JD-Core Version:    0.6.0
 */