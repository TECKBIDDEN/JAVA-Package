package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ez
public final class cm
{
  public final List<cl> qd;
  public final long qe;
  public final List<String> qf;
  public final List<String> qg;
  public final List<String> qh;
  public final String qi;
  public final long qj;
  public int qk;
  public int ql;

  public cm(String paramString)
    throws JSONException
  {
    JSONObject localJSONObject1 = new JSONObject(paramString);
    if (gs.u(2))
      gs.V("Mediation Response JSON: " + localJSONObject1.toString(2));
    JSONArray localJSONArray = localJSONObject1.getJSONArray("ad_networks");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    int i = -1;
    for (int j = 0; j < localJSONArray.length(); j++)
    {
      cl localcl = new cl(localJSONArray.getJSONObject(j));
      localArrayList.add(localcl);
      if ((i >= 0) || (!a(localcl)))
        continue;
      i = j;
    }
    this.qk = i;
    this.ql = localJSONArray.length();
    this.qd = Collections.unmodifiableList(localArrayList);
    this.qi = localJSONObject1.getString("qdata");
    JSONObject localJSONObject2 = localJSONObject1.optJSONObject("settings");
    long l2;
    if (localJSONObject2 != null)
    {
      this.qe = localJSONObject2.optLong("ad_network_timeout_millis", -1L);
      this.qf = cr.a(localJSONObject2, "click_urls");
      this.qg = cr.a(localJSONObject2, "imp_urls");
      this.qh = cr.a(localJSONObject2, "nofill_urls");
      long l1 = localJSONObject2.optLong("refresh", -1L);
      if (l1 > 0L)
        l2 = l1 * 1000L;
    }
    for (this.qj = l2; ; this.qj = -1L)
    {
      return;
      l2 = -1L;
      break;
      this.qe = -1L;
      this.qf = null;
      this.qg = null;
      this.qh = null;
    }
  }

  private boolean a(cl paramcl)
  {
    Iterator localIterator = paramcl.pY.iterator();
    do
      if (!localIterator.hasNext())
        break;
    while (!((String)localIterator.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"));
    for (int i = 1; ; i = 0)
      return i;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cm
 * JD-Core Version:    0.6.0
 */