package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ViewSwitcher;

@ez
final class u$a extends ViewSwitcher
{
  private final gm ly;

  public u$a(Context paramContext)
  {
    super(paramContext);
    this.ly = new gm(paramContext);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    this.ly.c(paramMotionEvent);
    return false;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.u.a
 * JD-Core Version:    0.6.0
 */