package com.doomonafireball.betterpickers;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class UnderlinePageIndicatorPicker$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new UnderlinePageIndicatorPicker.SavedState.1();
  int currentPage;

  private UnderlinePageIndicatorPicker$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    this.currentPage = paramParcel.readInt();
  }

  public UnderlinePageIndicatorPicker$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.currentPage);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.doomonafireball.betterpickers.UnderlinePageIndicatorPicker.SavedState
 * JD-Core Version:    0.6.0
 */