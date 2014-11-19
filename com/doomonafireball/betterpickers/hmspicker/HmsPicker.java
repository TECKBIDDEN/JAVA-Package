package com.doomonafireball.betterpickers.hmspicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.doomonafireball.betterpickers.R.color;
import com.doomonafireball.betterpickers.R.drawable;
import com.doomonafireball.betterpickers.R.id;
import com.doomonafireball.betterpickers.R.layout;
import com.doomonafireball.betterpickers.R.styleable;

public class HmsPicker extends LinearLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  private int mButtonBackgroundResId;
  protected final Context mContext;
  protected ImageButton mDelete;
  private int mDeleteDrawableSrcResId;
  protected View mDivider;
  private int mDividerColor;
  protected HmsView mEnteredHms;
  private TextView mHoursLabel;
  protected int[] mInput = new int[this.mInputSize];
  protected int mInputPointer = -1;
  protected int mInputSize = 5;
  private int mKeyBackgroundResId;
  protected Button mLeft;
  private TextView mMinutesLabel;
  protected final Button[] mNumbers = new Button[10];
  protected Button mRight;
  private TextView mSecondsLabel;
  private Button mSetButton;
  private ColorStateList mTextColor;
  private int mTheme = -1;

  public HmsPicker(Context paramContext)
  {
    this(paramContext, null);
  }

  public HmsPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
    this.mTextColor = getResources().getColorStateList(R.color.dialog_text_color_holo_dark);
    this.mKeyBackgroundResId = R.drawable.key_background_dark;
    this.mButtonBackgroundResId = R.drawable.button_background_dark;
    this.mDividerColor = getResources().getColor(R.color.default_divider_color_dark);
    this.mDeleteDrawableSrcResId = R.drawable.ic_backspace_dark;
  }

  private void addClickedNumber(int paramInt)
  {
    if (this.mInputPointer < -1 + this.mInputSize);
    for (int i = this.mInputPointer; ; i--)
    {
      if (i < 0)
      {
        this.mInputPointer = (1 + this.mInputPointer);
        this.mInput[0] = paramInt;
        return;
      }
      this.mInput[(i + 1)] = this.mInput[i];
    }
  }

  private void enableSetButton()
  {
    boolean bool = false;
    if (this.mSetButton == null);
    while (true)
    {
      return;
      if (this.mInputPointer == -1)
      {
        this.mSetButton.setEnabled(false);
        continue;
      }
      Button localButton = this.mSetButton;
      if (this.mInputPointer >= 0)
        bool = true;
      localButton.setEnabled(bool);
    }
  }

  private void restyleViews()
  {
    Button[] arrayOfButton = this.mNumbers;
    int i = arrayOfButton.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        if (this.mDivider != null)
          this.mDivider.setBackgroundColor(this.mDividerColor);
        if (this.mHoursLabel != null)
        {
          this.mHoursLabel.setTextColor(this.mTextColor);
          this.mHoursLabel.setBackgroundResource(this.mKeyBackgroundResId);
        }
        if (this.mMinutesLabel != null)
        {
          this.mMinutesLabel.setTextColor(this.mTextColor);
          this.mMinutesLabel.setBackgroundResource(this.mKeyBackgroundResId);
        }
        if (this.mSecondsLabel != null)
        {
          this.mSecondsLabel.setTextColor(this.mTextColor);
          this.mSecondsLabel.setBackgroundResource(this.mKeyBackgroundResId);
        }
        if (this.mDelete != null)
        {
          this.mDelete.setBackgroundResource(this.mButtonBackgroundResId);
          this.mDelete.setImageDrawable(getResources().getDrawable(this.mDeleteDrawableSrcResId));
        }
        if (this.mEnteredHms != null)
          this.mEnteredHms.setTheme(this.mTheme);
        return;
      }
      Button localButton = arrayOfButton[j];
      if (localButton == null)
        continue;
      localButton.setTextColor(this.mTextColor);
      localButton.setBackgroundResource(this.mKeyBackgroundResId);
    }
  }

  private void updateKeypad()
  {
    updateHms();
    enableSetButton();
    updateDeleteButton();
  }

  protected void doOnClick(View paramView)
  {
    Integer localInteger = (Integer)paramView.getTag(R.id.numbers_key);
    if (localInteger != null)
      addClickedNumber(localInteger.intValue());
    do
    {
      updateKeypad();
      return;
    }
    while ((paramView != this.mDelete) || (this.mInputPointer < 0));
    for (int i = 0; ; i++)
    {
      if (i >= this.mInputPointer)
      {
        this.mInput[this.mInputPointer] = 0;
        this.mInputPointer = (-1 + this.mInputPointer);
        break;
      }
      this.mInput[i] = this.mInput[(i + 1)];
    }
  }

  public int getHours()
  {
    return this.mInput[4];
  }

  protected int getLayoutId()
  {
    return R.layout.hms_picker_view;
  }

  public int getMinutes()
  {
    return 10 * this.mInput[3] + this.mInput[2];
  }

  public int getSeconds()
  {
    return 10 * this.mInput[1] + this.mInput[0];
  }

  public int getTime()
  {
    return 3600 * this.mInput[4] + 600 * this.mInput[3] + 60 * this.mInput[2] + 10 * this.mInput[1] + this.mInput[0];
  }

  public void onClick(View paramView)
  {
    paramView.performHapticFeedback(1);
    doOnClick(paramView);
    updateDeleteButton();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    View localView1 = findViewById(R.id.first);
    View localView2 = findViewById(R.id.second);
    View localView3 = findViewById(R.id.third);
    View localView4 = findViewById(R.id.fourth);
    this.mEnteredHms = ((HmsView)findViewById(R.id.hms_text));
    this.mDelete = ((ImageButton)findViewById(R.id.delete));
    this.mDelete.setOnClickListener(this);
    this.mDelete.setOnLongClickListener(this);
    this.mNumbers[1] = ((Button)localView1.findViewById(R.id.key_left));
    this.mNumbers[2] = ((Button)localView1.findViewById(R.id.key_middle));
    this.mNumbers[3] = ((Button)localView1.findViewById(R.id.key_right));
    this.mNumbers[4] = ((Button)localView2.findViewById(R.id.key_left));
    this.mNumbers[5] = ((Button)localView2.findViewById(R.id.key_middle));
    this.mNumbers[6] = ((Button)localView2.findViewById(R.id.key_right));
    this.mNumbers[7] = ((Button)localView3.findViewById(R.id.key_left));
    this.mNumbers[8] = ((Button)localView3.findViewById(R.id.key_middle));
    this.mNumbers[9] = ((Button)localView3.findViewById(R.id.key_right));
    this.mLeft = ((Button)localView4.findViewById(R.id.key_left));
    this.mNumbers[0] = ((Button)localView4.findViewById(R.id.key_middle));
    this.mRight = ((Button)localView4.findViewById(R.id.key_right));
    setLeftRightEnabled(false);
    for (int i = 0; ; i++)
    {
      if (i >= 10)
      {
        updateHms();
        this.mHoursLabel = ((TextView)findViewById(R.id.hours_label));
        this.mMinutesLabel = ((TextView)findViewById(R.id.minutes_label));
        this.mSecondsLabel = ((TextView)findViewById(R.id.seconds_label));
        this.mDivider = findViewById(R.id.divider);
        restyleViews();
        updateKeypad();
        return;
      }
      this.mNumbers[i].setOnClickListener(this);
      Button localButton = this.mNumbers[i];
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      localButton.setText(String.format("%d", arrayOfObject));
      this.mNumbers[i].setTag(R.id.numbers_key, new Integer(i));
    }
  }

  public boolean onLongClick(View paramView)
  {
    int i = 0;
    paramView.performHapticFeedback(0);
    if (paramView == this.mDelete)
    {
      this.mDelete.setPressed(false);
      reset();
      updateKeypad();
      i = 1;
    }
    return i;
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
      super.onRestoreInstanceState(paramParcelable);
    while (true)
    {
      return;
      SavedState localSavedState = (SavedState)paramParcelable;
      super.onRestoreInstanceState(localSavedState.getSuperState());
      this.mInputPointer = localSavedState.mInputPointer;
      this.mInput = localSavedState.mInput;
      if (this.mInput == null)
      {
        this.mInput = new int[this.mInputSize];
        this.mInputPointer = -1;
      }
      updateKeypad();
    }
  }

  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.mInput = this.mInput;
    localSavedState.mInputPointer = this.mInputPointer;
    return localSavedState;
  }

  public void reset()
  {
    for (int i = 0; ; i++)
    {
      if (i >= this.mInputSize)
      {
        this.mInputPointer = -1;
        updateHms();
        return;
      }
      this.mInput[i] = 0;
    }
  }

  public void restoreEntryState(Bundle paramBundle, String paramString)
  {
    int[] arrayOfInt = paramBundle.getIntArray(paramString);
    if ((arrayOfInt != null) && (this.mInputSize == arrayOfInt.length));
    for (int i = 0; ; i++)
    {
      if (i >= this.mInputSize)
      {
        updateHms();
        return;
      }
      this.mInput[i] = arrayOfInt[i];
      if (this.mInput[i] == 0)
        continue;
      this.mInputPointer = i;
    }
  }

  public void saveEntryState(Bundle paramBundle, String paramString)
  {
    paramBundle.putIntArray(paramString, this.mInput);
  }

  protected void setLeftRightEnabled(boolean paramBoolean)
  {
    this.mLeft.setEnabled(paramBoolean);
    this.mRight.setEnabled(paramBoolean);
    if (!paramBoolean)
    {
      this.mLeft.setContentDescription(null);
      this.mRight.setContentDescription(null);
    }
  }

  public void setSetButton(Button paramButton)
  {
    this.mSetButton = paramButton;
    enableSetButton();
  }

  public void setTheme(int paramInt)
  {
    this.mTheme = paramInt;
    if (this.mTheme != -1)
    {
      TypedArray localTypedArray = getContext().obtainStyledAttributes(paramInt, R.styleable.BetterPickersDialogFragment);
      this.mTextColor = localTypedArray.getColorStateList(0);
      this.mKeyBackgroundResId = localTypedArray.getResourceId(4, this.mKeyBackgroundResId);
      this.mButtonBackgroundResId = localTypedArray.getResourceId(5, this.mButtonBackgroundResId);
      this.mDividerColor = localTypedArray.getColor(7, this.mDividerColor);
      this.mDeleteDrawableSrcResId = localTypedArray.getResourceId(2, this.mDeleteDrawableSrcResId);
    }
    restyleViews();
  }

  public void updateDeleteButton()
  {
    if (this.mInputPointer != -1);
    for (boolean bool = true; ; bool = false)
    {
      if (this.mDelete != null)
        this.mDelete.setEnabled(bool);
      return;
    }
  }

  protected void updateHms()
  {
    this.mEnteredHms.setTime(this.mInput[4], this.mInput[3], this.mInput[2], this.mInput[1], this.mInput[0]);
  }

  private static class SavedState extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new HmsPicker.SavedState.1();
    int mAmPmState;
    int[] mInput;
    int mInputPointer;

    private SavedState(Parcel paramParcel)
    {
      super();
      this.mInputPointer = paramParcel.readInt();
      paramParcel.readIntArray(this.mInput);
      this.mAmPmState = paramParcel.readInt();
    }

    public SavedState(Parcelable paramParcelable)
    {
      super();
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.mInputPointer);
      paramParcel.writeIntArray(this.mInput);
      paramParcel.writeInt(this.mAmPmState);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.hmspicker.HmsPicker
 * JD-Core Version:    0.6.0
 */