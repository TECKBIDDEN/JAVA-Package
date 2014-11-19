package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

public class a
  implements Parcelable.Creator<ChangeEvent>
{
  static void a(ChangeEvent paramChangeEvent, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1, paramChangeEvent.BR);
    b.a(paramParcel, 2, paramChangeEvent.MO, paramInt, false);
    b.c(paramParcel, 3, paramChangeEvent.NE);
    b.H(paramParcel, i);
  }

  public ChangeEvent T(Parcel paramParcel)
  {
    int i = 0;
    int j = com.google.android.gms.common.internal.safeparcel.a.C(paramParcel);
    Object localObject1 = null;
    int k = 0;
    if (paramParcel.dataPosition() < j)
    {
      int m = com.google.android.gms.common.internal.safeparcel.a.B(paramParcel);
      int n;
      Object localObject2;
      int i1;
      switch (com.google.android.gms.common.internal.safeparcel.a.aD(m))
      {
      default:
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, m);
        n = i;
        localObject2 = localObject1;
        i1 = k;
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        k = i1;
        localObject1 = localObject2;
        i = n;
        break;
        int i2 = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
        int i3 = i;
        localObject2 = localObject1;
        i1 = i2;
        n = i3;
        continue;
        DriveId localDriveId = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(paramParcel, m, DriveId.CREATOR);
        i1 = k;
        n = i;
        localObject2 = localDriveId;
        continue;
        n = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
        localObject2 = localObject1;
        i1 = k;
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new ChangeEvent(k, localObject1, i);
  }

  public ChangeEvent[] ba(int paramInt)
  {
    return new ChangeEvent[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.events.a
 * JD-Core Version:    0.6.0
 */