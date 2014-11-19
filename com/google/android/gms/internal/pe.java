package com.google.android.gms.internal;

import java.io.IOException;

public final class pe
{
  private int awo;
  private int awp;
  private int awq;
  private int awr;
  private int aws;
  private int awt = 2147483647;
  private int awu;
  private int awv = 64;
  private int aww = 67108864;
  private final byte[] buffer;

  private pe(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.awo = paramInt1;
    this.awp = (paramInt1 + paramInt2);
    this.awr = paramInt1;
  }

  public static long A(long paramLong)
  {
    return paramLong >>> 1 ^ -(1L & paramLong);
  }

  public static pe a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new pe(paramArrayOfByte, paramInt1, paramInt2);
  }

  public static int gn(int paramInt)
  {
    return paramInt >>> 1 ^ -(paramInt & 0x1);
  }

  public static pe p(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  private void qr()
  {
    this.awp += this.awq;
    int i = this.awp;
    if (i > this.awt)
    {
      this.awq = (i - this.awt);
      this.awp -= this.awq;
    }
    while (true)
    {
      return;
      this.awq = 0;
    }
  }

  public void a(pm parampm)
    throws IOException
  {
    int i = qn();
    if (this.awu >= this.awv)
      throw pl.qE();
    int j = go(i);
    this.awu = (1 + this.awu);
    parampm.b(this);
    gl(0);
    this.awu = (-1 + this.awu);
    gp(j);
  }

  public void a(pm parampm, int paramInt)
    throws IOException
  {
    if (this.awu >= this.awv)
      throw pl.qE();
    this.awu = (1 + this.awu);
    parampm.b(this);
    gl(pp.x(paramInt, 4));
    this.awu = (-1 + this.awu);
  }

  public int getPosition()
  {
    return this.awr - this.awo;
  }

  public void gl(int paramInt)
    throws pl
  {
    if (this.aws != paramInt)
      throw pl.qC();
  }

  public boolean gm(int paramInt)
    throws IOException
  {
    int i = 1;
    switch (pp.gG(paramInt))
    {
    default:
      throw pl.qD();
    case 0:
      qj();
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return i;
      qq();
      continue;
      gs(qn());
      continue;
      qh();
      gl(pp.x(pp.gH(paramInt), 4));
      continue;
      i = 0;
      continue;
      qp();
    }
  }

  public int go(int paramInt)
    throws pl
  {
    if (paramInt < 0)
      throw pl.qz();
    int i = paramInt + this.awr;
    int j = this.awt;
    if (i > j)
      throw pl.qy();
    this.awt = i;
    qr();
    return j;
  }

  public void gp(int paramInt)
  {
    this.awt = paramInt;
    qr();
  }

  public void gq(int paramInt)
  {
    if (paramInt > this.awr - this.awo)
      throw new IllegalArgumentException("Position " + paramInt + " is beyond current " + (this.awr - this.awo));
    if (paramInt < 0)
      throw new IllegalArgumentException("Bad position " + paramInt);
    this.awr = (paramInt + this.awo);
  }

  public byte[] gr(int paramInt)
    throws IOException
  {
    if (paramInt < 0)
      throw pl.qz();
    if (paramInt + this.awr > this.awt)
    {
      gs(this.awt - this.awr);
      throw pl.qy();
    }
    if (paramInt <= this.awp - this.awr)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(this.buffer, this.awr, arrayOfByte, 0, paramInt);
      this.awr = (paramInt + this.awr);
      return arrayOfByte;
    }
    throw pl.qy();
  }

  public void gs(int paramInt)
    throws IOException
  {
    if (paramInt < 0)
      throw pl.qz();
    if (paramInt + this.awr > this.awt)
    {
      gs(this.awt - this.awr);
      throw pl.qy();
    }
    if (paramInt <= this.awp - this.awr)
    {
      this.awr = (paramInt + this.awr);
      return;
    }
    throw pl.qy();
  }

  public int qg()
    throws IOException
  {
    int i = 0;
    if (qt())
      this.aws = 0;
    while (true)
    {
      return i;
      this.aws = qn();
      if (this.aws == 0)
        throw pl.qB();
      i = this.aws;
    }
  }

  public void qh()
    throws IOException
  {
    int i;
    do
      i = qg();
    while ((i != 0) && (gm(i)));
  }

  public long qi()
    throws IOException
  {
    return qo();
  }

  public int qj()
    throws IOException
  {
    return qn();
  }

  public boolean qk()
    throws IOException
  {
    if (qn() != 0);
    for (int i = 1; ; i = 0)
      return i;
  }

  public int ql()
    throws IOException
  {
    return gn(qn());
  }

  public long qm()
    throws IOException
  {
    return A(qo());
  }

  public int qn()
    throws IOException
  {
    int i = qu();
    if (i >= 0);
    int i4;
    do
    {
      int i1;
      int i2;
      while (true)
      {
        return i;
        int j = i & 0x7F;
        int k = qu();
        if (k >= 0)
        {
          i = j | k << 7;
          continue;
        }
        int m = j | (k & 0x7F) << 7;
        int n = qu();
        if (n >= 0)
        {
          i = m | n << 14;
          continue;
        }
        i1 = m | (n & 0x7F) << 14;
        i2 = qu();
        if (i2 < 0)
          break;
        i = i1 | i2 << 21;
      }
      int i3 = i1 | (i2 & 0x7F) << 21;
      i4 = qu();
      i = i3 | i4 << 28;
    }
    while (i4 >= 0);
    for (int i5 = 0; ; i5++)
    {
      if (i5 >= 5)
        break label160;
      if (qu() >= 0)
        break;
    }
    label160: throw pl.qA();
  }

  public long qo()
    throws IOException
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = qu();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0)
        return l;
      i += 7;
    }
    throw pl.qA();
  }

  public int qp()
    throws IOException
  {
    int i = qu();
    int j = qu();
    int k = qu();
    int m = qu();
    return i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16 | (m & 0xFF) << 24;
  }

  public long qq()
    throws IOException
  {
    int i = qu();
    int j = qu();
    int k = qu();
    int m = qu();
    int n = qu();
    int i1 = qu();
    int i2 = qu();
    int i3 = qu();
    return 0xFF & i | (0xFF & j) << 8 | (0xFF & k) << 16 | (0xFF & m) << 24 | (0xFF & n) << 32 | (0xFF & i1) << 40 | (0xFF & i2) << 48 | (0xFF & i3) << 56;
  }

  public int qs()
  {
    if (this.awt == 2147483647);
    int i;
    for (int j = -1; ; j = this.awt - i)
    {
      return j;
      i = this.awr;
    }
  }

  public boolean qt()
  {
    if (this.awr == this.awp);
    for (int i = 1; ; i = 0)
      return i;
  }

  public byte qu()
    throws IOException
  {
    if (this.awr == this.awp)
      throw pl.qy();
    byte[] arrayOfByte = this.buffer;
    int i = this.awr;
    this.awr = (i + 1);
    return arrayOfByte[i];
  }

  public byte[] r(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte;
    if (paramInt2 == 0)
      arrayOfByte = pp.awS;
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = new byte[paramInt2];
      int i = paramInt1 + this.awo;
      System.arraycopy(this.buffer, i, arrayOfByte, 0, paramInt2);
    }
  }

  public byte[] readBytes()
    throws IOException
  {
    int i = qn();
    byte[] arrayOfByte;
    if ((i <= this.awp - this.awr) && (i > 0))
    {
      arrayOfByte = new byte[i];
      System.arraycopy(this.buffer, this.awr, arrayOfByte, 0, i);
      this.awr = (i + this.awr);
    }
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = gr(i);
    }
  }

  public double readDouble()
    throws IOException
  {
    return Double.longBitsToDouble(qq());
  }

  public float readFloat()
    throws IOException
  {
    return Float.intBitsToFloat(qp());
  }

  public String readString()
    throws IOException
  {
    int i = qn();
    String str;
    if ((i <= this.awp - this.awr) && (i > 0))
    {
      str = new String(this.buffer, this.awr, i, "UTF-8");
      this.awr = (i + this.awr);
    }
    while (true)
    {
      return str;
      str = new String(gr(i), "UTF-8");
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pe
 * JD-Core Version:    0.6.0
 */