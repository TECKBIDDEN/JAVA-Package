package com.google.android.gms.internal;

import com.google.android.gms.fitness.data.DataSource;

public class kv
{
  private static final ThreadLocal<String> To = new ThreadLocal();

  public static String bq(String paramString)
  {
    return s(paramString, (String)To.get());
  }

  public static DataSource c(DataSource paramDataSource)
  {
    if (!paramDataSource.iJ());
    while (true)
    {
      return paramDataSource;
      String str = (String)To.get();
      if ((iU()) || (str.equals(paramDataSource.getAppPackageName())))
        continue;
      paramDataSource = paramDataSource.iK();
    }
  }

  public static boolean iU()
  {
    String str = (String)To.get();
    if ((str == null) || (str.startsWith("com.google")));
    for (int i = 1; ; i = 0)
      return i;
  }

  private static String s(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null));
    while (true)
    {
      return paramString1;
      byte[] arrayOfByte = new byte[paramString1.length() + paramString2.length()];
      System.arraycopy(paramString1.getBytes(), 0, arrayOfByte, 0, paramString1.length());
      System.arraycopy(paramString2.getBytes(), 0, arrayOfByte, paramString1.length(), paramString2.length());
      paramString1 = Integer.toHexString(kb.a(arrayOfByte, 0, arrayOfByte.length, 0));
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kv
 * JD-Core Version:    0.6.0
 */