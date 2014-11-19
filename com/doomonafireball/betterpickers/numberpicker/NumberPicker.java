package com.doomonafireball.betterpickers.numberpicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import com.doomonafireball.betterpickers.R.string;
import com.doomonafireball.betterpickers.R.styleable;
import java.math.BigDecimal;

public class NumberPicker extends LinearLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  private static final int CLICKED_DECIMAL = 10;
  private static final int SIGN_NEGATIVE = 1;
  private static final int SIGN_POSITIVE;
  private int mButtonBackgroundResId;
  protected final Context mContext;
  protected ImageButton mDelete;
  private int mDeleteDrawableSrcResId;
  protected View mDivider;
  private int mDividerColor;
  protected NumberView mEnteredNumber;
  private NumberPickerErrorTextView mError;
  protected int[] mInput = new int[this.mInputSize];
  protected int mInputPointer = -1;
  protected int mInputSize = 20;
  private int mKeyBackgroundResId;
  private TextView mLabel;
  private String mLabelText = "";
  protected Button mLeft;
  private Integer mMaxNumber = null;
  private Integer mMinNumber = null;
  protected final Button[] mNumbers = new Button[10];
  protected Button mRight;
  private Button mSetButton;
  private int mSign;
  private ColorStateList mTextColor;
  private int mTheme = -1;

  public NumberPicker(Context paramContext)
  {
    this(paramContext, null);
  }

  public NumberPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
    this.mTextColor = getResources().getColorStateList(R.color.dialog_text_color_holo_dark);
    this.mKeyBackgroundResId = R.drawable.key_background_dark;
    this.mButtonBackgroundResId = R.drawable.button_background_dark;
    this.mDeleteDrawableSrcResId = R.drawable.ic_backspace_dark;
    this.mDividerColor = getResources().getColor(R.color.default_divider_color_dark);
  }

  private void addClickedNumber(int paramInt)
  {
    if (this.mInputPointer < -1 + this.mInputSize)
    {
      if ((this.mInput[0] == 0) && (this.mInput[1] == -1) && (!containsDecimal()) && (paramInt != 10))
        this.mInput[0] = paramInt;
    }
    else
      return;
    for (int i = this.mInputPointer; ; i--)
    {
      if (i < 0)
      {
        this.mInputPointer = (1 + this.mInputPointer);
        this.mInput[0] = paramInt;
        break;
      }
      this.mInput[(i + 1)] = this.mInput[i];
    }
  }

  private boolean canAddDecimal()
  {
    if (containsDecimal());
    for (int i = 0; ; i = 1)
      return i;
  }

  private boolean containsDecimal()
  {
    int i = 0;
    int[] arrayOfInt = this.mInput;
    int j = arrayOfInt.length;
    for (int k = 0; ; k++)
    {
      if (k >= j)
        return i;
      if (arrayOfInt[k] != 10)
        continue;
      i = 1;
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

  private String getEnteredNumberString()
  {
    String str = "";
    int i = this.mInputPointer;
    if (i < 0)
      return str;
    if (this.mInput[i] != -1)
      if (this.mInput[i] != 10)
        break label62;
    label62: for (str = str + "."; ; str = str + this.mInput[i])
    {
      i--;
      break;
    }
  }

  private void onLeftClicked()
  {
    if (this.mSign == 0);
    for (this.mSign = 1; ; this.mSign = 0)
      return;
  }

  private void onRightClicked()
  {
    if (canAddDecimal())
      addClickedNumber(10);
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
        if (this.mEnteredNumber != null)
          this.mEnteredNumber.setTheme(this.mTheme);
        if (this.mLabel != null)
          this.mLabel.setTextColor(this.mTextColor);
        return;
      }
      Button localButton = arrayOfButton[j];
      if (localButton == null)
        continue;
      localButton.setTextColor(this.mTextColor);
      localButton.setBackgroundResource(this.mKeyBackgroundResId);
    }
  }

  private void showLabel()
  {
    if (this.mLabel != null)
      this.mLabel.setText(this.mLabelText);
  }

  private void updateKeypad()
  {
    updateLeftRightButtons();
    updateNumber();
    enableSetButton();
    updateDeleteButton();
  }

  private void updateLeftRightButtons()
  {
    this.mRight.setEnabled(canAddDecimal());
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
        if (this.mInputPointer < 0)
          continue;
        for (int i = 0; ; i++)
        {
          if (i >= this.mInputPointer)
          {
            this.mInput[this.mInputPointer] = -1;
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

  public double getDecimal()
  {
    return BigDecimal.valueOf(getEnteredNumber()).divideAndRemainder(BigDecimal.ONE)[1].doubleValue();
  }

  public double getEnteredNumber()
  {
    String str = "0";
    int i = this.mInputPointer;
    if (i < 0);
    do
    {
      if (this.mSign == 1)
        str = "-" + str;
      return Double.parseDouble(str);
    }
    while (this.mInput[i] == -1);
    if (this.mInput[i] == 10);
    for (str = str + "."; ; str = str + this.mInput[i])
    {
      i--;
      break;
    }
  }

  public NumberPickerErrorTextView getErrorView()
  {
    return this.mError;
  }

  public boolean getIsNegative()
  {
    int i = 1;
    if (this.mSign == i);
    while (true)
    {
      return i;
      i = 0;
    }
  }

  protected int getLayoutId()
  {
    return R.layout.number_picker_view;
  }

  public int getNumber()
  {
    return Integer.parseInt(Double.toString(getEnteredNumber()).split("\\.")[0]);
  }

  public void onClick(View paramView)
  {
    paramView.performHapticFeedback(1);
    this.mError.hideImmediately();
    doOnClick(paramView);
    updateDeleteButton();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.mDivider = findViewById(R.id.divider);
    this.mError = ((NumberPickerErrorTextView)findViewById(R.id.error));
    int i = 0;
    if (i >= this.mInput.length)
    {
      View localView1 = findViewById(R.id.first);
      View localView2 = findViewById(R.id.second);
      View localView3 = findViewById(R.id.third);
      View localView4 = findViewById(R.id.fourth);
      this.mEnteredNumber = ((NumberView)findViewById(R.id.number_text));
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
      setLeftRightEnabled();
    }
    for (int j = 0; ; j++)
    {
      if (j >= 10)
      {
        updateNumber();
        Resources localResources = this.mContext.getResources();
        this.mLeft.setText(localResources.getString(R.string.number_picker_plus_minus));
        this.mRight.setText(localResources.getString(R.string.number_picker_seperator));
        this.mLeft.setOnClickListener(this);
        this.mRight.setOnClickListener(this);
        this.mLabel = ((TextView)findViewById(R.id.label));
        this.mSign = 0;
        showLabel();
        restyleViews();
        updateKeypad();
        return;
        this.mInput[i] = -1;
        i++;
        break;
      }
      this.mNumbers[j].setOnClickListener(this);
      Button localButton = this.mNumbers[j];
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(j);
      localButton.setText(String.format("%d", arrayOfObject));
      this.mNumbers[j].setTag(R.id.numbers_key, new Integer(j));
    }
  }

  public boolean onLongClick(View paramView)
  {
    int i = 0;
    paramView.performHapticFeedback(0);
    this.mError.hideImmediately();
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
      this.mSign = localSavedState.mSign;
      updateKeypad();
    }
  }

  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.mInput = this.mInput;
    localSavedState.mSign = this.mSign;
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
        updateNumber();
        return;
      }
      this.mInput[i] = -1;
    }
  }

  public void setDecimalVisibility(int paramInt)
  {
    if (this.mRight != null)
      this.mRight.setVisibility(paramInt);
  }

  public void setLabelText(String paramString)
  {
    this.mLabelText = paramString;
    showLabel();
  }

  protected void setLeftRightEnabled()
  {
    this.mLeft.setEnabled(true);
    this.mRight.setEnabled(canAddDecimal());
    if (!canAddDecimal())
      this.mRight.setContentDescription(null);
  }

  public void setMax(int paramInt)
  {
    this.mMaxNumber = Integer.valueOf(paramInt);
  }

  public void setMin(int paramInt)
  {
    this.mMinNumber = Integer.valueOf(paramInt);
  }

  public void setPlusMinusVisibility(int paramInt)
  {
    if (this.mLeft != null)
      this.mLeft.setVisibility(paramInt);
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

  protected void updateNumber()
  {
    boolean bool1 = false;
    int i = 1;
    String str1 = getEnteredNumberString().replaceAll("\\-", "");
    String[] arrayOfString = str1.split("\\.");
    if (arrayOfString.length >= 2)
      if (arrayOfString[0].equals(""))
      {
        NumberView localNumberView4 = this.mEnteredNumber;
        String str5 = arrayOfString[i];
        boolean bool4 = containsDecimal();
        if (this.mSign == i)
          localNumberView4.setNumber("0", str5, bool4, i);
      }
    while (true)
    {
      return;
      int j = 0;
      break;
      NumberView localNumberView3 = this.mEnteredNumber;
      String str3 = arrayOfString[0];
      String str4 = arrayOfString[j];
      boolean bool3 = containsDecimal();
      if (this.mSign == j);
      int k;
      while (true)
      {
        localNumberView3.setNumber(str3, str4, bool3, j);
        break;
        k = 0;
      }
      int m;
      if (arrayOfString.length == k)
      {
        NumberView localNumberView2 = this.mEnteredNumber;
        String str2 = arrayOfString[0];
        boolean bool2 = containsDecimal();
        if (this.mSign == k);
        while (true)
        {
          localNumberView2.setNumber(str2, "", bool2, k);
          break;
          m = 0;
        }
      }
      if (!str1.equals("."))
        continue;
      NumberView localNumberView1 = this.mEnteredNumber;
      if (this.mSign == m)
        bool1 = m;
      localNumberView1.setNumber("0", "", m, bool1);
    }
  }

  private static class SavedState extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new NumberPicker.SavedState.1();
    int[] mInput;
    int mInputPointer;
    int mSign;

    private SavedState(Parcel paramParcel)
    {
      super();
      this.mInputPointer = paramParcel.readInt();
      paramParcel.readIntArray(this.mInput);
      this.mSign = paramParcel.readInt();
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
      paramParcel.writeInt(this.mSign);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.numberpicker.NumberPicker
 * JD-Core Version:    0.6.0
 */