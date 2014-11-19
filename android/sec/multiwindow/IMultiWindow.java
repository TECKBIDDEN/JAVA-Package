package android.sec.multiwindow;

import android.content.ComponentName;
import android.graphics.Point;
import android.graphics.Rect;

@Deprecated
public abstract interface IMultiWindow
{
  public abstract boolean finish();

  public abstract boolean finish(int paramInt);

  public abstract boolean fitToHalf(int paramInt);

  public abstract int getHeight();

  public abstract Point getMinimumSize();

  public abstract Rect getRect();

  public abstract Rect getRect(int paramInt);

  public abstract int getWidth();

  public abstract boolean isMaximized();

  public abstract boolean isMaximized(int paramInt);

  public abstract boolean isStartingSplitScreen(ComponentName paramComponentName);

  public abstract boolean maximize();

  public abstract boolean minimize();

  public abstract boolean minimize(int paramInt);

  public abstract boolean pinUp(boolean paramBoolean);

  public abstract boolean pinUp(boolean paramBoolean, int paramInt);

  public abstract boolean relayout(Rect paramRect);

  public abstract boolean restore();

  public abstract boolean restore(int paramInt);

  public abstract boolean setMinimumSize(int paramInt1, int paramInt2);

  public abstract boolean start();
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     android.sec.multiwindow.IMultiWindow
 * JD-Core Version:    0.6.0
 */