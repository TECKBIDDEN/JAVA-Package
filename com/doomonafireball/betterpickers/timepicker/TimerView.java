package com.doomonafireball.betterpickers.timepicker;

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

public class TimerView extends LinearLayout
{
  private final Typeface mAndroidClockMonoThin;
  private ZeroTopPaddingTextView mHoursOnes;
  private ZeroTopPaddingTextView mHoursSeperator;
  private ZeroTopPaddingTextView mHoursTens;
  private ZeroTopPaddingTextView mMinutesOnes;
  private ZeroTopPaddingTextView mMinutesTens;
  private Typeface mOriginalHoursTypeface;
  private ColorStateList mTextColor;

  public TimerView(Context paramContext)
  {
    this(paramContext, null);
  }

  public TimerView(Context paramContext, AttributeSet paramAttributeSet)
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
    if (this.mHoursTens != null)
      this.mHoursTens.setTextColor(this.mTextColor);
    if (this.mMinutesTens != null)
      this.mMinutesTens.setTextColor(this.mTextColor);
    if (this.mHoursSeperator != null)
      this.mHoursSeperator.setTextColor(this.mTextColor);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.mHoursTens = ((ZeroTopPaddingTextView)findViewById(R.id.hours_tens));
    this.mMinutesTens = ((ZeroTopPaddingTextView)findViewById(R.id.minutes_tens));
    this.mHoursOnes = ((ZeroTopPaddingTextView)findViewById(R.id.hours_ones));
    this.mMinutesOnes = ((ZeroTopPaddingTextView)findViewById(R.id.minutes_ones));
    this.mHoursSeperator = ((ZeroTopPaddingTextView)findViewById(R.id.hours_seperator));
    if (this.mHoursOnes != null)
      this.mOriginalHoursTypeface = this.mHoursOnes.getTypeface();
    if (this.mMinutesTens != null)
    {
      this.mMinutesTens.setTypeface(this.mAndroidClockMonoThin);
      this.mMinutesTens.updatePadding();
    }
    if (this.mMinutesOnes != null)
    {
      this.mMinutesOnes.setTypeface(this.mAndroidClockMonoThin);
      this.mMinutesOnes.updatePadding();
    }
  }

  public void setTheme(int paramInt)
  {
    if (paramInt != -1)
      this.mTextColor = getContext().obtainStyledAttributes(paramInt, R.styleable.BetterPickersDialogFragment).getColorStateList(0);
    restyleViews();
  }

  public void setTime(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.mHoursTens != null)
    {
      if (paramInt1 == -2)
        this.mHoursTens.setVisibility(4);
    }
    else
    {
      if (this.mHoursOnes != null)
      {
        if (paramInt2 != -1)
          break label252;
        this.mHoursOnes.setText("-");
        this.mHoursOnes.setTypeface(this.mAndroidClockMonoThin);
        this.mHoursOnes.setEnabled(false);
        this.mHoursOnes.updatePadding();
      }
      label69: if (this.mMinutesTens != null)
      {
        if (paramInt3 != -1)
          break label313;
        this.mMinutesTens.setText("-");
        this.mMinutesTens.setEnabled(false);
      }
      label99: if (this.mMinutesOnes != null)
      {
        if (paramInt4 != -1)
          break label356;
        this.mMinutesOnes.setText("-");
        this.mMinutesOnes.setEnabled(false);
      }
    }
    while (true)
    {
      return;
      if (paramInt1 == -1)
      {
        this.mHoursTens.setText("-");
        this.mHoursTens.setTypeface(this.mAndroidClockMonoThin);
        this.mHoursTens.setEnabled(false);
        this.mHoursTens.updatePadding();
        this.mHoursTens.setVisibility(0);
        break;
      }
      ZeroTopPaddingTextView localZeroTopPaddingTextView4 = this.mHoursTens;
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Integer.valueOf(paramInt1);
      localZeroTopPaddingTextView4.setText(String.format("%d", arrayOfObject4));
      this.mHoursTens.setTypeface(this.mOriginalHoursTypeface);
      this.mHoursTens.setEnabled(true);
      this.mHoursTens.updatePadding();
      this.mHoursTens.setVisibility(0);
      break;
      label252: ZeroTopPaddingTextView localZeroTopPaddingTextView3 = this.mHoursOnes;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(paramInt2);
      localZeroTopPaddingTextView3.setText(String.format("%d", arrayOfObject3));
      this.mHoursOnes.setTypeface(this.mOriginalHoursTypeface);
      this.mHoursOnes.setEnabled(true);
      this.mHoursOnes.updatePadding();
      break label69;
      label313: this.mMinutesTens.setEnabled(true);
      ZeroTopPaddingTextView localZeroTopPaddingTextView2 = this.mMinutesTens;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt3);
      localZeroTopPaddingTextView2.setText(String.format("%d", arrayOfObject2));
      break label99;
      label356: ZeroTopPaddingTextView localZeroTopPaddingTextView1 = this.mMinutesOnes;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramInt4);
      localZeroTopPaddingTextView1.setText(String.format("%d", arrayOfObject1));
      this.mMinutesOnes.setEnabled(true);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.timepicker.TimerView
 * JD-Core Version:    0.6.0
 */