package android.sec.multiwindow;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import java.util.List;

@Deprecated
public abstract interface IMultiWindowManager
{
  public static final int LEFT = 0;
  public static final int RIGHT = 1;
  public static final String SERVICE_NAME = "multiwindow";

  public abstract boolean arrangeWindows(int paramInt);

  public abstract Bitmap capture(ComponentName paramComponentName);

  public abstract boolean exchangeSplitScreens();

  public abstract boolean finishAllWindow();

  public abstract boolean finishAppPid(int paramInt);

  public abstract boolean getMultiLayout();

  public abstract List<ComponentName> getMultiWindowList();

  public abstract List<ComponentName> getMultiWindowList(ComponentName paramComponentName);

  public abstract MultiWindowType getMultiWindowMode();

  public abstract ComponentName getPinupWindow();

  public abstract List<ComponentName> getPinupWindowList();

  public abstract ComponentName getResumedWindow();

  public abstract List<ComponentName> getRunningWindowList();

  public abstract List<ComponentName> getSplitList();

  public abstract List<ComponentName> getVisibleWindowList();

  public abstract IMultiWindow getWindowInstance(ComponentName paramComponentName);

  public abstract IMultiWindow getWindowInstance(Intent paramIntent);

  public abstract boolean isMultiWindow(ComponentName paramComponentName);

  public abstract boolean isPermissionOff();

  public abstract boolean isPinup(ComponentName paramComponentName);

  public abstract boolean isPinup(ComponentName paramComponentName, int paramInt);

  public abstract boolean isRunning(ComponentName paramComponentName);

  public abstract boolean isVisible(ComponentName paramComponentName);

  public abstract boolean notifyFinished(Activity paramActivity);

  public abstract boolean notifyForceFinished(ComponentName paramComponentName);

  public abstract boolean notifySIP(int paramInt);

  public abstract boolean notifyStarted(Activity paramActivity);

  public abstract boolean orientationChangeRestore(ComponentName paramComponentName, int paramInt);

  public abstract boolean postResume(Activity paramActivity);

  public abstract IMultiWindow registerMultiWindow(ComponentName paramComponentName);

  public abstract IMultiWindow registerMultiWindow(ComponentName paramComponentName, int paramInt1, int paramInt2);

  public abstract IMultiWindow registerMultiWindow(ComponentName paramComponentName, int paramInt1, int paramInt2, boolean paramBoolean);

  public abstract IMultiWindow registerMultiWindow(ComponentName paramComponentName, List<Point> paramList);

  public abstract boolean registerMultiWindowPair(ComponentName paramComponentName1, ComponentName paramComponentName2);

  public abstract boolean removeMultiWindow(ComponentName paramComponentName);

  public abstract boolean removeMultiWindowPair(ComponentName paramComponentName1, ComponentName paramComponentName2);

  public abstract Bitmap screenShot(ComponentName paramComponentName);

  public abstract boolean sendCreateAction(Activity paramActivity);

  public abstract boolean sendDestroyAction(Activity paramActivity);

  public abstract boolean sendFinishAction(Activity paramActivity);

  public abstract boolean sendPauseAction(Activity paramActivity);

  public abstract boolean sendResumeAction(Activity paramActivity);

  public abstract boolean sendStartAction(Activity paramActivity);

  public abstract boolean setMultiLayout(boolean paramBoolean);

  public abstract boolean setMultiWindowMode(MultiWindowType paramMultiWindowType);

  public abstract void setPreferenceValue(boolean paramBoolean);

  public abstract void showSwitchWindowGuideDialog(Context paramContext);

  public abstract boolean startLauncher();

  public abstract boolean startLauncher(ComponentName paramComponentName);

  public abstract boolean startLauncher(Context paramContext);

  public abstract boolean startLauncher(Context paramContext, ComponentName paramComponentName);

  public abstract boolean startSplitScreens(ComponentName paramComponentName1, ComponentName paramComponentName2);

  public abstract boolean startSplitScreens(ComponentName paramComponentName, Intent paramIntent);

  public abstract boolean startSplitScreens(Intent paramIntent, ComponentName paramComponentName);

  public abstract boolean startSplitScreensForLauncher(ComponentName paramComponentName1, ComponentName paramComponentName2);

  public abstract boolean unRegisterMultiWindow(ComponentName paramComponentName);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     android.sec.multiwindow.IMultiWindowManager
 * JD-Core Version:    0.6.0
 */