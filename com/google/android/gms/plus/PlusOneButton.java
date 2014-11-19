package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.plus.internal.g;

public final class PlusOneButton extends FrameLayout
{
  public static final int ANNOTATION_BUBBLE = 1;
  public static final int ANNOTATION_INLINE = 2;
  public static final int ANNOTATION_NONE = 0;
  public static final int DEFAULT_ACTIVITY_REQUEST_CODE = -1;
  public static final int SIZE_MEDIUM = 1;
  public static final int SIZE_SMALL = 0;
  public static final int SIZE_STANDARD = 3;
  public static final int SIZE_TALL = 2;
  private View ala;
  private int alb;
  private int alc;
  private OnPlusOneClickListener ald;
  private int mSize;
  private String uR;

  public PlusOneButton(Context paramContext)
  {
    this(paramContext, null);
  }

  public PlusOneButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mSize = getSize(paramContext, paramAttributeSet);
    this.alb = getAnnotation(paramContext, paramAttributeSet);
    this.alc = -1;
    G(getContext());
    if (isInEditMode());
  }

  private void G(Context paramContext)
  {
    if (this.ala != null)
      removeView(this.ala);
    this.ala = g.a(paramContext, this.mSize, this.alb, this.uR, this.alc);
    setOnPlusOneClickListener(this.ald);
    addView(this.ala);
  }

  protected static int getAnnotation(Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = 0;
    String str = q.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", paramContext, paramAttributeSet, true, false, "PlusOneButton");
    if ("INLINE".equalsIgnoreCase(str))
      i = 2;
    while (true)
    {
      return i;
      if ("NONE".equalsIgnoreCase(str))
        continue;
      i = 1;
    }
  }

  protected static int getSize(Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = 0;
    String str = q.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", paramContext, paramAttributeSet, true, false, "PlusOneButton");
    if ("SMALL".equalsIgnoreCase(str));
    while (true)
    {
      return i;
      if ("MEDIUM".equalsIgnoreCase(str))
      {
        i = 1;
        continue;
      }
      if ("TALL".equalsIgnoreCase(str))
      {
        i = 2;
        continue;
      }
      i = 3;
    }
  }

  public void initialize(String paramString, int paramInt)
  {
    n.a(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener).");
    this.uR = paramString;
    this.alc = paramInt;
    G(getContext());
  }

  public void initialize(String paramString, OnPlusOneClickListener paramOnPlusOneClickListener)
  {
    this.uR = paramString;
    this.alc = 0;
    G(getContext());
    setOnPlusOneClickListener(paramOnPlusOneClickListener);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.ala.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = this.ala;
    measureChild(localView, paramInt1, paramInt2);
    setMeasuredDimension(localView.getMeasuredWidth(), localView.getMeasuredHeight());
  }

  public void setAnnotation(int paramInt)
  {
    this.alb = paramInt;
    G(getContext());
  }

  public void setOnPlusOneClickListener(OnPlusOneClickListener paramOnPlusOneClickListener)
  {
    this.ald = paramOnPlusOneClickListener;
    this.ala.setOnClickListener(new PlusOneButton.DefaultOnPlusOneClickListener(this, paramOnPlusOneClickListener));
  }

  public void setSize(int paramInt)
  {
    this.mSize = paramInt;
    G(getContext());
  }

  public static abstract interface OnPlusOneClickListener
  {
    public abstract void onPlusOneClick(Intent paramIntent);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.PlusOneButton
 * JD-Core Version:    0.6.0
 */