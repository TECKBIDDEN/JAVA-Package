package com.google.android.gms.analytics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class aa
{
  private final Map<String, Integer> AU = new HashMap();
  private final Map<String, String> AV = new HashMap();
  private final boolean AW;
  private final String AX;

  aa(String paramString, boolean paramBoolean)
  {
    this.AW = paramBoolean;
    this.AX = paramString;
  }

  void e(String paramString, int paramInt)
  {
    if (!this.AW);
    while (true)
    {
      return;
      Integer localInteger = (Integer)this.AU.get(paramString);
      if (localInteger == null)
        localInteger = Integer.valueOf(0);
      this.AU.put(paramString, Integer.valueOf(paramInt + localInteger.intValue()));
    }
  }

  String eM()
  {
    if (!this.AW);
    StringBuilder localStringBuilder;
    for (String str1 = ""; ; str1 = localStringBuilder.toString())
    {
      return str1;
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.AX);
      Iterator localIterator1 = this.AU.keySet().iterator();
      while (localIterator1.hasNext())
      {
        String str3 = (String)localIterator1.next();
        localStringBuilder.append("&").append(str3).append("=").append(this.AU.get(str3));
      }
      Iterator localIterator2 = this.AV.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        localStringBuilder.append("&").append(str2).append("=").append((String)this.AV.get(str2));
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.aa
 * JD-Core Version:    0.6.0
 */