package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class m
{
  public static boolean equal(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2))));
    for (int i = 1; ; i = 0)
      return i;
  }

  public static a h(Object paramObject)
  {
    return new a(paramObject, null);
  }

  public static int hashCode(Object[] paramArrayOfObject)
  {
    return Arrays.hashCode(paramArrayOfObject);
  }

  public static final class a
  {
    private final List<String> LY;
    private final Object LZ;

    private a(Object paramObject)
    {
      this.LZ = n.i(paramObject);
      this.LY = new ArrayList();
    }

    public a a(String paramString, Object paramObject)
    {
      this.LY.add((String)n.i(paramString) + "=" + String.valueOf(paramObject));
      return this;
    }

    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(100).append(this.LZ.getClass().getSimpleName()).append('{');
      int i = this.LY.size();
      for (int j = 0; j < i; j++)
      {
        localStringBuilder.append((String)this.LY.get(j));
        if (j >= i - 1)
          continue;
        localStringBuilder.append(", ");
      }
      return '}';
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.m
 * JD-Core Version:    0.6.0
 */