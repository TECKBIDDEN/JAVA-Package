package com.google.android.gms.internal;

import java.util.LinkedHashMap;

public class ja<K, V>
{
  private final LinkedHashMap<K, V> Mb;
  private int Mc;
  private int Md;
  private int Me;
  private int Mf;
  private int Mg;
  private int Mh;
  private int size;

  public ja(int paramInt)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("maxSize <= 0");
    this.Mc = paramInt;
    this.Mb = new LinkedHashMap(0, 0.75F, true);
  }

  private int c(K paramK, V paramV)
  {
    int i = sizeOf(paramK, paramV);
    if (i < 0)
      throw new IllegalStateException("Negative size: " + paramK + "=" + paramV);
    return i;
  }

  protected V create(K paramK)
  {
    return null;
  }

  protected void entryRemoved(boolean paramBoolean, K paramK, V paramV1, V paramV2)
  {
  }

  public final void evictAll()
  {
    trimToSize(-1);
  }

  public final V get(K paramK)
  {
    if (paramK == null)
      throw new NullPointerException("key == null");
    monitorenter;
    Object localObject3;
    try
    {
      localObject2 = this.Mb.get(paramK);
      if (localObject2 != null)
      {
        this.Mg = (1 + this.Mg);
        monitorexit;
        break label170;
      }
      this.Mh = (1 + this.Mh);
      monitorexit;
      localObject3 = create(paramK);
      if (localObject3 == null)
        localObject2 = null;
    }
    finally
    {
      monitorexit;
    }
    monitorenter;
    try
    {
      this.Me = (1 + this.Me);
      localObject2 = this.Mb.put(paramK, localObject3);
      if (localObject2 != null)
        this.Mb.put(paramK, localObject2);
      while (true)
      {
        monitorexit;
        if (localObject2 == null)
          break;
        entryRemoved(false, paramK, localObject3, localObject2);
        break label170;
        this.size += c(paramK, localObject3);
      }
    }
    finally
    {
      monitorexit;
    }
    trimToSize(this.Mc);
    Object localObject2 = localObject3;
    label170: return localObject2;
  }

  public final V put(K paramK, V paramV)
  {
    if ((paramK == null) || (paramV == null))
      throw new NullPointerException("key == null || value == null");
    monitorenter;
    try
    {
      this.Md = (1 + this.Md);
      this.size += c(paramK, paramV);
      Object localObject2 = this.Mb.put(paramK, paramV);
      if (localObject2 != null)
        this.size -= c(paramK, localObject2);
      monitorexit;
      if (localObject2 != null)
        entryRemoved(false, paramK, localObject2, paramV);
      trimToSize(this.Mc);
      return localObject2;
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }

  public final int size()
  {
    monitorenter;
    try
    {
      int i = this.size;
      monitorexit;
      return i;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  protected int sizeOf(K paramK, V paramV)
  {
    return 1;
  }

  public final String toString()
  {
    int i = 0;
    monitorenter;
    try
    {
      int j = this.Mg + this.Mh;
      if (j != 0)
        i = 100 * this.Mg / j;
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(this.Mc);
      arrayOfObject[1] = Integer.valueOf(this.Mg);
      arrayOfObject[2] = Integer.valueOf(this.Mh);
      arrayOfObject[3] = Integer.valueOf(i);
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", arrayOfObject);
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

  // ERROR //
  public void trimToSize(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 96	com/google/android/gms/internal/ja:size	I
    //   6: iflt +20 -> 26
    //   9: aload_0
    //   10: getfield 38	com/google/android/gms/internal/ja:Mb	Ljava/util/LinkedHashMap;
    //   13: invokevirtual 121	java/util/LinkedHashMap:isEmpty	()Z
    //   16: ifeq +48 -> 64
    //   19: aload_0
    //   20: getfield 96	com/google/android/gms/internal/ja:size	I
    //   23: ifeq +41 -> 64
    //   26: new 45	java/lang/IllegalStateException
    //   29: dup
    //   30: new 47	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   37: aload_0
    //   38: invokevirtual 125	java/lang/Object:getClass	()Ljava/lang/Class;
    //   41: invokevirtual 130	java/lang/Class:getName	()Ljava/lang/String;
    //   44: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: ldc 132
    //   49: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokespecial 64	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   58: athrow
    //   59: astore_2
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_2
    //   63: athrow
    //   64: aload_0
    //   65: getfield 96	com/google/android/gms/internal/ja:size	I
    //   68: iload_1
    //   69: if_icmple +13 -> 82
    //   72: aload_0
    //   73: getfield 38	com/google/android/gms/internal/ja:Mb	Ljava/util/LinkedHashMap;
    //   76: invokevirtual 121	java/util/LinkedHashMap:isEmpty	()Z
    //   79: ifeq +6 -> 85
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: getfield 38	com/google/android/gms/internal/ja:Mb	Ljava/util/LinkedHashMap;
    //   89: invokevirtual 136	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   92: invokeinterface 142 1 0
    //   97: invokeinterface 148 1 0
    //   102: checkcast 150	java/util/Map$Entry
    //   105: astore_3
    //   106: aload_3
    //   107: invokeinterface 153 1 0
    //   112: astore 4
    //   114: aload_3
    //   115: invokeinterface 156 1 0
    //   120: astore 5
    //   122: aload_0
    //   123: getfield 38	com/google/android/gms/internal/ja:Mb	Ljava/util/LinkedHashMap;
    //   126: aload 4
    //   128: invokevirtual 159	java/util/LinkedHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: aload_0
    //   133: aload_0
    //   134: getfield 96	com/google/android/gms/internal/ja:size	I
    //   137: aload_0
    //   138: aload 4
    //   140: aload 5
    //   142: invokespecial 98	com/google/android/gms/internal/ja:c	(Ljava/lang/Object;Ljava/lang/Object;)I
    //   145: isub
    //   146: putfield 96	com/google/android/gms/internal/ja:size	I
    //   149: aload_0
    //   150: iconst_1
    //   151: aload_0
    //   152: getfield 161	com/google/android/gms/internal/ja:Mf	I
    //   155: iadd
    //   156: putfield 161	com/google/android/gms/internal/ja:Mf	I
    //   159: aload_0
    //   160: monitorexit
    //   161: aload_0
    //   162: iconst_1
    //   163: aload 4
    //   165: aload 5
    //   167: aconst_null
    //   168: invokevirtual 94	com/google/android/gms/internal/ja:entryRemoved	(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   171: goto -171 -> 0
    //
    // Exception table:
    //   from	to	target	type
    //   2	62	59	finally
    //   64	161	59	finally
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ja
 * JD-Core Version:    0.6.0
 */