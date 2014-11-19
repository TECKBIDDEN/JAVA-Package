package com.doomonafireball.betterpickers.numberpicker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import java.util.Vector;

public class NumberPickerBuilder
{
  private Integer decimalVisibility;
  private String labelText;
  private Vector<NumberPickerDialogFragment.NumberPickerDialogHandler> mNumberPickerDialogHandlers = new Vector();
  private int mReference;
  private FragmentManager manager;
  private Integer maxNumber;
  private Integer minNumber;
  private Integer plusMinusVisibility;
  private Integer styleResId;
  private Fragment targetFragment;

  public NumberPickerBuilder addNumberPickerDialogHandler(NumberPickerDialogFragment.NumberPickerDialogHandler paramNumberPickerDialogHandler)
  {
    this.mNumberPickerDialogHandlers.add(paramNumberPickerDialogHandler);
    return this;
  }

  public NumberPickerBuilder removeNumberPickerDialogHandler(NumberPickerDialogFragment.NumberPickerDialogHandler paramNumberPickerDialogHandler)
  {
    this.mNumberPickerDialogHandlers.remove(paramNumberPickerDialogHandler);
    return this;
  }

  public NumberPickerBuilder setDecimalVisibility(int paramInt)
  {
    this.decimalVisibility = Integer.valueOf(paramInt);
    return this;
  }

  public NumberPickerBuilder setFragmentManager(FragmentManager paramFragmentManager)
  {
    this.manager = paramFragmentManager;
    return this;
  }

  public NumberPickerBuilder setLabelText(String paramString)
  {
    this.labelText = paramString;
    return this;
  }

  public NumberPickerBuilder setMaxNumber(int paramInt)
  {
    this.maxNumber = Integer.valueOf(paramInt);
    return this;
  }

  public NumberPickerBuilder setMinNumber(int paramInt)
  {
    this.minNumber = Integer.valueOf(paramInt);
    return this;
  }

  public NumberPickerBuilder setPlusMinusVisibility(int paramInt)
  {
    this.plusMinusVisibility = Integer.valueOf(paramInt);
    return this;
  }

  public NumberPickerBuilder setReference(int paramInt)
  {
    this.mReference = paramInt;
    return this;
  }

  public NumberPickerBuilder setStyleResId(int paramInt)
  {
    this.styleResId = Integer.valueOf(paramInt);
    return this;
  }

  public NumberPickerBuilder setTargetFragment(Fragment paramFragment)
  {
    this.targetFragment = paramFragment;
    return this;
  }

  public void show()
  {
    if ((this.manager == null) || (this.styleResId == null))
      Log.e("NumberPickerBuilder", "setFragmentManager() and setStyleResId() must be called.");
    while (true)
    {
      return;
      FragmentTransaction localFragmentTransaction = this.manager.beginTransaction();
      Fragment localFragment = this.manager.findFragmentByTag("number_dialog");
      if (localFragment != null)
        localFragmentTransaction.remove(localFragment);
      localFragmentTransaction.addToBackStack(null);
      NumberPickerDialogFragment localNumberPickerDialogFragment = NumberPickerDialogFragment.newInstance(this.mReference, this.styleResId.intValue(), this.minNumber, this.maxNumber, this.plusMinusVisibility, this.decimalVisibility, this.labelText);
      if (this.targetFragment != null)
        localNumberPickerDialogFragment.setTargetFragment(this.targetFragment, 0);
      localNumberPickerDialogFragment.setNumberPickerDialogHandlers(this.mNumberPickerDialogHandlers);
      localNumberPickerDialogFragment.show(localFragmentTransaction, "number_dialog");
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.numberpicker.NumberPickerBuilder
 * JD-Core Version:    0.6.0
 */