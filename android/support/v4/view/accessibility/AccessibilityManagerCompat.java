package android.support.v4.view.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

public class AccessibilityManagerCompat
{
  private static final AccessibilityManagerVersionImpl IMPL;

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
      IMPL = new AccessibilityManagerCompat.AccessibilityManagerIcsImpl();
    while (true)
    {
      return;
      IMPL = new AccessibilityManagerCompat.AccessibilityManagerStubImpl();
    }
  }

  public static boolean addAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, AccessibilityStateChangeListenerCompat paramAccessibilityStateChangeListenerCompat)
  {
    return IMPL.addAccessibilityStateChangeListener(paramAccessibilityManager, paramAccessibilityStateChangeListenerCompat);
  }

  public static List<AccessibilityServiceInfo> getEnabledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager, int paramInt)
  {
    return IMPL.getEnabledAccessibilityServiceList(paramAccessibilityManager, paramInt);
  }

  public static List<AccessibilityServiceInfo> getInstalledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager)
  {
    return IMPL.getInstalledAccessibilityServiceList(paramAccessibilityManager);
  }

  public static boolean isTouchExplorationEnabled(AccessibilityManager paramAccessibilityManager)
  {
    return IMPL.isTouchExplorationEnabled(paramAccessibilityManager);
  }

  public static boolean removeAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, AccessibilityStateChangeListenerCompat paramAccessibilityStateChangeListenerCompat)
  {
    return IMPL.removeAccessibilityStateChangeListener(paramAccessibilityManager, paramAccessibilityStateChangeListenerCompat);
  }

  static abstract interface AccessibilityManagerVersionImpl
  {
    public abstract boolean addAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat paramAccessibilityStateChangeListenerCompat);

    public abstract List<AccessibilityServiceInfo> getEnabledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager, int paramInt);

    public abstract List<AccessibilityServiceInfo> getInstalledAccessibilityServiceList(AccessibilityManager paramAccessibilityManager);

    public abstract boolean isTouchExplorationEnabled(AccessibilityManager paramAccessibilityManager);

    public abstract Object newAccessiblityStateChangeListener(AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat paramAccessibilityStateChangeListenerCompat);

    public abstract boolean removeAccessibilityStateChangeListener(AccessibilityManager paramAccessibilityManager, AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat paramAccessibilityStateChangeListenerCompat);
  }

  public static abstract class AccessibilityStateChangeListenerCompat
  {
    final Object mListener = AccessibilityManagerCompat.IMPL.newAccessiblityStateChangeListener(this);

    public abstract void onAccessibilityStateChanged(boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.accessibility.AccessibilityManagerCompat
 * JD-Core Version:    0.6.0
 */