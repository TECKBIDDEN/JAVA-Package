package com.google.android.gms.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.net.Uri.Builder;
import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ParameterValuePair;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ez
public final class gj
{
  private static final Object uf = new Object();
  private static final SimpleDateFormat[] wm;
  private static boolean wn;
  private static String wo;
  private static boolean wp;

  static
  {
    SimpleDateFormat[] arrayOfSimpleDateFormat = new SimpleDateFormat[2];
    arrayOfSimpleDateFormat[0] = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    arrayOfSimpleDateFormat[1] = new SimpleDateFormat("yyyyMMdd");
    wm = arrayOfSimpleDateFormat;
    wn = true;
    wp = false;
  }

  public static String L(String paramString)
  {
    return Uri.parse(paramString).buildUpon().query(null).build().toString();
  }

  public static int M(String paramString)
  {
    try
    {
      int j = Integer.parseInt(paramString);
      i = j;
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        gs.W("Could not parse value:" + localNumberFormatException);
        int i = 0;
      }
    }
  }

  public static boolean N(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    for (boolean bool = false; ; bool = paramString.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)"))
      return bool;
  }

  public static long O(String paramString)
  {
    long l1 = -1L;
    int i = 0;
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return l1;
      SimpleDateFormat[] arrayOfSimpleDateFormat = wm;
      int j = arrayOfSimpleDateFormat.length;
      while (true)
        while (true)
        {
          if (i >= j)
            break label78;
          SimpleDateFormat localSimpleDateFormat = arrayOfSimpleDateFormat[i];
          try
          {
            localSimpleDateFormat.setLenient(false);
            localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long l3 = localSimpleDateFormat.parse(paramString).getTime();
            l1 = l3;
          }
          catch (ParseException localParseException)
          {
            i++;
          }
        }
      try
      {
        label78: long l2 = Long.parseLong(paramString);
        l1 = l2;
      }
      catch (NumberFormatException localNumberFormatException)
      {
      }
    }
  }

  public static String a(Readable paramReadable)
    throws IOException
  {
    StringBuilder localStringBuilder = new StringBuilder();
    CharBuffer localCharBuffer = CharBuffer.allocate(2048);
    while (true)
    {
      int i = paramReadable.read(localCharBuffer);
      if (i == -1)
        break;
      localCharBuffer.flip();
      localStringBuilder.append(localCharBuffer, 0, i);
    }
    return localStringBuilder.toString();
  }

  private static JSONArray a(Collection<?> paramCollection)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      a(localJSONArray, localIterator.next());
    return localJSONArray;
  }

  static JSONArray a(Object[] paramArrayOfObject)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    int i = paramArrayOfObject.length;
    for (int j = 0; j < i; j++)
      a(localJSONArray, paramArrayOfObject[j]);
    return localJSONArray;
  }

  public static void a(Context paramContext, String paramString, WebSettings paramWebSettings)
  {
    paramWebSettings.setUserAgentString(c(paramContext, paramString));
  }

  public static void a(Context paramContext, String paramString, List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      new gq(paramContext, paramString, (String)localIterator.next()).start();
  }

  public static void a(Context paramContext, String paramString1, List<String> paramList, String paramString2)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      new gq(paramContext, paramString1, (String)localIterator.next(), paramString2).start();
  }

  public static void a(Context paramContext, String paramString, boolean paramBoolean, HttpURLConnection paramHttpURLConnection)
  {
    a(paramContext, paramString, paramBoolean, paramHttpURLConnection, false);
  }

  public static void a(Context paramContext, String paramString1, boolean paramBoolean, HttpURLConnection paramHttpURLConnection, String paramString2)
  {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(paramBoolean);
    paramHttpURLConnection.setReadTimeout(60000);
    paramHttpURLConnection.setRequestProperty("User-Agent", paramString2);
    paramHttpURLConnection.setUseCaches(false);
  }

  public static void a(Context paramContext, String paramString, boolean paramBoolean1, HttpURLConnection paramHttpURLConnection, boolean paramBoolean2)
  {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(paramBoolean1);
    paramHttpURLConnection.setReadTimeout(60000);
    paramHttpURLConnection.setRequestProperty("User-Agent", c(paramContext, paramString));
    paramHttpURLConnection.setUseCaches(paramBoolean2);
  }

  public static void a(WebView paramWebView)
  {
    if (Build.VERSION.SDK_INT >= 11)
      gn.a(paramWebView);
  }

  private static void a(JSONArray paramJSONArray, Object paramObject)
    throws JSONException
  {
    if ((paramObject instanceof Bundle))
      paramJSONArray.put(c((Bundle)paramObject));
    while (true)
    {
      return;
      if ((paramObject instanceof Map))
      {
        paramJSONArray.put(t((Map)paramObject));
        continue;
      }
      if ((paramObject instanceof Collection))
      {
        paramJSONArray.put(a((Collection)paramObject));
        continue;
      }
      if ((paramObject instanceof Object[]))
      {
        paramJSONArray.put(a((Object[])(Object[])paramObject));
        continue;
      }
      paramJSONArray.put(paramObject);
    }
  }

  private static void a(JSONObject paramJSONObject, String paramString, Object paramObject)
    throws JSONException
  {
    if ((paramObject instanceof Bundle))
      paramJSONObject.put(paramString, c((Bundle)paramObject));
    while (true)
    {
      return;
      if ((paramObject instanceof Map))
      {
        paramJSONObject.put(paramString, t((Map)paramObject));
        continue;
      }
      if ((paramObject instanceof Collection))
      {
        if (paramString != null);
        while (true)
        {
          paramJSONObject.put(paramString, a((Collection)paramObject));
          break;
          paramString = "null";
        }
      }
      if ((paramObject instanceof Object[]))
      {
        paramJSONObject.put(paramString, a(Arrays.asList((Object[])(Object[])paramObject)));
        continue;
      }
      paramJSONObject.put(paramString, paramObject);
    }
  }

  public static boolean a(PackageManager paramPackageManager, String paramString1, String paramString2)
  {
    if (paramPackageManager.checkPermission(paramString2, paramString1) == 0);
    for (int i = 1; ; i = 0)
      return i;
  }

  public static boolean a(ClassLoader paramClassLoader, Class<?> paramClass, String paramString)
  {
    int i = 0;
    try
    {
      boolean bool = paramClass.isAssignableFrom(Class.forName(paramString, false, paramClassLoader));
      i = bool;
      label17: return i;
    }
    catch (Throwable localThrowable)
    {
      break label17;
    }
  }

  public static void b(WebView paramWebView)
  {
    if (Build.VERSION.SDK_INT >= 11)
      gn.b(paramWebView);
  }

  public static String c(Context paramContext, String paramString)
  {
    String str1;
    synchronized (uf)
    {
      if (wo != null)
      {
        str1 = wo;
        break label232;
      }
      int i = Build.VERSION.SDK_INT;
      if (i < 17)
        break label93;
    }
    try
    {
      wo = gp.getDefaultUserAgent(paramContext);
      wo = wo + " (Mobile; " + paramString + ")";
      str1 = wo;
      monitorexit;
      break label232;
      localObject2 = finally;
      monitorexit;
      throw localObject2;
    }
    catch (Exception localException2)
    {
    }
    label93: if (!gr.dt())
    {
      gr.wC.post(new Runnable(paramContext)
      {
        public void run()
        {
          synchronized (gj.dq())
          {
            gj.P(gj.u(this.mV));
            gj.dq().notifyAll();
            return;
          }
        }
      });
      while (true)
      {
        String str2 = wo;
        if (str2 != null)
          break;
        try
        {
          uf.wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          wo = jdMethod_do();
          gs.W("Interrupted, use default user agent: " + wo);
        }
      }
    }
    try
    {
      wo = r(paramContext);
      wo = wo + " (Mobile; " + paramString + ")";
      str1 = wo;
      monitorexit;
    }
    catch (Exception localException1)
    {
      while (true)
        wo = jdMethod_do();
    }
    label232: return str1;
  }

  public static Map<String, String> c(Uri paramUri)
  {
    if (paramUri == null);
    HashMap localHashMap;
    for (Object localObject = null; ; localObject = localHashMap)
    {
      return localObject;
      localHashMap = new HashMap();
      UrlQuerySanitizer localUrlQuerySanitizer = new UrlQuerySanitizer();
      localUrlQuerySanitizer.setAllowUnregisteredParamaters(true);
      localUrlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
      localUrlQuerySanitizer.parseUrl(paramUri.toString());
      Iterator localIterator = localUrlQuerySanitizer.getParameterList().iterator();
      while (localIterator.hasNext())
      {
        UrlQuerySanitizer.ParameterValuePair localParameterValuePair = (UrlQuerySanitizer.ParameterValuePair)localIterator.next();
        localHashMap.put(localParameterValuePair.mParameter, localParameterValuePair.mValue);
      }
    }
  }

  private static JSONObject c(Bundle paramBundle)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(localJSONObject, str, paramBundle.get(str));
    }
    return localJSONObject;
  }

  public static void c(Context paramContext, String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString2);
    a(paramContext, paramString1, localArrayList);
  }

  public static boolean dl()
  {
    return wn;
  }

  public static int dm()
  {
    if (Build.VERSION.SDK_INT >= 9);
    for (int i = 6; ; i = 0)
      return i;
  }

  public static int dn()
  {
    if (Build.VERSION.SDK_INT >= 9);
    for (int i = 7; ; i = 1)
      return i;
  }

  static String jdMethod_do()
  {
    StringBuffer localStringBuffer = new StringBuffer(256);
    localStringBuffer.append("Mozilla/5.0 (Linux; U; Android");
    if (Build.VERSION.RELEASE != null)
      localStringBuffer.append(" ").append(Build.VERSION.RELEASE);
    localStringBuffer.append("; ").append(Locale.getDefault());
    if (Build.DEVICE != null)
    {
      localStringBuffer.append("; ").append(Build.DEVICE);
      if (Build.DISPLAY != null)
        localStringBuffer.append(" Build/").append(Build.DISPLAY);
    }
    localStringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
    return localStringBuffer.toString();
  }

  public static String dp()
  {
    UUID localUUID = UUID.randomUUID();
    byte[] arrayOfByte1 = BigInteger.valueOf(localUUID.getLeastSignificantBits()).toByteArray();
    byte[] arrayOfByte2 = BigInteger.valueOf(localUUID.getMostSignificantBits()).toByteArray();
    Object localObject = new BigInteger(1, arrayOfByte1).toString();
    int i = 0;
    while (true)
    {
      if (i < 2);
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(arrayOfByte1);
        localMessageDigest.update(arrayOfByte2);
        byte[] arrayOfByte3 = new byte[8];
        System.arraycopy(localMessageDigest.digest(), 0, arrayOfByte3, 0, 8);
        String str = new BigInteger(1, arrayOfByte3).toString();
        localObject = str;
        label106: i++;
        continue;
        return localObject;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        break label106;
      }
    }
  }

  public static boolean p(Context paramContext)
  {
    int i = 0;
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveActivity(localIntent, 65536);
    if ((localResolveInfo == null) || (localResolveInfo.activityInfo == null))
    {
      gs.W("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
      return i;
    }
    if ((0x10 & localResolveInfo.activityInfo.configChanges) == 0)
    {
      Object[] arrayOfObject7 = new Object[1];
      arrayOfObject7[i] = "keyboard";
      gs.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", arrayOfObject7));
    }
    for (int j = 0; ; j = 1)
    {
      if ((0x20 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        Object[] arrayOfObject6 = new Object[1];
        arrayOfObject6[i] = "keyboardHidden";
        gs.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", arrayOfObject6));
        j = 0;
      }
      if ((0x80 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[i] = "orientation";
        gs.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", arrayOfObject5));
        j = 0;
      }
      if ((0x100 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[i] = "screenLayout";
        gs.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", arrayOfObject4));
        j = 0;
      }
      if ((0x200 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[i] = "uiMode";
        gs.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", arrayOfObject3));
        j = 0;
      }
      if ((0x400 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[i] = "screenSize";
        gs.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", arrayOfObject2));
        j = 0;
      }
      if ((0x800 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[i] = "smallestScreenSize";
        gs.W(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", arrayOfObject1));
        break;
      }
      i = j;
      break;
    }
  }

  public static void q(Context paramContext)
  {
    if (wp);
    while (true)
    {
      return;
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.USER_PRESENT");
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      paramContext.getApplicationContext().registerReceiver(new a(null), localIntentFilter);
      wp = true;
    }
  }

  private static String r(Context paramContext)
  {
    return new WebView(paramContext).getSettings().getUserAgentString();
  }

  public static int s(Context paramContext)
  {
    int i = 0;
    int j;
    if ((paramContext instanceof Activity))
    {
      Window localWindow = ((Activity)paramContext).getWindow();
      Rect localRect = new Rect();
      localWindow.getDecorView().getWindowVisibleDisplayFrame(localRect);
      j = localRect.top;
      i = localWindow.findViewById(16908290).getTop() - j;
    }
    while (true)
    {
      return i + j;
      j = 0;
    }
  }

  public static JSONObject t(Map<String, ?> paramMap)
    throws JSONException
  {
    JSONObject localJSONObject;
    try
    {
      localJSONObject = new JSONObject();
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        a(localJSONObject, str, paramMap.get(str));
      }
    }
    catch (ClassCastException localClassCastException)
    {
      throw new JSONException("Could not convert map to JSON: " + localClassCastException.getMessage());
    }
    return localJSONObject;
  }

  public static int[] t(Context paramContext)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    float f = 160.0F / localDisplayMetrics.densityDpi;
    int i = (int)(f * localDisplayMetrics.widthPixels);
    int j = (int)(f * localDisplayMetrics.heightPixels);
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = i;
    arrayOfInt[1] = j;
    return arrayOfInt;
  }

  private static final class a extends BroadcastReceiver
  {
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if ("android.intent.action.USER_PRESENT".equals(paramIntent.getAction()))
        gj.w(true);
      while (true)
      {
        return;
        if ("android.intent.action.SCREEN_OFF".equals(paramIntent.getAction()))
        {
          gj.w(false);
          continue;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gj
 * JD-Core Version:    0.6.0
 */