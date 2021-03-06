package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class AccessibilityNodeInfoCompat
{
  public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
  public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
  public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
  public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
  public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
  public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
  public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
  public static final int ACTION_CLEAR_FOCUS = 2;
  public static final int ACTION_CLEAR_SELECTION = 8;
  public static final int ACTION_CLICK = 16;
  public static final int ACTION_COPY = 16384;
  public static final int ACTION_CUT = 65536;
  public static final int ACTION_FOCUS = 1;
  public static final int ACTION_LONG_CLICK = 32;
  public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
  public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
  public static final int ACTION_PASTE = 32768;
  public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
  public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
  public static final int ACTION_SCROLL_BACKWARD = 8192;
  public static final int ACTION_SCROLL_FORWARD = 4096;
  public static final int ACTION_SELECT = 4;
  public static final int ACTION_SET_SELECTION = 131072;
  public static final int FOCUS_ACCESSIBILITY = 2;
  public static final int FOCUS_INPUT = 1;
  private static final AccessibilityNodeInfoImpl IMPL;
  public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
  public static final int MOVEMENT_GRANULARITY_LINE = 4;
  public static final int MOVEMENT_GRANULARITY_PAGE = 16;
  public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
  public static final int MOVEMENT_GRANULARITY_WORD = 2;
  private final Object mInfo;

  static
  {
    if ("JellyBeanMR2".equals(Build.VERSION.CODENAME))
      IMPL = new AccessibilityNodeInfoCompat.AccessibilityNodeInfoJellybeanMr2Impl();
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 16)
      {
        IMPL = new AccessibilityNodeInfoCompat.AccessibilityNodeInfoJellybeanImpl();
        continue;
      }
      if (Build.VERSION.SDK_INT >= 14)
      {
        IMPL = new AccessibilityNodeInfoCompat.AccessibilityNodeInfoIcsImpl();
        continue;
      }
      IMPL = new AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl();
    }
  }

  public AccessibilityNodeInfoCompat(Object paramObject)
  {
    this.mInfo = paramObject;
  }

  private static String getActionSymbolicName(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "ACTION_UNKNOWN";
    case 1:
    case 2:
    case 4:
    case 8:
    case 16:
    case 32:
    case 64:
    case 128:
    case 256:
    case 512:
    case 1024:
    case 2048:
    case 4096:
    case 8192:
    case 65536:
    case 16384:
    case 32768:
    case 131072:
    }
    while (true)
    {
      return str;
      str = "ACTION_FOCUS";
      continue;
      str = "ACTION_CLEAR_FOCUS";
      continue;
      str = "ACTION_SELECT";
      continue;
      str = "ACTION_CLEAR_SELECTION";
      continue;
      str = "ACTION_CLICK";
      continue;
      str = "ACTION_LONG_CLICK";
      continue;
      str = "ACTION_ACCESSIBILITY_FOCUS";
      continue;
      str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
      continue;
      str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
      continue;
      str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
      continue;
      str = "ACTION_NEXT_HTML_ELEMENT";
      continue;
      str = "ACTION_PREVIOUS_HTML_ELEMENT";
      continue;
      str = "ACTION_SCROLL_FORWARD";
      continue;
      str = "ACTION_SCROLL_BACKWARD";
      continue;
      str = "ACTION_CUT";
      continue;
      str = "ACTION_COPY";
      continue;
      str = "ACTION_PASTE";
      continue;
      str = "ACTION_SET_SELECTION";
    }
  }

  public static AccessibilityNodeInfoCompat obtain()
  {
    return wrapNonNullInstance(IMPL.obtain());
  }

  public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    return wrapNonNullInstance(IMPL.obtain(paramAccessibilityNodeInfoCompat.mInfo));
  }

  public static AccessibilityNodeInfoCompat obtain(View paramView)
  {
    return wrapNonNullInstance(IMPL.obtain(paramView));
  }

  public static AccessibilityNodeInfoCompat obtain(View paramView, int paramInt)
  {
    return wrapNonNullInstance(IMPL.obtain(paramView, paramInt));
  }

  static AccessibilityNodeInfoCompat wrapNonNullInstance(Object paramObject)
  {
    if (paramObject != null);
    for (AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(paramObject); ; localAccessibilityNodeInfoCompat = null)
      return localAccessibilityNodeInfoCompat;
  }

  public void addAction(int paramInt)
  {
    IMPL.addAction(this.mInfo, paramInt);
  }

  public void addChild(View paramView)
  {
    IMPL.addChild(this.mInfo, paramView);
  }

  public void addChild(View paramView, int paramInt)
  {
    IMPL.addChild(this.mInfo, paramView, paramInt);
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
      AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat)paramObject;
      if (this.mInfo == null)
      {
        if (localAccessibilityNodeInfoCompat.mInfo == null)
          continue;
        i = 0;
        continue;
      }
      if (this.mInfo.equals(localAccessibilityNodeInfoCompat.mInfo))
        continue;
      i = 0;
    }
  }

  public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    List localList = IMPL.findAccessibilityNodeInfosByText(this.mInfo, paramString);
    int i = localList.size();
    for (int j = 0; j < i; j++)
      localArrayList.add(new AccessibilityNodeInfoCompat(localList.get(j)));
    return localArrayList;
  }

  public AccessibilityNodeInfoCompat findFocus(int paramInt)
  {
    return wrapNonNullInstance(IMPL.findFocus(this.mInfo, paramInt));
  }

  public AccessibilityNodeInfoCompat focusSearch(int paramInt)
  {
    return wrapNonNullInstance(IMPL.focusSearch(this.mInfo, paramInt));
  }

  public int getActions()
  {
    return IMPL.getActions(this.mInfo);
  }

  public void getBoundsInParent(Rect paramRect)
  {
    IMPL.getBoundsInParent(this.mInfo, paramRect);
  }

  public void getBoundsInScreen(Rect paramRect)
  {
    IMPL.getBoundsInScreen(this.mInfo, paramRect);
  }

  public AccessibilityNodeInfoCompat getChild(int paramInt)
  {
    return wrapNonNullInstance(IMPL.getChild(this.mInfo, paramInt));
  }

  public int getChildCount()
  {
    return IMPL.getChildCount(this.mInfo);
  }

  public CharSequence getClassName()
  {
    return IMPL.getClassName(this.mInfo);
  }

  public CharSequence getContentDescription()
  {
    return IMPL.getContentDescription(this.mInfo);
  }

  public Object getInfo()
  {
    return this.mInfo;
  }

  public int getMovementGranularities()
  {
    return IMPL.getMovementGranularities(this.mInfo);
  }

  public CharSequence getPackageName()
  {
    return IMPL.getPackageName(this.mInfo);
  }

  public AccessibilityNodeInfoCompat getParent()
  {
    return wrapNonNullInstance(IMPL.getParent(this.mInfo));
  }

  public CharSequence getText()
  {
    return IMPL.getText(this.mInfo);
  }

  public String getViewIdResourceName()
  {
    return IMPL.getViewIdResourceName(this.mInfo);
  }

  public int getWindowId()
  {
    return IMPL.getWindowId(this.mInfo);
  }

  public int hashCode()
  {
    if (this.mInfo == null);
    for (int i = 0; ; i = this.mInfo.hashCode())
      return i;
  }

  public boolean isAccessibilityFocused()
  {
    return IMPL.isAccessibilityFocused(this.mInfo);
  }

  public boolean isCheckable()
  {
    return IMPL.isCheckable(this.mInfo);
  }

  public boolean isChecked()
  {
    return IMPL.isChecked(this.mInfo);
  }

  public boolean isClickable()
  {
    return IMPL.isClickable(this.mInfo);
  }

  public boolean isEnabled()
  {
    return IMPL.isEnabled(this.mInfo);
  }

  public boolean isFocusable()
  {
    return IMPL.isFocusable(this.mInfo);
  }

  public boolean isFocused()
  {
    return IMPL.isFocused(this.mInfo);
  }

  public boolean isLongClickable()
  {
    return IMPL.isLongClickable(this.mInfo);
  }

  public boolean isPassword()
  {
    return IMPL.isPassword(this.mInfo);
  }

  public boolean isScrollable()
  {
    return IMPL.isScrollable(this.mInfo);
  }

  public boolean isSelected()
  {
    return IMPL.isSelected(this.mInfo);
  }

  public boolean isVisibleToUser()
  {
    return IMPL.isVisibleToUser(this.mInfo);
  }

  public boolean performAction(int paramInt)
  {
    return IMPL.performAction(this.mInfo, paramInt);
  }

  public boolean performAction(int paramInt, Bundle paramBundle)
  {
    return IMPL.performAction(this.mInfo, paramInt, paramBundle);
  }

  public void recycle()
  {
    IMPL.recycle(this.mInfo);
  }

  public void setAccessibilityFocused(boolean paramBoolean)
  {
    IMPL.setAccessibilityFocused(this.mInfo, paramBoolean);
  }

  public void setBoundsInParent(Rect paramRect)
  {
    IMPL.setBoundsInParent(this.mInfo, paramRect);
  }

  public void setBoundsInScreen(Rect paramRect)
  {
    IMPL.setBoundsInScreen(this.mInfo, paramRect);
  }

  public void setCheckable(boolean paramBoolean)
  {
    IMPL.setCheckable(this.mInfo, paramBoolean);
  }

  public void setChecked(boolean paramBoolean)
  {
    IMPL.setChecked(this.mInfo, paramBoolean);
  }

  public void setClassName(CharSequence paramCharSequence)
  {
    IMPL.setClassName(this.mInfo, paramCharSequence);
  }

  public void setClickable(boolean paramBoolean)
  {
    IMPL.setClickable(this.mInfo, paramBoolean);
  }

  public void setContentDescription(CharSequence paramCharSequence)
  {
    IMPL.setContentDescription(this.mInfo, paramCharSequence);
  }

  public void setEnabled(boolean paramBoolean)
  {
    IMPL.setEnabled(this.mInfo, paramBoolean);
  }

  public void setFocusable(boolean paramBoolean)
  {
    IMPL.setFocusable(this.mInfo, paramBoolean);
  }

  public void setFocused(boolean paramBoolean)
  {
    IMPL.setFocused(this.mInfo, paramBoolean);
  }

  public void setLongClickable(boolean paramBoolean)
  {
    IMPL.setLongClickable(this.mInfo, paramBoolean);
  }

  public void setMovementGranularities(int paramInt)
  {
    IMPL.setMovementGranularities(this.mInfo, paramInt);
  }

  public void setPackageName(CharSequence paramCharSequence)
  {
    IMPL.setPackageName(this.mInfo, paramCharSequence);
  }

  public void setParent(View paramView)
  {
    IMPL.setParent(this.mInfo, paramView);
  }

  public void setParent(View paramView, int paramInt)
  {
    IMPL.setParent(this.mInfo, paramView, paramInt);
  }

  public void setPassword(boolean paramBoolean)
  {
    IMPL.setPassword(this.mInfo, paramBoolean);
  }

  public void setScrollable(boolean paramBoolean)
  {
    IMPL.setScrollable(this.mInfo, paramBoolean);
  }

  public void setSelected(boolean paramBoolean)
  {
    IMPL.setSelected(this.mInfo, paramBoolean);
  }

  public void setSource(View paramView)
  {
    IMPL.setSource(this.mInfo, paramView);
  }

  public void setSource(View paramView, int paramInt)
  {
    IMPL.setSource(this.mInfo, paramView, paramInt);
  }

  public void setText(CharSequence paramCharSequence)
  {
    IMPL.setText(this.mInfo, paramCharSequence);
  }

  public void setViewIdResourceName(String paramString)
  {
    IMPL.setViewIdResourceName(this.mInfo, paramString);
  }

  public void setVisibleToUser(boolean paramBoolean)
  {
    IMPL.setVisibleToUser(this.mInfo, paramBoolean);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Rect localRect = new Rect();
    getBoundsInParent(localRect);
    localStringBuilder.append("; boundsInParent: " + localRect);
    getBoundsInScreen(localRect);
    localStringBuilder.append("; boundsInScreen: " + localRect);
    localStringBuilder.append("; packageName: ").append(getPackageName());
    localStringBuilder.append("; className: ").append(getClassName());
    localStringBuilder.append("; text: ").append(getText());
    localStringBuilder.append("; contentDescription: ").append(getContentDescription());
    localStringBuilder.append("; viewId: ").append(getViewIdResourceName());
    localStringBuilder.append("; checkable: ").append(isCheckable());
    localStringBuilder.append("; checked: ").append(isChecked());
    localStringBuilder.append("; focusable: ").append(isFocusable());
    localStringBuilder.append("; focused: ").append(isFocused());
    localStringBuilder.append("; selected: ").append(isSelected());
    localStringBuilder.append("; clickable: ").append(isClickable());
    localStringBuilder.append("; longClickable: ").append(isLongClickable());
    localStringBuilder.append("; enabled: ").append(isEnabled());
    localStringBuilder.append("; password: ").append(isPassword());
    localStringBuilder.append("; scrollable: " + isScrollable());
    localStringBuilder.append("; [");
    int i = getActions();
    while (i != 0)
    {
      int j = 1 << Integer.numberOfTrailingZeros(i);
      i &= (j ^ 0xFFFFFFFF);
      localStringBuilder.append(getActionSymbolicName(j));
      if (i == 0)
        continue;
      localStringBuilder.append(", ");
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }

  static abstract interface AccessibilityNodeInfoImpl
  {
    public abstract void addAction(Object paramObject, int paramInt);

    public abstract void addChild(Object paramObject, View paramView);

    public abstract void addChild(Object paramObject, View paramView, int paramInt);

    public abstract List<Object> findAccessibilityNodeInfosByText(Object paramObject, String paramString);

    public abstract Object findFocus(Object paramObject, int paramInt);

    public abstract Object focusSearch(Object paramObject, int paramInt);

    public abstract int getActions(Object paramObject);

    public abstract void getBoundsInParent(Object paramObject, Rect paramRect);

    public abstract void getBoundsInScreen(Object paramObject, Rect paramRect);

    public abstract Object getChild(Object paramObject, int paramInt);

    public abstract int getChildCount(Object paramObject);

    public abstract CharSequence getClassName(Object paramObject);

    public abstract CharSequence getContentDescription(Object paramObject);

    public abstract int getMovementGranularities(Object paramObject);

    public abstract CharSequence getPackageName(Object paramObject);

    public abstract Object getParent(Object paramObject);

    public abstract CharSequence getText(Object paramObject);

    public abstract String getViewIdResourceName(Object paramObject);

    public abstract int getWindowId(Object paramObject);

    public abstract boolean isAccessibilityFocused(Object paramObject);

    public abstract boolean isCheckable(Object paramObject);

    public abstract boolean isChecked(Object paramObject);

    public abstract boolean isClickable(Object paramObject);

    public abstract boolean isEnabled(Object paramObject);

    public abstract boolean isFocusable(Object paramObject);

    public abstract boolean isFocused(Object paramObject);

    public abstract boolean isLongClickable(Object paramObject);

    public abstract boolean isPassword(Object paramObject);

    public abstract boolean isScrollable(Object paramObject);

    public abstract boolean isSelected(Object paramObject);

    public abstract boolean isVisibleToUser(Object paramObject);

    public abstract Object obtain();

    public abstract Object obtain(View paramView);

    public abstract Object obtain(View paramView, int paramInt);

    public abstract Object obtain(Object paramObject);

    public abstract boolean performAction(Object paramObject, int paramInt);

    public abstract boolean performAction(Object paramObject, int paramInt, Bundle paramBundle);

    public abstract void recycle(Object paramObject);

    public abstract void setAccessibilityFocused(Object paramObject, boolean paramBoolean);

    public abstract void setBoundsInParent(Object paramObject, Rect paramRect);

    public abstract void setBoundsInScreen(Object paramObject, Rect paramRect);

    public abstract void setCheckable(Object paramObject, boolean paramBoolean);

    public abstract void setChecked(Object paramObject, boolean paramBoolean);

    public abstract void setClassName(Object paramObject, CharSequence paramCharSequence);

    public abstract void setClickable(Object paramObject, boolean paramBoolean);

    public abstract void setContentDescription(Object paramObject, CharSequence paramCharSequence);

    public abstract void setEnabled(Object paramObject, boolean paramBoolean);

    public abstract void setFocusable(Object paramObject, boolean paramBoolean);

    public abstract void setFocused(Object paramObject, boolean paramBoolean);

    public abstract void setLongClickable(Object paramObject, boolean paramBoolean);

    public abstract void setMovementGranularities(Object paramObject, int paramInt);

    public abstract void setPackageName(Object paramObject, CharSequence paramCharSequence);

    public abstract void setParent(Object paramObject, View paramView);

    public abstract void setParent(Object paramObject, View paramView, int paramInt);

    public abstract void setPassword(Object paramObject, boolean paramBoolean);

    public abstract void setScrollable(Object paramObject, boolean paramBoolean);

    public abstract void setSelected(Object paramObject, boolean paramBoolean);

    public abstract void setSource(Object paramObject, View paramView);

    public abstract void setSource(Object paramObject, View paramView, int paramInt);

    public abstract void setText(Object paramObject, CharSequence paramCharSequence);

    public abstract void setViewIdResourceName(Object paramObject, String paramString);

    public abstract void setVisibleToUser(Object paramObject, boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.accessibility.AccessibilityNodeInfoCompat
 * JD-Core Version:    0.6.0
 */