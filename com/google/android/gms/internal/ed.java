package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

@ez
public final class ed
{
  public static String D(String paramString)
  {
    Object localObject = null;
    if (paramString == null);
    while (true)
    {
      return localObject;
      try
      {
        String str = new JSONObject(paramString).getString("developerPayload");
        localObject = str;
      }
      catch (JSONException localJSONException)
      {
        gs.W("Fail to parse purchase data");
      }
    }
  }

  public static String E(String paramString)
  {
    Object localObject = null;
    if (paramString == null);
    while (true)
    {
      return localObject;
      try
      {
        String str = new JSONObject(paramString).getString("purchaseToken");
        localObject = str;
      }
      catch (JSONException localJSONException)
      {
        gs.W("Fail to parse purchase data");
      }
    }
  }

  public static int b(Bundle paramBundle)
  {
    Object localObject = paramBundle.get("RESPONSE_CODE");
    int i;
    if (localObject == null)
    {
      gs.W("Bundle with null response code, assuming OK (known issue)");
      i = 0;
    }
    while (true)
    {
      return i;
      if ((localObject instanceof Integer))
      {
        i = ((Integer)localObject).intValue();
        continue;
      }
      if ((localObject instanceof Long))
      {
        i = (int)((Long)localObject).longValue();
        continue;
      }
      gs.W("Unexpected type for intent response code. " + localObject.getClass().getName());
      i = 5;
    }
  }

  public static int d(Intent paramIntent)
  {
    Object localObject = paramIntent.getExtras().get("RESPONSE_CODE");
    int i;
    if (localObject == null)
    {
      gs.W("Intent with no response code, assuming OK (known issue)");
      i = 0;
    }
    while (true)
    {
      return i;
      if ((localObject instanceof Integer))
      {
        i = ((Integer)localObject).intValue();
        continue;
      }
      if ((localObject instanceof Long))
      {
        i = (int)((Long)localObject).longValue();
        continue;
      }
      gs.W("Unexpected type for intent response code. " + localObject.getClass().getName());
      i = 5;
    }
  }

  public static String e(Intent paramIntent)
  {
    if (paramIntent == null);
    for (String str = null; ; str = paramIntent.getStringExtra("INAPP_PURCHASE_DATA"))
      return str;
  }

  public static String f(Intent paramIntent)
  {
    if (paramIntent == null);
    for (String str = null; ; str = paramIntent.getStringExtra("INAPP_DATA_SIGNATURE"))
      return str;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ed
 * JD-Core Version:    0.6.0
 */