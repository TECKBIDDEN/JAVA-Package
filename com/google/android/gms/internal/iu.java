package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class iu
{
  private static final ip Gr = new ip("MetadataUtils");
  private static final String[] HA;
  private static final String HB;

  static
  {
    String[] arrayOfString = new String[4];
    arrayOfString[0] = "Z";
    arrayOfString[1] = "+hh";
    arrayOfString[2] = "+hhmm";
    arrayOfString[3] = "+hh:mm";
    HA = arrayOfString;
    HB = "yyyyMMdd'T'HHmmss" + HA[0];
  }

  public static String a(Calendar paramCalendar)
  {
    String str2;
    if (paramCalendar == null)
    {
      Gr.b("Calendar object cannot be null", new Object[0]);
      str2 = null;
    }
    while (true)
    {
      return str2;
      String str1 = HB;
      if ((paramCalendar.get(11) == 0) && (paramCalendar.get(12) == 0) && (paramCalendar.get(13) == 0))
        str1 = "yyyyMMdd";
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat(str1);
      localSimpleDateFormat.setTimeZone(paramCalendar.getTimeZone());
      str2 = localSimpleDateFormat.format(paramCalendar.getTime());
      if (!str2.endsWith("+0000"))
        continue;
      str2 = str2.replace("+0000", HA[0]);
    }
  }

  // ERROR //
  public static void a(List<WebImage> paramList, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface 105 1 0
    //   6: aload_1
    //   7: ldc 107
    //   9: invokevirtual 113	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   12: astore_3
    //   13: aload_3
    //   14: invokevirtual 119	org/json/JSONArray:length	()I
    //   17: istore 4
    //   19: iconst_0
    //   20: istore 5
    //   22: iload 5
    //   24: iload 4
    //   26: if_icmpge +34 -> 60
    //   29: aload_3
    //   30: iload 5
    //   32: invokevirtual 123	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   35: astore 6
    //   37: aload_0
    //   38: new 125	com/google/android/gms/common/images/WebImage
    //   41: dup
    //   42: aload 6
    //   44: invokespecial 128	com/google/android/gms/common/images/WebImage:<init>	(Lorg/json/JSONObject;)V
    //   47: invokeinterface 132 2 0
    //   52: pop
    //   53: iinc 5 1
    //   56: goto -34 -> 22
    //   59: astore_2
    //   60: return
    //   61: astore 7
    //   63: goto -10 -> 53
    //
    // Exception table:
    //   from	to	target	type
    //   0	37	59	org/json/JSONException
    //   37	53	59	org/json/JSONException
    //   37	53	61	java/lang/IllegalArgumentException
  }

  public static void a(JSONObject paramJSONObject, List<WebImage> paramList)
  {
    JSONArray localJSONArray;
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      localJSONArray = new JSONArray();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        localJSONArray.put(((WebImage)localIterator.next()).bL());
    }
    try
    {
      paramJSONObject.put("images", localJSONArray);
      label65: return;
    }
    catch (JSONException localJSONException)
    {
      break label65;
    }
  }

  public static Calendar aL(String paramString)
  {
    Object localObject;
    if (TextUtils.isEmpty(paramString))
    {
      Gr.b("Input string is empty or null", new Object[0]);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      String str1 = aM(paramString);
      if (TextUtils.isEmpty(str1))
      {
        Gr.b("Invalid date format", new Object[0]);
        localObject = null;
        continue;
      }
      String str2 = aN(paramString);
      String str3 = "yyyyMMdd";
      Calendar localCalendar;
      if (!TextUtils.isEmpty(str2))
      {
        str1 = str1 + "T" + str2;
        if (str2.length() == "HHmmss".length())
          str3 = "yyyyMMdd'T'HHmmss";
      }
      else
      {
        localCalendar = GregorianCalendar.getInstance();
      }
      try
      {
        Date localDate = new SimpleDateFormat(str3).parse(str1);
        localCalendar.setTime(localDate);
        localObject = localCalendar;
        continue;
        str3 = HB;
      }
      catch (ParseException localParseException)
      {
        ip localip = Gr;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localParseException.getMessage();
        localip.b("Error parsing string: %s", arrayOfObject);
        localObject = null;
      }
    }
  }

  private static String aM(String paramString)
  {
    Object localObject = null;
    if (TextUtils.isEmpty(paramString))
      Gr.b("Input string is empty or null", new Object[0]);
    while (true)
    {
      return localObject;
      try
      {
        String str = paramString.substring(0, "yyyyMMdd".length());
        localObject = str;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        ip localip = Gr;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localIndexOutOfBoundsException.getMessage();
        localip.c("Error extracting the date: %s", arrayOfObject);
      }
    }
  }

  private static String aN(String paramString)
  {
    Object localObject = null;
    if (TextUtils.isEmpty(paramString))
      Gr.b("string is empty or null", new Object[0]);
    while (true)
    {
      return localObject;
      int i = paramString.indexOf('T');
      int j = i + 1;
      if (i != "yyyyMMdd".length())
      {
        Gr.b("T delimeter is not found", new Object[0]);
        continue;
      }
      String str;
      try
      {
        str = paramString.substring(j);
        if (str.length() != "HHmmss".length())
          break label118;
        localObject = str;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        ip localip = Gr;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localIndexOutOfBoundsException.getMessage();
        localip.b("Error extracting the time substring: %s", arrayOfObject);
      }
      continue;
      label118: switch (str.charAt("HHmmss".length()))
      {
      default:
        break;
      case '+':
      case '-':
        if (!aO(str))
          continue;
        localObject = str.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
        break;
      case 'Z':
        if (str.length() != "HHmmss".length() + HA[0].length())
          continue;
        localObject = str.substring(0, -1 + str.length()) + "+0000";
      }
    }
  }

  private static boolean aO(String paramString)
  {
    int i = 1;
    int j = paramString.length();
    int k = "HHmmss".length();
    if ((j == k + HA[i].length()) || (j == k + HA[2].length()) || (j == k + HA[3].length()));
    while (true)
    {
      return i;
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iu
 * JD-Core Version:    0.6.0
 */