package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.d.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class di
{
  private static final Object arJ = null;
  private static Long arK = new Long(0L);
  private static Double arL = new Double(0.0D);
  private static dh arM = dh.z(0L);
  private static String arN = new String("");
  private static Boolean arO = new Boolean(false);
  private static List<Object> arP = new ArrayList(0);
  private static Map<Object, Object> arQ = new HashMap();
  private static d.a arR = u(arN);

  public static d.a cU(String paramString)
  {
    d.a locala = new d.a();
    locala.type = 5;
    locala.gA = paramString;
    return locala;
  }

  private static dh cV(String paramString)
  {
    try
    {
      dh localdh2 = dh.cT(paramString);
      localdh1 = localdh2;
      return localdh1;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        bh.T("Failed to convert '" + paramString + "' to a number.");
        dh localdh1 = arM;
      }
    }
  }

  private static Long cW(String paramString)
  {
    dh localdh = cV(paramString);
    if (localdh == arM);
    for (Long localLong = arK; ; localLong = Long.valueOf(localdh.longValue()))
      return localLong;
  }

  private static Double cX(String paramString)
  {
    dh localdh = cV(paramString);
    if (localdh == arM);
    for (Double localDouble = arL; ; localDouble = Double.valueOf(localdh.doubleValue()))
      return localDouble;
  }

  private static Boolean cY(String paramString)
  {
    Boolean localBoolean;
    if ("true".equalsIgnoreCase(paramString))
      localBoolean = Boolean.TRUE;
    while (true)
    {
      return localBoolean;
      if ("false".equalsIgnoreCase(paramString))
      {
        localBoolean = Boolean.FALSE;
        continue;
      }
      localBoolean = arO;
    }
  }

  private static double getDouble(Object paramObject)
  {
    double d;
    if ((paramObject instanceof Number))
      d = ((Number)paramObject).doubleValue();
    while (true)
    {
      return d;
      bh.T("getDouble received non-Number");
      d = 0.0D;
    }
  }

  public static String j(d.a parama)
  {
    return p(o(parama));
  }

  public static dh k(d.a parama)
  {
    return q(o(parama));
  }

  public static Long l(d.a parama)
  {
    return r(o(parama));
  }

  public static Double m(d.a parama)
  {
    return s(o(parama));
  }

  public static Boolean n(d.a parama)
  {
    return t(o(parama));
  }

  public static Object o(d.a parama)
  {
    int i = 0;
    Object localObject1;
    if (parama == null)
      localObject1 = arJ;
    while (true)
    {
      return localObject1;
      switch (parama.type)
      {
      default:
        bh.T("Failed to convert a value of type: " + parama.type);
        localObject1 = arJ;
        break;
      case 1:
        localObject1 = parama.gv;
        break;
      case 2:
        ArrayList localArrayList = new ArrayList(parama.gw.length);
        d.a[] arrayOfa2 = parama.gw;
        int k = arrayOfa2.length;
        while (true)
        {
          if (i >= k)
            break label173;
          Object localObject4 = o(arrayOfa2[i]);
          if (localObject4 == arJ)
          {
            localObject1 = arJ;
            break;
          }
          localArrayList.add(localObject4);
          i++;
        }
        localObject1 = localArrayList;
        break;
      case 3:
        if (parama.gx.length != parama.gy.length)
        {
          bh.T("Converting an invalid value to object: " + parama.toString());
          localObject1 = arJ;
          continue;
        }
        HashMap localHashMap = new HashMap(parama.gy.length);
        while (true)
        {
          if (i >= parama.gx.length)
            break label310;
          Object localObject2 = o(parama.gx[i]);
          Object localObject3 = o(parama.gy[i]);
          if ((localObject2 == arJ) || (localObject3 == arJ))
          {
            localObject1 = arJ;
            break;
          }
          localHashMap.put(localObject2, localObject3);
          i++;
        }
        localObject1 = localHashMap;
        break;
      case 4:
        bh.T("Trying to convert a macro reference to object");
        localObject1 = arJ;
        break;
      case 5:
        bh.T("Trying to convert a function id to object");
        localObject1 = arJ;
        break;
      case 6:
        localObject1 = Long.valueOf(parama.gB);
        break;
      case 7:
        StringBuffer localStringBuffer = new StringBuffer();
        d.a[] arrayOfa1 = parama.gD;
        int j = arrayOfa1.length;
        while (true)
        {
          if (i >= j)
            break label413;
          String str = j(arrayOfa1[i]);
          if (str == arN)
          {
            localObject1 = arJ;
            break;
          }
          localStringBuffer.append(str);
          i++;
        }
        label413: localObject1 = localStringBuffer.toString();
        break;
      case 8:
        label173: label310: localObject1 = Boolean.valueOf(parama.gC);
      }
    }
  }

  public static String p(Object paramObject)
  {
    if (paramObject == null);
    for (String str = arN; ; str = paramObject.toString())
      return str;
  }

  public static Object pC()
  {
    return arJ;
  }

  public static Long pD()
  {
    return arK;
  }

  public static Double pE()
  {
    return arL;
  }

  public static Boolean pF()
  {
    return arO;
  }

  public static dh pG()
  {
    return arM;
  }

  public static String pH()
  {
    return arN;
  }

  public static d.a pI()
  {
    return arR;
  }

  public static dh q(Object paramObject)
  {
    dh localdh;
    if ((paramObject instanceof dh))
      localdh = (dh)paramObject;
    while (true)
    {
      return localdh;
      if (w(paramObject))
      {
        localdh = dh.z(x(paramObject));
        continue;
      }
      if (v(paramObject))
      {
        localdh = dh.a(Double.valueOf(getDouble(paramObject)));
        continue;
      }
      localdh = cV(p(paramObject));
    }
  }

  public static Long r(Object paramObject)
  {
    if (w(paramObject));
    for (Long localLong = Long.valueOf(x(paramObject)); ; localLong = cW(p(paramObject)))
      return localLong;
  }

  public static Double s(Object paramObject)
  {
    if (v(paramObject));
    for (Double localDouble = Double.valueOf(getDouble(paramObject)); ; localDouble = cX(p(paramObject)))
      return localDouble;
  }

  public static Boolean t(Object paramObject)
  {
    if ((paramObject instanceof Boolean));
    for (Boolean localBoolean = (Boolean)paramObject; ; localBoolean = cY(p(paramObject)))
      return localBoolean;
  }

  public static d.a u(Object paramObject)
  {
    boolean bool1 = false;
    d.a locala1 = new d.a();
    d.a locala2;
    if ((paramObject instanceof d.a))
    {
      locala2 = (d.a)paramObject;
      return locala2;
    }
    if ((paramObject instanceof String))
    {
      locala1.type = 1;
      locala1.gv = ((String)paramObject);
    }
    while (true)
    {
      locala1.gF = bool1;
      locala2 = locala1;
      break;
      if ((paramObject instanceof List))
      {
        locala1.type = 2;
        List localList = (List)paramObject;
        ArrayList localArrayList3 = new ArrayList(localList.size());
        Iterator localIterator2 = localList.iterator();
        boolean bool4 = false;
        if (localIterator2.hasNext())
        {
          d.a locala5 = u(localIterator2.next());
          if (locala5 == arR)
          {
            locala2 = arR;
            break;
          }
          if ((bool4) || (locala5.gF));
          for (boolean bool5 = true; ; bool5 = false)
          {
            localArrayList3.add(locala5);
            bool4 = bool5;
            break;
          }
        }
        locala1.gw = ((d.a[])localArrayList3.toArray(new d.a[0]));
        bool1 = bool4;
        continue;
      }
      if ((paramObject instanceof Map))
      {
        locala1.type = 3;
        Set localSet = ((Map)paramObject).entrySet();
        ArrayList localArrayList1 = new ArrayList(localSet.size());
        ArrayList localArrayList2 = new ArrayList(localSet.size());
        Iterator localIterator1 = localSet.iterator();
        boolean bool2 = false;
        if (localIterator1.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator1.next();
          d.a locala3 = u(localEntry.getKey());
          d.a locala4 = u(localEntry.getValue());
          if ((locala3 == arR) || (locala4 == arR))
          {
            locala2 = arR;
            break;
          }
          if ((bool2) || (locala3.gF) || (locala4.gF));
          for (boolean bool3 = true; ; bool3 = false)
          {
            localArrayList1.add(locala3);
            localArrayList2.add(locala4);
            bool2 = bool3;
            break;
          }
        }
        locala1.gx = ((d.a[])localArrayList1.toArray(new d.a[0]));
        locala1.gy = ((d.a[])localArrayList2.toArray(new d.a[0]));
        bool1 = bool2;
        continue;
      }
      if (v(paramObject))
      {
        locala1.type = 1;
        locala1.gv = paramObject.toString();
        continue;
      }
      if (w(paramObject))
      {
        locala1.type = 6;
        locala1.gB = x(paramObject);
        continue;
      }
      if (!(paramObject instanceof Boolean))
        break label514;
      locala1.type = 8;
      locala1.gC = ((Boolean)paramObject).booleanValue();
    }
    label514: StringBuilder localStringBuilder = new StringBuilder().append("Converting to Value from unknown object type: ");
    if (paramObject == null);
    for (String str = "null"; ; str = paramObject.getClass().toString())
    {
      bh.T(str);
      locala2 = arR;
      break;
    }
  }

  private static boolean v(Object paramObject)
  {
    if (((paramObject instanceof Double)) || ((paramObject instanceof Float)) || (((paramObject instanceof dh)) && (((dh)paramObject).px())));
    for (int i = 1; ; i = 0)
      return i;
  }

  private static boolean w(Object paramObject)
  {
    if (((paramObject instanceof Byte)) || ((paramObject instanceof Short)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Long)) || (((paramObject instanceof dh)) && (((dh)paramObject).py())));
    for (int i = 1; ; i = 0)
      return i;
  }

  private static long x(Object paramObject)
  {
    long l;
    if ((paramObject instanceof Number))
      l = ((Number)paramObject).longValue();
    while (true)
    {
      return l;
      bh.T("getInt64 received non-Number");
      l = 0L;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.di
 * JD-Core Version:    0.6.0
 */