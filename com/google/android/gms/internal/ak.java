package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;

@ez
public class ak
{
  private final Object mw = new Object();
  private final int nf;
  private final int ng;
  private final int nh;
  private final ap ni;
  private ArrayList<String> nj = new ArrayList();
  private int nk = 0;
  private int nl = 0;
  private int nm = 0;
  private int nn;
  private String no = "";

  public ak(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.nf = paramInt1;
    this.ng = paramInt2;
    this.nh = paramInt3;
    this.ni = new ap(paramInt4);
  }

  private String a(ArrayList<String> paramArrayList, int paramInt)
  {
    String str;
    if (paramArrayList.isEmpty())
      str = "";
    while (true)
    {
      return str;
      StringBuffer localStringBuffer = new StringBuffer();
      Iterator localIterator = paramArrayList.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localStringBuffer.append((String)localIterator.next());
        localStringBuffer.append(' ');
      }
      while (localStringBuffer.length() <= paramInt);
      localStringBuffer.deleteCharAt(-1 + localStringBuffer.length());
      str = localStringBuffer.toString();
      if (str.length() < paramInt)
        continue;
      str = str.substring(0, paramInt);
    }
  }

  private void j(String paramString)
  {
    if ((paramString == null) || (paramString.length() < this.nh));
    while (true)
    {
      return;
      synchronized (this.mw)
      {
        this.nj.add(paramString);
        this.nk += paramString.length();
      }
    }
  }

  int a(int paramInt1, int paramInt2)
  {
    return paramInt1 * this.nf + paramInt2 * this.ng;
  }

  public boolean aN()
  {
    while (true)
    {
      synchronized (this.mw)
      {
        if (this.nm == 0)
        {
          i = 1;
          return i;
        }
      }
      int i = 0;
    }
  }

  public String aO()
  {
    return this.no;
  }

  public void aP()
  {
    synchronized (this.mw)
    {
      this.nn = (-100 + this.nn);
      return;
    }
  }

  public void aQ()
  {
    synchronized (this.mw)
    {
      this.nm = (-1 + this.nm);
      return;
    }
  }

  public void aR()
  {
    synchronized (this.mw)
    {
      this.nm = (1 + this.nm);
      return;
    }
  }

  public void aS()
  {
    synchronized (this.mw)
    {
      int i = a(this.nk, this.nl);
      if (i > this.nn)
      {
        this.nn = i;
        this.no = this.ni.a(this.nj);
      }
      return;
    }
  }

  int aT()
  {
    return this.nk;
  }

  public void c(int paramInt)
  {
    this.nl = paramInt;
  }

  public boolean equals(Object paramObject)
  {
    int i = 0;
    if (!(paramObject instanceof ak));
    while (true)
    {
      return i;
      if (paramObject == this)
      {
        i = 1;
        continue;
      }
      ak localak = (ak)paramObject;
      if ((localak.aO() == null) || (!localak.aO().equals(aO())))
        continue;
      i = 1;
    }
  }

  public int getScore()
  {
    return this.nn;
  }

  public void h(String paramString)
  {
    j(paramString);
    synchronized (this.mw)
    {
      if (this.nm < 0)
        gs.S("ActivityContent: negative number of WebViews.");
      aS();
      return;
    }
  }

  public int hashCode()
  {
    return aO().hashCode();
  }

  public void i(String paramString)
  {
    j(paramString);
  }

  public String toString()
  {
    return "ActivityContent fetchId: " + this.nl + " score:" + this.nn + " total_length:" + this.nk + "\n text: " + a(this.nj, 200) + "\n signture: " + this.no;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ak
 * JD-Core Version:    0.6.0
 */