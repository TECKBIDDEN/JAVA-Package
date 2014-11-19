package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Map<Ljava.lang.String;Ljava.lang.Object;>;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataLayer
{
  public static final String EVENT_KEY = "event";
  public static final Object OBJECT_NOT_PRESENT = new Object();
  static final String[] aov = "gtm.lifetime".toString().split("\\.");
  private static final Pattern aow = Pattern.compile("(\\d+)\\s*([smhd]?)");
  private final LinkedList<Map<String, Object>> aoA;
  private final c aoB;
  private final CountDownLatch aoC;
  private final ConcurrentHashMap<b, Integer> aox;
  private final Map<String, Object> aoy;
  private final ReentrantLock aoz;

  DataLayer()
  {
    this(new DataLayer.1());
  }

  DataLayer(c paramc)
  {
    this.aoB = paramc;
    this.aox = new ConcurrentHashMap();
    this.aoy = new HashMap();
    this.aoz = new ReentrantLock();
    this.aoA = new LinkedList();
    this.aoC = new CountDownLatch(1);
    oc();
  }

  private void F(Map<String, Object> paramMap)
  {
    this.aoz.lock();
    try
    {
      this.aoA.offer(paramMap);
      if (this.aoz.getHoldCount() == 1)
        od();
      G(paramMap);
      return;
    }
    finally
    {
      this.aoz.unlock();
    }
    throw localObject;
  }

  private void G(Map<String, Object> paramMap)
  {
    Long localLong = H(paramMap);
    if (localLong == null);
    while (true)
    {
      return;
      List localList = J(paramMap);
      localList.remove("gtm.lifetime");
      this.aoB.a(localList, localLong.longValue());
    }
  }

  private Long H(Map<String, Object> paramMap)
  {
    Object localObject = I(paramMap);
    if (localObject == null);
    for (Long localLong = null; ; localLong = ct(localObject.toString()))
      return localLong;
  }

  private Object I(Map<String, Object> paramMap)
  {
    String[] arrayOfString = aov;
    int i = arrayOfString.length;
    int j = 0;
    Object localObject2;
    for (Object localObject1 = paramMap; ; localObject1 = localObject2)
    {
      String str;
      if (j < i)
      {
        str = arrayOfString[j];
        if (!(localObject1 instanceof Map))
          localObject1 = null;
      }
      else
      {
        return localObject1;
      }
      localObject2 = ((Map)localObject1).get(str);
      j++;
    }
  }

  private List<a> J(Map<String, Object> paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    a(paramMap, "", localArrayList);
    return localArrayList;
  }

  // ERROR //
  private void K(Map<String, Object> paramMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 91	com/google/android/gms/tagmanager/DataLayer:aoy	Ljava/util/Map;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_1
    //   8: invokeinterface 183 1 0
    //   13: invokeinterface 189 1 0
    //   18: astore 4
    //   20: aload 4
    //   22: invokeinterface 195 1 0
    //   27: ifeq +45 -> 72
    //   30: aload 4
    //   32: invokeinterface 199 1 0
    //   37: checkcast 53	java/lang/String
    //   40: astore 5
    //   42: aload_0
    //   43: aload_0
    //   44: aload 5
    //   46: aload_1
    //   47: aload 5
    //   49: invokeinterface 170 2 0
    //   54: invokevirtual 202	com/google/android/gms/tagmanager/DataLayer:c	(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Map;
    //   57: aload_0
    //   58: getfield 91	com/google/android/gms/tagmanager/DataLayer:aoy	Ljava/util/Map;
    //   61: invokevirtual 205	com/google/android/gms/tagmanager/DataLayer:a	(Ljava/util/Map;Ljava/util/Map;)V
    //   64: goto -44 -> 20
    //   67: astore_3
    //   68: aload_2
    //   69: monitorexit
    //   70: aload_3
    //   71: athrow
    //   72: aload_2
    //   73: monitorexit
    //   74: aload_0
    //   75: aload_1
    //   76: invokespecial 208	com/google/android/gms/tagmanager/DataLayer:L	(Ljava/util/Map;)V
    //   79: return
    //
    // Exception table:
    //   from	to	target	type
    //   7	70	67	finally
    //   72	74	67	finally
  }

  private void L(Map<String, Object> paramMap)
  {
    Iterator localIterator = this.aox.keySet().iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).D(paramMap);
  }

  private void a(Map<String, Object> paramMap, String paramString, Collection<a> paramCollection)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      StringBuilder localStringBuilder = new StringBuilder().append(paramString);
      if (paramString.length() == 0);
      String str2;
      for (String str1 = ""; ; str1 = ".")
      {
        str2 = str1 + (String)localEntry.getKey();
        if (!(localEntry.getValue() instanceof Map))
          break label124;
        a((Map)localEntry.getValue(), str2, paramCollection);
        break;
      }
      label124: if (str2.equals("gtm.lifetime"))
        continue;
      paramCollection.add(new a(str2, localEntry.getValue()));
    }
  }

  static Long ct(String paramString)
  {
    Long localLong = null;
    Matcher localMatcher = aow.matcher(paramString);
    if (!localMatcher.matches())
      bh.U("unknown _lifetime: " + paramString);
    while (true)
    {
      return localLong;
      long l1;
      try
      {
        long l2 = Long.parseLong(localMatcher.group(1));
        l1 = l2;
        if (l1 <= 0L)
          bh.U("non-positive _lifetime: " + paramString);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        while (true)
        {
          bh.W("illegal number in _lifetime value: " + paramString);
          l1 = 0L;
        }
        String str = localMatcher.group(2);
        if (str.length() == 0)
        {
          localLong = Long.valueOf(l1);
          continue;
        }
        switch (str.charAt(0))
        {
        default:
          bh.W("unknown units in _lifetime: " + paramString);
        case 's':
        case 'm':
        case 'h':
        case 'd':
        }
      }
      continue;
      localLong = Long.valueOf(l1 * 1000L);
      continue;
      localLong = Long.valueOf(60L * (l1 * 1000L));
      continue;
      localLong = Long.valueOf(60L * (60L * (l1 * 1000L)));
      continue;
      localLong = Long.valueOf(24L * (60L * (60L * (l1 * 1000L))));
    }
  }

  public static List<Object> listOf(Object[] paramArrayOfObject)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfObject.length; i++)
      localArrayList.add(paramArrayOfObject[i]);
    return localArrayList;
  }

  public static Map<String, Object> mapOf(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length % 2 != 0)
      throw new IllegalArgumentException("expected even number of key-value pairs");
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < paramArrayOfObject.length; i += 2)
    {
      if (!(paramArrayOfObject[i] instanceof String))
        throw new IllegalArgumentException("key is not a string: " + paramArrayOfObject[i]);
      localHashMap.put((String)paramArrayOfObject[i], paramArrayOfObject[(i + 1)]);
    }
    return localHashMap;
  }

  private void oc()
  {
    this.aoB.a(new DataLayer.2(this));
  }

  private void od()
  {
    int j;
    for (int i = 0; ; i = j)
    {
      Map localMap = (Map)this.aoA.poll();
      if (localMap != null)
      {
        K(localMap);
        j = i + 1;
        if (j <= 500)
          continue;
        this.aoA.clear();
        throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
      }
      return;
    }
  }

  void a(b paramb)
  {
    this.aox.put(paramb, Integer.valueOf(0));
  }

  void a(Map<String, Object> paramMap1, Map<String, Object> paramMap2)
  {
    Iterator localIterator = paramMap1.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap1.get(str);
      if ((localObject instanceof List))
      {
        if (!(paramMap2.get(str) instanceof List))
          paramMap2.put(str, new ArrayList());
        b((List)localObject, (List)paramMap2.get(str));
        continue;
      }
      if ((localObject instanceof Map))
      {
        if (!(paramMap2.get(str) instanceof Map))
          paramMap2.put(str, new HashMap());
        a((Map)localObject, (Map)paramMap2.get(str));
        continue;
      }
      paramMap2.put(str, localObject);
    }
  }

  void b(List<Object> paramList1, List<Object> paramList2)
  {
    while (paramList2.size() < paramList1.size())
      paramList2.add(null);
    int i = 0;
    if (i < paramList1.size())
    {
      Object localObject = paramList1.get(i);
      if ((localObject instanceof List))
      {
        if (!(paramList2.get(i) instanceof List))
          paramList2.set(i, new ArrayList());
        b((List)localObject, (List)paramList2.get(i));
      }
      while (true)
      {
        i++;
        break;
        if ((localObject instanceof Map))
        {
          if (!(paramList2.get(i) instanceof Map))
            paramList2.set(i, new HashMap());
          a((Map)localObject, (Map)paramList2.get(i));
          continue;
        }
        if (localObject == OBJECT_NOT_PRESENT)
          continue;
        paramList2.set(i, localObject);
      }
    }
  }

  Map<String, Object> c(String paramString, Object paramObject)
  {
    HashMap localHashMap1 = new HashMap();
    String[] arrayOfString = paramString.toString().split("\\.");
    int i = 0;
    HashMap localHashMap2;
    for (Object localObject = localHashMap1; i < -1 + arrayOfString.length; localObject = localHashMap2)
    {
      localHashMap2 = new HashMap();
      ((Map)localObject).put(arrayOfString[i], localHashMap2);
      i++;
    }
    ((Map)localObject).put(arrayOfString[(-1 + arrayOfString.length)], paramObject);
    return (Map<String, Object>)localHashMap1;
  }

  void cs(String paramString)
  {
    push(paramString, null);
    this.aoB.cu(paramString);
  }

  public Object get(String paramString)
  {
    while (true)
    {
      int j;
      Object localObject3;
      synchronized (this.aoy)
      {
        Map localMap2 = this.aoy;
        String[] arrayOfString = paramString.split("\\.");
        int i = arrayOfString.length;
        localObject2 = localMap2;
        j = 0;
        if (j >= i)
          continue;
        String str = arrayOfString[j];
        if ((localObject2 instanceof Map))
          continue;
        localObject2 = null;
        break label100;
        localObject3 = ((Map)localObject2).get(str);
        if (localObject3 != null)
          break label103;
        localObject2 = null;
      }
      label100: return localObject2;
      label103: j++;
      Object localObject2 = localObject3;
    }
  }

  public void push(String paramString, Object paramObject)
  {
    push(c(paramString, paramObject));
  }

  public void push(Map<String, Object> paramMap)
  {
    try
    {
      this.aoC.await();
      F(paramMap);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        bh.W("DataLayer.push: unexpected InterruptedException");
    }
  }

  public void pushEvent(String paramString, Map<String, Object> paramMap)
  {
    HashMap localHashMap = new HashMap(paramMap);
    localHashMap.put("event", paramString);
    push(localHashMap);
  }

  // ERROR //
  public String toString()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 91	com/google/android/gms/tagmanager/DataLayer:aoy	Ljava/util/Map;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: new 223	java/lang/StringBuilder
    //   10: dup
    //   11: invokespecial 224	java/lang/StringBuilder:<init>	()V
    //   14: astore_2
    //   15: aload_0
    //   16: getfield 91	com/google/android/gms/tagmanager/DataLayer:aoy	Ljava/util/Map;
    //   19: invokeinterface 219 1 0
    //   24: invokeinterface 189 1 0
    //   29: astore 4
    //   31: aload 4
    //   33: invokeinterface 195 1 0
    //   38: ifeq +64 -> 102
    //   41: aload 4
    //   43: invokeinterface 199 1 0
    //   48: checkcast 221	java/util/Map$Entry
    //   51: astore 6
    //   53: iconst_2
    //   54: anewarray 4	java/lang/Object
    //   57: astore 7
    //   59: aload 7
    //   61: iconst_0
    //   62: aload 6
    //   64: invokeinterface 234 1 0
    //   69: aastore
    //   70: aload 7
    //   72: iconst_1
    //   73: aload 6
    //   75: invokeinterface 238 1 0
    //   80: aastore
    //   81: aload_2
    //   82: ldc_w 383
    //   85: aload 7
    //   87: invokestatic 387	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   90: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: goto -63 -> 31
    //   97: astore_3
    //   98: aload_1
    //   99: monitorexit
    //   100: aload_3
    //   101: athrow
    //   102: aload_2
    //   103: invokevirtual 235	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: astore 5
    //   108: aload_1
    //   109: monitorexit
    //   110: aload 5
    //   112: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   7	100	97	finally
    //   102	110	97	finally
  }

  static final class a
  {
    public final String JH;
    public final Object wq;

    a(String paramString, Object paramObject)
    {
      this.JH = paramString;
      this.wq = paramObject;
    }

    public boolean equals(Object paramObject)
    {
      int i = 0;
      if (!(paramObject instanceof a));
      while (true)
      {
        return i;
        a locala = (a)paramObject;
        if ((!this.JH.equals(locala.JH)) || (!this.wq.equals(locala.wq)))
          continue;
        i = 1;
      }
    }

    public int hashCode()
    {
      Integer[] arrayOfInteger = new Integer[2];
      arrayOfInteger[0] = Integer.valueOf(this.JH.hashCode());
      arrayOfInteger[1] = Integer.valueOf(this.wq.hashCode());
      return Arrays.hashCode(arrayOfInteger);
    }

    public String toString()
    {
      return "Key: " + this.JH + " value: " + this.wq.toString();
    }
  }

  static abstract interface b
  {
    public abstract void D(Map<String, Object> paramMap);
  }

  static abstract interface c
  {
    public abstract void a(a parama);

    public abstract void a(List<DataLayer.a> paramList, long paramLong);

    public abstract void cu(String paramString);

    public static abstract interface a
    {
      public abstract void g(List<DataLayer.a> paramList);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.DataLayer
 * JD-Core Version:    0.6.0
 */