package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ez
public final class fs
{
  private static final SimpleDateFormat up = new SimpleDateFormat("yyyyMMdd");

  public static fk a(Context paramContext, fi paramfi, String paramString)
  {
    JSONObject localJSONObject;
    String str1;
    String str3;
    String str4;
    long l1;
    String str5;
    long l2;
    int i;
    fk localfk1;
    fk localfk3;
    label211: Object localObject1;
    label249: int m;
    while (true)
    {
      try
      {
        localJSONObject = new JSONObject(paramString);
        str1 = localJSONObject.optString("ad_base_url", null);
        String str2 = localJSONObject.optString("ad_url", null);
        str3 = localJSONObject.optString("ad_size", null);
        str4 = localJSONObject.optString("ad_html", null);
        l1 = -1L;
        str5 = localJSONObject.optString("debug_dialog", null);
        if (!localJSONObject.has("interstitial_timeout"))
          break label662;
        l2 = ()(1000.0D * localJSONObject.getDouble("interstitial_timeout"));
        String str6 = localJSONObject.optString("orientation", null);
        i = -1;
        if (!"portrait".equals(str6))
          continue;
        i = gj.dn();
        if (TextUtils.isEmpty(str4))
          continue;
        if (!TextUtils.isEmpty(str1))
          break label653;
        gs.W("Could not parse the mediation config: Missing required ad_base_url field");
        localfk1 = new fk(0);
        break label659;
        if (!"landscape".equals(str6))
          continue;
        i = gj.dm();
        continue;
        if (TextUtils.isEmpty(str2))
          continue;
        fk localfk2 = fr.a(paramContext, paramfi.lD.wD, str2, null, null);
        str1 = localfk2.rP;
        str4 = localfk2.tG;
        l1 = localfk2.tM;
        localfk3 = localfk2;
        JSONArray localJSONArray1 = localJSONObject.optJSONArray("click_urls");
        if (localfk3 == null)
        {
          localObject1 = null;
          if (localJSONArray1 == null)
            break;
          if (localObject1 != null)
            break label670;
          localObject1 = new LinkedList();
          break label670;
          if (m >= localJSONArray1.length())
            break label676;
          ((List)localObject1).add(localJSONArray1.getString(m));
          m++;
          continue;
          gs.W("Could not parse the mediation config: Missing required ad_html or ad_url field.");
          localfk1 = new fk(0);
        }
      }
      catch (JSONException localJSONException)
      {
        gs.W("Could not parse the mediation config: " + localJSONException.getMessage());
        localfk1 = new fk(0);
      }
      localObject1 = localfk3.qf;
    }
    label349: JSONArray localJSONArray2 = localJSONObject.optJSONArray("impression_urls");
    Object localObject3;
    if (localfk3 == null)
      localObject3 = null;
    label387: int k;
    label428: Object localObject5;
    label466: int j;
    while (localJSONArray2 != null)
    {
      if (localObject3 != null)
        break label683;
      localObject3 = new LinkedList();
      break label683;
      while (k < localJSONArray2.length())
      {
        ((List)localObject3).add(localJSONArray2.getString(k));
        k++;
      }
      localObject3 = localfk3.qg;
      continue;
      JSONArray localJSONArray3 = localJSONObject.optJSONArray("manual_impression_urls");
      if (localfk3 == null);
      for (localObject5 = null; localJSONArray3 != null; localObject5 = localfk3.tK)
      {
        if (localObject5 != null)
          break label696;
        localObject5 = new LinkedList();
        break label696;
        while (j < localJSONArray3.length())
        {
          ((List)localObject5).add(localJSONArray3.getString(j));
          j++;
        }
      }
    }
    while (true)
    {
      if (localfk3 != null)
      {
        if (localfk3.orientation != -1)
          i = localfk3.orientation;
        if (localfk3.tH > 0L)
          l2 = localfk3.tH;
      }
      String str7 = localJSONObject.optString("active_view");
      String str8 = null;
      boolean bool = localJSONObject.optBoolean("ad_is_javascript", false);
      if (bool)
        str8 = localJSONObject.optString("ad_passback_url", null);
      localfk1 = new fk(str1, str4, (List)localObject2, (List)localObject4, l2, false, -1L, (List)localObject6, -1L, i, str3, l1, str5, bool, str8, str7, false, false, paramfi.tF, false);
      break label659;
      Object localObject6 = localObject5;
      continue;
      Object localObject4 = localObject3;
      break label428;
      Object localObject2 = localObject1;
      break label349;
      label653: localfk3 = null;
      break label211;
      label659: return localfk1;
      label662: l2 = -1L;
      break;
      label670: m = 0;
      break label249;
      label676: localObject2 = localObject1;
      break label349;
      label683: k = 0;
      break label387;
      localObject4 = localObject3;
      break label428;
      label696: j = 0;
      break label466;
      localObject6 = localObject5;
    }
  }

  public static String a(fi paramfi, fw paramfw, Location paramLocation, String paramString1, String paramString2)
  {
    try
    {
      HashMap localHashMap = new HashMap();
      ArrayList localArrayList = new ArrayList();
      if (!TextUtils.isEmpty(paramString1))
        localArrayList.add(paramString1);
      if (!TextUtils.isEmpty(paramString2))
        localArrayList.add(paramString2);
      if (localArrayList.size() > 0)
        localHashMap.put("eid", TextUtils.join(",", localArrayList));
      if (paramfi.tw != null)
        localHashMap.put("ad_pos", paramfi.tw);
      a(localHashMap, paramfi.tx);
      localHashMap.put("format", paramfi.lH.of);
      if (paramfi.lH.width == -1)
        localHashMap.put("smart_w", "full");
      if (paramfi.lH.height == -2)
        localHashMap.put("smart_h", "auto");
      if (paramfi.lH.oh != null)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        ay[] arrayOfay = paramfi.lH.oh;
        int i = arrayOfay.length;
        int j = 0;
        if (j < i)
        {
          ay localay = arrayOfay[j];
          if (localStringBuilder.length() != 0)
            localStringBuilder.append("|");
          int k;
          if (localay.width == -1)
          {
            k = (int)(localay.widthPixels / paramfw.vi);
            label257: localStringBuilder.append(k);
            localStringBuilder.append("x");
            if (localay.height != -2)
              break label322;
          }
          label322: for (int m = (int)(localay.heightPixels / paramfw.vi); ; m = localay.height)
          {
            localStringBuilder.append(m);
            j++;
            break;
            k = localay.width;
            break label257;
          }
        }
        localHashMap.put("sz", localStringBuilder);
      }
      if (paramfi.tD != 0)
      {
        localHashMap.put("native_version", Integer.valueOf(paramfi.tD));
        localHashMap.put("native_templates", paramfi.lS);
      }
      localHashMap.put("slotname", paramfi.lA);
      localHashMap.put("pn", paramfi.applicationInfo.packageName);
      if (paramfi.ty != null)
        localHashMap.put("vc", Integer.valueOf(paramfi.ty.versionCode));
      localHashMap.put("ms", paramfi.tz);
      localHashMap.put("seq_num", paramfi.tA);
      localHashMap.put("session_id", paramfi.tB);
      localHashMap.put("js", paramfi.lD.wD);
      a(localHashMap, paramfw);
      if ((paramfi.tx.versionCode >= 2) && (paramfi.tx.ob != null))
        a(localHashMap, paramfi.tx.ob);
      if (paramfi.versionCode >= 2)
        localHashMap.put("quality_signals", paramfi.tC);
      if ((paramfi.versionCode >= 4) && (paramfi.tF))
        localHashMap.put("forceHttps", Boolean.valueOf(paramfi.tF));
      if ((paramfi.versionCode >= 3) && (paramfi.tE != null))
        localHashMap.put("content_info", paramfi.tE);
      if (gs.u(2))
      {
        String str3 = gj.t(localHashMap).toString(2);
        gs.V("Ad Request JSON: " + str3);
      }
      String str2 = gj.t(localHashMap).toString();
      str1 = str2;
      return str1;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        gs.W("Problem serializing ad request to JSON: " + localJSONException.getMessage());
        String str1 = null;
      }
    }
  }

  private static void a(HashMap<String, Object> paramHashMap, Location paramLocation)
  {
    HashMap localHashMap = new HashMap();
    Float localFloat = Float.valueOf(1000.0F * paramLocation.getAccuracy());
    Long localLong1 = Long.valueOf(1000L * paramLocation.getTime());
    Long localLong2 = Long.valueOf(()(10000000.0D * paramLocation.getLatitude()));
    Long localLong3 = Long.valueOf(()(10000000.0D * paramLocation.getLongitude()));
    localHashMap.put("radius", localFloat);
    localHashMap.put("lat", localLong2);
    localHashMap.put("long", localLong3);
    localHashMap.put("time", localLong1);
    paramHashMap.put("uule", localHashMap);
  }

  private static void a(HashMap<String, Object> paramHashMap, av paramav)
  {
    String str = gf.dj();
    if (str != null)
      paramHashMap.put("abf", str);
    if (paramav.nT != -1L)
      paramHashMap.put("cust_age", up.format(new Date(paramav.nT)));
    if (paramav.extras != null)
      paramHashMap.put("extras", paramav.extras);
    if (paramav.nU != -1)
      paramHashMap.put("cust_gender", Integer.valueOf(paramav.nU));
    if (paramav.nV != null)
      paramHashMap.put("kw", paramav.nV);
    if (paramav.nX != -1)
      paramHashMap.put("tag_for_child_directed_treatment", Integer.valueOf(paramav.nX));
    if (paramav.nW)
      paramHashMap.put("adtest", "on");
    if (paramav.versionCode >= 2)
    {
      if (paramav.nY)
        paramHashMap.put("d_imp_hdr", Integer.valueOf(1));
      if (!TextUtils.isEmpty(paramav.nZ))
        paramHashMap.put("ppid", paramav.nZ);
      if (paramav.oa != null)
        a(paramHashMap, paramav.oa);
    }
    if ((paramav.versionCode >= 3) && (paramav.oc != null))
      paramHashMap.put("url", paramav.oc);
  }

  private static void a(HashMap<String, Object> paramHashMap, bj parambj)
  {
    Object localObject1 = null;
    if (Color.alpha(parambj.oH) != 0)
      paramHashMap.put("acolor", t(parambj.oH));
    if (Color.alpha(parambj.backgroundColor) != 0)
      paramHashMap.put("bgcolor", t(parambj.backgroundColor));
    if ((Color.alpha(parambj.oI) != 0) && (Color.alpha(parambj.oJ) != 0))
    {
      paramHashMap.put("gradientto", t(parambj.oI));
      paramHashMap.put("gradientfrom", t(parambj.oJ));
    }
    if (Color.alpha(parambj.oK) != 0)
      paramHashMap.put("bcolor", t(parambj.oK));
    paramHashMap.put("bthick", Integer.toString(parambj.oL));
    Object localObject2;
    switch (parambj.oM)
    {
    default:
      localObject2 = null;
      if (localObject2 != null)
        paramHashMap.put("btype", localObject2);
      switch (parambj.oN)
      {
      default:
      case 2:
      case 0:
      case 1:
      }
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      if (localObject1 != null)
        paramHashMap.put("callbuttoncolor", localObject1);
      if (parambj.oO != null)
        paramHashMap.put("channel", parambj.oO);
      if (Color.alpha(parambj.oP) != 0)
        paramHashMap.put("dcolor", t(parambj.oP));
      if (parambj.oQ != null)
        paramHashMap.put("font", parambj.oQ);
      if (Color.alpha(parambj.oR) != 0)
        paramHashMap.put("hcolor", t(parambj.oR));
      paramHashMap.put("headersize", Integer.toString(parambj.oS));
      if (parambj.oT != null)
        paramHashMap.put("q", parambj.oT);
      return;
      localObject2 = "none";
      break;
      localObject2 = "dashed";
      break;
      localObject2 = "dotted";
      break;
      localObject2 = "solid";
      break;
      localObject1 = "dark";
      continue;
      localObject1 = "light";
      continue;
      localObject1 = "medium";
    }
  }

  private static void a(HashMap<String, Object> paramHashMap, fw paramfw)
  {
    paramHashMap.put("am", Integer.valueOf(paramfw.uS));
    paramHashMap.put("cog", s(paramfw.uT));
    paramHashMap.put("coh", s(paramfw.uU));
    if (!TextUtils.isEmpty(paramfw.uV))
      paramHashMap.put("carrier", paramfw.uV);
    paramHashMap.put("gl", paramfw.uW);
    if (paramfw.uX)
      paramHashMap.put("simulator", Integer.valueOf(1));
    paramHashMap.put("ma", s(paramfw.uY));
    paramHashMap.put("sp", s(paramfw.uZ));
    paramHashMap.put("hl", paramfw.va);
    if (!TextUtils.isEmpty(paramfw.vb))
      paramHashMap.put("mv", paramfw.vb);
    paramHashMap.put("muv", Integer.valueOf(paramfw.vc));
    if (paramfw.vd != -2)
      paramHashMap.put("cnt", Integer.valueOf(paramfw.vd));
    paramHashMap.put("gnt", Integer.valueOf(paramfw.ve));
    paramHashMap.put("pt", Integer.valueOf(paramfw.vf));
    paramHashMap.put("rm", Integer.valueOf(paramfw.vg));
    paramHashMap.put("riv", Integer.valueOf(paramfw.vh));
    paramHashMap.put("u_sd", Float.valueOf(paramfw.vi));
    paramHashMap.put("sh", Integer.valueOf(paramfw.vk));
    paramHashMap.put("sw", Integer.valueOf(paramfw.vj));
    Bundle localBundle1 = new Bundle();
    localBundle1.putInt("active_network_state", paramfw.vo);
    localBundle1.putBoolean("active_network_metered", paramfw.vn);
    paramHashMap.put("connectivity", localBundle1);
    Bundle localBundle2 = new Bundle();
    localBundle2.putBoolean("is_charging", paramfw.vm);
    localBundle2.putDouble("battery_level", paramfw.vl);
    paramHashMap.put("battery", localBundle2);
  }

  private static Integer s(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
      return Integer.valueOf(i);
  }

  private static String t(int paramInt)
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(0xFFFFFF & paramInt);
    return String.format(localLocale, "#%06x", arrayOfObject);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fs
 * JD-Core Version:    0.6.0
 */