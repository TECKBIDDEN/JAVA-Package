package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

class CursorAdapter$ChangeObserver extends ContentObserver
{
  public CursorAdapter$ChangeObserver(CursorAdapter paramCursorAdapter)
  {
    super(new Handler());
  }

  public boolean deliverSelfNotifications()
  {
    return true;
  }

  public void onChange(boolean paramBoolean)
  {
    this.this$0.onContentChanged();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.CursorAdapter.ChangeObserver
 * JD-Core Version:    0.6.0
 */