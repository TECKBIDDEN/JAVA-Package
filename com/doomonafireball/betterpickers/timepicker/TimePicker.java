package com.doomonafireball.betterpickers.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.format.DateFormat;
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
import com.doomonafireball.betterpickers.R.string;
import com.doomonafireball.betterpickers.R.styleable;
import java.text.DateFormatSymbols;

public class TimePicker extends LinearLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  private static final int AMPM_NOT_SELECTED = 0;
  private static final int AM_SELECTED = 2;
  private static final int HOURS24_MODE = 3;
  private static final int PM_SELECTED = 1;
  private static final String TIME_PICKER_SAVED_AMPM = "timer_picker_saved_ampm";
  private static final String TIME_PICKER_SAVED_BUFFER_POINTER = "timer_picker_saved_buffer_pointer";
  private static final String TIME_PICKER_SAVED_INPUT = "timer_picker_saved_input";
  private TextView mAmPmLabel;
  private int mAmPmState;
  private String[] mAmpm;
  private int mButtonBackgroundResId;
  protected final Context mContext;
  protected ImageButton mDelete;
  private int mDeleteDrawableSrcResId;
  protected View mDivider;
  private int mDividerColor;
  protected TimerView mEnteredTime;
  protected int[] mInput = new int[this.mInputSize];
  protected int mInputPointer = -1;
  protected int mInputSize = 4;
  private boolean mIs24HoursMode = false;
  private int mKeyBackgroundResId;
  protected Button mLeft;
  private final String mNoAmPmLabel;
  protected final Button[] mNumbers = new Button[10];
  protected Button mRight;
  private Button mSetButton;
  private ColorStateList mTextColor;
  private int mTheme = -1;

  public TimePicker(Context paramContext)
  {
    this(paramContext, null);
  }

  public TimePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    this.mIs24HoursMode = get24HourMode(this.mContext);
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
    this.mNoAmPmLabel = paramContext.getResources().getString(R.string.time_picker_ampm_label);
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

  private boolean canAddDigits()
  {
    int i = 1;
    int j = getEnteredTime();
    if (!this.mIs24HoursMode)
      if ((j < i) || (j > 12));
    while (true)
    {
      return i;
      i = 0;
      continue;
      if ((j >= 0) && (j <= 23) && (this.mInputPointer > -1) && (this.mInputPointer < 2))
        continue;
      i = 0;
    }
  }

  private void enableSetButton()
  {
    boolean bool = true;
    if (this.mSetButton == null);
    while (true)
    {
      return;
      if (this.mInputPointer != -1)
        break;
      this.mSetButton.setEnabled(false);
    }
    if (this.mIs24HoursMode)
    {
      int i = getEnteredTime();
      Button localButton2 = this.mSetButton;
      if ((this.mInputPointer >= 2) && ((i < 60) || (i > 95)));
      while (true)
      {
        localButton2.setEnabled(bool);
        break;
        bool = false;
      }
    }
    Button localButton1 = this.mSetButton;
    if (this.mAmPmState != 0);
    while (true)
    {
      localButton1.setEnabled(bool);
      break;
      bool = false;
    }
  }

  public static boolean get24HourMode(Context paramContext)
  {
    return DateFormat.is24HourFormat(paramContext);
  }

  private int getEnteredTime()
  {
    return 1000 * this.mInput[3] + 100 * this.mInput[2] + 10 * this.mInput[1] + this.mInput[0];
  }

  private void onLeftClicked()
  {
    getEnteredTime();
    if (!this.mIs24HoursMode)
    {
      if (canAddDigits())
      {
        addClickedNumber(0);
        addClickedNumber(0);
      }
      this.mAmPmState = 2;
    }
    while (true)
    {
      return;
      if (canAddDigits())
      {
        addClickedNumber(0);
        addClickedNumber(0);
        continue;
      }
    }
  }

  private void onRightClicked()
  {
    getEnteredTime();
    if (!this.mIs24HoursMode)
    {
      if (canAddDigits())
      {
        addClickedNumber(0);
        addClickedNumber(0);
      }
      this.mAmPmState = 1;
    }
    while (true)
    {
      return;
      if (canAddDigits())
      {
        addClickedNumber(3);
        addClickedNumber(0);
        continue;
      }
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
        if (this.mLeft != null)
        {
          this.mLeft.setTextColor(this.mTextColor);
          this.mLeft.setBackgroundResource(this.mKeyBackgroundResId);
        }
        if (this.mAmPmLabel != null)
        {
          this.mAmPmLabel.setTextColor(this.mTextColor);
          this.mAmPmLabel.setBackgroundResource(this.mKeyBackgroundResId);
        }
        if (this.mRight != null)
        {
          this.mRight.setTextColor(this.mTextColor);
          this.mRight.setBackgroundResource(this.mKeyBackgroundResId);
        }
        if (this.mDelete != null)
        {
          this.mDelete.setBackgroundResource(this.mButtonBackgroundResId);
          this.mDelete.setImageDrawable(getResources().getDrawable(this.mDeleteDrawableSrcResId));
        }
        if (this.mEnteredTime != null)
          this.mEnteredTime.setTheme(this.mTheme);
        return;
      }
      Button localButton = arrayOfButton[j];
      if (localButton == null)
        continue;
      localButton.setTextColor(this.mTextColor);
      localButton.setBackgroundResource(this.mKeyBackgroundResId);
    }
  }

  private void setKeyRange(int paramInt)
  {
    int i = 0;
    if (i >= this.mNumbers.length)
      return;
    Button localButton = this.mNumbers[i];
    if (i <= paramInt);
    for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      i++;
      break;
    }
  }

  private void showAmPm()
  {
    if (!this.mIs24HoursMode)
      switch (this.mAmPmState)
      {
      default:
      case 0:
      case 2:
      case 1:
      }
    while (true)
    {
      return;
      this.mAmPmLabel.setText(this.mNoAmPmLabel);
      continue;
      this.mAmPmLabel.setText(this.mAmpm[0]);
      continue;
      this.mAmPmLabel.setText(this.mAmpm[1]);
      continue;
      this.mAmPmLabel.setVisibility(4);
      this.mAmPmState = 3;
    }
  }

  private void updateKeypad()
  {
    showAmPm();
    updateLeftRightButtons();
    updateTime();
    updateNumericKeys();
    enableSetButton();
    updateDeleteButton();
  }

  private void updateLeftRightButtons()
  {
    int i = getEnteredTime();
    if (this.mIs24HoursMode)
    {
      boolean bool = canAddDigits();
      this.mLeft.setEnabled(bool);
      this.mRight.setEnabled(bool);
    }
    while (true)
    {
      return;
      if (((i > 12) && (i < 100)) || (i == 0) || (this.mAmPmState != 0))
      {
        this.mLeft.setEnabled(false);
        this.mRight.setEnabled(false);
        continue;
      }
      this.mLeft.setEnabled(true);
      this.mRight.setEnabled(true);
    }
  }

  private void updateNumericKeys()
  {
    int i = getEnteredTime();
    if (this.mIs24HoursMode)
      if (this.mInputPointer >= 3)
        setKeyRange(-1);
    while (true)
    {
      return;
      if (i == 0)
      {
        if ((this.mInputPointer == -1) || (this.mInputPointer == 0) || (this.mInputPointer == 2))
        {
          setKeyRange(9);
          continue;
        }
        if (this.mInputPointer == 1)
        {
          setKeyRange(5);
          continue;
        }
        setKeyRange(-1);
        continue;
      }
      if (i == 1)
      {
        if ((this.mInputPointer == 0) || (this.mInputPointer == 2))
        {
          setKeyRange(9);
          continue;
        }
        if (this.mInputPointer == 1)
        {
          setKeyRange(5);
          continue;
        }
        setKeyRange(-1);
        continue;
      }
      if (i == 2)
      {
        if ((this.mInputPointer == 2) || (this.mInputPointer == 1))
        {
          setKeyRange(9);
          continue;
        }
        if (this.mInputPointer == 0)
        {
          setKeyRange(3);
          continue;
        }
        setKeyRange(-1);
        continue;
      }
      if (i <= 5)
      {
        setKeyRange(9);
        continue;
      }
      if (i <= 9)
      {
        setKeyRange(5);
        continue;
      }
      if ((i >= 10) && (i <= 15))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 16) && (i <= 19))
      {
        setKeyRange(5);
        continue;
      }
      if ((i >= 20) && (i <= 25))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 26) && (i <= 29))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 30) && (i <= 35))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 36) && (i <= 39))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 40) && (i <= 45))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 46) && (i <= 49))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 50) && (i <= 55))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 56) && (i <= 59))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 60) && (i <= 65))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 70) && (i <= 75))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 80) && (i <= 85))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 90) && (i <= 95))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 100) && (i <= 105))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 106) && (i <= 109))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 110) && (i <= 115))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 116) && (i <= 119))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 120) && (i <= 125))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 126) && (i <= 129))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 130) && (i <= 135))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 136) && (i <= 139))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 140) && (i <= 145))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 146) && (i <= 149))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 150) && (i <= 155))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 156) && (i <= 159))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 160) && (i <= 165))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 166) && (i <= 169))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 170) && (i <= 175))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 176) && (i <= 179))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 180) && (i <= 185))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 186) && (i <= 189))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 190) && (i <= 195))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 196) && (i <= 199))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 200) && (i <= 205))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 206) && (i <= 209))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 210) && (i <= 215))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 216) && (i <= 219))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 220) && (i <= 225))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 226) && (i <= 229))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 230) && (i <= 235))
      {
        setKeyRange(9);
        continue;
      }
      if (i < 236)
        continue;
      setKeyRange(-1);
      continue;
      if (this.mAmPmState != 0)
      {
        setKeyRange(-1);
        continue;
      }
      if (i == 0)
      {
        setKeyRange(9);
        this.mNumbers[0].setEnabled(false);
        continue;
      }
      if (i <= 9)
      {
        setKeyRange(5);
        continue;
      }
      if (i <= 95)
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 100) && (i <= 105))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 106) && (i <= 109))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 110) && (i <= 115))
      {
        setKeyRange(9);
        continue;
      }
      if ((i >= 116) && (i <= 119))
      {
        setKeyRange(-1);
        continue;
      }
      if ((i >= 120) && (i <= 125))
      {
        setKeyRange(9);
        continue;
      }
      if (i < 126)
        continue;
      setKeyRange(-1);
    }
  }

  protected void doOnClick(View paramView)
  {
    Integer localInteger = (Integer)paramView.getTag(R.id.numbers_key);
    if (localInteger != null)
      addClickedNumber(localInteger.intValue());
    while (true)
    {
      updateKeypad();
      return;
      if (paramView == this.mDelete)
      {
        if ((!this.mIs24HoursMode) && (this.mAmPmState != 0))
        {
          this.mAmPmState = 0;
          continue;
        }
        if (this.mInputPointer < 0)
          continue;
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
      if (paramView == this.mLeft)
      {
        onLeftClicked();
        continue;
      }
      if (paramView != this.mRight)
        continue;
      onRightClicked();
    }
  }

  public int getHours()
  {
    int i = 12;
    int j = 10 * this.mInput[3] + this.mInput[2];
    if (j == i);
    switch (this.mAmPmState)
    {
    default:
      if (this.mAmPmState != 1)
        break;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      i += j;
      while (true)
      {
        return i;
        i = 0;
        continue;
        i = j;
      }
      i = 0;
    }
  }

  protected int getLayoutId()
  {
    return R.layout.time_picker_view;
  }

  public int getMinutes()
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
    this.mEnteredTime = ((TimerView)findViewById(R.id.timer_time_text));
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
    int i = 0;
    if (i >= 10)
    {
      updateTime();
      Resources localResources = this.mContext.getResources();
      this.mAmpm = new DateFormatSymbols().getAmPmStrings();
      if (!this.mIs24HoursMode)
        break label486;
      this.mLeft.setText(localResources.getString(R.string.time_picker_00_label));
      this.mRight.setText(localResources.getString(R.string.time_picker_30_label));
    }
    while (true)
    {
      this.mLeft.setOnClickListener(this);
      this.mRight.setOnClickListener(this);
      this.mAmPmLabel = ((TextView)findViewById(R.id.ampm_label));
      this.mAmPmState = 0;
      this.mDivider = findViewById(R.id.divider);
      restyleViews();
      updateKeypad();
      return;
      this.mNumbers[i].setOnClickListener(this);
      Button localButton = this.mNumbers[i];
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      localButton.setText(String.format("%d", arrayOfObject));
      this.mNumbers[i].setTag(R.id.numbers_key, new Integer(i));
      i++;
      break;
      label486: this.mLeft.setText(this.mAmpm[0]);
      this.mRight.setText(this.mAmpm[1]);
    }
  }

  public boolean onLongClick(View paramView)
  {
    int i = 0;
    paramView.performHapticFeedback(0);
    if (paramView == this.mDelete)
    {
      this.mDelete.setPressed(false);
      this.mAmPmState = 0;
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
      this.mAmPmState = localSavedState.mAmPmState;
      updateKeypad();
    }
  }

  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.mInput = this.mInput;
    localSavedState.mAmPmState = this.mAmPmState;
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
        updateTime();
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
        updateTime();
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

  protected void updateTime()
  {
    int i = -1;
    getEnteredTime();
    int j;
    label197: int k;
    if (this.mInputPointer > -1)
    {
      if (this.mInputPointer >= 0)
      {
        int i1 = this.mInput[this.mInputPointer];
        if (((this.mIs24HoursMode) && (i1 >= 3) && (i1 <= 9)) || ((!this.mIs24HoursMode) && (i1 >= 2) && (i1 <= 9)))
          i = -2;
      }
      if ((this.mInputPointer > 0) && (this.mInputPointer < 3) && (i != -2))
      {
        int n = 10 * this.mInput[this.mInputPointer] + this.mInput[(-1 + this.mInputPointer)];
        if (((this.mIs24HoursMode) && (n >= 24) && (n <= 25)) || ((!this.mIs24HoursMode) && (n >= 13) && (n <= 15)))
          i = -2;
      }
      if (this.mInputPointer == 3)
        i = this.mInput[3];
      if (this.mInputPointer >= 2)
        break label240;
      j = -1;
      if (this.mInputPointer >= 1)
        break label250;
      k = -1;
      label209: if (this.mInputPointer >= 0)
        break label261;
    }
    label261: for (int m = -1; ; m = this.mInput[0])
    {
      this.mEnteredTime.setTime(i, j, k, m);
      return;
      i = -1;
      break;
      label240: j = this.mInput[2];
      break label197;
      label250: k = this.mInput[1];
      break label209;
    }
  }

  private static class SavedState extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new TimePicker.SavedState.1();
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
 * Qualified Name:     com.doomonafireball.betterpickers.timepicker.TimePicker
 * JD-Core Version:    0.6.0
 */