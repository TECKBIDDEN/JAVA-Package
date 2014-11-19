package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtil;

@ez
public final class cf
{
  public static void a(Context paramContext, b paramb)
  {
    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext) != 0)
      paramb.a(bn.bs());
    while (true)
    {
      return;
      new cf.a(paramContext, paramb);
    }
  }

  public static abstract interface b
  {
    public abstract void a(Bundle paramBundle);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cf
 * JD-Core Version:    0.6.0
 */