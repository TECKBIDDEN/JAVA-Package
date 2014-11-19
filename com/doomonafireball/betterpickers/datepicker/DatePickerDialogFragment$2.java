package com.doomonafireball.betterpickers.datepicker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Iterator;
import java.util.Vector;

class DatePickerDialogFragment$2
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    Iterator localIterator = DatePickerDialogFragment.access$0(this.this$0).iterator();
    Fragment localFragment;
    if (!localIterator.hasNext())
    {
      FragmentActivity localFragmentActivity = this.this$0.getActivity();
      localFragment = this.this$0.getTargetFragment();
      if (!(localFragmentActivity instanceof DatePickerDialogFragment.DatePickerDialogHandler))
        break label152;
      ((DatePickerDialogFragment.DatePickerDialogHandler)localFragmentActivity).onDialogDateSet(DatePickerDialogFragment.access$1(this.this$0), DatePickerDialogFragment.access$2(this.this$0).getYear(), DatePickerDialogFragment.access$2(this.this$0).getMonthOfYear(), DatePickerDialogFragment.access$2(this.this$0).getDayOfMonth());
    }
    while (true)
    {
      this.this$0.dismiss();
      return;
      ((DatePickerDialogFragment.DatePickerDialogHandler)localIterator.next()).onDialogDateSet(DatePickerDialogFragment.access$1(this.this$0), DatePickerDialogFragment.access$2(this.this$0).getYear(), DatePickerDialogFragment.access$2(this.this$0).getMonthOfYear(), DatePickerDialogFragment.access$2(this.this$0).getDayOfMonth());
      break;
      label152: if (!(localFragment instanceof DatePickerDialogFragment.DatePickerDialogHandler))
        continue;
      ((DatePickerDialogFragment.DatePickerDialogHandler)localFragment).onDialogDateSet(DatePickerDialogFragment.access$1(this.this$0), DatePickerDialogFragment.access$2(this.this$0).getYear(), DatePickerDialogFragment.access$2(this.this$0).getMonthOfYear(), DatePickerDialogFragment.access$2(this.this$0).getDayOfMonth());
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.datepicker.DatePickerDialogFragment.2
 * JD-Core Version:    0.6.0
 */