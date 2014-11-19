package com.google.android.gms.internal;

import java.io.IOException;

public final class pp
{
  public static final int[] awL = new int[0];
  public static final long[] awM = new long[0];
  public static final float[] awN = new float[0];
  public static final double[] awO = new double[0];
  public static final boolean[] awP = new boolean[0];
  public static final String[] awQ = new String[0];
  public static final byte[][] awR = new byte[0][];
  public static final byte[] awS = new byte[0];

  public static final int b(pe parampe, int paramInt)
    throws IOException
  {
    int i = 1;
    int j = parampe.getPosition();
    parampe.gm(paramInt);
    while (parampe.qg() == paramInt)
    {
      parampe.gm(paramInt);
      i++;
    }
    parampe.gq(j);
    return i;
  }

  static int gG(int paramInt)
  {
    return paramInt & 0x7;
  }

  public static int gH(int paramInt)
  {
    return paramInt >>> 3;
  }

  static int x(int paramInt1, int paramInt2)
  {
    return paramInt2 | paramInt1 << 3;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pp
 * JD-Core Version:    0.6.0
 */