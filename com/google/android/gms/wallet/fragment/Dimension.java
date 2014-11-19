package com.google.android.gms.wallet.fragment;

import android.util.DisplayMetrics;
import android.util.TypedValue;

public class Dimension
{
  public static final int MATCH_PARENT = -1;
  public static final int UNIT_DIP = 1;
  public static final int UNIT_IN = 4;
  public static final int UNIT_MM = 5;
  public static final int UNIT_PT = 3;
  public static final int UNIT_PX = 0;
  public static final int UNIT_SP = 2;
  public static final int WRAP_CONTENT = -2;

  public static int a(long paramLong, DisplayMetrics paramDisplayMetrics)
  {
    int i = (int)(paramLong >>> 32);
    int j = (int)paramLong;
    int m;
    int k;
    switch (i)
    {
    default:
      throw new IllegalStateException("Unexpected unit or type: " + i);
    case 129:
    case 128:
      for (m = j; ; m = TypedValue.complexToDimensionPixelSize(j, paramDisplayMetrics))
        return m;
    case 0:
      k = 0;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      m = Math.round(TypedValue.applyDimension(k, Float.intBitsToFloat(j), paramDisplayMetrics));
      break;
      k = 1;
      continue;
      k = 2;
      continue;
      k = 3;
      continue;
      k = 4;
      continue;
      k = 5;
    }
  }

  public static long a(int paramInt, float paramFloat)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unrecognized unit: " + paramInt);
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    return o(paramInt, Float.floatToIntBits(paramFloat));
  }

  public static long a(TypedValue paramTypedValue)
  {
    long l;
    switch (paramTypedValue.type)
    {
    default:
      throw new IllegalArgumentException("Unexpected dimension type: " + paramTypedValue.type);
    case 16:
      l = fD(paramTypedValue.data);
    case 5:
    }
    while (true)
    {
      return l;
      l = o(128, paramTypedValue.data);
    }
  }

  public static long fD(int paramInt)
  {
    long l;
    if (paramInt < 0)
      if ((paramInt == -1) || (paramInt == -2))
        l = o(129, paramInt);
    while (true)
    {
      return l;
      throw new IllegalArgumentException("Unexpected dimension value: " + paramInt);
      l = a(0, paramInt);
    }
  }

  private static long o(int paramInt1, int paramInt2)
  {
    return paramInt1 << 32 | 0xFFFFFFFF & paramInt2;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.Dimension
 * JD-Core Version:    0.6.0
 */