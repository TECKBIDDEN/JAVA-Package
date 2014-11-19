package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class x
{
  static String a(w paramw, long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramw.eG());
    if (paramw.eI() > 0L)
    {
      long l = paramLong - paramw.eI();
      if (l >= 0L)
        localStringBuilder.append("&qt").append("=").append(l);
    }
    localStringBuilder.append("&z").append("=").append(paramw.eH());
    return localStringBuilder.toString();
  }

  static String encode(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw new AssertionError("URL encoding failed for: " + paramString);
  }

  static Map<String, String> z(Map<String, String> paramMap)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((!((String)localEntry.getKey()).startsWith("&")) || (localEntry.getValue() == null))
        continue;
      String str = ((String)localEntry.getKey()).substring(1);
      if (TextUtils.isEmpty(str))
        continue;
      localHashMap.put(str, localEntry.getValue());
    }
    return localHashMap;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.x
 * JD-Core Version:    0.6.0
 */