package com.google.android.gms.analytics;

import android.text.TextUtils;

class w
{
  private String AE;
  private final long AF;
  private final long AG;
  private String AH = "https:";

  w(String paramString, long paramLong1, long paramLong2)
  {
    this.AE = paramString;
    this.AF = paramLong1;
    this.AG = paramLong2;
  }

  void aj(String paramString)
  {
    this.AE = paramString;
  }

  void ak(String paramString)
  {
    if ((paramString == null) || (TextUtils.isEmpty(paramString.trim())));
    while (true)
    {
      return;
      if (paramString.toLowerCase().startsWith("http:"))
      {
        this.AH = "http:";
        continue;
      }
    }
  }

  String eG()
  {
    return this.AE;
  }

  long eH()
  {
    return this.AF;
  }

  long eI()
  {
    return this.AG;
  }

  String eJ()
  {
    return this.AH;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.w
 * JD-Core Version:    0.6.0
 */