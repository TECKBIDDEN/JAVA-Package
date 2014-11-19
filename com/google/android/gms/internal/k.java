package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.view.MotionEvent;

public class k
{
  private String kR = "googleads.g.doubleclick.net";
  private String kS = "/pagead/ads";
  private String kT = "ad.doubleclick.net";
  private String[] kU;
  private g kV;

  public k(g paramg)
  {
    String[] arrayOfString = new String[3];
    arrayOfString[0] = ".doubleclick.net";
    arrayOfString[1] = ".googleadservices.com";
    arrayOfString[2] = ".googlesyndication.com";
    this.kU = arrayOfString;
    this.kV = paramg;
  }

  private Uri a(Uri paramUri, Context paramContext, String paramString, boolean paramBoolean)
    throws l
  {
    boolean bool;
    try
    {
      bool = a(paramUri);
      if (bool)
      {
        if (!paramUri.toString().contains("dc_ms="))
          break label65;
        throw new l("Parameter already exists: dc_ms");
      }
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      throw new l("Provided Uri is not in a valid state");
    }
    if (paramUri.getQueryParameter("ms") != null)
      throw new l("Query parameter already exists: ms");
    label65: String str;
    if (paramBoolean)
      str = this.kV.a(paramContext, paramString);
    Object localObject;
    while (true)
      if (bool)
      {
        localObject = b(paramUri, "dc_ms", str);
        break;
        str = this.kV.a(paramContext);
        continue;
      }
      else
      {
        Uri localUri = a(paramUri, "ms", str);
        localObject = localUri;
      }
    return (Uri)localObject;
  }

  private Uri a(Uri paramUri, String paramString1, String paramString2)
    throws UnsupportedOperationException
  {
    String str = paramUri.toString();
    int i = str.indexOf("&adurl");
    if (i == -1)
      i = str.indexOf("?adurl");
    if (i != -1);
    for (Uri localUri = Uri.parse(str.substring(0, i + 1) + paramString1 + "=" + paramString2 + "&" + str.substring(i + 1)); ; localUri = paramUri.buildUpon().appendQueryParameter(paramString1, paramString2).build())
      return localUri;
  }

  private Uri b(Uri paramUri, String paramString1, String paramString2)
  {
    String str1 = paramUri.toString();
    int i = str1.indexOf(";adurl");
    if (i != -1);
    String str2;
    int j;
    for (Uri localUri = Uri.parse(str1.substring(0, i + 1) + paramString1 + "=" + paramString2 + ";" + str1.substring(i + 1)); ; localUri = Uri.parse(str1.substring(0, j + str2.length()) + ";" + paramString1 + "=" + paramString2 + ";" + str1.substring(j + str2.length())))
    {
      return localUri;
      str2 = paramUri.getEncodedPath();
      j = str1.indexOf(str2);
    }
  }

  public Uri a(Uri paramUri, Context paramContext)
    throws l
  {
    try
    {
      Uri localUri = a(paramUri, paramContext, paramUri.getQueryParameter("ai"), true);
      return localUri;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
    }
    throw new l("Provided Uri is not in a valid state");
  }

  public void a(MotionEvent paramMotionEvent)
  {
    this.kV.a(paramMotionEvent);
  }

  public boolean a(Uri paramUri)
  {
    if (paramUri == null)
      throw new NullPointerException();
    try
    {
      boolean bool2 = paramUri.getHost().equals(this.kT);
      bool1 = bool2;
      return bool1;
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
        boolean bool1 = false;
    }
  }

  public boolean b(Uri paramUri)
  {
    int i = 0;
    if (paramUri == null)
      throw new NullPointerException();
    try
    {
      String str = paramUri.getHost();
      String[] arrayOfString = this.kU;
      int j = arrayOfString.length;
      for (int k = 0; ; k++)
      {
        if (k < j)
        {
          boolean bool = str.endsWith(arrayOfString[k]);
          if (!bool)
            continue;
          i = 1;
        }
        label60: return i;
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      break label60;
    }
  }

  public g z()
  {
    return this.kV;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.k
 * JD-Core Version:    0.6.0
 */