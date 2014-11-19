package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.c.i;
import com.google.android.gms.internal.d.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ct
{
  private static final bz<d.a> aqH = new bz(di.pI(), true);
  private final DataLayer anS;
  private final cr.c aqI;
  private final ag aqJ;
  private final Map<String, aj> aqK;
  private final Map<String, aj> aqL;
  private final Map<String, aj> aqM;
  private final k<cr.a, bz<d.a>> aqN;
  private final k<String, b> aqO;
  private final Set<cr.e> aqP;
  private final Map<String, c> aqQ;
  private volatile String aqR;
  private int aqS;

  public ct(Context paramContext, cr.c paramc, DataLayer paramDataLayer, s.a parama1, s.a parama2, ag paramag)
  {
    if (paramc == null)
      throw new NullPointerException("resource cannot be null");
    this.aqI = paramc;
    this.aqP = new HashSet(paramc.oW());
    this.anS = paramDataLayer;
    this.aqJ = paramag;
    ct.1 local1 = new ct.1(this);
    this.aqN = new l().a(1048576, local1);
    ct.2 local2 = new ct.2(this);
    this.aqO = new l().a(1048576, local2);
    this.aqK = new HashMap();
    b(new i(paramContext));
    b(new s(parama2));
    b(new w(paramDataLayer));
    b(new dj(paramContext, paramDataLayer));
    this.aqL = new HashMap();
    c(new q());
    c(new ad());
    c(new ae());
    c(new al());
    c(new am());
    c(new bd());
    c(new be());
    c(new ci());
    c(new dc());
    this.aqM = new HashMap();
    a(new b(paramContext));
    a(new c(paramContext));
    a(new e(paramContext));
    a(new f(paramContext));
    a(new g(paramContext));
    a(new h(paramContext));
    a(new m());
    a(new p(this.aqI.getVersion()));
    a(new s(parama1));
    a(new u(paramDataLayer));
    a(new z(paramContext));
    a(new aa());
    a(new ac());
    a(new ah(this));
    a(new an());
    a(new ao());
    a(new ax(paramContext));
    a(new az());
    a(new bc());
    a(new bj());
    a(new bl(paramContext));
    a(new ca());
    a(new cc());
    a(new cf());
    a(new ch());
    a(new cj(paramContext));
    a(new cu());
    a(new cv());
    a(new de());
    a(new dk());
    this.aqQ = new HashMap();
    Iterator localIterator1 = this.aqP.iterator();
    while (localIterator1.hasNext())
    {
      cr.e locale = (cr.e)localIterator1.next();
      if (paramag.oo())
      {
        a(locale.pe(), locale.pf(), "add macro");
        a(locale.pj(), locale.pg(), "remove macro");
        a(locale.pc(), locale.ph(), "add tag");
        a(locale.pd(), locale.pi(), "remove tag");
      }
      for (int i = 0; i < locale.pe().size(); i++)
      {
        cr.a locala3 = (cr.a)locale.pe().get(i);
        String str2 = "Unknown";
        if ((paramag.oo()) && (i < locale.pf().size()))
          str2 = (String)locale.pf().get(i);
        c localc2 = e(this.aqQ, h(locala3));
        localc2.b(locale);
        localc2.a(locale, locala3);
        localc2.a(locale, str2);
      }
      for (int j = 0; j < locale.pj().size(); j++)
      {
        cr.a locala2 = (cr.a)locale.pj().get(j);
        String str1 = "Unknown";
        if ((paramag.oo()) && (j < locale.pg().size()))
          str1 = (String)locale.pg().get(j);
        c localc1 = e(this.aqQ, h(locala2));
        localc1.b(locale);
        localc1.b(locale, locala2);
        localc1.b(locale, str1);
      }
    }
    Iterator localIterator2 = this.aqI.oX().entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator2.next();
      Iterator localIterator3 = ((List)localEntry.getValue()).iterator();
      while (localIterator3.hasNext())
      {
        cr.a locala1 = (cr.a)localIterator3.next();
        if (di.n((d.a)locala1.oS().get(com.google.android.gms.internal.b.dG.toString())).booleanValue())
          continue;
        e(this.aqQ, (String)localEntry.getKey()).i(locala1);
      }
    }
  }

  private bz<d.a> a(d.a parama, Set<String> paramSet, dl paramdl)
  {
    bz localbz1;
    if (!parama.gF)
      localbz1 = new bz(parama, true);
    while (true)
    {
      return localbz1;
      switch (parama.type)
      {
      case 5:
      case 6:
      default:
        bh.T("Unknown type: " + parama.type);
        localbz1 = aqH;
        break;
      case 2:
        d.a locala3 = cr.g(parama);
        locala3.gw = new d.a[parama.gw.length];
        for (int k = 0; ; k++)
        {
          if (k >= parama.gw.length)
            break label190;
          bz localbz5 = a(parama.gw[k], paramSet, paramdl.fh(k));
          if (localbz5 == aqH)
          {
            localbz1 = aqH;
            break;
          }
          locala3.gw[k] = ((d.a)localbz5.getObject());
        }
        localbz1 = new bz(locala3, false);
        break;
      case 3:
        d.a locala2 = cr.g(parama);
        if (parama.gx.length != parama.gy.length)
        {
          bh.T("Invalid serving value: " + parama.toString());
          localbz1 = aqH;
          continue;
        }
        locala2.gx = new d.a[parama.gx.length];
        locala2.gy = new d.a[parama.gx.length];
        for (int j = 0; ; j++)
        {
          if (j >= parama.gx.length)
            break label403;
          bz localbz3 = a(parama.gx[j], paramSet, paramdl.fi(j));
          bz localbz4 = a(parama.gy[j], paramSet, paramdl.fj(j));
          if ((localbz3 == aqH) || (localbz4 == aqH))
          {
            localbz1 = aqH;
            break;
          }
          locala2.gx[j] = ((d.a)localbz3.getObject());
          locala2.gy[j] = ((d.a)localbz4.getObject());
        }
        localbz1 = new bz(locala2, false);
        break;
      case 4:
        if (paramSet.contains(parama.gz))
        {
          bh.T("Macro cycle detected.  Current macro reference: " + parama.gz + "." + "  Previous macro references: " + paramSet.toString() + ".");
          localbz1 = aqH;
          continue;
        }
        paramSet.add(parama.gz);
        localbz1 = dm.a(a(parama.gz, paramSet, paramdl.oD()), parama.gE);
        paramSet.remove(parama.gz);
        break;
      case 7:
        label190: d.a locala1 = cr.g(parama);
        label403: locala1.gD = new d.a[parama.gD.length];
        for (int i = 0; ; i++)
        {
          if (i >= parama.gD.length)
            break label631;
          bz localbz2 = a(parama.gD[i], paramSet, paramdl.fk(i));
          if (localbz2 == aqH)
          {
            localbz1 = aqH;
            break;
          }
          locala1.gD[i] = ((d.a)localbz2.getObject());
        }
        label631: localbz1 = new bz(locala1, false);
      }
    }
  }

  private bz<d.a> a(String paramString, Set<String> paramSet, bk parambk)
  {
    this.aqS = (1 + this.aqS);
    b localb = (b)this.aqO.get(paramString);
    if ((localb != null) && (!this.aqJ.oo()))
    {
      a(localb.oT(), paramSet);
      this.aqS = (-1 + this.aqS);
    }
    c localc;
    for (bz localbz3 = localb.pn(); ; localbz3 = aqH)
    {
      return localbz3;
      localc = (c)this.aqQ.get(paramString);
      if (localc != null)
        break;
      bh.T(pm() + "Invalid macro: " + paramString);
      this.aqS = (-1 + this.aqS);
    }
    bz localbz1 = a(paramString, localc.po(), localc.pp(), localc.pq(), localc.ps(), localc.pr(), paramSet, parambk.of());
    if (((Set)localbz1.getObject()).isEmpty());
    for (cr.a locala = localc.pt(); ; locala = (cr.a)((Set)localbz1.getObject()).iterator().next())
    {
      if (locala != null)
        break label301;
      this.aqS = (-1 + this.aqS);
      localbz3 = aqH;
      break;
      if (((Set)localbz1.getObject()).size() <= 1)
        continue;
      bh.W(pm() + "Multiple macros active for macroName " + paramString);
    }
    label301: bz localbz2 = a(this.aqM, locala, paramSet, parambk.ou());
    boolean bool;
    if ((localbz1.oE()) && (localbz2.oE()))
    {
      bool = true;
      label339: if (localbz2 != aqH)
        break label415;
    }
    label415: for (localbz3 = aqH; ; localbz3 = new bz(localbz2.getObject(), bool))
    {
      d.a locala1 = locala.oT();
      if (localbz3.oE())
        this.aqO.e(paramString, new b(localbz3, locala1));
      a(locala1, paramSet);
      this.aqS = (-1 + this.aqS);
      break;
      bool = false;
      break label339;
    }
  }

  private bz<d.a> a(Map<String, aj> paramMap, cr.a parama, Set<String> paramSet, ck paramck)
  {
    boolean bool1 = true;
    d.a locala = (d.a)parama.oS().get(com.google.android.gms.internal.b.cU.toString());
    bz localbz1;
    if (locala == null)
    {
      bh.T("No function id in properties");
      localbz1 = aqH;
    }
    aj localaj;
    HashMap localHashMap;
    boolean bool2;
    while (true)
    {
      return localbz1;
      String str = locala.gA;
      localaj = (aj)paramMap.get(str);
      if (localaj == null)
      {
        bh.T(str + " has no backing implementation.");
        localbz1 = aqH;
        continue;
      }
      localbz1 = (bz)this.aqN.get(parama);
      if ((localbz1 != null) && (!this.aqJ.oo()))
        continue;
      localHashMap = new HashMap();
      Iterator localIterator = parama.oS().entrySet().iterator();
      bool2 = bool1;
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        cm localcm = paramck.cE((String)localEntry.getKey());
        bz localbz2 = a((d.a)localEntry.getValue(), paramSet, localcm.e((d.a)localEntry.getValue()));
        if (localbz2 == aqH)
        {
          localbz1 = aqH;
          continue;
        }
        if (localbz2.oE())
          parama.a((String)localEntry.getKey(), (d.a)localbz2.getObject());
        for (boolean bool3 = bool2; ; bool3 = false)
        {
          localHashMap.put(localEntry.getKey(), localbz2.getObject());
          bool2 = bool3;
          break;
        }
      }
      if (localaj.a(localHashMap.keySet()))
        break;
      bh.T("Incorrect keys for function " + str + " required " + localaj.oq() + " had " + localHashMap.keySet());
      localbz1 = aqH;
    }
    if ((bool2) && (localaj.nL()));
    while (true)
    {
      localbz1 = new bz(localaj.C(localHashMap), bool1);
      if (bool1)
        this.aqN.e(parama, localbz1);
      paramck.d((d.a)localbz1.getObject());
      break;
      bool1 = false;
    }
  }

  private bz<Set<cr.a>> a(Set<cr.e> paramSet, Set<String> paramSet1, a parama, cs paramcs)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    Iterator localIterator = paramSet.iterator();
    boolean bool1 = true;
    if (localIterator.hasNext())
    {
      cr.e locale = (cr.e)localIterator.next();
      cn localcn = paramcs.oC();
      bz localbz = a(locale, paramSet1, localcn);
      if (((Boolean)localbz.getObject()).booleanValue())
        parama.a(locale, localHashSet1, localHashSet2, localcn);
      if ((bool1) && (localbz.oE()));
      for (boolean bool2 = true; ; bool2 = false)
      {
        bool1 = bool2;
        break;
      }
    }
    localHashSet1.removeAll(localHashSet2);
    paramcs.b(localHashSet1);
    return new bz(localHashSet1, bool1);
  }

  private void a(d.a parama, Set<String> paramSet)
  {
    if (parama == null);
    while (true)
    {
      return;
      bz localbz = a(parama, paramSet, new bx());
      if (localbz == aqH)
        continue;
      Object localObject1 = di.o((d.a)localbz.getObject());
      if ((localObject1 instanceof Map))
      {
        Map localMap2 = (Map)localObject1;
        this.anS.push(localMap2);
        continue;
      }
      if ((localObject1 instanceof List))
      {
        Iterator localIterator = ((List)localObject1).iterator();
        while (localIterator.hasNext())
        {
          Object localObject2 = localIterator.next();
          if ((localObject2 instanceof Map))
          {
            Map localMap1 = (Map)localObject2;
            this.anS.push(localMap1);
            continue;
          }
          bh.W("pushAfterEvaluate: value not a Map");
        }
        continue;
      }
      bh.W("pushAfterEvaluate: value not a Map or List");
    }
  }

  private static void a(List<cr.a> paramList, List<String> paramList1, String paramString)
  {
    if (paramList.size() != paramList1.size())
      bh.U("Invalid resource: imbalance of rule names of functions for " + paramString + " operation. Using default rule name instead");
  }

  private static void a(Map<String, aj> paramMap, aj paramaj)
  {
    if (paramMap.containsKey(paramaj.op()))
      throw new IllegalArgumentException("Duplicate function type name: " + paramaj.op());
    paramMap.put(paramaj.op(), paramaj);
  }

  private static c e(Map<String, c> paramMap, String paramString)
  {
    c localc = (c)paramMap.get(paramString);
    if (localc == null)
    {
      localc = new c();
      paramMap.put(paramString, localc);
    }
    return localc;
  }

  private static String h(cr.a parama)
  {
    return di.j((d.a)parama.oS().get(com.google.android.gms.internal.b.df.toString()));
  }

  private String pm()
  {
    if (this.aqS <= 1);
    StringBuilder localStringBuilder;
    for (String str = ""; ; str = localStringBuilder.toString())
    {
      return str;
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(Integer.toString(this.aqS));
      for (int i = 2; i < this.aqS; i++)
        localStringBuilder.append(' ');
      localStringBuilder.append(": ");
    }
  }

  bz<Boolean> a(cr.a parama, Set<String> paramSet, ck paramck)
  {
    bz localbz = a(this.aqL, parama, paramSet, paramck);
    Boolean localBoolean = di.n((d.a)localbz.getObject());
    paramck.d(di.u(localBoolean));
    return new bz(localBoolean, localbz.oE());
  }

  bz<Boolean> a(cr.e parame, Set<String> paramSet, cn paramcn)
  {
    Iterator localIterator1 = parame.pb().iterator();
    boolean bool1 = true;
    bz localbz3;
    bz localbz1;
    if (localIterator1.hasNext())
    {
      localbz3 = a((cr.a)localIterator1.next(), paramSet, paramcn.ow());
      if (((Boolean)localbz3.getObject()).booleanValue())
      {
        paramcn.f(di.u(Boolean.valueOf(false)));
        localbz1 = new bz(Boolean.valueOf(false), localbz3.oE());
      }
    }
    while (true)
    {
      return localbz1;
      if ((bool1) && (localbz3.oE()));
      for (boolean bool2 = true; ; bool2 = false)
      {
        bool1 = bool2;
        break;
      }
      Iterator localIterator2 = parame.pa().iterator();
      while (true)
      {
        if (!localIterator2.hasNext())
          break label241;
        bz localbz2 = a((cr.a)localIterator2.next(), paramSet, paramcn.ox());
        if (!((Boolean)localbz2.getObject()).booleanValue())
        {
          paramcn.f(di.u(Boolean.valueOf(false)));
          localbz1 = new bz(Boolean.valueOf(false), localbz2.oE());
          break;
        }
        if ((bool1) && (localbz2.oE()))
        {
          bool1 = true;
          continue;
        }
        bool1 = false;
      }
      label241: paramcn.f(di.u(Boolean.valueOf(true)));
      localbz1 = new bz(Boolean.valueOf(true), bool1);
    }
  }

  bz<Set<cr.a>> a(String paramString, Set<cr.e> paramSet, Map<cr.e, List<cr.a>> paramMap1, Map<cr.e, List<String>> paramMap2, Map<cr.e, List<cr.a>> paramMap3, Map<cr.e, List<String>> paramMap4, Set<String> paramSet1, cs paramcs)
  {
    return a(paramSet, paramSet1, new ct.3(this, paramMap1, paramMap2, paramMap3, paramMap4), paramcs);
  }

  bz<Set<cr.a>> a(Set<cr.e> paramSet, cs paramcs)
  {
    return a(paramSet, new HashSet(), new ct.4(this), paramcs);
  }

  void a(aj paramaj)
  {
    a(this.aqM, paramaj);
  }

  void b(aj paramaj)
  {
    a(this.aqK, paramaj);
  }

  void c(aj paramaj)
  {
    a(this.aqL, paramaj);
  }

  public bz<d.a> cO(String paramString)
  {
    this.aqS = 0;
    af localaf = this.aqJ.cx(paramString);
    bz localbz = a(paramString, new HashSet(), localaf.ol());
    localaf.on();
    return localbz;
  }

  void cP(String paramString)
  {
    monitorenter;
    try
    {
      this.aqR = paramString;
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public void cm(String paramString)
  {
    monitorenter;
    af localaf;
    try
    {
      cP(paramString);
      localaf = this.aqJ.cy(paramString);
      t localt = localaf.om();
      Iterator localIterator = ((Set)a(this.aqP, localt.of()).getObject()).iterator();
      while (localIterator.hasNext())
      {
        cr.a locala = (cr.a)localIterator.next();
        a(this.aqK, locala, new HashSet(), localt.oe());
      }
    }
    finally
    {
      monitorexit;
    }
    localaf.on();
    cP(null);
    monitorexit;
  }

  public void k(List<c.i> paramList)
  {
    monitorenter;
    while (true)
    {
      c.i locali;
      try
      {
        Iterator localIterator = paramList.iterator();
        if (!localIterator.hasNext())
          break;
        locali = (c.i)localIterator.next();
        if ((locali.name == null) || (!locali.name.startsWith("gaExperiment:")))
        {
          bh.V("Ignored supplemental: " + locali);
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      ai.a(this.anS, locali);
    }
    monitorexit;
  }

  String pl()
  {
    monitorenter;
    try
    {
      String str = this.aqR;
      monitorexit;
      return str;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  static abstract interface a
  {
    public abstract void a(cr.e parame, Set<cr.a> paramSet1, Set<cr.a> paramSet2, cn paramcn);
  }

  private static class b
  {
    private bz<d.a> aqY;
    private d.a aqt;

    public b(bz<d.a> parambz, d.a parama)
    {
      this.aqY = parambz;
      this.aqt = parama;
    }

    public int getSize()
    {
      int i = ((d.a)this.aqY.getObject()).qF();
      if (this.aqt == null);
      for (int j = 0; ; j = this.aqt.qF())
        return j + i;
    }

    public d.a oT()
    {
      return this.aqt;
    }

    public bz<d.a> pn()
    {
      return this.aqY;
    }
  }

  private static class c
  {
    private final Set<cr.e> aqP = new HashSet();
    private final Map<cr.e, List<cr.a>> aqZ = new HashMap();
    private final Map<cr.e, List<cr.a>> ara = new HashMap();
    private final Map<cr.e, List<String>> arb = new HashMap();
    private final Map<cr.e, List<String>> arc = new HashMap();
    private cr.a ard;

    public void a(cr.e parame, cr.a parama)
    {
      Object localObject = (List)this.aqZ.get(parame);
      if (localObject == null)
      {
        localObject = new ArrayList();
        this.aqZ.put(parame, localObject);
      }
      ((List)localObject).add(parama);
    }

    public void a(cr.e parame, String paramString)
    {
      Object localObject = (List)this.arb.get(parame);
      if (localObject == null)
      {
        localObject = new ArrayList();
        this.arb.put(parame, localObject);
      }
      ((List)localObject).add(paramString);
    }

    public void b(cr.e parame)
    {
      this.aqP.add(parame);
    }

    public void b(cr.e parame, cr.a parama)
    {
      Object localObject = (List)this.ara.get(parame);
      if (localObject == null)
      {
        localObject = new ArrayList();
        this.ara.put(parame, localObject);
      }
      ((List)localObject).add(parama);
    }

    public void b(cr.e parame, String paramString)
    {
      Object localObject = (List)this.arc.get(parame);
      if (localObject == null)
      {
        localObject = new ArrayList();
        this.arc.put(parame, localObject);
      }
      ((List)localObject).add(paramString);
    }

    public void i(cr.a parama)
    {
      this.ard = parama;
    }

    public Set<cr.e> po()
    {
      return this.aqP;
    }

    public Map<cr.e, List<cr.a>> pp()
    {
      return this.aqZ;
    }

    public Map<cr.e, List<String>> pq()
    {
      return this.arb;
    }

    public Map<cr.e, List<String>> pr()
    {
      return this.arc;
    }

    public Map<cr.e, List<cr.a>> ps()
    {
      return this.ara;
    }

    public cr.a pt()
    {
      return this.ard;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ct
 * JD-Core Version:    0.6.0
 */