package com.doomonafireball.betterpickers.hmspicker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import java.util.Vector;

public class HmsPickerBuilder
{
  private Vector<HmsPickerDialogFragment.HmsPickerDialogHandler> mHmsPickerDialogHandlers = new Vector();
  private int mReference;
  private FragmentManager manager;
  private Integer styleResId;
  private Fragment targetFragment;

  public HmsPickerBuilder addHmsPickerDialogHandler(HmsPickerDialogFragment.HmsPickerDialogHandler paramHmsPickerDialogHandler)
  {
    this.mHmsPickerDialogHandlers.add(paramHmsPickerDialogHandler);
    return this;
  }

  public HmsPickerBuilder removeHmsPickerDialogHandler(HmsPickerDialogFragment.HmsPickerDialogHandler paramHmsPickerDialogHandler)
  {
    this.mHmsPickerDialogHandlers.remove(paramHmsPickerDialogHandler);
    return this;
  }

  public HmsPickerBuilder setFragmentManager(FragmentManager paramFragmentManager)
  {
    this.manager = paramFragmentManager;
    return this;
  }

  public HmsPickerBuilder setReference(int paramInt)
  {
    this.mReference = paramInt;
    return this;
  }

  public HmsPickerBuilder setStyleResId(int paramInt)
  {
    this.styleResId = Integer.valueOf(paramInt);
    return this;
  }

  public HmsPickerBuilder setTargetFragment(Fragment paramFragment)
  {
    this.targetFragment = paramFragment;
    return this;
  }

  public void show()
  {
    if ((this.manager == null) || (this.styleResId == null))
      Log.e("HmsPickerBuilder", "setFragmentManager() and setStyleResId() must be called.");
    while (true)
    {
      return;
      FragmentTransaction localFragmentTransaction = this.manager.beginTransaction();
      Fragment localFragment = this.manager.findFragmentByTag("hms_dialog");
      if (localFragment != null)
        localFragmentTransaction.remove(localFragment);
      localFragmentTransaction.addToBackStack(null);
      HmsPickerDialogFragment localHmsPickerDialogFragment = HmsPickerDialogFragment.newInstance(this.mReference, this.styleResId.intValue());
      if (this.targetFragment != null)
        localHmsPickerDialogFragment.setTargetFragment(this.targetFragment, 0);
      localHmsPickerDialogFragment.setHmsPickerDialogHandlers(this.mHmsPickerDialogHandlers);
      localHmsPickerDialogFragment.show(localFragmentTransaction, "hms_dialog");
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.hmspicker.HmsPickerBuilder
 * JD-Core Version:    0.6.0
 */