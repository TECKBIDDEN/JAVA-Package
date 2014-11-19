package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ViewGroupCompat
{
  static final ViewGroupCompatImpl IMPL;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
      IMPL = new ViewGroupCompat.ViewGroupCompatIcsImpl();
    while (true)
    {
      return;
      if (i >= 11)
      {
        IMPL = new ViewGroupCompat.ViewGroupCompatHCImpl();
        continue;
      }
      IMPL = new ViewGroupCompat.ViewGroupCompatStubImpl();
    }
  }

  public static boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return IMPL.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }

  public static void setMotionEventSplittingEnabled(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    IMPL.setMotionEventSplittingEnabled(paramViewGroup, paramBoolean);
  }

  static abstract interface ViewGroupCompatImpl
  {
    public abstract boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent);

    public abstract void setMotionEventSplittingEnabled(ViewGroup paramViewGroup, boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewGroupCompat
 * JD-Core Version:    0.6.0
 */