package com.google.android.gms.internal;

import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;

@ez
final class dk$c
{
  public final int index;
  public final ViewGroup.LayoutParams rI;
  public final ViewGroup rJ;

  public dk$c(gv paramgv)
    throws dk.a
  {
    this.rI = paramgv.getLayoutParams();
    ViewParent localViewParent = paramgv.getParent();
    if ((localViewParent instanceof ViewGroup))
    {
      this.rJ = ((ViewGroup)localViewParent);
      this.index = this.rJ.indexOfChild(paramgv);
      this.rJ.removeView(paramgv);
      paramgv.x(true);
      return;
    }
    throw new dk.a("Could not get the parent of the WebView for an overlay.");
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dk.c
 * JD-Core Version:    0.6.0
 */