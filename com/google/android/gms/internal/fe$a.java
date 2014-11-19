package com.google.android.gms.internal;

final class fe$a extends Exception
{
  private final int tc;

  public fe$a(String paramString, int paramInt)
  {
    super(paramString);
    this.tc = paramInt;
  }

  public int getErrorCode()
  {
    return this.tc;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fe.a
 * JD-Core Version:    0.6.0
 */