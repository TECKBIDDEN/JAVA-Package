package com.doomonafireball.betterpickers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public abstract class PickerLinearLayout extends LinearLayout
{
  public PickerLinearLayout(Context paramContext)
  {
    super(paramContext);
  }

  public PickerLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public abstract View getViewAt(int paramInt);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.PickerLinearLayout
 * JD-Core Version:    0.6.0
 */