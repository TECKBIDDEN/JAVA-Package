package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import java.util.ArrayList;

public class b
  implements Parcelable.Creator<ParcelableEvent>
{
  static void a(ParcelableEvent paramParcelableEvent, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.D(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramParcelableEvent.BR);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramParcelableEvent.vL, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramParcelableEvent.Re, false);
    com.google.android.gms.common.internal.safeparcel.b.b(paramParcel, 4, paramParcelableEvent.Rl, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 5, paramParcelableEvent.Rm);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 6, paramParcelableEvent.Rh, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 7, paramParcelableEvent.Rn, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 8, paramParcelableEvent.Ro, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 9, paramParcelableEvent.Rp, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 10, paramParcelableEvent.Rq, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 11, paramParcelableEvent.Rr, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 12, paramParcelableEvent.Rs, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 13, paramParcelableEvent.Rt, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 14, paramParcelableEvent.Ru, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 15, paramParcelableEvent.Rv, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.H(paramParcel, i);
  }

  public ParcelableEvent aZ(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    int j = 0;
    String str1 = null;
    String str2 = null;
    ArrayList localArrayList = null;
    boolean bool = false;
    String str3 = null;
    String str4 = null;
    TextInsertedDetails localTextInsertedDetails = null;
    TextDeletedDetails localTextDeletedDetails = null;
    ValuesAddedDetails localValuesAddedDetails = null;
    ValuesRemovedDetails localValuesRemovedDetails = null;
    ValuesSetDetails localValuesSetDetails = null;
    ValueChangedDetails localValueChangedDetails = null;
    ReferenceShiftedDetails localReferenceShiftedDetails = null;
    ObjectChangedDetails localObjectChangedDetails = null;
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
        str1 = a.o(paramParcel, k);
        break;
      case 3:
        str2 = a.o(paramParcel, k);
        break;
      case 4:
        localArrayList = a.C(paramParcel, k);
        break;
      case 5:
        bool = a.c(paramParcel, k);
        break;
      case 6:
        str3 = a.o(paramParcel, k);
        break;
      case 7:
        str4 = a.o(paramParcel, k);
        break;
      case 8:
        localTextInsertedDetails = (TextInsertedDetails)a.a(paramParcel, k, TextInsertedDetails.CREATOR);
        break;
      case 9:
        localTextDeletedDetails = (TextDeletedDetails)a.a(paramParcel, k, TextDeletedDetails.CREATOR);
        break;
      case 10:
        localValuesAddedDetails = (ValuesAddedDetails)a.a(paramParcel, k, ValuesAddedDetails.CREATOR);
        break;
      case 11:
        localValuesRemovedDetails = (ValuesRemovedDetails)a.a(paramParcel, k, ValuesRemovedDetails.CREATOR);
        break;
      case 12:
        localValuesSetDetails = (ValuesSetDetails)a.a(paramParcel, k, ValuesSetDetails.CREATOR);
        break;
      case 13:
        localValueChangedDetails = (ValueChangedDetails)a.a(paramParcel, k, ValueChangedDetails.CREATOR);
        break;
      case 14:
        localReferenceShiftedDetails = (ReferenceShiftedDetails)a.a(paramParcel, k, ReferenceShiftedDetails.CREATOR);
        break;
      case 15:
        localObjectChangedDetails = (ObjectChangedDetails)a.a(paramParcel, k, ObjectChangedDetails.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ParcelableEvent(j, str1, str2, localArrayList, bool, str3, str4, localTextInsertedDetails, localTextDeletedDetails, localValuesAddedDetails, localValuesRemovedDetails, localValuesSetDetails, localValueChangedDetails, localReferenceShiftedDetails, localObjectChangedDetails);
  }

  public ParcelableEvent[] cm(int paramInt)
  {
    return new ParcelableEvent[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.event.b
 * JD-Core Version:    0.6.0
 */