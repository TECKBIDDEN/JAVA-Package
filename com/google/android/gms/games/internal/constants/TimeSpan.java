package com.google.android.gms.games.internal.constants;

public final class TimeSpan
{
  private TimeSpan()
  {
    throw new AssertionError("Uninstantiable");
  }

  public static String dH(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unknown time span " + paramInt);
    case 0:
      str = "DAILY";
    case 1:
    case 2:
    }
    while (true)
    {
      return str;
      str = "WEEKLY";
      continue;
      str = "ALL_TIME";
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.constants.TimeSpan
 * JD-Core Version:    0.6.0
 */