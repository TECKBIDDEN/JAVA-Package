package com.doomonafireball.betterpickers.numberpicker;

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

public class NumberView extends LinearLayout
{
  private final Typeface mAndroidClockMonoThin;
  private ZeroTopPaddingTextView mDecimal;
  private ZeroTopPaddingTextView mDecimalSeperator;
  private ZeroTopPaddingTextView mMinusLabel;
  private ZeroTopPaddingTextView mNumber;
  private Typeface mOriginalNumberTypeface;
  private ColorStateList mTextColor;

  public NumberView(Context paramContext)
  {
    this(paramContext, null);
  }

  public NumberView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mAndroidClockMonoThin = Typeface.createFromAsset(paramContext.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
    this.mTextColor = getResources().getColorStateList(R.color.dialog_text_color_holo_dark);
  }

  private void restyleViews()
  {
    if (this.mNumber != null)
      this.mNumber.setTextColor(this.mTextColor);
    if (this.mDecimal != null)
      this.mDecimal.setTextColor(this.mTextColor);
    if (this.mDecimalSeperator != null)
      this.mDecimalSeperator.setTextColor(this.mTextColor);
    if (this.mMinusLabel != null)
      this.mMinusLabel.setTextColor(this.mTextColor);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.mNumber = ((ZeroTopPaddingTextView)findViewById(R.id.number));
    this.mDecimal = ((ZeroTopPaddingTextView)findViewById(R.id.decimal));
    this.mDecimalSeperator = ((ZeroTopPaddingTextView)findViewById(R.id.decimal_separator));
    this.mMinusLabel = ((ZeroTopPaddingTextView)findViewById(R.id.minus_label));
    if (this.mNumber != null)
      this.mOriginalNumberTypeface = this.mNumber.getTypeface();
    if (this.mNumber != null)
    {
      this.mNumber.setTypeface(this.mAndroidClockMonoThin);
      this.mNumber.updatePadding();
    }
    if (this.mDecimal != null)
    {
      this.mDecimal.setTypeface(this.mAndroidClockMonoThin);
      this.mDecimal.updatePadding();
    }
    restyleViews();
  }

  public void setNumber(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    ZeroTopPaddingTextView localZeroTopPaddingTextView1 = this.mMinusLabel;
    int j;
    label83: label108: ZeroTopPaddingTextView localZeroTopPaddingTextView2;
    if (paramBoolean2)
    {
      j = 0;
      localZeroTopPaddingTextView1.setVisibility(j);
      if (this.mNumber != null)
      {
        if (!paramString1.equals(""))
          break label140;
        this.mNumber.setText("-");
        this.mNumber.setTypeface(this.mAndroidClockMonoThin);
        this.mNumber.setEnabled(false);
        this.mNumber.updatePadding();
        this.mNumber.setVisibility(0);
      }
      if (this.mDecimal != null)
      {
        if (!paramString2.equals(""))
          break label234;
        this.mDecimal.setVisibility(8);
      }
      if (this.mDecimalSeperator != null)
      {
        localZeroTopPaddingTextView2 = this.mDecimalSeperator;
        if (!paramBoolean1)
          break label279;
      }
    }
    while (true)
    {
      localZeroTopPaddingTextView2.setVisibility(i);
      return;
      j = 8;
      break;
      label140: if (paramBoolean1)
      {
        this.mNumber.setText(paramString1);
        this.mNumber.setTypeface(this.mOriginalNumberTypeface);
        this.mNumber.setEnabled(true);
        this.mNumber.updatePadding();
        this.mNumber.setVisibility(0);
        break label83;
      }
      this.mNumber.setText(paramString1);
      this.mNumber.setTypeface(this.mAndroidClockMonoThin);
      this.mNumber.setEnabled(true);
      this.mNumber.updatePadding();
      this.mNumber.setVisibility(0);
      break label83;
      label234: this.mDecimal.setText(paramString2);
      this.mDecimal.setTypeface(this.mAndroidClockMonoThin);
      this.mDecimal.setEnabled(true);
      this.mDecimal.updatePadding();
      this.mDecimal.setVisibility(0);
      break label108;
      label279: i = 8;
    }
  }

  public void setTheme(int paramInt)
  {
    if (paramInt != -1)
      this.mTextColor = getContext().obtainStyledAttributes(paramInt, R.styleable.BetterPickersDialogFragment).getColorStateList(0);
    restyleViews();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.numberpicker.NumberView
 * JD-Core Version:    0.6.0
 */