package com.google.android.gms.tagmanager;

class dh extends Number
  implements Comparable<dh>
{
  private double arG;
  private long arH;
  private boolean arI;

  private dh(double paramDouble)
  {
    this.arG = paramDouble;
    this.arI = false;
  }

  private dh(long paramLong)
  {
    this.arH = paramLong;
    this.arI = true;
  }

  public static dh a(Double paramDouble)
  {
    return new dh(paramDouble.doubleValue());
  }

  public static dh cT(String paramString)
    throws NumberFormatException
  {
    try
    {
      localdh = new dh(Long.parseLong(paramString));
      return localdh;
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      try
      {
        dh localdh = new dh(Double.parseDouble(paramString));
      }
      catch (NumberFormatException localNumberFormatException2)
      {
      }
    }
    throw new NumberFormatException(paramString + " is not a valid TypedNumber");
  }

  public static dh z(long paramLong)
  {
    return new dh(paramLong);
  }

  public int a(dh paramdh)
  {
    if ((py()) && (paramdh.py()));
    for (int i = new Long(this.arH).compareTo(Long.valueOf(paramdh.arH)); ; i = Double.compare(doubleValue(), paramdh.doubleValue()))
      return i;
  }

  public byte byteValue()
  {
    return (byte)(int)longValue();
  }

  public double doubleValue()
  {
    double d;
    if (py())
      d = this.arH;
    while (true)
    {
      return d;
      d = this.arG;
    }
  }

  public boolean equals(Object paramObject)
  {
    if (((paramObject instanceof dh)) && (a((dh)paramObject) == 0));
    for (int i = 1; ; i = 0)
      return i;
  }

  public float floatValue()
  {
    return (float)doubleValue();
  }

  public int hashCode()
  {
    return new Long(longValue()).hashCode();
  }

  public int intValue()
  {
    return pA();
  }

  public long longValue()
  {
    return pz();
  }

  public int pA()
  {
    return (int)longValue();
  }

  public short pB()
  {
    return (short)(int)longValue();
  }

  public boolean px()
  {
    if (!py());
    for (int i = 1; ; i = 0)
      return i;
  }

  public boolean py()
  {
    return this.arI;
  }

  public long pz()
  {
    long l;
    if (py())
      l = this.arH;
    while (true)
    {
      return l;
      l = ()this.arG;
    }
  }

  public short shortValue()
  {
    return pB();
  }

  public String toString()
  {
    if (py());
    for (String str = Long.toString(this.arH); ; str = Double.toString(this.arG))
      return str;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.dh
 * JD-Core Version:    0.6.0
 */