package com.google.android.gms.internal;

@ez
final class fb$a extends Exception
{
  private final int tc;

  public fb$a(String paramString, int paramInt)
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
 * Qualified Name:     com.google.android.gms.internal.fb.a
 * JD-Core Version:    0.6.0
 */