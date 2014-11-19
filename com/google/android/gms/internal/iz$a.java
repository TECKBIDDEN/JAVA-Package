package com.google.android.gms.internal;

import com.google.android.gms.common.internal.m;

public final class iz$a
{
  public final int Li;
  public final int Lj;

  public iz$a(int paramInt1, int paramInt2)
  {
    this.Li = paramInt1;
    this.Lj = paramInt2;
  }

  public boolean equals(Object paramObject)
  {
    int i = 1;
    if (!(paramObject instanceof a))
      i = 0;
    while (true)
    {
      return i;
      if (this == paramObject)
        continue;
      a locala = (a)paramObject;
      if ((locala.Li == this.Li) && (locala.Lj == this.Lj))
        continue;
      i = 0;
    }
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.Li);
    arrayOfObject[1] = Integer.valueOf(this.Lj);
    return m.hashCode(arrayOfObject);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iz.a
 * JD-Core Version:    0.6.0
 */