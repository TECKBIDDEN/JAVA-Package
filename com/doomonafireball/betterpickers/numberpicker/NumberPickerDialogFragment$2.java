package com.doomonafireball.betterpickers.numberpicker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.doomonafireball.betterpickers.R.string;
import java.util.Iterator;
import java.util.Vector;

class NumberPickerDialogFragment$2
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    double d = NumberPickerDialogFragment.access$0(this.this$0).getEnteredNumber();
    if ((NumberPickerDialogFragment.access$1(this.this$0) != null) && (NumberPickerDialogFragment.access$2(this.this$0) != null) && ((d < NumberPickerDialogFragment.access$1(this.this$0).intValue()) || (d > NumberPickerDialogFragment.access$2(this.this$0).intValue())))
    {
      String str5 = this.this$0.getString(R.string.min_max_error);
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = NumberPickerDialogFragment.access$1(this.this$0);
      arrayOfObject3[1] = NumberPickerDialogFragment.access$2(this.this$0);
      String str6 = String.format(str5, arrayOfObject3);
      NumberPickerDialogFragment.access$0(this.this$0).getErrorView().setText(str6);
      NumberPickerDialogFragment.access$0(this.this$0).getErrorView().show();
    }
    while (true)
    {
      return;
      if ((NumberPickerDialogFragment.access$1(this.this$0) != null) && (d < NumberPickerDialogFragment.access$1(this.this$0).intValue()))
      {
        String str3 = this.this$0.getString(R.string.min_error);
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = NumberPickerDialogFragment.access$1(this.this$0);
        String str4 = String.format(str3, arrayOfObject2);
        NumberPickerDialogFragment.access$0(this.this$0).getErrorView().setText(str4);
        NumberPickerDialogFragment.access$0(this.this$0).getErrorView().show();
        continue;
      }
      if ((NumberPickerDialogFragment.access$2(this.this$0) == null) || (d <= NumberPickerDialogFragment.access$2(this.this$0).intValue()))
        break;
      String str1 = this.this$0.getString(R.string.max_error);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = NumberPickerDialogFragment.access$2(this.this$0);
      String str2 = String.format(str1, arrayOfObject1);
      NumberPickerDialogFragment.access$0(this.this$0).getErrorView().setText(str2);
      NumberPickerDialogFragment.access$0(this.this$0).getErrorView().show();
    }
    Iterator localIterator = NumberPickerDialogFragment.access$3(this.this$0).iterator();
    label343: Fragment localFragment;
    if (!localIterator.hasNext())
    {
      FragmentActivity localFragmentActivity = this.this$0.getActivity();
      localFragment = this.this$0.getTargetFragment();
      if (!(localFragmentActivity instanceof NumberPickerDialogFragment.NumberPickerDialogHandler))
        break label493;
      ((NumberPickerDialogFragment.NumberPickerDialogHandler)localFragmentActivity).onDialogNumberSet(NumberPickerDialogFragment.access$4(this.this$0), NumberPickerDialogFragment.access$0(this.this$0).getNumber(), NumberPickerDialogFragment.access$0(this.this$0).getDecimal(), NumberPickerDialogFragment.access$0(this.this$0).getIsNegative(), d);
    }
    while (true)
    {
      this.this$0.dismiss();
      break;
      ((NumberPickerDialogFragment.NumberPickerDialogHandler)localIterator.next()).onDialogNumberSet(NumberPickerDialogFragment.access$4(this.this$0), NumberPickerDialogFragment.access$0(this.this$0).getNumber(), NumberPickerDialogFragment.access$0(this.this$0).getDecimal(), NumberPickerDialogFragment.access$0(this.this$0).getIsNegative(), d);
      break label343;
      label493: if (!(localFragment instanceof NumberPickerDialogFragment.NumberPickerDialogHandler))
        continue;
      ((NumberPickerDialogFragment.NumberPickerDialogHandler)localFragment).onDialogNumberSet(NumberPickerDialogFragment.access$4(this.this$0), NumberPickerDialogFragment.access$0(this.this$0).getNumber(), NumberPickerDialogFragment.access$0(this.this$0).getDecimal(), NumberPickerDialogFragment.access$0(this.this$0).getIsNegative(), d);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.numberpicker.NumberPickerDialogFragment.2
 * JD-Core Version:    0.6.0
 */