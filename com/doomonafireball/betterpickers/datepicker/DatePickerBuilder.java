package com.doomonafireball.betterpickers.datepicker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import java.util.Vector;

public class DatePickerBuilder
{
  private Integer dayOfMonth;
  private Vector<DatePickerDialogFragment.DatePickerDialogHandler> mDatePickerDialogHandlers = new Vector();
  private int mReference = -1;
  private FragmentManager manager;
  private Integer monthOfYear;
  private Integer styleResId;
  private Fragment targetFragment;
  private Integer year;

  public DatePickerBuilder addDatePickerDialogHandler(DatePickerDialogFragment.DatePickerDialogHandler paramDatePickerDialogHandler)
  {
    this.mDatePickerDialogHandlers.add(paramDatePickerDialogHandler);
    return this;
  }

  public DatePickerBuilder removeDatePickerDialogHandler(DatePickerDialogFragment.DatePickerDialogHandler paramDatePickerDialogHandler)
  {
    this.mDatePickerDialogHandlers.remove(paramDatePickerDialogHandler);
    return this;
  }

  public DatePickerBuilder setDayOfMonth(int paramInt)
  {
    this.dayOfMonth = Integer.valueOf(paramInt);
    return this;
  }

  public DatePickerBuilder setFragmentManager(FragmentManager paramFragmentManager)
  {
    this.manager = paramFragmentManager;
    return this;
  }

  public DatePickerBuilder setMonthOfYear(int paramInt)
  {
    this.monthOfYear = Integer.valueOf(paramInt);
    return this;
  }

  public DatePickerBuilder setReference(int paramInt)
  {
    this.mReference = paramInt;
    return this;
  }

  public DatePickerBuilder setStyleResId(int paramInt)
  {
    this.styleResId = Integer.valueOf(paramInt);
    return this;
  }

  public DatePickerBuilder setTargetFragment(Fragment paramFragment)
  {
    this.targetFragment = paramFragment;
    return this;
  }

  public DatePickerBuilder setYear(int paramInt)
  {
    this.year = Integer.valueOf(paramInt);
    return this;
  }

  public void show()
  {
    if ((this.manager == null) || (this.styleResId == null))
      Log.e("DatePickerBuilder", "setFragmentManager() and setStyleResId() must be called.");
    while (true)
    {
      return;
      FragmentTransaction localFragmentTransaction = this.manager.beginTransaction();
      Fragment localFragment = this.manager.findFragmentByTag("date_dialog");
      if (localFragment != null)
        localFragmentTransaction.remove(localFragment);
      localFragmentTransaction.addToBackStack(null);
      DatePickerDialogFragment localDatePickerDialogFragment = DatePickerDialogFragment.newInstance(this.mReference, this.styleResId.intValue(), this.monthOfYear, this.dayOfMonth, this.year);
      if (this.targetFragment != null)
        localDatePickerDialogFragment.setTargetFragment(this.targetFragment, 0);
      localDatePickerDialogFragment.setDatePickerDialogHandlers(this.mDatePickerDialogHandlers);
      localDatePickerDialogFragment.show(localFragmentTransaction, "date_dialog");
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.datepicker.DatePickerBuilder
 * JD-Core Version:    0.6.0
 */