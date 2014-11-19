package com.google.android.gms.internal;

class pi
{
  private static final pj awB = new pj();
  private boolean awC = false;
  private int[] awD;
  private pj[] awE;
  private int mSize;

  public pi()
  {
    this(10);
  }

  public pi(int paramInt)
  {
    int i = idealIntArraySize(paramInt);
    this.awD = new int[i];
    this.awE = new pj[i];
    this.mSize = 0;
  }

  private boolean a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    int i = 0;
    int j = 0;
    if (j < paramInt)
      if (paramArrayOfInt1[j] == paramArrayOfInt2[j]);
    while (true)
    {
      return i;
      j++;
      break;
      i = 1;
    }
  }

  private boolean a(pj[] paramArrayOfpj1, pj[] paramArrayOfpj2, int paramInt)
  {
    int i = 0;
    int j = 0;
    if (j < paramInt)
      if (paramArrayOfpj1[j].equals(paramArrayOfpj2[j]));
    while (true)
    {
      return i;
      j++;
      break;
      i = 1;
    }
  }

  private int gF(int paramInt)
  {
    int i = 0;
    int j = -1 + this.mSize;
    int m;
    while (true)
    {
      if (i > j)
        break label66;
      m = i + j >>> 1;
      int n = this.awD[m];
      if (n < paramInt)
      {
        i = m + 1;
        continue;
      }
      if (n <= paramInt)
        break;
      j = m - 1;
    }
    label66: for (int k = m; ; k = i ^ 0xFFFFFFFF)
      return k;
  }

  private void gc()
  {
    int i = this.mSize;
    int[] arrayOfInt = this.awD;
    pj[] arrayOfpj = this.awE;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      pj localpj = arrayOfpj[j];
      if (localpj != awB)
      {
        if (j != k)
        {
          arrayOfInt[k] = arrayOfInt[j];
          arrayOfpj[k] = localpj;
          arrayOfpj[j] = null;
        }
        k++;
      }
      j++;
    }
    this.awC = false;
    this.mSize = k;
  }

  private int idealByteArraySize(int paramInt)
  {
    for (int i = 4; ; i++)
    {
      if (i < 32)
      {
        if (paramInt > -12 + (1 << i))
          continue;
        paramInt = -12 + (1 << i);
      }
      return paramInt;
    }
  }

  private int idealIntArraySize(int paramInt)
  {
    return idealByteArraySize(paramInt * 4) / 4;
  }

  public void a(int paramInt, pj parampj)
  {
    int i = gF(paramInt);
    if (i >= 0)
      this.awE[i] = parampj;
    while (true)
    {
      return;
      int j = i ^ 0xFFFFFFFF;
      if ((j < this.mSize) && (this.awE[j] == awB))
      {
        this.awD[j] = paramInt;
        this.awE[j] = parampj;
        continue;
      }
      if ((this.awC) && (this.mSize >= this.awD.length))
      {
        gc();
        j = 0xFFFFFFFF ^ gF(paramInt);
      }
      if (this.mSize >= this.awD.length)
      {
        int k = idealIntArraySize(1 + this.mSize);
        int[] arrayOfInt = new int[k];
        pj[] arrayOfpj = new pj[k];
        System.arraycopy(this.awD, 0, arrayOfInt, 0, this.awD.length);
        System.arraycopy(this.awE, 0, arrayOfpj, 0, this.awE.length);
        this.awD = arrayOfInt;
        this.awE = arrayOfpj;
      }
      if (this.mSize - j != 0)
      {
        System.arraycopy(this.awD, j, this.awD, j + 1, this.mSize - j);
        System.arraycopy(this.awE, j, this.awE, j + 1, this.mSize - j);
      }
      this.awD[j] = paramInt;
      this.awE[j] = parampj;
      this.mSize = (1 + this.mSize);
    }
  }

  public boolean equals(Object paramObject)
  {
    int i = 1;
    if (paramObject == this);
    while (true)
    {
      return i;
      if (!(paramObject instanceof pi))
      {
        i = 0;
        continue;
      }
      pi localpi = (pi)paramObject;
      if (size() != localpi.size())
      {
        i = 0;
        continue;
      }
      if ((a(this.awD, localpi.awD, this.mSize)) && (a(this.awE, localpi.awE, this.mSize)))
        continue;
      i = 0;
    }
  }

  public pj gD(int paramInt)
  {
    int i = gF(paramInt);
    if ((i < 0) || (this.awE[i] == awB));
    for (pj localpj = null; ; localpj = this.awE[i])
      return localpj;
  }

  public pj gE(int paramInt)
  {
    if (this.awC)
      gc();
    return this.awE[paramInt];
  }

  public int hashCode()
  {
    if (this.awC)
      gc();
    int i = 17;
    for (int j = 0; j < this.mSize; j++)
      i = 31 * (i * 31 + this.awD[j]) + this.awE[j].hashCode();
    return i;
  }

  public boolean isEmpty()
  {
    if (size() == 0);
    for (int i = 1; ; i = 0)
      return i;
  }

  public int size()
  {
    if (this.awC)
      gc();
    return this.mSize;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pi
 * JD-Core Version:    0.6.0
 */