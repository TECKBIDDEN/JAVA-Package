package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Locale;

@ez
public final class gf
{
  private static final Object uf = new Object();
  private static String we;

  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    synchronized (uf)
    {
      if ((we == null) && (!TextUtils.isEmpty(paramString1)))
        b(paramContext, paramString1, paramString2);
      String str = we;
      return str;
    }
  }

  private static void b(Context paramContext, String paramString1, String paramString2)
  {
    BigInteger localBigInteger2;
    try
    {
      ClassLoader localClassLoader = paramContext.createPackageContext(paramString2, 3).getClassLoader();
      Class localClass = Class.forName("com.google.ads.mediation.MediationAdapter", false, localClassLoader);
      BigInteger localBigInteger1 = new BigInteger(new byte[1]);
      String[] arrayOfString = paramString1.split(",");
      localBigInteger2 = localBigInteger1;
      for (int i = 0; i < arrayOfString.length; i++)
      {
        if (!gj.a(localClassLoader, localClass, arrayOfString[i]))
          continue;
        localBigInteger2 = localBigInteger2.setBit(i);
      }
    }
    catch (Throwable localThrowable)
    {
      we = "err";
    }
    while (true)
    {
      return;
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localBigInteger2;
      we = String.format(localLocale, "%X", arrayOfObject);
    }
  }

  public static String dj()
  {
    synchronized (uf)
    {
      String str = we;
      return str;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gf
 * JD-Core Version:    0.6.0
 */