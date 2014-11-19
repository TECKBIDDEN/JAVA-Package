package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class pb
{
  private static int a(String paramString, pc.a.a[] paramArrayOfa)
  {
    int i = paramArrayOfa.length;
    int j = 0;
    int k = 14;
    if (j < i)
    {
      pc.a.a locala = paramArrayOfa[j];
      if (k == 14)
        if ((locala.type == 9) || (locala.type == 2) || (locala.type == 6))
          k = locala.type;
      do
      {
        do
        {
          j++;
          break;
        }
        while (locala.type == 14);
        throw new IllegalArgumentException("Unexpected TypedValue type: " + locala.type + " for key " + paramString);
      }
      while (locala.type == k);
      throw new IllegalArgumentException("The ArrayList elements should all be the same type, but ArrayList with key " + paramString + " contains items of type " + k + " and " + locala.type);
    }
    return k;
  }

  static int a(List<Asset> paramList, Asset paramAsset)
  {
    paramList.add(paramAsset);
    return -1 + paramList.size();
  }

  public static a a(DataMap paramDataMap)
  {
    pc localpc = new pc();
    ArrayList localArrayList = new ArrayList();
    localpc.avS = a(paramDataMap, localArrayList);
    return new a(localpc, localArrayList);
  }

  private static pc.a.a a(List<Asset> paramList, Object paramObject)
  {
    pc.a.a locala1 = new pc.a.a();
    pc.a.a locala2;
    if (paramObject == null)
    {
      locala1.type = 14;
      locala2 = locala1;
      return locala2;
    }
    locala1.avW = new pc.a.a.a();
    if ((paramObject instanceof String))
    {
      locala1.type = 2;
      locala1.avW.avY = ((String)paramObject);
    }
    while (true)
    {
      locala2 = locala1;
      break;
      if ((paramObject instanceof Integer))
      {
        locala1.type = 6;
        locala1.avW.awc = ((Integer)paramObject).intValue();
        continue;
      }
      if ((paramObject instanceof Long))
      {
        locala1.type = 5;
        locala1.avW.awb = ((Long)paramObject).longValue();
        continue;
      }
      if ((paramObject instanceof Double))
      {
        locala1.type = 3;
        locala1.avW.avZ = ((Double)paramObject).doubleValue();
        continue;
      }
      if ((paramObject instanceof Float))
      {
        locala1.type = 4;
        locala1.avW.awa = ((Float)paramObject).floatValue();
        continue;
      }
      if ((paramObject instanceof Boolean))
      {
        locala1.type = 8;
        locala1.avW.awe = ((Boolean)paramObject).booleanValue();
        continue;
      }
      if ((paramObject instanceof Byte))
      {
        locala1.type = 7;
        locala1.avW.awd = ((Byte)paramObject).byteValue();
        continue;
      }
      if ((paramObject instanceof byte[]))
      {
        locala1.type = 1;
        locala1.avW.avX = ((byte[])(byte[])paramObject);
        continue;
      }
      if ((paramObject instanceof String[]))
      {
        locala1.type = 11;
        locala1.avW.awh = ((String[])(String[])paramObject);
        continue;
      }
      if ((paramObject instanceof long[]))
      {
        locala1.type = 12;
        locala1.avW.awi = ((long[])(long[])paramObject);
        continue;
      }
      if ((paramObject instanceof float[]))
      {
        locala1.type = 15;
        locala1.avW.awj = ((float[])(float[])paramObject);
        continue;
      }
      if ((paramObject instanceof Asset))
      {
        locala1.type = 13;
        locala1.avW.awk = a(paramList, (Asset)paramObject);
        continue;
      }
      if (!(paramObject instanceof DataMap))
        break label523;
      locala1.type = 9;
      DataMap localDataMap = (DataMap)paramObject;
      Set localSet = localDataMap.keySet();
      pc.a[] arrayOfa1 = new pc.a[localSet.size()];
      Iterator localIterator = localSet.iterator();
      for (int n = 0; localIterator.hasNext(); n++)
      {
        String str = (String)localIterator.next();
        arrayOfa1[n] = new pc.a();
        arrayOfa1[n].name = str;
        arrayOfa1[n].avU = a(paramList, localDataMap.get(str));
      }
      locala1.avW.awf = arrayOfa1;
    }
    label523: pc.a.a[] arrayOfa;
    Object localObject1;
    int j;
    int k;
    label566: Object localObject2;
    pc.a.a locala3;
    if ((paramObject instanceof ArrayList))
    {
      locala1.type = 10;
      ArrayList localArrayList = (ArrayList)paramObject;
      arrayOfa = new pc.a.a[localArrayList.size()];
      localObject1 = null;
      int i = localArrayList.size();
      j = 0;
      k = 14;
      if (j < i)
      {
        localObject2 = localArrayList.get(j);
        locala3 = a(paramList, localObject2);
        if ((locala3.type != 14) && (locala3.type != 2) && (locala3.type != 6) && (locala3.type != 9))
          throw new IllegalArgumentException("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a " + localObject2.getClass());
        if ((k != 14) || (locala3.type == 14));
      }
    }
    for (int m = locala3.type; ; m = k)
    {
      arrayOfa[j] = locala3;
      j++;
      k = m;
      localObject1 = localObject2;
      break label566;
      if (locala3.type != k)
      {
        throw new IllegalArgumentException("ArrayList elements must all be of the sameclass, but this one contains a " + localObject1.getClass() + " and a " + localObject2.getClass());
        locala1.avW.awg = arrayOfa;
        break;
        throw new RuntimeException("newFieldValueFromValue: unexpected value " + paramObject.getClass().getSimpleName());
      }
      localObject2 = localObject1;
    }
  }

  public static DataMap a(a parama)
  {
    DataMap localDataMap = new DataMap();
    for (pc.a locala : parama.avQ.avS)
      a(parama.avR, localDataMap, locala.name, locala.avU);
    return localDataMap;
  }

  private static ArrayList a(List<Asset> paramList, pc.a.a.a parama, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(parama.awg.length);
    pc.a.a[] arrayOfa = parama.awg;
    int i = arrayOfa.length;
    int j = 0;
    if (j < i)
    {
      pc.a.a locala = arrayOfa[j];
      if (locala.type == 14)
        localArrayList.add(null);
      while (true)
      {
        j++;
        break;
        if (paramInt == 9)
        {
          DataMap localDataMap = new DataMap();
          for (pc.a locala1 : locala.avW.awf)
            a(paramList, localDataMap, locala1.name, locala1.avU);
          localArrayList.add(localDataMap);
          continue;
        }
        if (paramInt == 2)
        {
          localArrayList.add(locala.avW.avY);
          continue;
        }
        if (paramInt != 6)
          break label188;
        localArrayList.add(Integer.valueOf(locala.avW.awc));
      }
      label188: throw new IllegalArgumentException("Unexpected typeOfArrayList: " + paramInt);
    }
    return localArrayList;
  }

  private static void a(List<Asset> paramList, DataMap paramDataMap, String paramString, pc.a.a parama)
  {
    int i = parama.type;
    if (i == 14)
      paramDataMap.putString(paramString, null);
    while (true)
    {
      return;
      pc.a.a.a locala = parama.avW;
      if (i == 1)
      {
        paramDataMap.putByteArray(paramString, locala.avX);
        continue;
      }
      if (i == 11)
      {
        paramDataMap.putStringArray(paramString, locala.awh);
        continue;
      }
      if (i == 12)
      {
        paramDataMap.putLongArray(paramString, locala.awi);
        continue;
      }
      if (i == 15)
      {
        paramDataMap.putFloatArray(paramString, locala.awj);
        continue;
      }
      if (i == 2)
      {
        paramDataMap.putString(paramString, locala.avY);
        continue;
      }
      if (i == 3)
      {
        paramDataMap.putDouble(paramString, locala.avZ);
        continue;
      }
      if (i == 4)
      {
        paramDataMap.putFloat(paramString, locala.awa);
        continue;
      }
      if (i == 5)
      {
        paramDataMap.putLong(paramString, locala.awb);
        continue;
      }
      if (i == 6)
      {
        paramDataMap.putInt(paramString, locala.awc);
        continue;
      }
      if (i == 7)
      {
        paramDataMap.putByte(paramString, (byte)locala.awd);
        continue;
      }
      if (i == 8)
      {
        paramDataMap.putBoolean(paramString, locala.awe);
        continue;
      }
      if (i == 13)
      {
        if (paramList == null)
          throw new RuntimeException("populateBundle: unexpected type for: " + paramString);
        paramDataMap.putAsset(paramString, (Asset)paramList.get((int)locala.awk));
        continue;
      }
      if (i == 9)
      {
        DataMap localDataMap = new DataMap();
        for (pc.a locala1 : locala.awf)
          a(paramList, localDataMap, locala1.name, locala1.avU);
        paramDataMap.putDataMap(paramString, localDataMap);
        continue;
      }
      if (i != 10)
        break;
      int m = a(paramString, locala.awg);
      ArrayList localArrayList = a(paramList, locala, m);
      if (m == 14)
      {
        paramDataMap.putStringArrayList(paramString, localArrayList);
        continue;
      }
      if (m == 9)
      {
        paramDataMap.putDataMapArrayList(paramString, localArrayList);
        continue;
      }
      if (m == 2)
      {
        paramDataMap.putStringArrayList(paramString, localArrayList);
        continue;
      }
      if (m == 6)
      {
        paramDataMap.putIntegerArrayList(paramString, localArrayList);
        continue;
      }
      throw new IllegalStateException("Unexpected typeOfArrayList: " + m);
    }
    throw new RuntimeException("populateBundle: unexpected type " + i);
  }

  private static pc.a[] a(DataMap paramDataMap, List<Asset> paramList)
  {
    Set localSet = paramDataMap.keySet();
    pc.a[] arrayOfa = new pc.a[localSet.size()];
    Iterator localIterator = localSet.iterator();
    for (int i = 0; localIterator.hasNext(); i++)
    {
      String str = (String)localIterator.next();
      Object localObject = paramDataMap.get(str);
      arrayOfa[i] = new pc.a();
      arrayOfa[i].name = str;
      arrayOfa[i].avU = a(paramList, localObject);
    }
    return arrayOfa;
  }

  public static class a
  {
    public final pc avQ;
    public final List<Asset> avR;

    public a(pc parampc, List<Asset> paramList)
    {
      this.avQ = parampc;
      this.avR = paramList;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pb
 * JD-Core Version:    0.6.0
 */