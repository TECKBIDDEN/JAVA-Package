package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;

@ez
public final class gp
{
  public static void a(Context paramContext, WebSettings paramWebSettings)
  {
    gn.a(paramContext, paramWebSettings);
    paramWebSettings.setMediaPlaybackRequiresUserGesture(false);
  }

  public static String getDefaultUserAgent(Context paramContext)
  {
    return WebSettings.getDefaultUserAgent(paramContext);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gp
 * JD-Core Version:    0.6.0
 */