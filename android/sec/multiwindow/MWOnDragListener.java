package android.sec.multiwindow;

import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.View.OnDragListener;

public abstract class MWOnDragListener
  implements View.OnDragListener
{
  public static final String TAG = "MWOnDragListener";

  public boolean onDrag(View paramView, DragEvent paramDragEvent)
  {
    int i = 1;
    switch (paramDragEvent.getAction())
    {
    default:
      Log.w("MWOnDragListener", "Unknown action type received by OnDragListener.");
      i = 0;
    case 1:
    case 2:
    case 5:
    case 6:
    case 3:
    case 4:
    }
    while (true)
    {
      return i;
      onDrop(paramDragEvent);
      paramView.invalidate();
      continue;
      paramView.invalidate();
    }
  }

  public abstract void onDrop(DragEvent paramDragEvent);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     android.sec.multiwindow.MWOnDragListener
 * JD-Core Version:    0.6.0
 */