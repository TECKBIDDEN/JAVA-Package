package com.google.android.gms.internal;

import java.util.Arrays;

public final class pk
{
  public static final Object awI = new Object();

  public static boolean equals(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    boolean bool;
    if ((paramArrayOfFloat1 == null) || (paramArrayOfFloat1.length == 0))
      if ((paramArrayOfFloat2 == null) || (paramArrayOfFloat2.length == 0))
        bool = true;
    while (true)
    {
      return bool;
      bool = false;
      continue;
      bool = Arrays.equals(paramArrayOfFloat1, paramArrayOfFloat2);
    }
  }

  public static boolean equals(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    boolean bool;
    if ((paramArrayOfInt1 == null) || (paramArrayOfInt1.length == 0))
      if ((paramArrayOfInt2 == null) || (paramArrayOfInt2.length == 0))
        bool = true;
    while (true)
    {
      return bool;
      bool = false;
      continue;
      bool = Arrays.equals(paramArrayOfInt1, paramArrayOfInt2);
    }
  }

  public static boolean equals(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    boolean bool;
    if ((paramArrayOfLong1 == null) || (paramArrayOfLong1.length == 0))
      if ((paramArrayOfLong2 == null) || (paramArrayOfLong2.length == 0))
        bool = true;
    while (true)
    {
      return bool;
      bool = false;
      continue;
      bool = Arrays.equals(paramArrayOfLong1, paramArrayOfLong2);
    }
  }

  public static boolean equals(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    int i = 0;
    int j;
    if (paramArrayOfObject1 == null)
    {
      j = 0;
      if (paramArrayOfObject2 != null)
        break label46;
    }
    int m;
    int n;
    label46: for (int k = 0; ; k = paramArrayOfObject2.length)
    {
      m = 0;
      for (n = 0; (n < j) && (paramArrayOfObject1[n] == null); n++);
      j = paramArrayOfObject1.length;
      break;
    }
    while (true)
    {
      if ((i1 < k) && (paramArrayOfObject2[i1] == null))
      {
        i1++;
        continue;
      }
      int i2;
      int i3;
      if (n >= j)
      {
        i2 = 1;
        if (i1 < k)
          break label112;
        i3 = 1;
        label92: if ((i2 == 0) || (i3 == 0))
          break label118;
        i = 1;
      }
      label112: label118: 
      do
      {
        return i;
        i2 = 0;
        break;
        i3 = 0;
        break label92;
      }
      while ((i2 != i3) || (!paramArrayOfObject1[n].equals(paramArrayOfObject2[i1])));
      int i4 = n + 1;
      m = i1 + 1;
      n = i4;
      break;
      int i1 = m;
    }
  }

  public static int hashCode(float[] paramArrayOfFloat)
  {
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length == 0));
    for (int i = 0; ; i = Arrays.hashCode(paramArrayOfFloat))
      return i;
  }

  public static int hashCode(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0));
    for (int i = 0; ; i = Arrays.hashCode(paramArrayOfInt))
      return i;
  }

  public static int hashCode(long[] paramArrayOfLong)
  {
    if ((paramArrayOfLong == null) || (paramArrayOfLong.length == 0));
    for (int i = 0; ; i = Arrays.hashCode(paramArrayOfLong))
      return i;
  }

  public static int hashCode(Object[] paramArrayOfObject)
  {
    int i = 0;
    if (paramArrayOfObject == null);
    for (int j = 0; ; j = paramArrayOfObject.length)
      for (int k = 0; k < j; k++)
      {
        Object localObject = paramArrayOfObject[k];
        if (localObject == null)
          continue;
        i = i * 31 + localObject.hashCode();
      }
    return i;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pk
 * JD-Core Version:    0.6.0
 */