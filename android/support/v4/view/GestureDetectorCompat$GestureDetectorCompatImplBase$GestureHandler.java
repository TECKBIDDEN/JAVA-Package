package android.support.v4.view;

import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;

class GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler extends Handler
{
  GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler(GestureDetectorCompat.GestureDetectorCompatImplBase paramGestureDetectorCompatImplBase)
  {
  }

  GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler(GestureDetectorCompat.GestureDetectorCompatImplBase paramGestureDetectorCompatImplBase, Handler paramHandler)
  {
    super(paramHandler.getLooper());
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      throw new RuntimeException("Unknown message " + paramMessage);
    case 1:
      GestureDetectorCompat.GestureDetectorCompatImplBase.access$100(this.this$0).onShowPress(GestureDetectorCompat.GestureDetectorCompatImplBase.access$000(this.this$0));
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      GestureDetectorCompat.GestureDetectorCompatImplBase.access$200(this.this$0);
      continue;
      if (GestureDetectorCompat.GestureDetectorCompatImplBase.access$300(this.this$0) == null)
        continue;
      if (!GestureDetectorCompat.GestureDetectorCompatImplBase.access$400(this.this$0))
      {
        GestureDetectorCompat.GestureDetectorCompatImplBase.access$300(this.this$0).onSingleTapConfirmed(GestureDetectorCompat.GestureDetectorCompatImplBase.access$000(this.this$0));
        continue;
      }
      GestureDetectorCompat.GestureDetectorCompatImplBase.access$502(this.this$0, true);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImplBase.GestureHandler
 * JD-Core Version:    0.6.0
 */