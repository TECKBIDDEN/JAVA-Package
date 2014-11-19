package com.doomonafireball.betterpickers.timepicker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import java.util.Vector;

public class TimePickerBuilder
{
  private int mReference = -1;
  private Vector<TimePickerDialogFragment.TimePickerDialogHandler> mTimePickerDialogHandlers = new Vector();
  private FragmentManager manager;
  private Integer styleResId;
  private Fragment targetFragment;

  public TimePickerBuilder addTimePickerDialogHandler(TimePickerDialogFragment.TimePickerDialogHandler paramTimePickerDialogHandler)
  {
    this.mTimePickerDialogHandlers.add(paramTimePickerDialogHandler);
    return this;
  }

  public TimePickerBuilder removeTimePickerDialogHandler(TimePickerDialogFragment.TimePickerDialogHandler paramTimePickerDialogHandler)
  {
    this.mTimePickerDialogHandlers.remove(paramTimePickerDialogHandler);
    return this;
  }

  public TimePickerBuilder setFragmentManager(FragmentManager paramFragmentManager)
  {
    this.manager = paramFragmentManager;
    return this;
  }

  public TimePickerBuilder setReference(int paramInt)
  {
    this.mReference = paramInt;
    return this;
  }

  public TimePickerBuilder setStyleResId(int paramInt)
  {
    this.styleResId = Integer.valueOf(paramInt);
    return this;
  }

  public TimePickerBuilder setTargetFragment(Fragment paramFragment)
  {
    this.targetFragment = paramFragment;
    return this;
  }

  public void show()
  {
    if ((this.manager == null) || (this.styleResId == null))
      Log.e("TimePickerBuilder", "setFragmentManager() and setStyleResId() must be called.");
    while (true)
    {
      return;
      FragmentTransaction localFragmentTransaction = this.manager.beginTransaction();
      Fragment localFragment = this.manager.findFragmentByTag("time_dialog");
      if (localFragment != null)
        localFragmentTransaction.remove(localFragment);
      localFragmentTransaction.addToBackStack(null);
      TimePickerDialogFragment localTimePickerDialogFragment = TimePickerDialogFragment.newInstance(this.mReference, this.styleResId.intValue());
      if (this.targetFragment != null)
        localTimePickerDialogFragment.setTargetFragment(this.targetFragment, 0);
      localTimePickerDialogFragment.setTimePickerDialogHandlers(this.mTimePickerDialogHandlers);
      localTimePickerDialogFragment.show(localFragmentTransaction, "time_dialog");
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.timepicker.TimePickerBuilder
 * JD-Core Version:    0.6.0
 */