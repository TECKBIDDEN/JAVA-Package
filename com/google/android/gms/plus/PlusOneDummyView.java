package com.google.android.gms.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class PlusOneDummyView extends FrameLayout
{
  public static final String TAG = "PlusOneDummyView";

  public PlusOneDummyView(Context paramContext, int paramInt)
  {
    super(paramContext);
    Button localButton = new Button(paramContext);
    localButton.setEnabled(false);
    localButton.setBackgroundDrawable(mY().getDrawable(paramInt));
    Point localPoint = eP(paramInt);
    addView(localButton, new FrameLayout.LayoutParams(localPoint.x, localPoint.y, 17));
  }

  private Point eP(int paramInt)
  {
    int i = 24;
    int k = 20;
    Point localPoint = new Point();
    switch (paramInt)
    {
    default:
      int n = i;
      i = 38;
      k = n;
    case 1:
    case 0:
    case 2:
    }
    while (true)
    {
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      float f1 = TypedValue.applyDimension(1, i, localDisplayMetrics);
      float f2 = TypedValue.applyDimension(1, k, localDisplayMetrics);
      localPoint.x = (int)(0.5D + f1);
      localPoint.y = (int)(0.5D + f2);
      return localPoint;
      int j = 32;
      continue;
      int m = 14;
      continue;
      j = 50;
    }
  }

  private d mY()
  {
    Object localObject = new PlusOneDummyView.b(getContext(), null);
    if (!((d)localObject).isValid())
      localObject = new PlusOneDummyView.c(getContext(), null);
    if (!((d)localObject).isValid())
      localObject = new PlusOneDummyView.a(getContext(), null);
    return (d)localObject;
  }

  private static abstract interface d
  {
    public abstract Drawable getDrawable(int paramInt);

    public abstract boolean isValid();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.PlusOneDummyView
 * JD-Core Version:    0.6.0
 */