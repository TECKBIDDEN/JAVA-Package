package com.google.android.gms.analytics;

public class z
{
  private static GoogleAnalytics AT;

  public static void T(String paramString)
  {
    Logger localLogger = getLogger();
    if (localLogger != null)
      localLogger.error(paramString);
  }

  public static void U(String paramString)
  {
    Logger localLogger = getLogger();
    if (localLogger != null)
      localLogger.info(paramString);
  }

  public static void V(String paramString)
  {
    Logger localLogger = getLogger();
    if (localLogger != null)
      localLogger.verbose(paramString);
  }

  public static void W(String paramString)
  {
    Logger localLogger = getLogger();
    if (localLogger != null)
      localLogger.warn(paramString);
  }

  public static boolean eL()
  {
    int i = 0;
    if ((getLogger() != null) && (getLogger().getLogLevel() == 0))
      i = 1;
    return i;
  }

  private static Logger getLogger()
  {
    if (AT == null)
      AT = GoogleAnalytics.eE();
    if (AT != null);
    for (Logger localLogger = AT.getLogger(); ; localLogger = null)
      return localLogger;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.z
 * JD-Core Version:    0.6.0
 */