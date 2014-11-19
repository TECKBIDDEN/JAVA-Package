package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class hp
{
  private static final String[] Cm;
  private static final Map<String, Integer> Cn;

  static
  {
    int i = 0;
    String[] arrayOfString = new String[9];
    arrayOfString[i] = "text1";
    arrayOfString[1] = "text2";
    arrayOfString[2] = "icon";
    arrayOfString[3] = "intent_action";
    arrayOfString[4] = "intent_data";
    arrayOfString[5] = "intent_data_id";
    arrayOfString[6] = "intent_extra_data";
    arrayOfString[7] = "suggest_large_icon";
    arrayOfString[8] = "intent_activity";
    Cm = arrayOfString;
    Cn = new HashMap(Cm.length);
    while (i < Cm.length)
    {
      Cn.put(Cm[i], Integer.valueOf(i));
      i++;
    }
  }

  public static String O(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= Cm.length));
    for (String str = null; ; str = Cm[paramInt])
      return str;
  }

  public static int as(String paramString)
  {
    Integer localInteger = (Integer)Cn.get(paramString);
    if (localInteger == null)
      throw new IllegalArgumentException("[" + paramString + "] is not a valid global search section name");
    return localInteger.intValue();
  }

  public static int fm()
  {
    return Cm.length;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hp
 * JD-Core Version:    0.6.0
 */