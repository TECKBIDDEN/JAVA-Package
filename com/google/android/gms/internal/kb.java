package com.google.android.gms.internal;

public class kb
{
  public static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 + (paramInt2 & 0xFFFFFFFC);
    int j = paramInt3;
    while (paramInt1 < i)
    {
      int i4 = -862048943 * (0xFF & paramArrayOfByte[paramInt1] | (0xFF & paramArrayOfByte[(paramInt1 + 1)]) << 8 | (0xFF & paramArrayOfByte[(paramInt1 + 2)]) << 16 | paramArrayOfByte[(paramInt1 + 3)] << 24);
      int i5 = j ^ 461845907 * (i4 << 15 | i4 >>> 17);
      j = -430675100 + 5 * (i5 << 13 | i5 >>> 19);
      paramInt1 += 4;
    }
    int k = 0;
    switch (paramInt2 & 0x3)
    {
    default:
    case 3:
    case 2:
    case 1:
    }
    int m;
    for (int n = j; ; n = j ^ 461845907 * (m << 15 | m >>> 17))
    {
      int i1 = n ^ paramInt2;
      int i2 = -2048144789 * (i1 ^ i1 >>> 16);
      int i3 = -1028477387 * (i2 ^ i2 >>> 13);
      return i3 ^ i3 >>> 16;
      k = (0xFF & paramArrayOfByte[(i + 2)]) << 16;
      k |= (0xFF & paramArrayOfByte[(i + 1)]) << 8;
      m = -862048943 * (k | 0xFF & paramArrayOfByte[i]);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kb
 * JD-Core Version:    0.6.0
 */