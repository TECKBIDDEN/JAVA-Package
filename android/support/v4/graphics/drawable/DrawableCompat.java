package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public class DrawableCompat
{
  static final DrawableImpl IMPL;

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
      IMPL = new DrawableCompat.HoneycombDrawableImpl();
    while (true)
    {
      return;
      IMPL = new DrawableCompat.BaseDrawableImpl();
    }
  }

  public static void jumpToCurrentState(Drawable paramDrawable)
  {
    IMPL.jumpToCurrentState(paramDrawable);
  }

  static abstract interface DrawableImpl
  {
    public abstract void jumpToCurrentState(Drawable paramDrawable);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.graphics.drawable.DrawableCompat
 * JD-Core Version:    0.6.0
 */