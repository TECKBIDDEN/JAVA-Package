package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.n;

public abstract class d
{
  protected final DataHolder IC;
  protected int JQ;
  private int JR;

  public d(DataHolder paramDataHolder, int paramInt)
  {
    this.IC = ((DataHolder)n.i(paramDataHolder));
    ap(paramInt);
  }

  protected void a(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    this.IC.a(paramString, this.JQ, this.JR, paramCharArrayBuffer);
  }

  public boolean aQ(String paramString)
  {
    return this.IC.aQ(paramString);
  }

  protected Uri aR(String paramString)
  {
    return this.IC.g(paramString, this.JQ, this.JR);
  }

  protected boolean aS(String paramString)
  {
    return this.IC.h(paramString, this.JQ, this.JR);
  }

  protected void ap(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.IC.getCount()));
    for (boolean bool = true; ; bool = false)
    {
      n.I(bool);
      this.JQ = paramInt;
      this.JR = this.IC.ar(this.JQ);
      return;
    }
  }

  public boolean equals(Object paramObject)
  {
    int i = 0;
    if ((paramObject instanceof d))
    {
      d locald = (d)paramObject;
      if ((m.equal(Integer.valueOf(locald.JQ), Integer.valueOf(this.JQ))) && (m.equal(Integer.valueOf(locald.JR), Integer.valueOf(this.JR))) && (locald.IC == this.IC))
        i = 1;
    }
    return i;
  }

  protected int gA()
  {
    return this.JQ;
  }

  protected boolean getBoolean(String paramString)
  {
    return this.IC.d(paramString, this.JQ, this.JR);
  }

  protected byte[] getByteArray(String paramString)
  {
    return this.IC.f(paramString, this.JQ, this.JR);
  }

  protected float getFloat(String paramString)
  {
    return this.IC.e(paramString, this.JQ, this.JR);
  }

  protected int getInteger(String paramString)
  {
    return this.IC.b(paramString, this.JQ, this.JR);
  }

  protected long getLong(String paramString)
  {
    return this.IC.a(paramString, this.JQ, this.JR);
  }

  protected String getString(String paramString)
  {
    return this.IC.c(paramString, this.JQ, this.JR);
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.JQ);
    arrayOfObject[1] = Integer.valueOf(this.JR);
    arrayOfObject[2] = this.IC;
    return m.hashCode(arrayOfObject);
  }

  public boolean isDataValid()
  {
    if (!this.IC.isClosed());
    for (int i = 1; ; i = 0)
      return i;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.d
 * JD-Core Version:    0.6.0
 */