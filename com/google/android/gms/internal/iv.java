package com.google.android.gms.internal;

import android.content.Context;

public abstract class iv<T>
{
  private static a JG;
  private static final Object mw = new Object();
  protected final String JH;
  protected final T JI;
  private T JJ = null;

  static
  {
    JG = null;
  }

  protected iv(String paramString, T paramT)
  {
    this.JH = paramString;
    this.JI = paramT;
  }

  public static void H(Context paramContext)
  {
    synchronized (mw)
    {
      if (JG == null)
        JG = new iv.b(paramContext.getContentResolver());
      return;
    }
  }

  public static iv<Integer> a(String paramString, Integer paramInteger)
  {
    return new iv.2(paramString, paramInteger);
  }

  public static iv<Boolean> g(String paramString, boolean paramBoolean)
  {
    return new iv.1(paramString, Boolean.valueOf(paramBoolean));
  }

  public static iv<String> m(String paramString1, String paramString2)
  {
    return new iv.3(paramString1, paramString2);
  }

  public String getKey()
  {
    return this.JH;
  }

  private static abstract interface a
  {
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iv
 * JD-Core Version:    0.6.0
 */