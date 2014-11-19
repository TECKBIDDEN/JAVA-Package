package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

public final class jt
{
  private static Pattern MJ = null;

  public static boolean K(Context paramContext)
  {
    return paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch");
  }

  public static int aN(int paramInt)
  {
    return paramInt / 1000;
  }

  public static int aO(int paramInt)
  {
    return paramInt % 1000 / 100;
  }

  public static boolean aP(int paramInt)
  {
    if (aO(paramInt) == 3);
    for (int i = 1; ; i = 0)
      return i;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jt
 * JD-Core Version:    0.6.0
 */