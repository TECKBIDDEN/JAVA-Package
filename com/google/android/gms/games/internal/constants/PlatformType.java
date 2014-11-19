package com.google.android.gms.games.internal.constants;

public final class PlatformType
{
  public static String dH(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unknown platform type: " + paramInt);
    case 0:
      str = "ANDROID";
    case 1:
    case 2:
    }
    while (true)
    {
      return str;
      str = "IOS";
      continue;
      str = "WEB_APP";
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.constants.PlatformType
 * JD-Core Version:    0.6.0
 */