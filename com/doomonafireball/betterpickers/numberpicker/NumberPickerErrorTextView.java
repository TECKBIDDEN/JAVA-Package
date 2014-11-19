package com.doomonafireball.betterpickers.numberpicker;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class NumberPickerErrorTextView extends TextView
{
  private static final long LENGTH_SHORT = 3000L;
  private Handler fadeInEndHandler = new Handler();
  private Runnable hideRunnable = new NumberPickerErrorTextView.1(this);

  public NumberPickerErrorTextView(Context paramContext)
  {
    super(paramContext);
  }

  public NumberPickerErrorTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public NumberPickerErrorTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void hide()
  {
    this.fadeInEndHandler.removeCallbacks(this.hideRunnable);
    Animation localAnimation = AnimationUtils.loadAnimation(getContext(), 17432577);
    localAnimation.setAnimationListener(new NumberPickerErrorTextView.3(this));
    startAnimation(localAnimation);
  }

  public void hideImmediately()
  {
    this.fadeInEndHandler.removeCallbacks(this.hideRunnable);
    setVisibility(4);
  }

  public void show()
  {
    this.fadeInEndHandler.removeCallbacks(this.hideRunnable);
    Animation localAnimation = AnimationUtils.loadAnimation(getContext(), 17432576);
    localAnimation.setAnimationListener(new NumberPickerErrorTextView.2(this));
    startAnimation(localAnimation);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.numberpicker.NumberPickerErrorTextView
 * JD-Core Version:    0.6.0
 */