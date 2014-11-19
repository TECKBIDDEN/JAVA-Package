package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;

public final class iw extends Drawable
  implements Drawable.Callback
{
  private boolean KE = true;
  private int KK = 0;
  private long KL;
  private int KM;
  private int KN = 255;
  private int KO;
  private int KP = 0;
  private boolean KQ;
  private b KR;
  private Drawable KS;
  private Drawable KT;
  private boolean KU;
  private boolean KV;
  private boolean KW;
  private int KX;
  private int mFrom;

  public iw(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    this(null);
    if (paramDrawable1 == null)
      paramDrawable1 = a.gM();
    this.KS = paramDrawable1;
    paramDrawable1.setCallback(this);
    b localb1 = this.KR;
    localb1.Lb |= paramDrawable1.getChangingConfigurations();
    if (paramDrawable2 == null)
      paramDrawable2 = a.gM();
    this.KT = paramDrawable2;
    paramDrawable2.setCallback(this);
    b localb2 = this.KR;
    localb2.Lb |= paramDrawable2.getChangingConfigurations();
  }

  iw(b paramb)
  {
    this.KR = new b(paramb);
  }

  public boolean canConstantState()
  {
    if (!this.KU)
      if ((this.KS.getConstantState() == null) || (this.KT.getConstantState() == null))
        break label44;
    label44: for (boolean bool = true; ; bool = false)
    {
      this.KV = bool;
      this.KU = true;
      return this.KV;
    }
  }

  public void draw(Canvas paramCanvas)
  {
    int i = 1;
    int j = 0;
    label34: int k;
    boolean bool;
    Drawable localDrawable1;
    Drawable localDrawable2;
    switch (this.KK)
    {
    default:
      j = i;
      k = this.KP;
      bool = this.KE;
      localDrawable1 = this.KS;
      localDrawable2 = this.KT;
      if (j != 0)
      {
        if ((!bool) || (k == 0))
          localDrawable1.draw(paramCanvas);
        if (k != this.KN)
          break;
        localDrawable2.setAlpha(this.KN);
        localDrawable2.draw(paramCanvas);
      }
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      this.KL = SystemClock.uptimeMillis();
      this.KK = 2;
      break label34;
      if (this.KL < 0L)
        break;
      float f1 = (float)(SystemClock.uptimeMillis() - this.KL) / this.KO;
      if (f1 >= 1.0F);
      while (true)
      {
        if (i != 0)
          this.KK = 0;
        float f2 = Math.min(f1, 1.0F);
        this.KP = (int)(this.mFrom + f2 * (this.KM - this.mFrom));
        break;
        i = 0;
      }
      if (bool)
        localDrawable1.setAlpha(this.KN - k);
      localDrawable1.draw(paramCanvas);
      if (bool)
        localDrawable1.setAlpha(this.KN);
      if (k > 0)
      {
        localDrawable2.setAlpha(k);
        localDrawable2.draw(paramCanvas);
        localDrawable2.setAlpha(this.KN);
      }
      invalidateSelf();
    }
  }

  public Drawable gL()
  {
    return this.KT;
  }

  public int getChangingConfigurations()
  {
    return super.getChangingConfigurations() | this.KR.La | this.KR.Lb;
  }

  public Drawable.ConstantState getConstantState()
  {
    if (canConstantState())
      this.KR.La = getChangingConfigurations();
    for (b localb = this.KR; ; localb = null)
      return localb;
  }

  public int getIntrinsicHeight()
  {
    return Math.max(this.KS.getIntrinsicHeight(), this.KT.getIntrinsicHeight());
  }

  public int getIntrinsicWidth()
  {
    return Math.max(this.KS.getIntrinsicWidth(), this.KT.getIntrinsicWidth());
  }

  public int getOpacity()
  {
    if (!this.KW)
    {
      this.KX = Drawable.resolveOpacity(this.KS.getOpacity(), this.KT.getOpacity());
      this.KW = true;
    }
    return this.KX;
  }

  public void invalidateDrawable(Drawable paramDrawable)
  {
    if (kc.hB())
    {
      Drawable.Callback localCallback = getCallback();
      if (localCallback != null)
        localCallback.invalidateDrawable(this);
    }
  }

  public Drawable mutate()
  {
    if ((!this.KQ) && (super.mutate() == this))
    {
      if (!canConstantState())
        throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
      this.KS.mutate();
      this.KT.mutate();
      this.KQ = true;
    }
    return this;
  }

  protected void onBoundsChange(Rect paramRect)
  {
    this.KS.setBounds(paramRect);
    this.KT.setBounds(paramRect);
  }

  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    if (kc.hB())
    {
      Drawable.Callback localCallback = getCallback();
      if (localCallback != null)
        localCallback.scheduleDrawable(this, paramRunnable, paramLong);
    }
  }

  public void setAlpha(int paramInt)
  {
    if (this.KP == this.KN)
      this.KP = paramInt;
    this.KN = paramInt;
    invalidateSelf();
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.KS.setColorFilter(paramColorFilter);
    this.KT.setColorFilter(paramColorFilter);
  }

  public void startTransition(int paramInt)
  {
    this.mFrom = 0;
    this.KM = this.KN;
    this.KP = 0;
    this.KO = paramInt;
    this.KK = 1;
    invalidateSelf();
  }

  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    if (kc.hB())
    {
      Drawable.Callback localCallback = getCallback();
      if (localCallback != null)
        localCallback.unscheduleDrawable(this, paramRunnable);
    }
  }

  private static final class a extends Drawable
  {
    private static final a KY = new a();
    private static final a KZ = new a(null);

    public void draw(Canvas paramCanvas)
    {
    }

    public Drawable.ConstantState getConstantState()
    {
      return KZ;
    }

    public int getOpacity()
    {
      return -2;
    }

    public void setAlpha(int paramInt)
    {
    }

    public void setColorFilter(ColorFilter paramColorFilter)
    {
    }

    private static final class a extends Drawable.ConstantState
    {
      public int getChangingConfigurations()
      {
        return 0;
      }

      public Drawable newDrawable()
      {
        return iw.a.gM();
      }
    }
  }

  static final class b extends Drawable.ConstantState
  {
    int La;
    int Lb;

    b(b paramb)
    {
      if (paramb != null)
      {
        this.La = paramb.La;
        this.Lb = paramb.Lb;
      }
    }

    public int getChangingConfigurations()
    {
      return this.La;
    }

    public Drawable newDrawable()
    {
      return new iw(this);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iw
 * JD-Core Version:    0.6.0
 */