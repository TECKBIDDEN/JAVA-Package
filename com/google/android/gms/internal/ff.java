package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

@ez
public final class ff
{
  public static gg a(Context paramContext, fi paramfi, a parama)
  {
    if (paramfi.lD.wG);
    for (gg localgg = b(paramContext, paramfi, parama); ; localgg = c(paramContext, paramfi, parama))
      return localgg;
  }

  private static gg b(Context paramContext, fi paramfi, a parama)
  {
    gs.S("Fetching ad response from local ad request service.");
    fg.a locala = new fg.a(paramContext, paramfi, parama);
    locala.start();
    return locala;
  }

  private static gg c(Context paramContext, fi paramfi, a parama)
  {
    gs.S("Fetching ad response from remote ad request service.");
    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext) != 0)
      gs.W("Failed to connect to remote ad request service.");
    for (fg.b localb = null; ; localb = new fg.b(paramContext, paramfi, parama))
      return localb;
  }

  public static abstract interface a
  {
    public abstract void a(fk paramfk);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ff
 * JD-Core Version:    0.6.0
 */