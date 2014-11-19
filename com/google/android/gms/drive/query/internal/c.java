package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c
  implements Parcelable.Creator<FieldWithSortOrder>
{
  static void a(FieldWithSortOrder paramFieldWithSortOrder, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1000, paramFieldWithSortOrder.BR);
    b.a(paramParcel, 1, paramFieldWithSortOrder.Pt, false);
    b.a(paramParcel, 2, paramFieldWithSortOrder.QF);
    b.H(paramParcel, i);
  }

  public FieldWithSortOrder aM(Parcel paramParcel)
  {
    boolean bool = false;
    int i = a.C(paramParcel);
    String str = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.B(paramParcel);
      switch (a.aD(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 1:
        str = a.o(paramParcel, k);
        break;
      case 2:
        bool = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new FieldWithSortOrder(j, str, bool);
  }

  public FieldWithSortOrder[] bY(int paramInt)
  {
    return new FieldWithSortOrder[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.internal.c
 * JD-Core Version:    0.6.0
 */