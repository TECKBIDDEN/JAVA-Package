package com.doomonafireball.betterpickers;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

public class AutoScrollHorizontalScrollView extends HorizontalScrollView
{
  public AutoScrollHorizontalScrollView(Context paramContext)
  {
    super(paramContext);
  }

  public AutoScrollHorizontalScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AutoScrollHorizontalScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    fullScroll(66);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.AutoScrollHorizontalScrollView
 * JD-Core Version:    0.6.0
 */