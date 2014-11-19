package com.doomonafireball.betterpickers;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

public class ZeroTopPaddingTextView extends TextView
{
  private static final float BOLD_FONT_BOTTOM_PADDING_RATIO = 0.208F;
  private static final float BOLD_FONT_PADDING_RATIO = 0.208F;
  private static final float NORMAL_FONT_BOTTOM_PADDING_RATIO = 0.25F;
  private static final float NORMAL_FONT_PADDING_RATIO = 0.328F;
  private static final float PRE_ICS_BOTTOM_PADDING_RATIO = 0.233F;
  private static final Typeface SAN_SERIF_BOLD = Typeface.create("san-serif", 1);
  private String decimalSeperator = "";
  private int mPaddingRight = 0;
  private String timeSeperator = "";

  public ZeroTopPaddingTextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public ZeroTopPaddingTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ZeroTopPaddingTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
    setIncludeFontPadding(false);
    updatePadding();
  }

  private void init()
  {
    this.decimalSeperator = getResources().getString(R.string.number_picker_seperator);
    this.timeSeperator = getResources().getString(R.string.time_picker_time_seperator);
  }

  public void setPaddingRight(int paramInt)
  {
    this.mPaddingRight = paramInt;
    updatePadding();
  }

  public void updatePadding()
  {
    float f1 = 0.328F;
    float f2 = 0.25F;
    if ((getPaint().getTypeface() != null) && (getPaint().getTypeface().equals(Typeface.DEFAULT_BOLD)))
    {
      f1 = 0.208F;
      f2 = 0.208F;
    }
    if ((getTypeface() != null) && (getTypeface().equals(SAN_SERIF_BOLD)))
    {
      f1 = 0.208F;
      f2 = 0.208F;
    }
    if ((Build.VERSION.SDK_INT < 14) && (getText() != null) && ((getText().toString().equals(this.decimalSeperator)) || (getText().toString().equals(this.timeSeperator))))
      f2 = 0.233F;
    setPadding(0, (int)(-f1 * getTextSize()), this.mPaddingRight, (int)(-f2 * getTextSize()));
  }

  public void updatePaddingForBoldDate()
  {
    setPadding(0, (int)(-0.208F * getTextSize()), this.mPaddingRight, (int)(-0.208F * getTextSize()));
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.ZeroTopPaddingTextView
 * JD-Core Version:    0.6.0
 */