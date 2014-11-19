package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class nu
  implements Parcelable.Creator<nt>
{
  static void a(nt paramnt, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    Set localSet = paramnt.alR;
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, paramnt.BR);
    if (localSet.contains(Integer.valueOf(2)))
      b.a(paramParcel, 2, paramnt.alS, paramInt, true);
    if (localSet.contains(Integer.valueOf(3)))
      b.b(paramParcel, 3, paramnt.alT, true);
    if (localSet.contains(Integer.valueOf(4)))
      b.a(paramParcel, 4, paramnt.alU, paramInt, true);
    if (localSet.contains(Integer.valueOf(5)))
      b.a(paramParcel, 5, paramnt.alV, true);
    if (localSet.contains(Integer.valueOf(6)))
      b.a(paramParcel, 6, paramnt.alW, true);
    if (localSet.contains(Integer.valueOf(7)))
      b.a(paramParcel, 7, paramnt.alX, true);
    if (localSet.contains(Integer.valueOf(8)))
      b.c(paramParcel, 8, paramnt.alY, true);
    if (localSet.contains(Integer.valueOf(9)))
      b.c(paramParcel, 9, paramnt.alZ);
    if (localSet.contains(Integer.valueOf(10)))
      b.c(paramParcel, 10, paramnt.ama, true);
    if (localSet.contains(Integer.valueOf(11)))
      b.a(paramParcel, 11, paramnt.amb, paramInt, true);
    if (localSet.contains(Integer.valueOf(12)))
      b.c(paramParcel, 12, paramnt.amc, true);
    if (localSet.contains(Integer.valueOf(13)))
      b.a(paramParcel, 13, paramnt.amd, true);
    if (localSet.contains(Integer.valueOf(14)))
      b.a(paramParcel, 14, paramnt.ame, true);
    if (localSet.contains(Integer.valueOf(15)))
      b.a(paramParcel, 15, paramnt.amf, paramInt, true);
    if (localSet.contains(Integer.valueOf(17)))
      b.a(paramParcel, 17, paramnt.amh, true);
    if (localSet.contains(Integer.valueOf(16)))
      b.a(paramParcel, 16, paramnt.amg, true);
    if (localSet.contains(Integer.valueOf(19)))
      b.c(paramParcel, 19, paramnt.ami, true);
    if (localSet.contains(Integer.valueOf(18)))
      b.a(paramParcel, 18, paramnt.ol, true);
    if (localSet.contains(Integer.valueOf(21)))
      b.a(paramParcel, 21, paramnt.amk, true);
    if (localSet.contains(Integer.valueOf(20)))
      b.a(paramParcel, 20, paramnt.amj, true);
    if (localSet.contains(Integer.valueOf(23)))
      b.a(paramParcel, 23, paramnt.Tg, true);
    if (localSet.contains(Integer.valueOf(22)))
      b.a(paramParcel, 22, paramnt.aml, true);
    if (localSet.contains(Integer.valueOf(25)))
      b.a(paramParcel, 25, paramnt.amn, true);
    if (localSet.contains(Integer.valueOf(24)))
      b.a(paramParcel, 24, paramnt.amm, true);
    if (localSet.contains(Integer.valueOf(27)))
      b.a(paramParcel, 27, paramnt.amp, true);
    if (localSet.contains(Integer.valueOf(26)))
      b.a(paramParcel, 26, paramnt.amo, true);
    if (localSet.contains(Integer.valueOf(29)))
      b.a(paramParcel, 29, paramnt.amr, paramInt, true);
    if (localSet.contains(Integer.valueOf(28)))
      b.a(paramParcel, 28, paramnt.amq, true);
    if (localSet.contains(Integer.valueOf(31)))
      b.a(paramParcel, 31, paramnt.amt, true);
    if (localSet.contains(Integer.valueOf(30)))
      b.a(paramParcel, 30, paramnt.ams, true);
    if (localSet.contains(Integer.valueOf(34)))
      b.a(paramParcel, 34, paramnt.amv, paramInt, true);
    if (localSet.contains(Integer.valueOf(32)))
      b.a(paramParcel, 32, paramnt.BL, true);
    if (localSet.contains(Integer.valueOf(33)))
      b.a(paramParcel, 33, paramnt.amu, true);
    if (localSet.contains(Integer.valueOf(38)))
      b.a(paramParcel, 38, paramnt.aea);
    if (localSet.contains(Integer.valueOf(39)))
      b.a(paramParcel, 39, paramnt.mName, true);
    if (localSet.contains(Integer.valueOf(36)))
      b.a(paramParcel, 36, paramnt.adZ);
    if (localSet.contains(Integer.valueOf(37)))
      b.a(paramParcel, 37, paramnt.amw, paramInt, true);
    if (localSet.contains(Integer.valueOf(42)))
      b.a(paramParcel, 42, paramnt.amz, true);
    if (localSet.contains(Integer.valueOf(43)))
      b.a(paramParcel, 43, paramnt.amA, true);
    if (localSet.contains(Integer.valueOf(40)))
      b.a(paramParcel, 40, paramnt.amx, paramInt, true);
    if (localSet.contains(Integer.valueOf(41)))
      b.c(paramParcel, 41, paramnt.amy, true);
    if (localSet.contains(Integer.valueOf(46)))
      b.a(paramParcel, 46, paramnt.amD, paramInt, true);
    if (localSet.contains(Integer.valueOf(47)))
      b.a(paramParcel, 47, paramnt.amE, true);
    if (localSet.contains(Integer.valueOf(44)))
      b.a(paramParcel, 44, paramnt.amB, true);
    if (localSet.contains(Integer.valueOf(45)))
      b.a(paramParcel, 45, paramnt.amC, true);
    if (localSet.contains(Integer.valueOf(51)))
      b.a(paramParcel, 51, paramnt.amI, true);
    if (localSet.contains(Integer.valueOf(50)))
      b.a(paramParcel, 50, paramnt.amH, paramInt, true);
    if (localSet.contains(Integer.valueOf(49)))
      b.a(paramParcel, 49, paramnt.amG, true);
    if (localSet.contains(Integer.valueOf(48)))
      b.a(paramParcel, 48, paramnt.amF, true);
    if (localSet.contains(Integer.valueOf(55)))
      b.a(paramParcel, 55, paramnt.amK, true);
    if (localSet.contains(Integer.valueOf(54)))
      b.a(paramParcel, 54, paramnt.uR, true);
    if (localSet.contains(Integer.valueOf(53)))
      b.a(paramParcel, 53, paramnt.uO, true);
    if (localSet.contains(Integer.valueOf(52)))
      b.a(paramParcel, 52, paramnt.amJ, true);
    if (localSet.contains(Integer.valueOf(56)))
      b.a(paramParcel, 56, paramnt.amL, true);
    b.H(paramParcel, i);
  }

  public nt db(Parcel paramParcel)
  {
    int i = a.C(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    Object localObject1 = null;
    ArrayList localArrayList1 = null;
    Object localObject2 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    ArrayList localArrayList2 = null;
    int k = 0;
    ArrayList localArrayList3 = null;
    Object localObject3 = null;
    ArrayList localArrayList4 = null;
    String str4 = null;
    String str5 = null;
    Object localObject4 = null;
    String str6 = null;
    String str7 = null;
    String str8 = null;
    ArrayList localArrayList5 = null;
    String str9 = null;
    String str10 = null;
    String str11 = null;
    String str12 = null;
    String str13 = null;
    String str14 = null;
    String str15 = null;
    String str16 = null;
    String str17 = null;
    Object localObject5 = null;
    String str18 = null;
    String str19 = null;
    String str20 = null;
    String str21 = null;
    Object localObject6 = null;
    double d1 = 0.0D;
    Object localObject7 = null;
    double d2 = 0.0D;
    String str22 = null;
    Object localObject8 = null;
    ArrayList localArrayList6 = null;
    String str23 = null;
    String str24 = null;
    String str25 = null;
    String str26 = null;
    Object localObject9 = null;
    String str27 = null;
    String str28 = null;
    String str29 = null;
    Object localObject10 = null;
    String str30 = null;
    String str31 = null;
    String str32 = null;
    String str33 = null;
    String str34 = null;
    String str35 = null;
    while (paramParcel.dataPosition() < i)
    {
      int m = a.B(paramParcel);
      switch (a.aD(m))
      {
      case 35:
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        j = a.g(paramParcel, m);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2:
        nt localnt10 = (nt)a.a(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(2));
        localObject1 = localnt10;
        break;
      case 3:
        localArrayList1 = a.C(paramParcel, m);
        localHashSet.add(Integer.valueOf(3));
        break;
      case 4:
        nt localnt9 = (nt)a.a(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(4));
        localObject2 = localnt9;
        break;
      case 5:
        str1 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(5));
        break;
      case 6:
        str2 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(6));
        break;
      case 7:
        str3 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(7));
        break;
      case 8:
        localArrayList2 = a.c(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(8));
        break;
      case 9:
        k = a.g(paramParcel, m);
        localHashSet.add(Integer.valueOf(9));
        break;
      case 10:
        localArrayList3 = a.c(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(10));
        break;
      case 11:
        nt localnt8 = (nt)a.a(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(11));
        localObject3 = localnt8;
        break;
      case 12:
        localArrayList4 = a.c(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(12));
        break;
      case 13:
        str4 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(13));
        break;
      case 14:
        str5 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(14));
        break;
      case 15:
        nt localnt7 = (nt)a.a(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(15));
        localObject4 = localnt7;
        break;
      case 17:
        str7 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(17));
        break;
      case 16:
        str6 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(16));
        break;
      case 19:
        localArrayList5 = a.c(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(19));
        break;
      case 18:
        str8 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(18));
        break;
      case 21:
        str10 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(21));
        break;
      case 20:
        str9 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(20));
        break;
      case 23:
        str12 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(23));
        break;
      case 22:
        str11 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(22));
        break;
      case 25:
        str14 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(25));
        break;
      case 24:
        str13 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(24));
        break;
      case 27:
        str16 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(27));
        break;
      case 26:
        str15 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(26));
        break;
      case 29:
        nt localnt6 = (nt)a.a(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(29));
        localObject5 = localnt6;
        break;
      case 28:
        str17 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(28));
        break;
      case 31:
        str19 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(31));
        break;
      case 30:
        str18 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(30));
        break;
      case 34:
        nt localnt5 = (nt)a.a(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(34));
        localObject6 = localnt5;
        break;
      case 32:
        str20 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(32));
        break;
      case 33:
        str21 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(33));
        break;
      case 38:
        d2 = a.m(paramParcel, m);
        localHashSet.add(Integer.valueOf(38));
        break;
      case 39:
        str22 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(39));
        break;
      case 36:
        d1 = a.m(paramParcel, m);
        localHashSet.add(Integer.valueOf(36));
        break;
      case 37:
        nt localnt4 = (nt)a.a(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(37));
        localObject7 = localnt4;
        break;
      case 42:
        str23 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(42));
        break;
      case 43:
        str24 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(43));
        break;
      case 40:
        nt localnt3 = (nt)a.a(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(40));
        localObject8 = localnt3;
        break;
      case 41:
        localArrayList6 = a.c(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(41));
        break;
      case 46:
        nt localnt2 = (nt)a.a(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(46));
        localObject9 = localnt2;
        break;
      case 47:
        str27 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(47));
        break;
      case 44:
        str25 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(44));
        break;
      case 45:
        str26 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(45));
        break;
      case 51:
        str30 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(51));
        break;
      case 50:
        nt localnt1 = (nt)a.a(paramParcel, m, nt.CREATOR);
        localHashSet.add(Integer.valueOf(50));
        localObject10 = localnt1;
        break;
      case 49:
        str29 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(49));
        break;
      case 48:
        str28 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(48));
        break;
      case 55:
        str34 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(55));
        break;
      case 54:
        str33 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(54));
        break;
      case 53:
        str32 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(53));
        break;
      case 52:
        str31 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(52));
        break;
      case 56:
        str35 = a.o(paramParcel, m);
        localHashSet.add(Integer.valueOf(56));
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new nt(localHashSet, j, localObject1, localArrayList1, localObject2, str1, str2, str3, localArrayList2, k, localArrayList3, localObject3, localArrayList4, str4, str5, localObject4, str6, str7, str8, localArrayList5, str9, str10, str11, str12, str13, str14, str15, str16, str17, localObject5, str18, str19, str20, str21, localObject6, d1, localObject7, d2, str22, localObject8, localArrayList6, str23, str24, str25, str26, localObject9, str27, str28, str29, localObject10, str30, str31, str32, str33, str34, str35);
  }

  public nt[] eS(int paramInt)
  {
    return new nt[paramInt];
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nu
 * JD-Core Version:    0.6.0
 */