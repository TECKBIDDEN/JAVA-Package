package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.b;
import com.google.android.gms.internal.d.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ba
{
  public static cr.c cD(String paramString)
    throws JSONException
  {
    d.a locala = n(new JSONObject(paramString));
    cr.d locald = cr.c.oV();
    for (int i = 0; i < locala.gx.length; i++)
      locald.a(cr.a.oR().b(b.df.toString(), locala.gx[i]).b(b.cU.toString(), di.cU(m.nO())).b(m.nP(), locala.gy[i]).oU());
    return locald.oY();
  }

  private static d.a n(Object paramObject)
    throws JSONException
  {
    return di.u(o(paramObject));
  }

  static Object o(Object paramObject)
    throws JSONException
  {
    if ((paramObject instanceof JSONArray))
      throw new RuntimeException("JSONArrays are not supported");
    if (JSONObject.NULL.equals(paramObject))
      throw new RuntimeException("JSON nulls are not supported");
    if ((paramObject instanceof JSONObject))
    {
      JSONObject localJSONObject = (JSONObject)paramObject;
      HashMap localHashMap = new HashMap();
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localHashMap.put(str, o(localJSONObject.get(str)));
      }
      paramObject = localHashMap;
    }
    return paramObject;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ba
 * JD-Core Version:    0.6.0
 */