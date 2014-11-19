package com.doomonafireball.betterpickers.numberpicker;

import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class NumberPickerErrorTextView$2
  implements Animation.AnimationListener
{
  public void onAnimationEnd(Animation paramAnimation)
  {
    NumberPickerErrorTextView.access$0(this.this$0).postDelayed(NumberPickerErrorTextView.access$1(this.this$0), 3000L);
    this.this$0.setVisibility(0);
  }

  public void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.numberpicker.NumberPickerErrorTextView.2
 * JD-Core Version:    0.6.0
 */