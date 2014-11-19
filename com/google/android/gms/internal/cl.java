package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ez
public final class cl
{
  public final String pW;
  public final String pX;
  public final List<String> pY;
  public final String pZ;
  public final String qa;
  public final List<String> qb;
  public final String qc;

  public cl(JSONObject paramJSONObject)
    throws JSONException
  {
    this.pX = paramJSONObject.getString("id");
    JSONArray localJSONArray = paramJSONObject.getJSONArray("adapters");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    for (int i = 0; i < localJSONArray.length(); i++)
      localArrayList.add(localJSONArray.getString(i));
    this.pY = Collections.unmodifiableList(localArrayList);
    this.pZ = paramJSONObject.optString("allocation_id", null);
    this.qb = cr.a(paramJSONObject, "imp_urls");
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("ad");
    String str2;
    JSONObject localJSONObject2;
    if (localJSONObject1 != null)
    {
      str2 = localJSONObject1.toString();
      this.pW = str2;
      localJSONObject2 = paramJSONObject.optJSONObject("data");
      if (localJSONObject2 == null)
        break label175;
    }
    label175: for (String str3 = localJSONObject2.toString(); ; str3 = null)
    {
      this.qc = str3;
      if (localJSONObject2 != null)
        str1 = localJSONObject2.optString("class_name");
      this.qa = str1;
      return;
      str2 = null;
      break;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cl
 * JD-Core Version:    0.6.0
 */