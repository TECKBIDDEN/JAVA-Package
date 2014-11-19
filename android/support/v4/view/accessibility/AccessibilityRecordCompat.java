package android.support.v4.view.accessibility;

import android.os.Build.VERSION;
import android.os.Parcelable;
import android.view.View;
import java.util.List;

public class AccessibilityRecordCompat
{
  private static final AccessibilityRecordImpl IMPL;
  private final Object mRecord;

  static
  {
    if (Build.VERSION.SDK_INT >= 16)
      IMPL = new AccessibilityRecordCompat.AccessibilityRecordJellyBeanImpl();
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 15)
      {
        IMPL = new AccessibilityRecordCompat.AccessibilityRecordIcsMr1Impl();
        continue;
      }
      if (Build.VERSION.SDK_INT >= 14)
      {
        IMPL = new AccessibilityRecordCompat.AccessibilityRecordIcsImpl();
        continue;
      }
      IMPL = new AccessibilityRecordCompat.AccessibilityRecordStubImpl();
    }
  }

  public AccessibilityRecordCompat(Object paramObject)
  {
    this.mRecord = paramObject;
  }

  public static AccessibilityRecordCompat obtain()
  {
    return new AccessibilityRecordCompat(IMPL.obtain());
  }

  public static AccessibilityRecordCompat obtain(AccessibilityRecordCompat paramAccessibilityRecordCompat)
  {
    return new AccessibilityRecordCompat(IMPL.obtain(paramAccessibilityRecordCompat.mRecord));
  }

  public boolean equals(Object paramObject)
  {
    int i = 1;
    if (this == paramObject);
    while (true)
    {
      return i;
      if (paramObject == null)
      {
        i = 0;
        continue;
      }
      if (getClass() != paramObject.getClass())
      {
        i = 0;
        continue;
      }
      AccessibilityRecordCompat localAccessibilityRecordCompat = (AccessibilityRecordCompat)paramObject;
      if (this.mRecord == null)
      {
        if (localAccessibilityRecordCompat.mRecord == null)
          continue;
        i = 0;
        continue;
      }
      if (this.mRecord.equals(localAccessibilityRecordCompat.mRecord))
        continue;
      i = 0;
    }
  }

  public int getAddedCount()
  {
    return IMPL.getAddedCount(this.mRecord);
  }

  public CharSequence getBeforeText()
  {
    return IMPL.getBeforeText(this.mRecord);
  }

  public CharSequence getClassName()
  {
    return IMPL.getClassName(this.mRecord);
  }

  public CharSequence getContentDescription()
  {
    return IMPL.getContentDescription(this.mRecord);
  }

  public int getCurrentItemIndex()
  {
    return IMPL.getCurrentItemIndex(this.mRecord);
  }

  public int getFromIndex()
  {
    return IMPL.getFromIndex(this.mRecord);
  }

  public Object getImpl()
  {
    return this.mRecord;
  }

  public int getItemCount()
  {
    return IMPL.getItemCount(this.mRecord);
  }

  public int getMaxScrollX()
  {
    return IMPL.getMaxScrollX(this.mRecord);
  }

  public int getMaxScrollY()
  {
    return IMPL.getMaxScrollY(this.mRecord);
  }

  public Parcelable getParcelableData()
  {
    return IMPL.getParcelableData(this.mRecord);
  }

  public int getRemovedCount()
  {
    return IMPL.getRemovedCount(this.mRecord);
  }

  public int getScrollX()
  {
    return IMPL.getScrollX(this.mRecord);
  }

  public int getScrollY()
  {
    return IMPL.getScrollY(this.mRecord);
  }

  public AccessibilityNodeInfoCompat getSource()
  {
    return IMPL.getSource(this.mRecord);
  }

  public List<CharSequence> getText()
  {
    return IMPL.getText(this.mRecord);
  }

  public int getToIndex()
  {
    return IMPL.getToIndex(this.mRecord);
  }

  public int getWindowId()
  {
    return IMPL.getWindowId(this.mRecord);
  }

  public int hashCode()
  {
    if (this.mRecord == null);
    for (int i = 0; ; i = this.mRecord.hashCode())
      return i;
  }

  public boolean isChecked()
  {
    return IMPL.isChecked(this.mRecord);
  }

  public boolean isEnabled()
  {
    return IMPL.isEnabled(this.mRecord);
  }

  public boolean isFullScreen()
  {
    return IMPL.isFullScreen(this.mRecord);
  }

  public boolean isPassword()
  {
    return IMPL.isPassword(this.mRecord);
  }

  public boolean isScrollable()
  {
    return IMPL.isScrollable(this.mRecord);
  }

  public void recycle()
  {
    IMPL.recycle(this.mRecord);
  }

  public void setAddedCount(int paramInt)
  {
    IMPL.setAddedCount(this.mRecord, paramInt);
  }

  public void setBeforeText(CharSequence paramCharSequence)
  {
    IMPL.setBeforeText(this.mRecord, paramCharSequence);
  }

  public void setChecked(boolean paramBoolean)
  {
    IMPL.setChecked(this.mRecord, paramBoolean);
  }

  public void setClassName(CharSequence paramCharSequence)
  {
    IMPL.setClassName(this.mRecord, paramCharSequence);
  }

  public void setContentDescription(CharSequence paramCharSequence)
  {
    IMPL.setContentDescription(this.mRecord, paramCharSequence);
  }

  public void setCurrentItemIndex(int paramInt)
  {
    IMPL.setCurrentItemIndex(this.mRecord, paramInt);
  }

  public void setEnabled(boolean paramBoolean)
  {
    IMPL.setEnabled(this.mRecord, paramBoolean);
  }

  public void setFromIndex(int paramInt)
  {
    IMPL.setFromIndex(this.mRecord, paramInt);
  }

  public void setFullScreen(boolean paramBoolean)
  {
    IMPL.setFullScreen(this.mRecord, paramBoolean);
  }

  public void setItemCount(int paramInt)
  {
    IMPL.setItemCount(this.mRecord, paramInt);
  }

  public void setMaxScrollX(int paramInt)
  {
    IMPL.setMaxScrollX(this.mRecord, paramInt);
  }

  public void setMaxScrollY(int paramInt)
  {
    IMPL.setMaxScrollY(this.mRecord, paramInt);
  }

  public void setParcelableData(Parcelable paramParcelable)
  {
    IMPL.setParcelableData(this.mRecord, paramParcelable);
  }

  public void setPassword(boolean paramBoolean)
  {
    IMPL.setPassword(this.mRecord, paramBoolean);
  }

  public void setRemovedCount(int paramInt)
  {
    IMPL.setRemovedCount(this.mRecord, paramInt);
  }

  public void setScrollX(int paramInt)
  {
    IMPL.setScrollX(this.mRecord, paramInt);
  }

  public void setScrollY(int paramInt)
  {
    IMPL.setScrollY(this.mRecord, paramInt);
  }

  public void setScrollable(boolean paramBoolean)
  {
    IMPL.setScrollable(this.mRecord, paramBoolean);
  }

  public void setSource(View paramView)
  {
    IMPL.setSource(this.mRecord, paramView);
  }

  public void setSource(View paramView, int paramInt)
  {
    IMPL.setSource(this.mRecord, paramView, paramInt);
  }

  public void setToIndex(int paramInt)
  {
    IMPL.setToIndex(this.mRecord, paramInt);
  }

  static abstract interface AccessibilityRecordImpl
  {
    public abstract int getAddedCount(Object paramObject);

    public abstract CharSequence getBeforeText(Object paramObject);

    public abstract CharSequence getClassName(Object paramObject);

    public abstract CharSequence getContentDescription(Object paramObject);

    public abstract int getCurrentItemIndex(Object paramObject);

    public abstract int getFromIndex(Object paramObject);

    public abstract int getItemCount(Object paramObject);

    public abstract int getMaxScrollX(Object paramObject);

    public abstract int getMaxScrollY(Object paramObject);

    public abstract Parcelable getParcelableData(Object paramObject);

    public abstract int getRemovedCount(Object paramObject);

    public abstract int getScrollX(Object paramObject);

    public abstract int getScrollY(Object paramObject);

    public abstract AccessibilityNodeInfoCompat getSource(Object paramObject);

    public abstract List<CharSequence> getText(Object paramObject);

    public abstract int getToIndex(Object paramObject);

    public abstract int getWindowId(Object paramObject);

    public abstract boolean isChecked(Object paramObject);

    public abstract boolean isEnabled(Object paramObject);

    public abstract boolean isFullScreen(Object paramObject);

    public abstract boolean isPassword(Object paramObject);

    public abstract boolean isScrollable(Object paramObject);

    public abstract Object obtain();

    public abstract Object obtain(Object paramObject);

    public abstract void recycle(Object paramObject);

    public abstract void setAddedCount(Object paramObject, int paramInt);

    public abstract void setBeforeText(Object paramObject, CharSequence paramCharSequence);

    public abstract void setChecked(Object paramObject, boolean paramBoolean);

    public abstract void setClassName(Object paramObject, CharSequence paramCharSequence);

    public abstract void setContentDescription(Object paramObject, CharSequence paramCharSequence);

    public abstract void setCurrentItemIndex(Object paramObject, int paramInt);

    public abstract void setEnabled(Object paramObject, boolean paramBoolean);

    public abstract void setFromIndex(Object paramObject, int paramInt);

    public abstract void setFullScreen(Object paramObject, boolean paramBoolean);

    public abstract void setItemCount(Object paramObject, int paramInt);

    public abstract void setMaxScrollX(Object paramObject, int paramInt);

    public abstract void setMaxScrollY(Object paramObject, int paramInt);

    public abstract void setParcelableData(Object paramObject, Parcelable paramParcelable);

    public abstract void setPassword(Object paramObject, boolean paramBoolean);

    public abstract void setRemovedCount(Object paramObject, int paramInt);

    public abstract void setScrollX(Object paramObject, int paramInt);

    public abstract void setScrollY(Object paramObject, int paramInt);

    public abstract void setScrollable(Object paramObject, boolean paramBoolean);

    public abstract void setSource(Object paramObject, View paramView);

    public abstract void setSource(Object paramObject, View paramView, int paramInt);

    public abstract void setToIndex(Object paramObject, int paramInt);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.accessibility.AccessibilityRecordCompat
 * JD-Core Version:    0.6.0
 */