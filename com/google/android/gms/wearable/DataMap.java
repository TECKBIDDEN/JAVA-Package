package com.google.android.gms.wearable;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.pb;
import com.google.android.gms.internal.pb.a;
import com.google.android.gms.internal.pc;
import com.google.android.gms.internal.pl;
import com.google.android.gms.internal.pm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DataMap
{
  public static final String TAG = "DataMap";
  private final HashMap<String, Object> auL = new HashMap();

  private static void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    if ((paramObject instanceof String))
      paramBundle.putString(paramString, (String)paramObject);
    while (true)
    {
      return;
      if ((paramObject instanceof Integer))
      {
        paramBundle.putInt(paramString, ((Integer)paramObject).intValue());
        continue;
      }
      if ((paramObject instanceof Long))
      {
        paramBundle.putLong(paramString, ((Long)paramObject).longValue());
        continue;
      }
      if ((paramObject instanceof Double))
      {
        paramBundle.putDouble(paramString, ((Double)paramObject).doubleValue());
        continue;
      }
      if ((paramObject instanceof Float))
      {
        paramBundle.putFloat(paramString, ((Float)paramObject).floatValue());
        continue;
      }
      if ((paramObject instanceof Boolean))
      {
        paramBundle.putBoolean(paramString, ((Boolean)paramObject).booleanValue());
        continue;
      }
      if ((paramObject instanceof Byte))
      {
        paramBundle.putByte(paramString, ((Byte)paramObject).byteValue());
        continue;
      }
      if ((paramObject instanceof byte[]))
      {
        paramBundle.putByteArray(paramString, (byte[])(byte[])paramObject);
        continue;
      }
      if ((paramObject instanceof String[]))
      {
        paramBundle.putStringArray(paramString, (String[])(String[])paramObject);
        continue;
      }
      if ((paramObject instanceof long[]))
      {
        paramBundle.putLongArray(paramString, (long[])(long[])paramObject);
        continue;
      }
      if ((paramObject instanceof float[]))
      {
        paramBundle.putFloatArray(paramString, (float[])(float[])paramObject);
        continue;
      }
      if ((paramObject instanceof Asset))
      {
        paramBundle.putParcelable(paramString, (Asset)paramObject);
        continue;
      }
      if ((paramObject instanceof DataMap))
      {
        paramBundle.putParcelable(paramString, ((DataMap)paramObject).toBundle());
        continue;
      }
      if (!(paramObject instanceof ArrayList))
        continue;
      switch (d((ArrayList)paramObject))
      {
      default:
        break;
      case 0:
        paramBundle.putStringArrayList(paramString, (ArrayList)paramObject);
        break;
      case 1:
        paramBundle.putStringArrayList(paramString, (ArrayList)paramObject);
        break;
      case 3:
        paramBundle.putStringArrayList(paramString, (ArrayList)paramObject);
        break;
      case 2:
        paramBundle.putIntegerArrayList(paramString, (ArrayList)paramObject);
        break;
      case 4:
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = ((ArrayList)paramObject).iterator();
        while (localIterator.hasNext())
          localArrayList.add(((DataMap)localIterator.next()).toBundle());
        paramBundle.putParcelableArrayList(paramString, localArrayList);
      }
    }
  }

  private static void a(DataMap paramDataMap, String paramString, Object paramObject)
  {
    if ((paramObject instanceof String))
      paramDataMap.putString(paramString, (String)paramObject);
    while (true)
    {
      return;
      if ((paramObject instanceof Integer))
      {
        paramDataMap.putInt(paramString, ((Integer)paramObject).intValue());
        continue;
      }
      if ((paramObject instanceof Long))
      {
        paramDataMap.putLong(paramString, ((Long)paramObject).longValue());
        continue;
      }
      if ((paramObject instanceof Double))
      {
        paramDataMap.putDouble(paramString, ((Double)paramObject).doubleValue());
        continue;
      }
      if ((paramObject instanceof Float))
      {
        paramDataMap.putFloat(paramString, ((Float)paramObject).floatValue());
        continue;
      }
      if ((paramObject instanceof Boolean))
      {
        paramDataMap.putBoolean(paramString, ((Boolean)paramObject).booleanValue());
        continue;
      }
      if ((paramObject instanceof Byte))
      {
        paramDataMap.putByte(paramString, ((Byte)paramObject).byteValue());
        continue;
      }
      if ((paramObject instanceof byte[]))
      {
        paramDataMap.putByteArray(paramString, (byte[])(byte[])paramObject);
        continue;
      }
      if ((paramObject instanceof String[]))
      {
        paramDataMap.putStringArray(paramString, (String[])(String[])paramObject);
        continue;
      }
      if ((paramObject instanceof long[]))
      {
        paramDataMap.putLongArray(paramString, (long[])(long[])paramObject);
        continue;
      }
      if ((paramObject instanceof float[]))
      {
        paramDataMap.putFloatArray(paramString, (float[])(float[])paramObject);
        continue;
      }
      if ((paramObject instanceof Asset))
      {
        paramDataMap.putAsset(paramString, (Asset)paramObject);
        continue;
      }
      if ((paramObject instanceof Bundle))
      {
        paramDataMap.putDataMap(paramString, fromBundle((Bundle)paramObject));
        continue;
      }
      if (!(paramObject instanceof ArrayList))
        continue;
      switch (d((ArrayList)paramObject))
      {
      case 4:
      default:
        break;
      case 0:
        paramDataMap.putStringArrayList(paramString, (ArrayList)paramObject);
        break;
      case 1:
        paramDataMap.putStringArrayList(paramString, (ArrayList)paramObject);
        break;
      case 3:
        paramDataMap.putStringArrayList(paramString, (ArrayList)paramObject);
        break;
      case 2:
        paramDataMap.putIntegerArrayList(paramString, (ArrayList)paramObject);
        break;
      case 5:
        paramDataMap.putDataMapArrayList(paramString, arrayListFromBundleArrayList((ArrayList)paramObject));
      }
    }
  }

  private void a(String paramString1, Object paramObject, String paramString2, ClassCastException paramClassCastException)
  {
    a(paramString1, paramObject, paramString2, "<null>", paramClassCastException);
  }

  private void a(String paramString1, Object paramObject1, String paramString2, Object paramObject2, ClassCastException paramClassCastException)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Key ");
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" expected ");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(" but value was a ");
    localStringBuilder.append(paramObject1.getClass().getName());
    localStringBuilder.append(".  The default value ");
    localStringBuilder.append(paramObject2);
    localStringBuilder.append(" was returned.");
    Log.w("DataMap", localStringBuilder.toString());
    Log.w("DataMap", "Attempt to cast generated internal exception:", paramClassCastException);
  }

  private static boolean a(Asset paramAsset1, Asset paramAsset2)
  {
    boolean bool;
    if ((paramAsset1 == null) || (paramAsset2 == null))
      if (paramAsset1 == paramAsset2)
        bool = true;
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if (!TextUtils.isEmpty(paramAsset1.getDigest()))
      {
        bool = paramAsset1.getDigest().equals(paramAsset2.getDigest());
        continue;
      }
      bool = Arrays.equals(paramAsset1.getData(), paramAsset2.getData());
    }
  }

  private static boolean a(DataMap paramDataMap1, DataMap paramDataMap2)
  {
    int i = 0;
    if (paramDataMap1.size() != paramDataMap2.size());
    while (true)
    {
      return i;
      Iterator localIterator = paramDataMap1.keySet().iterator();
      Object localObject1;
      Object localObject2;
      label96: 
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  if (!localIterator.hasNext())
                    break label305;
                  String str = (String)localIterator.next();
                  localObject1 = paramDataMap1.get(str);
                  localObject2 = paramDataMap2.get(str);
                  if (!(localObject1 instanceof Asset))
                    break label96;
                  if (!(localObject2 instanceof Asset))
                    break;
                }
                while (a((Asset)localObject1, (Asset)localObject2));
                break;
                if (!(localObject1 instanceof String[]))
                  break label137;
                if (!(localObject2 instanceof String[]))
                  break;
              }
              while (Arrays.equals((String[])(String[])localObject1, (String[])(String[])localObject2));
              break;
              if (!(localObject1 instanceof long[]))
                break label178;
              if (!(localObject2 instanceof long[]))
                break;
            }
            while (Arrays.equals((long[])(long[])localObject1, (long[])(long[])localObject2));
            break;
            if (!(localObject1 instanceof float[]))
              break label219;
            if (!(localObject2 instanceof float[]))
              break;
          }
          while (Arrays.equals((float[])(float[])localObject1, (float[])(float[])localObject2));
          break;
          if (!(localObject1 instanceof byte[]))
            break label260;
          if (!(localObject2 instanceof byte[]))
            break;
        }
        while (Arrays.equals((byte[])(byte[])localObject1, (byte[])(byte[])localObject2));
        break;
        if ((localObject1 != null) && (localObject2 != null))
          continue;
        if (localObject1 == localObject2);
        for (int j = 1; ; j = 0)
        {
          i = j;
          break;
        }
      }
      while (localObject1.equals(localObject2));
      label137: label178: label219: continue;
      label260: label305: i = 1;
    }
  }

  public static ArrayList<DataMap> arrayListFromBundleArrayList(ArrayList<Bundle> paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
      localArrayList.add(fromBundle((Bundle)localIterator.next()));
    return localArrayList;
  }

  private static int d(ArrayList<?> paramArrayList)
  {
    int i;
    if (paramArrayList.isEmpty())
      i = 0;
    while (true)
    {
      return i;
      Iterator localIterator = paramArrayList.iterator();
      Object localObject;
      do
      {
        do
        {
          if (!localIterator.hasNext())
            break;
          localObject = localIterator.next();
        }
        while (localObject == null);
        if ((localObject instanceof Integer))
        {
          i = 2;
          break;
        }
        if ((localObject instanceof String))
        {
          i = 3;
          break;
        }
        if (!(localObject instanceof DataMap))
          continue;
        i = 4;
        break;
      }
      while (!(localObject instanceof Bundle));
      i = 5;
      continue;
      i = 1;
    }
  }

  public static DataMap fromBundle(Bundle paramBundle)
  {
    paramBundle.setClassLoader(Asset.class.getClassLoader());
    DataMap localDataMap = new DataMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(localDataMap, str, paramBundle.get(str));
    }
    return localDataMap;
  }

  public static DataMap fromByteArray(byte[] paramArrayOfByte)
  {
    try
    {
      DataMap localDataMap = pb.a(new pb.a(pc.n(paramArrayOfByte), new ArrayList()));
      return localDataMap;
    }
    catch (pl localpl)
    {
    }
    throw new IllegalArgumentException("Unable to convert data", localpl);
  }

  public void clear()
  {
    this.auL.clear();
  }

  public boolean containsKey(String paramString)
  {
    return this.auL.containsKey(paramString);
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof DataMap));
    for (boolean bool = false; ; bool = a(this, (DataMap)paramObject))
      return bool;
  }

  public <T> T get(String paramString)
  {
    return this.auL.get(paramString);
  }

  public Asset getAsset(String paramString)
  {
    Object localObject = this.auL.get(paramString);
    Asset localAsset;
    if (localObject == null)
      localAsset = null;
    while (true)
    {
      return localAsset;
      try
      {
        localAsset = (Asset)localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "Asset", localClassCastException);
        localAsset = null;
      }
    }
  }

  public boolean getBoolean(String paramString)
  {
    return getBoolean(paramString, false);
  }

  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    Object localObject = this.auL.get(paramString);
    if (localObject == null);
    while (true)
    {
      return paramBoolean;
      try
      {
        boolean bool = ((Boolean)localObject).booleanValue();
        paramBoolean = bool;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "Boolean", Boolean.valueOf(paramBoolean), localClassCastException);
      }
    }
  }

  public byte getByte(String paramString)
  {
    return getByte(paramString, 0);
  }

  public byte getByte(String paramString, byte paramByte)
  {
    Object localObject = this.auL.get(paramString);
    if (localObject == null);
    while (true)
    {
      return paramByte;
      try
      {
        byte b = ((Byte)localObject).byteValue();
        paramByte = b;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "Byte", Byte.valueOf(paramByte), localClassCastException);
      }
    }
  }

  public byte[] getByteArray(String paramString)
  {
    Object localObject = this.auL.get(paramString);
    byte[] arrayOfByte;
    if (localObject == null)
      arrayOfByte = null;
    while (true)
    {
      return arrayOfByte;
      try
      {
        arrayOfByte = (byte[])(byte[])localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "byte[]", localClassCastException);
        arrayOfByte = null;
      }
    }
  }

  public DataMap getDataMap(String paramString)
  {
    Object localObject = this.auL.get(paramString);
    DataMap localDataMap;
    if (localObject == null)
      localDataMap = null;
    while (true)
    {
      return localDataMap;
      try
      {
        localDataMap = (DataMap)localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "DataMap", localClassCastException);
        localDataMap = null;
      }
    }
  }

  public ArrayList<DataMap> getDataMapArrayList(String paramString)
  {
    Object localObject = this.auL.get(paramString);
    ArrayList localArrayList;
    if (localObject == null)
      localArrayList = null;
    while (true)
    {
      return localArrayList;
      try
      {
        localArrayList = (ArrayList)localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "ArrayList<DataMap>", localClassCastException);
        localArrayList = null;
      }
    }
  }

  public double getDouble(String paramString)
  {
    return getDouble(paramString, 0.0D);
  }

  public double getDouble(String paramString, double paramDouble)
  {
    Object localObject = this.auL.get(paramString);
    if (localObject == null);
    while (true)
    {
      return paramDouble;
      try
      {
        double d = ((Double)localObject).doubleValue();
        paramDouble = d;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "Double", Double.valueOf(paramDouble), localClassCastException);
      }
    }
  }

  public float getFloat(String paramString)
  {
    return getFloat(paramString, 0.0F);
  }

  public float getFloat(String paramString, float paramFloat)
  {
    Object localObject = this.auL.get(paramString);
    if (localObject == null);
    while (true)
    {
      return paramFloat;
      try
      {
        float f = ((Float)localObject).floatValue();
        paramFloat = f;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "Float", Float.valueOf(paramFloat), localClassCastException);
      }
    }
  }

  public float[] getFloatArray(String paramString)
  {
    Object localObject = this.auL.get(paramString);
    float[] arrayOfFloat;
    if (localObject == null)
      arrayOfFloat = null;
    while (true)
    {
      return arrayOfFloat;
      try
      {
        arrayOfFloat = (float[])(float[])localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "float[]", localClassCastException);
        arrayOfFloat = null;
      }
    }
  }

  public int getInt(String paramString)
  {
    return getInt(paramString, 0);
  }

  public int getInt(String paramString, int paramInt)
  {
    Object localObject = this.auL.get(paramString);
    if (localObject == null);
    while (true)
    {
      return paramInt;
      try
      {
        int i = ((Integer)localObject).intValue();
        paramInt = i;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "Integer", localClassCastException);
      }
    }
  }

  public ArrayList<Integer> getIntegerArrayList(String paramString)
  {
    Object localObject = this.auL.get(paramString);
    ArrayList localArrayList;
    if (localObject == null)
      localArrayList = null;
    while (true)
    {
      return localArrayList;
      try
      {
        localArrayList = (ArrayList)localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "ArrayList<Integer>", localClassCastException);
        localArrayList = null;
      }
    }
  }

  public long getLong(String paramString)
  {
    return getLong(paramString, 0L);
  }

  public long getLong(String paramString, long paramLong)
  {
    Object localObject = this.auL.get(paramString);
    if (localObject == null);
    while (true)
    {
      return paramLong;
      try
      {
        long l = ((Long)localObject).longValue();
        paramLong = l;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "long", localClassCastException);
      }
    }
  }

  public long[] getLongArray(String paramString)
  {
    Object localObject = this.auL.get(paramString);
    long[] arrayOfLong;
    if (localObject == null)
      arrayOfLong = null;
    while (true)
    {
      return arrayOfLong;
      try
      {
        arrayOfLong = (long[])(long[])localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "long[]", localClassCastException);
        arrayOfLong = null;
      }
    }
  }

  public String getString(String paramString)
  {
    Object localObject = this.auL.get(paramString);
    String str;
    if (localObject == null)
      str = null;
    while (true)
    {
      return str;
      try
      {
        str = (String)localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "String", localClassCastException);
        str = null;
      }
    }
  }

  public String getString(String paramString1, String paramString2)
  {
    String str = getString(paramString1);
    if (str == null);
    while (true)
    {
      return paramString2;
      paramString2 = str;
    }
  }

  public String[] getStringArray(String paramString)
  {
    Object localObject = this.auL.get(paramString);
    String[] arrayOfString;
    if (localObject == null)
      arrayOfString = null;
    while (true)
    {
      return arrayOfString;
      try
      {
        arrayOfString = (String[])(String[])localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "String[]", localClassCastException);
        arrayOfString = null;
      }
    }
  }

  public ArrayList<String> getStringArrayList(String paramString)
  {
    Object localObject = this.auL.get(paramString);
    ArrayList localArrayList;
    if (localObject == null)
      localArrayList = null;
    while (true)
    {
      return localArrayList;
      try
      {
        localArrayList = (ArrayList)localObject;
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "ArrayList<String>", localClassCastException);
        localArrayList = null;
      }
    }
  }

  public int hashCode()
  {
    return 29 * this.auL.hashCode();
  }

  public boolean isEmpty()
  {
    return this.auL.isEmpty();
  }

  public Set<String> keySet()
  {
    return this.auL.keySet();
  }

  public void putAll(DataMap paramDataMap)
  {
    Iterator localIterator = paramDataMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.auL.put(str, paramDataMap.get(str));
    }
  }

  public void putAsset(String paramString, Asset paramAsset)
  {
    this.auL.put(paramString, paramAsset);
  }

  public void putBoolean(String paramString, boolean paramBoolean)
  {
    this.auL.put(paramString, Boolean.valueOf(paramBoolean));
  }

  public void putByte(String paramString, byte paramByte)
  {
    this.auL.put(paramString, Byte.valueOf(paramByte));
  }

  public void putByteArray(String paramString, byte[] paramArrayOfByte)
  {
    this.auL.put(paramString, paramArrayOfByte);
  }

  public void putDataMap(String paramString, DataMap paramDataMap)
  {
    this.auL.put(paramString, paramDataMap);
  }

  public void putDataMapArrayList(String paramString, ArrayList<DataMap> paramArrayList)
  {
    this.auL.put(paramString, paramArrayList);
  }

  public void putDouble(String paramString, double paramDouble)
  {
    this.auL.put(paramString, Double.valueOf(paramDouble));
  }

  public void putFloat(String paramString, float paramFloat)
  {
    this.auL.put(paramString, Float.valueOf(paramFloat));
  }

  public void putFloatArray(String paramString, float[] paramArrayOfFloat)
  {
    this.auL.put(paramString, paramArrayOfFloat);
  }

  public void putInt(String paramString, int paramInt)
  {
    this.auL.put(paramString, Integer.valueOf(paramInt));
  }

  public void putIntegerArrayList(String paramString, ArrayList<Integer> paramArrayList)
  {
    this.auL.put(paramString, paramArrayList);
  }

  public void putLong(String paramString, long paramLong)
  {
    this.auL.put(paramString, Long.valueOf(paramLong));
  }

  public void putLongArray(String paramString, long[] paramArrayOfLong)
  {
    this.auL.put(paramString, paramArrayOfLong);
  }

  public void putString(String paramString1, String paramString2)
  {
    this.auL.put(paramString1, paramString2);
  }

  public void putStringArray(String paramString, String[] paramArrayOfString)
  {
    this.auL.put(paramString, paramArrayOfString);
  }

  public void putStringArrayList(String paramString, ArrayList<String> paramArrayList)
  {
    this.auL.put(paramString, paramArrayList);
  }

  public Object remove(String paramString)
  {
    return this.auL.remove(paramString);
  }

  public int size()
  {
    return this.auL.size();
  }

  public Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = this.auL.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(localBundle, str, this.auL.get(str));
    }
    return localBundle;
  }

  public byte[] toByteArray()
  {
    return pm.f(pb.a(this).avQ);
  }

  public String toString()
  {
    return this.auL.toString();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataMap
 * JD-Core Version:    0.6.0
 */