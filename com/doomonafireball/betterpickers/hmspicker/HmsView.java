package com.doomonafireball.betterpickers.hmspicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.doomonafireball.betterpickers.R.color;
import com.doomonafireball.betterpickers.R.id;
import com.doomonafireball.betterpickers.R.styleable;
import com.doomonafireball.betterpickers.ZeroTopPaddingTextView;

public class HmsView extends LinearLayout
{
  private final Typeface mAndroidClockMonoThin;
  private ZeroTopPaddingTextView mHoursOnes;
  private ZeroTopPaddingTextView mMinutesOnes;
  private ZeroTopPaddingTextView mMinutesTens;
  private Typeface mOriginalHoursTypeface;
  private ZeroTopPaddingTextView mSecondsOnes;
  private ZeroTopPaddingTextView mSecondsTens;
  private ColorStateList mTextColor;

  public HmsView(Context paramContext)
  {
    this(paramContext, null);
  }

  public HmsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mAndroidClockMonoThin = Typeface.createFromAsset(paramContext.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
    this.mTextColor = getResources().getColorStateList(R.color.dialog_text_color_holo_dark);
  }

  private void restyleViews()
  {
    if (this.mHoursOnes != null)
      this.mHoursOnes.setTextColor(this.mTextColor);
    if (this.mMinutesOnes != null)
      this.mMinutesOnes.setTextColor(this.mTextColor);
    if (this.mMinutesTens != null)
      this.mMinutesTens.setTextColor(this.mTextColor);
    if (this.mSecondsOnes != null)
      this.mSecondsOnes.setTextColor(this.mTextColor);
    if (this.mSecondsTens != null)
      this.mSecondsTens.setTextColor(this.mTextColor);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.mHoursOnes = ((ZeroTopPaddingTextView)findViewById(R.id.hours_ones));
    this.mMinutesTens = ((ZeroTopPaddingTextView)findViewById(R.id.minutes_tens));
    this.mMinutesOnes = ((ZeroTopPaddingTextView)findViewById(R.id.minutes_ones));
    this.mSecondsTens = ((ZeroTopPaddingTextView)findViewById(R.id.seconds_tens));
    this.mSecondsOnes = ((ZeroTopPaddingTextView)findViewById(R.id.seconds_ones));
    if (this.mHoursOnes != null)
      this.mOriginalHoursTypeface = this.mHoursOnes.getTypeface();
    if (this.mSecondsTens != null)
    {
      this.mSecondsTens.setTypeface(this.mAndroidClockMonoThin);
      this.mSecondsTens.updatePadding();
    }
    if (this.mSecondsOnes != null)
    {
      this.mSecondsOnes.setTypeface(this.mAndroidClockMonoThin);
      this.mSecondsOnes.updatePadding();
    }
  }

  public void setTheme(int paramInt)
  {
    if (paramInt != -1)
      this.mTextColor = getContext().obtainStyledAttributes(paramInt, R.styleable.BetterPickersDialogFragment).getColorStateList(0);
    restyleViews();
  }

  public void setTime(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (this.mHoursOnes != null)
    {
      ZeroTopPaddingTextView localZeroTopPaddingTextView5 = this.mHoursOnes;
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = Integer.valueOf(paramInt1);
      localZeroTopPaddingTextView5.setText(String.format("%d", arrayOfObject5));
    }
    if (this.mMinutesTens != null)
    {
      ZeroTopPaddingTextView localZeroTopPaddingTextView4 = this.mMinutesTens;
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Integer.valueOf(paramInt2);
      localZeroTopPaddingTextView4.setText(String.format("%d", arrayOfObject4));
    }
    if (this.mMinutesOnes != null)
    {
      ZeroTopPaddingTextView localZeroTopPaddingTextView3 = this.mMinutesOnes;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(paramInt3);
      localZeroTopPaddingTextView3.setText(String.format("%d", arrayOfObject3));
    }
    if (this.mSecondsTens != null)
    {
      ZeroTopPaddingTextView localZeroTopPaddingTextView2 = this.mSecondsTens;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt4);
      localZeroTopPaddingTextView2.setText(String.format("%d", arrayOfObject2));
    }
    if (this.mSecondsOnes != null)
    {
      ZeroTopPaddingTextView localZeroTopPaddingTextView1 = this.mSecondsOnes;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramInt5);
      localZeroTopPaddingTextView1.setText(String.format("%d", arrayOfObject1));
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.hmspicker.HmsView
 * JD-Core Version:    0.6.0
 */