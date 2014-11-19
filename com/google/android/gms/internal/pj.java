package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class pj
{
  private ph<?, ?> awF;
  private Object awG;
  private List<po> awH = new ArrayList();

  private byte[] toByteArray()
    throws IOException
  {
    byte[] arrayOfByte = new byte[c()];
    a(pf.q(arrayOfByte));
    return arrayOfByte;
  }

  void a(pf parampf)
    throws IOException
  {
    if (this.awG != null)
      this.awF.a(this.awG, parampf);
    while (true)
    {
      return;
      Iterator localIterator = this.awH.iterator();
      while (localIterator.hasNext())
        ((po)localIterator.next()).a(parampf);
    }
  }

  void a(po parampo)
  {
    this.awH.add(parampo);
  }

  <T> T b(ph<?, T> paramph)
  {
    if (this.awG != null)
    {
      if (this.awF != paramph)
        throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
    }
    else
    {
      this.awF = paramph;
      this.awG = paramph.l(this.awH);
      this.awH = null;
    }
    return this.awG;
  }

  int c()
  {
    int i;
    if (this.awG != null)
      i = this.awF.A(this.awG);
    while (true)
    {
      return i;
      Iterator localIterator = this.awH.iterator();
      i = 0;
      while (localIterator.hasNext())
        i += ((po)localIterator.next()).c();
    }
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject == this)
      bool1 = true;
    while (true)
    {
      return bool1;
      if (!(paramObject instanceof pj))
        continue;
      pj localpj = (pj)paramObject;
      if ((this.awG != null) && (localpj.awG != null))
      {
        if (this.awF != localpj.awF)
          continue;
        if (!this.awF.awz.isArray())
        {
          bool1 = this.awG.equals(localpj.awG);
          continue;
        }
        if ((this.awG instanceof byte[]))
        {
          bool1 = Arrays.equals((byte[])(byte[])this.awG, (byte[])(byte[])localpj.awG);
          continue;
        }
        if ((this.awG instanceof int[]))
        {
          bool1 = Arrays.equals((int[])(int[])this.awG, (int[])(int[])localpj.awG);
          continue;
        }
        if ((this.awG instanceof long[]))
        {
          bool1 = Arrays.equals((long[])(long[])this.awG, (long[])(long[])localpj.awG);
          continue;
        }
        if ((this.awG instanceof float[]))
        {
          bool1 = Arrays.equals((float[])(float[])this.awG, (float[])(float[])localpj.awG);
          continue;
        }
        if ((this.awG instanceof double[]))
        {
          bool1 = Arrays.equals((double[])(double[])this.awG, (double[])(double[])localpj.awG);
          continue;
        }
        if ((this.awG instanceof boolean[]))
        {
          bool1 = Arrays.equals((boolean[])(boolean[])this.awG, (boolean[])(boolean[])localpj.awG);
          continue;
        }
        bool1 = Arrays.deepEquals((Object[])(Object[])this.awG, (Object[])(Object[])localpj.awG);
        continue;
      }
      if ((this.awH != null) && (localpj.awH != null))
      {
        bool1 = this.awH.equals(localpj.awH);
        continue;
      }
      try
      {
        boolean bool2 = Arrays.equals(toByteArray(), localpj.toByteArray());
        bool1 = bool2;
      }
      catch (IOException localIOException)
      {
      }
    }
    throw new IllegalStateException(localIOException);
  }

  public int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(toByteArray());
      return i + 527;
    }
    catch (IOException localIOException)
    {
    }
    throw new IllegalStateException(localIOException);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pj
 * JD-Core Version:    0.6.0
 */