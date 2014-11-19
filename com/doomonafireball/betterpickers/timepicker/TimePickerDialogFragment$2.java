package com.doomonafireball.betterpickers.timepicker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Iterator;
import java.util.Vector;

class TimePickerDialogFragment$2
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    Iterator localIterator = TimePickerDialogFragment.access$0(this.this$0).iterator();
    Fragment localFragment;
    if (!localIterator.hasNext())
    {
      FragmentActivity localFragmentActivity = this.this$0.getActivity();
      localFragment = this.this$0.getTargetFragment();
      if (!(localFragmentActivity instanceof TimePickerDialogFragment.TimePickerDialogHandler))
        break label132;
      ((TimePickerDialogFragment.TimePickerDialogHandler)localFragmentActivity).onDialogTimeSet(TimePickerDialogFragment.access$1(this.this$0), TimePickerDialogFragment.access$2(this.this$0).getHours(), TimePickerDialogFragment.access$2(this.this$0).getMinutes());
    }
    while (true)
    {
      this.this$0.dismiss();
      return;
      ((TimePickerDialogFragment.TimePickerDialogHandler)localIterator.next()).onDialogTimeSet(TimePickerDialogFragment.access$1(this.this$0), TimePickerDialogFragment.access$2(this.this$0).getHours(), TimePickerDialogFragment.access$2(this.this$0).getMinutes());
      break;
      label132: if (!(localFragment instanceof TimePickerDialogFragment.TimePickerDialogHandler))
        continue;
      ((TimePickerDialogFragment.TimePickerDialogHandler)localFragment).onDialogTimeSet(TimePickerDialogFragment.access$1(this.this$0), TimePickerDialogFragment.access$2(this.this$0).getHours(), TimePickerDialogFragment.access$2(this.this$0).getMinutes());
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.timepicker.TimePickerDialogFragment.2
 * JD-Core Version:    0.6.0
 */