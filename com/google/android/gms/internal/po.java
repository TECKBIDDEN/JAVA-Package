package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

final class po
{
  final byte[] awK;
  final int tag;

  po(int paramInt, byte[] paramArrayOfByte)
  {
    this.tag = paramInt;
    this.awK = paramArrayOfByte;
  }

  void a(pf parampf)
    throws IOException
  {
    parampf.gz(this.tag);
    parampf.t(this.awK);
  }

  int c()
  {
    return 0 + pf.gA(this.tag) + this.awK.length;
  }

  public boolean equals(Object paramObject)
  {
    int i = 1;
    if (paramObject == this);
    while (true)
    {
      return i;
      if (!(paramObject instanceof po))
      {
        i = 0;
        continue;
      }
      po localpo = (po)paramObject;
      if ((this.tag == localpo.tag) && (Arrays.equals(this.awK, localpo.awK)))
        continue;
      i = 0;
    }
  }

  public int hashCode()
  {
    return 31 * (527 + this.tag) + Arrays.hashCode(this.awK);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.po
 * JD-Core Version:    0.6.0
 */