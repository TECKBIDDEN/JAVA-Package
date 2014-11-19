package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public final class hq$a
{
  private final List<hk> CA;
  private BitSet CB;
  private String CC;
  private String Cv;
  private boolean Cw;
  private int Cx;
  private boolean Cy;
  private String Cz;
  private final String mName;

  public hq$a(String paramString)
  {
    this.mName = paramString;
    this.Cx = 1;
    this.CA = new ArrayList();
  }

  public a E(boolean paramBoolean)
  {
    this.Cw = paramBoolean;
    return this;
  }

  public a F(boolean paramBoolean)
  {
    this.Cy = paramBoolean;
    return this;
  }

  public a P(int paramInt)
  {
    if (this.CB == null)
      this.CB = new BitSet();
    this.CB.set(paramInt);
    return this;
  }

  public a at(String paramString)
  {
    this.Cv = paramString;
    return this;
  }

  public a au(String paramString)
  {
    this.CC = paramString;
    return this;
  }

  public hq fn()
  {
    int i = 0;
    int[] arrayOfInt = null;
    if (this.CB != null)
    {
      arrayOfInt = new int[this.CB.cardinality()];
      int j = this.CB.nextSetBit(0);
      while (j >= 0)
      {
        int k = i + 1;
        arrayOfInt[i] = j;
        j = this.CB.nextSetBit(j + 1);
        i = k;
      }
    }
    return new hq(this.mName, this.Cv, this.Cw, this.Cx, this.Cy, this.Cz, (hk[])this.CA.toArray(new hk[this.CA.size()]), arrayOfInt, this.CC);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hq.a
 * JD-Core Version:    0.6.0
 */