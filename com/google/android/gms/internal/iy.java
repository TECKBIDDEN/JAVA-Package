package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.widget.ImageView;

public final class iy extends ImageView
{
  private Uri Lc;
  private int Ld;
  private int Le;
  private a Lf;
  private int Lg;
  private float Lh;

  public void ay(int paramInt)
  {
    this.Ld = paramInt;
  }

  public void g(Uri paramUri)
  {
    this.Lc = paramUri;
  }

  public int gN()
  {
    return this.Ld;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.Lf != null)
      paramCanvas.clipPath(this.Lf.g(getWidth(), getHeight()));
    super.onDraw(paramCanvas);
    if (this.Le != 0)
      paramCanvas.drawColor(this.Le);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int j;
    int i;
    switch (this.Lg)
    {
    default:
      return;
    case 1:
      j = getMeasuredHeight();
      i = (int)(j * this.Lh);
    case 2:
    }
    while (true)
    {
      setMeasuredDimension(i, j);
      break;
      i = getMeasuredWidth();
      j = (int)(i / this.Lh);
    }
  }

  public static abstract interface a
  {
    public abstract Path g(int paramInt1, int paramInt2);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iy
 * JD-Core Version:    0.6.0
 */