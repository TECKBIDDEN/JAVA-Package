package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class jz
{
  private static final Pattern ML = Pattern.compile("\\\\.");
  private static final Pattern MM = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

  public static String bf(String paramString)
  {
    Matcher localMatcher;
    StringBuffer localStringBuffer;
    if (!TextUtils.isEmpty(paramString))
    {
      localMatcher = MM.matcher(paramString);
      localStringBuffer = null;
      while (localMatcher.find())
      {
        if (localStringBuffer == null)
          localStringBuffer = new StringBuffer();
        switch (localMatcher.group().charAt(0))
        {
        default:
          break;
        case '\b':
          localMatcher.appendReplacement(localStringBuffer, "\\\\b");
          break;
        case '"':
          localMatcher.appendReplacement(localStringBuffer, "\\\\\\\"");
          break;
        case '\\':
          localMatcher.appendReplacement(localStringBuffer, "\\\\\\\\");
          break;
        case '/':
          localMatcher.appendReplacement(localStringBuffer, "\\\\/");
          break;
        case '\f':
          localMatcher.appendReplacement(localStringBuffer, "\\\\f");
          break;
        case '\n':
          localMatcher.appendReplacement(localStringBuffer, "\\\\n");
          break;
        case '\r':
          localMatcher.appendReplacement(localStringBuffer, "\\\\r");
          break;
        case '\t':
          localMatcher.appendReplacement(localStringBuffer, "\\\\t");
        }
      }
      if (localStringBuffer != null)
        break label217;
    }
    while (true)
    {
      return paramString;
      label217: localMatcher.appendTail(localStringBuffer);
      paramString = localStringBuffer.toString();
    }
  }

  public static boolean d(Object paramObject1, Object paramObject2)
  {
    boolean bool1 = false;
    JSONObject localJSONObject1;
    JSONObject localJSONObject2;
    if (((paramObject1 instanceof JSONObject)) && ((paramObject2 instanceof JSONObject)))
    {
      localJSONObject1 = (JSONObject)paramObject1;
      localJSONObject2 = (JSONObject)paramObject2;
      if (localJSONObject1.length() == localJSONObject2.length());
    }
    while (true)
    {
      return bool1;
      Iterator localIterator = localJSONObject1.keys();
      label50: String str;
      if (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        if (!localJSONObject2.has(str))
          continue;
      }
      try
      {
        boolean bool3 = d(localJSONObject1.get(str), localJSONObject2.get(str));
        if (bool3)
          break label50;
        continue;
        bool1 = true;
        continue;
        JSONArray localJSONArray1;
        JSONArray localJSONArray2;
        int i;
        if (((paramObject1 instanceof JSONArray)) && ((paramObject2 instanceof JSONArray)))
        {
          localJSONArray1 = (JSONArray)paramObject1;
          localJSONArray2 = (JSONArray)paramObject2;
          if (localJSONArray1.length() != localJSONArray2.length())
            continue;
          i = 0;
          label154: if (i >= localJSONArray1.length());
        }
        try
        {
          boolean bool2 = d(localJSONArray1.get(i), localJSONArray2.get(i));
          if (!bool2)
            continue;
          i++;
          break label154;
          bool1 = true;
          continue;
          bool1 = paramObject1.equals(paramObject2);
        }
        catch (JSONException localJSONException1)
        {
        }
      }
      catch (JSONException localJSONException2)
      {
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jz
 * JD-Core Version:    0.6.0
 */