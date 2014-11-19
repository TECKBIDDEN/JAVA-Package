package com.doomonafireball.betterpickers.hmspicker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Iterator;
import java.util.Vector;

class HmsPickerDialogFragment$2
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    Iterator localIterator = HmsPickerDialogFragment.access$0(this.this$0).iterator();
    Fragment localFragment;
    if (!localIterator.hasNext())
    {
      FragmentActivity localFragmentActivity = this.this$0.getActivity();
      localFragment = this.this$0.getTargetFragment();
      if (!(localFragmentActivity instanceof HmsPickerDialogFragment.HmsPickerDialogHandler))
        break label152;
      ((HmsPickerDialogFragment.HmsPickerDialogHandler)localFragmentActivity).onDialogHmsSet(HmsPickerDialogFragment.access$1(this.this$0), HmsPickerDialogFragment.access$2(this.this$0).getHours(), HmsPickerDialogFragment.access$2(this.this$0).getMinutes(), HmsPickerDialogFragment.access$2(this.this$0).getSeconds());
    }
    while (true)
    {
      this.this$0.dismiss();
      return;
      ((HmsPickerDialogFragment.HmsPickerDialogHandler)localIterator.next()).onDialogHmsSet(HmsPickerDialogFragment.access$1(this.this$0), HmsPickerDialogFragment.access$2(this.this$0).getHours(), HmsPickerDialogFragment.access$2(this.this$0).getMinutes(), HmsPickerDialogFragment.access$2(this.this$0).getSeconds());
      break;
      label152: if (!(localFragment instanceof HmsPickerDialogFragment.HmsPickerDialogHandler))
        continue;
      ((HmsPickerDialogFragment.HmsPickerDialogHandler)localFragment).onDialogHmsSet(HmsPickerDialogFragment.access$1(this.this$0), HmsPickerDialogFragment.access$2(this.this$0).getHours(), HmsPickerDialogFragment.access$2(this.this$0).getMinutes(), HmsPickerDialogFragment.access$2(this.this$0).getSeconds());
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.hmspicker.HmsPickerDialogFragment.2
 * JD-Core Version:    0.6.0
 */