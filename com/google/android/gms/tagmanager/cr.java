package com.google.android.gms.tagmanager;

import I;
import com.google.android.gms.internal.b;
import com.google.android.gms.internal.c.b;
import com.google.android.gms.internal.c.e;
import com.google.android.gms.internal.c.f;
import com.google.android.gms.internal.c.g;
import com.google.android.gms.internal.c.h;
import com.google.android.gms.internal.d.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class cr
{
  private static d.a a(int paramInt, c.f paramf, d.a[] paramArrayOfa, Set<Integer> paramSet)
    throws cr.g
  {
    int i = 0;
    if (paramSet.contains(Integer.valueOf(paramInt)))
      cI("Value cycle detected.  Current value reference: " + paramInt + "." + "  Previous value references: " + paramSet + ".");
    d.a locala1 = (d.a)a(paramf.fG, paramInt, "values");
    Object localObject;
    if (paramArrayOfa[paramInt] != null)
    {
      localObject = paramArrayOfa[paramInt];
      return localObject;
    }
    d.a locala2 = null;
    paramSet.add(Integer.valueOf(paramInt));
    switch (locala1.type)
    {
    default:
    case 2:
    case 3:
    case 4:
    case 7:
    case 1:
    case 5:
    case 6:
    case 8:
    }
    while (true)
    {
      if (locala2 == null)
        cI("Invalid value: " + locala1);
      paramArrayOfa[paramInt] = locala2;
      paramSet.remove(Integer.valueOf(paramInt));
      localObject = locala2;
      break;
      c.h localh3 = h(locala1);
      locala2 = g(locala1);
      locala2.gw = new d.a[localh3.gh.length];
      int[] arrayOfInt4 = localh3.gh;
      int i10 = arrayOfInt4.length;
      int i13;
      for (int i11 = 0; i < i10; i11 = i13)
      {
        int i12 = arrayOfInt4[i];
        d.a[] arrayOfa4 = locala2.gw;
        i13 = i11 + 1;
        arrayOfa4[i11] = a(i12, paramf, paramArrayOfa, paramSet);
        i++;
      }
      locala2 = g(locala1);
      c.h localh2 = h(locala1);
      if (localh2.gi.length != localh2.gj.length)
        cI("Uneven map keys (" + localh2.gi.length + ") and map values (" + localh2.gj.length + ")");
      locala2.gx = new d.a[localh2.gi.length];
      locala2.gy = new d.a[localh2.gi.length];
      int[] arrayOfInt2 = localh2.gi;
      int i1 = arrayOfInt2.length;
      int i2 = 0;
      int i9;
      for (int i3 = 0; i2 < i1; i3 = i9)
      {
        int i8 = arrayOfInt2[i2];
        d.a[] arrayOfa3 = locala2.gx;
        i9 = i3 + 1;
        arrayOfa3[i3] = a(i8, paramf, paramArrayOfa, paramSet);
        i2++;
      }
      int[] arrayOfInt3 = localh2.gj;
      int i4 = arrayOfInt3.length;
      int i7;
      for (int i5 = 0; i < i4; i5 = i7)
      {
        int i6 = arrayOfInt3[i];
        d.a[] arrayOfa2 = locala2.gy;
        i7 = i5 + 1;
        arrayOfa2[i5] = a(i6, paramf, paramArrayOfa, paramSet);
        i++;
      }
      locala2 = g(locala1);
      locala2.gz = di.j(a(h(locala1).gm, paramf, paramArrayOfa, paramSet));
      continue;
      locala2 = g(locala1);
      c.h localh1 = h(locala1);
      locala2.gD = new d.a[localh1.gl.length];
      int[] arrayOfInt1 = localh1.gl;
      int j = arrayOfInt1.length;
      int n;
      for (int k = 0; i < j; k = n)
      {
        int m = arrayOfInt1[i];
        d.a[] arrayOfa1 = locala2.gD;
        n = k + 1;
        arrayOfa1[k] = a(m, paramf, paramArrayOfa, paramSet);
        i++;
      }
      locala2 = locala1;
    }
  }

  private static a a(c.b paramb, c.f paramf, d.a[] paramArrayOfa, int paramInt)
    throws cr.g
  {
    b localb = a.oR();
    int[] arrayOfInt = paramb.fq;
    int i = arrayOfInt.length;
    int j = 0;
    if (j < i)
    {
      Integer localInteger = Integer.valueOf(arrayOfInt[j]);
      c.e locale = (c.e)a(paramf.fH, localInteger.intValue(), "properties");
      String str = (String)a(paramf.fF, locale.key, "keys");
      d.a locala = (d.a)a(paramArrayOfa, locale.value, "values");
      if (b.ec.toString().equals(str))
        localb.i(locala);
      while (true)
      {
        j++;
        break;
        localb.b(str, locala);
      }
    }
    return localb.oU();
  }

  private static e a(c.g paramg, List<a> paramList1, List<a> paramList2, List<a> paramList3, c.f paramf)
  {
    f localf = e.oZ();
    int[] arrayOfInt1 = paramg.fV;
    int i = arrayOfInt1.length;
    for (int j = 0; j < i; j++)
      localf.b((a)paramList3.get(Integer.valueOf(arrayOfInt1[j]).intValue()));
    int[] arrayOfInt2 = paramg.fW;
    int k = arrayOfInt2.length;
    for (int m = 0; m < k; m++)
      localf.c((a)paramList3.get(Integer.valueOf(arrayOfInt2[m]).intValue()));
    int[] arrayOfInt3 = paramg.fX;
    int n = arrayOfInt3.length;
    for (int i1 = 0; i1 < n; i1++)
      localf.d((a)paramList1.get(Integer.valueOf(arrayOfInt3[i1]).intValue()));
    int[] arrayOfInt4 = paramg.fZ;
    int i2 = arrayOfInt4.length;
    for (int i3 = 0; i3 < i2; i3++)
    {
      Integer localInteger4 = Integer.valueOf(arrayOfInt4[i3]);
      localf.cK(paramf.fG[localInteger4.intValue()].gv);
    }
    int[] arrayOfInt5 = paramg.fY;
    int i4 = arrayOfInt5.length;
    for (int i5 = 0; i5 < i4; i5++)
      localf.e((a)paramList1.get(Integer.valueOf(arrayOfInt5[i5]).intValue()));
    int[] arrayOfInt6 = paramg.ga;
    int i6 = arrayOfInt6.length;
    for (int i7 = 0; i7 < i6; i7++)
    {
      Integer localInteger3 = Integer.valueOf(arrayOfInt6[i7]);
      localf.cL(paramf.fG[localInteger3.intValue()].gv);
    }
    int[] arrayOfInt7 = paramg.gb;
    int i8 = arrayOfInt7.length;
    for (int i9 = 0; i9 < i8; i9++)
      localf.f((a)paramList2.get(Integer.valueOf(arrayOfInt7[i9]).intValue()));
    int[] arrayOfInt8 = paramg.gd;
    int i10 = arrayOfInt8.length;
    for (int i11 = 0; i11 < i10; i11++)
    {
      Integer localInteger2 = Integer.valueOf(arrayOfInt8[i11]);
      localf.cM(paramf.fG[localInteger2.intValue()].gv);
    }
    int[] arrayOfInt9 = paramg.gc;
    int i12 = arrayOfInt9.length;
    for (int i13 = 0; i13 < i12; i13++)
      localf.g((a)paramList2.get(Integer.valueOf(arrayOfInt9[i13]).intValue()));
    int[] arrayOfInt10 = paramg.ge;
    int i14 = arrayOfInt10.length;
    for (int i15 = 0; i15 < i14; i15++)
    {
      Integer localInteger1 = Integer.valueOf(arrayOfInt10[i15]);
      localf.cN(paramf.fG[localInteger1.intValue()].gv);
    }
    return localf.pk();
  }

  private static <T> T a(T[] paramArrayOfT, int paramInt, String paramString)
    throws cr.g
  {
    if ((paramInt < 0) || (paramInt >= paramArrayOfT.length))
      cI("Index out of bounds detected: " + paramInt + " in " + paramString);
    return paramArrayOfT[paramInt];
  }

  public static c b(c.f paramf)
    throws cr.g
  {
    int i = 0;
    d.a[] arrayOfa = new d.a[paramf.fG.length];
    for (int j = 0; j < paramf.fG.length; j++)
      a(j, paramf, arrayOfa, new HashSet(0));
    d locald = c.oV();
    ArrayList localArrayList1 = new ArrayList();
    for (int k = 0; k < paramf.fJ.length; k++)
      localArrayList1.add(a(paramf.fJ[k], paramf, arrayOfa, k));
    ArrayList localArrayList2 = new ArrayList();
    for (int m = 0; m < paramf.fK.length; m++)
      localArrayList2.add(a(paramf.fK[m], paramf, arrayOfa, m));
    ArrayList localArrayList3 = new ArrayList();
    for (int n = 0; n < paramf.fI.length; n++)
    {
      a locala = a(paramf.fI[n], paramf, arrayOfa, n);
      locald.a(locala);
      localArrayList3.add(locala);
    }
    c.g[] arrayOfg = paramf.fL;
    int i1 = arrayOfg.length;
    while (i < i1)
    {
      locald.a(a(arrayOfg[i], localArrayList1, localArrayList3, localArrayList2, paramf));
      i++;
    }
    locald.cJ(paramf.version);
    locald.fl(paramf.fT);
    return locald.oY();
  }

  public static void b(InputStream paramInputStream, OutputStream paramOutputStream)
    throws IOException
  {
    byte[] arrayOfByte = new byte[1024];
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1)
        return;
      paramOutputStream.write(arrayOfByte, 0, i);
    }
  }

  private static void cI(String paramString)
    throws cr.g
  {
    bh.T(paramString);
    throw new g(paramString);
  }

  public static d.a g(d.a parama)
  {
    d.a locala = new d.a();
    locala.type = parama.type;
    locala.gE = ((int[])parama.gE.clone());
    if (parama.gF)
      locala.gF = parama.gF;
    return locala;
  }

  private static c.h h(d.a parama)
    throws cr.g
  {
    if ((c.h)parama.a(c.h.gf) == null)
      cI("Expected a ServingValue and didn't get one. Value is: " + parama);
    return (c.h)parama.a(c.h.gf);
  }

  public static class a
  {
    private final Map<String, d.a> aqs;
    private final d.a aqt;

    private a(Map<String, d.a> paramMap, d.a parama)
    {
      this.aqs = paramMap;
      this.aqt = parama;
    }

    public static cr.b oR()
    {
      return new cr.b(null);
    }

    public void a(String paramString, d.a parama)
    {
      this.aqs.put(paramString, parama);
    }

    public Map<String, d.a> oS()
    {
      return Collections.unmodifiableMap(this.aqs);
    }

    public d.a oT()
    {
      return this.aqt;
    }

    public String toString()
    {
      return "Properties: " + oS() + " pushAfterEvaluate: " + this.aqt;
    }
  }

  public static class b
  {
    private final Map<String, d.a> aqs = new HashMap();
    private d.a aqt;

    public b b(String paramString, d.a parama)
    {
      this.aqs.put(paramString, parama);
      return this;
    }

    public b i(d.a parama)
    {
      this.aqt = parama;
      return this;
    }

    public cr.a oU()
    {
      return new cr.a(this.aqs, this.aqt, null);
    }
  }

  public static class c
  {
    private final String Sq;
    private final List<cr.e> aqu;
    private final Map<String, List<cr.a>> aqv;
    private final int aqw;

    private c(List<cr.e> paramList, Map<String, List<cr.a>> paramMap, String paramString, int paramInt)
    {
      this.aqu = Collections.unmodifiableList(paramList);
      this.aqv = Collections.unmodifiableMap(paramMap);
      this.Sq = paramString;
      this.aqw = paramInt;
    }

    public static cr.d oV()
    {
      return new cr.d(null);
    }

    public String getVersion()
    {
      return this.Sq;
    }

    public List<cr.e> oW()
    {
      return this.aqu;
    }

    public Map<String, List<cr.a>> oX()
    {
      return this.aqv;
    }

    public String toString()
    {
      return "Rules: " + oW() + "  Macros: " + this.aqv;
    }
  }

  public static class d
  {
    private String Sq = "";
    private final List<cr.e> aqu = new ArrayList();
    private final Map<String, List<cr.a>> aqv = new HashMap();
    private int aqw = 0;

    public d a(cr.a parama)
    {
      String str = di.j((d.a)parama.oS().get(b.df.toString()));
      Object localObject = (List)this.aqv.get(str);
      if (localObject == null)
      {
        localObject = new ArrayList();
        this.aqv.put(str, localObject);
      }
      ((List)localObject).add(parama);
      return (d)this;
    }

    public d a(cr.e parame)
    {
      this.aqu.add(parame);
      return this;
    }

    public d cJ(String paramString)
    {
      this.Sq = paramString;
      return this;
    }

    public d fl(int paramInt)
    {
      this.aqw = paramInt;
      return this;
    }

    public cr.c oY()
    {
      return new cr.c(this.aqu, this.aqv, this.Sq, this.aqw, null);
    }
  }

  public static class e
  {
    private final List<cr.a> aqA;
    private final List<cr.a> aqB;
    private final List<cr.a> aqC;
    private final List<String> aqD;
    private final List<String> aqE;
    private final List<String> aqF;
    private final List<String> aqG;
    private final List<cr.a> aqx;
    private final List<cr.a> aqy;
    private final List<cr.a> aqz;

    private e(List<cr.a> paramList1, List<cr.a> paramList2, List<cr.a> paramList3, List<cr.a> paramList4, List<cr.a> paramList5, List<cr.a> paramList6, List<String> paramList7, List<String> paramList8, List<String> paramList9, List<String> paramList10)
    {
      this.aqx = Collections.unmodifiableList(paramList1);
      this.aqy = Collections.unmodifiableList(paramList2);
      this.aqz = Collections.unmodifiableList(paramList3);
      this.aqA = Collections.unmodifiableList(paramList4);
      this.aqB = Collections.unmodifiableList(paramList5);
      this.aqC = Collections.unmodifiableList(paramList6);
      this.aqD = Collections.unmodifiableList(paramList7);
      this.aqE = Collections.unmodifiableList(paramList8);
      this.aqF = Collections.unmodifiableList(paramList9);
      this.aqG = Collections.unmodifiableList(paramList10);
    }

    public static cr.f oZ()
    {
      return new cr.f(null);
    }

    public List<cr.a> pa()
    {
      return this.aqx;
    }

    public List<cr.a> pb()
    {
      return this.aqy;
    }

    public List<cr.a> pc()
    {
      return this.aqz;
    }

    public List<cr.a> pd()
    {
      return this.aqA;
    }

    public List<cr.a> pe()
    {
      return this.aqB;
    }

    public List<String> pf()
    {
      return this.aqD;
    }

    public List<String> pg()
    {
      return this.aqE;
    }

    public List<String> ph()
    {
      return this.aqF;
    }

    public List<String> pi()
    {
      return this.aqG;
    }

    public List<cr.a> pj()
    {
      return this.aqC;
    }

    public String toString()
    {
      return "Positive predicates: " + pa() + "  Negative predicates: " + pb() + "  Add tags: " + pc() + "  Remove tags: " + pd() + "  Add macros: " + pe() + "  Remove macros: " + pj();
    }
  }

  public static class f
  {
    private final List<cr.a> aqA = new ArrayList();
    private final List<cr.a> aqB = new ArrayList();
    private final List<cr.a> aqC = new ArrayList();
    private final List<String> aqD = new ArrayList();
    private final List<String> aqE = new ArrayList();
    private final List<String> aqF = new ArrayList();
    private final List<String> aqG = new ArrayList();
    private final List<cr.a> aqx = new ArrayList();
    private final List<cr.a> aqy = new ArrayList();
    private final List<cr.a> aqz = new ArrayList();

    public f b(cr.a parama)
    {
      this.aqx.add(parama);
      return this;
    }

    public f c(cr.a parama)
    {
      this.aqy.add(parama);
      return this;
    }

    public f cK(String paramString)
    {
      this.aqF.add(paramString);
      return this;
    }

    public f cL(String paramString)
    {
      this.aqG.add(paramString);
      return this;
    }

    public f cM(String paramString)
    {
      this.aqD.add(paramString);
      return this;
    }

    public f cN(String paramString)
    {
      this.aqE.add(paramString);
      return this;
    }

    public f d(cr.a parama)
    {
      this.aqz.add(parama);
      return this;
    }

    public f e(cr.a parama)
    {
      this.aqA.add(parama);
      return this;
    }

    public f f(cr.a parama)
    {
      this.aqB.add(parama);
      return this;
    }

    public f g(cr.a parama)
    {
      this.aqC.add(parama);
      return this;
    }

    public cr.e pk()
    {
      return new cr.e(this.aqx, this.aqy, this.aqz, this.aqA, this.aqB, this.aqC, this.aqD, this.aqE, this.aqF, this.aqG, null);
    }
  }

  public static class g extends Exception
  {
    public g(String paramString)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.cr
 * JD-Core Version:    0.6.0
 */