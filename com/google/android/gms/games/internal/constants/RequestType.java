package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class RequestType
{
  public static String dH(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      GamesLog.q("RequestType", "Unknown request type: " + paramInt);
      str = "UNKNOWN_TYPE";
    case 1:
    case 2:
    }
    while (true)
    {
      return str;
      str = "GIFT";
      continue;
      str = "WISH";
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.constants.RequestType
 * JD-Core Version:    0.6.0
 */