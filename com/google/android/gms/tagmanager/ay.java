package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

class ay
{
  private static String apn;
  static Map<String, String> apo = new HashMap();

  static void cC(String paramString)
  {
    monitorenter;
    try
    {
      apn = paramString;
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  static void d(Context paramContext, String paramString)
  {
    cz.a(paramContext, "gtm_install_referrer", "referrer", paramString);
    f(paramContext, paramString);
  }

  static String e(Context paramContext, String paramString)
  {
    if (apn == null)
      monitorenter;
    try
    {
      if (apn == null)
      {
        SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("gtm_install_referrer", 0);
        if (localSharedPreferences == null)
          break label51;
        apn = localSharedPreferences.getString("referrer", "");
      }
      while (true)
      {
        return x(apn, paramString);
        label51: apn = "";
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  static String f(Context paramContext, String paramString1, String paramString2)
  {
    String str = (String)apo.get(paramString1);
    SharedPreferences localSharedPreferences;
    if (str == null)
    {
      localSharedPreferences = paramContext.getSharedPreferences("gtm_click_referrers", 0);
      if (localSharedPreferences == null)
        break label59;
    }
    label59: for (str = localSharedPreferences.getString(paramString1, ""); ; str = "")
    {
      apo.put(paramString1, str);
      return x(str, paramString2);
    }
  }

  static void f(Context paramContext, String paramString)
  {
    String str = x(paramString, "conv");
    if ((str != null) && (str.length() > 0))
    {
      apo.put(str, paramString);
      cz.a(paramContext, "gtm_click_referrers", str, paramString);
    }
  }

  static String x(String paramString1, String paramString2)
  {
    if (paramString2 == null)
      if (paramString1.length() <= 0);
    while (true)
    {
      return paramString1;
      paramString1 = null;
      continue;
      paramString1 = Uri.parse("http://hostname/?" + paramString1).getQueryParameter(paramString2);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ay
 * JD-Core Version:    0.6.0
 */