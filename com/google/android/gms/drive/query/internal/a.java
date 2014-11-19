package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class a
  implements Parcelable.Creator<ComparisonFilter>
{
  static void a(ComparisonFilter paramComparisonFilter, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.c(paramParcel, 1000, paramComparisonFilter.BR);
    b.a(paramParcel, 1, paramComparisonFilter.QC, paramInt, false);
    b.a(paramParcel, 2, paramComparisonFilter.QD, paramInt, false);
    b.H(paramParcel, i);
  }

  public ComparisonFilter aK(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = com.google.android.gms.common.internal.safeparcel.a.C(paramParcel);
    int j = 0;
    Object localObject2 = null;
    if (paramParcel.dataPosition() < i)
    {
      int k = com.google.android.gms.common.internal.safeparcel.a.B(paramParcel);
      Object localObject3;
      Object localObject4;
      int m;
      switch (com.google.android.gms.common.internal.safeparcel.a.aD(k))
      {
      default:
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, k);
        localObject3 = localObject1;
        localObject4 = localObject2;
        m = j;
      case 1000:
      case 1:
      case 2:
      }
      while (true)
      {
        j = m;
        localObject2 = localObject4;
        localObject1 = localObject3;
        break;
        int n = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, k);
        Object localObject5 = localObject1;
        localObject4 = localObject2;
        m = n;
        localObject3 = localObject5;
        continue;
        Operator localOperator = (Operator)com.google.android.gms.common.internal.safeparcel.a.a(paramParcel, k, Operator.CREATOR);
        m = j;
        localObject3 = localObject1;
        localObject4 = localOperator;
        continue;
        localObject3 = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(paramParcel, k, MetadataBundle.CREATOR);
        localObject4 = localObject2;
        m = j;
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return (ComparisonFilter)new ComparisonFilter(j, localObject2, localObject1);
  }

  public ComparisonFilter[] bW(int paramInt)
  {
    return new ComparisonFilter[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.internal.a
 * JD-Core Version:    0.6.0
 */