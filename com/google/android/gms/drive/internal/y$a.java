package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.CompletionListener;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.DriveEvent.Listener;
import com.google.android.gms.drive.events.c;

class y$a extends Handler
{
  private final Context mContext;

  private y$a(Looper paramLooper, Context paramContext)
  {
    super(paramLooper);
    this.mContext = paramContext;
  }

  public void a(c paramc, DriveEvent paramDriveEvent)
  {
    sendMessage(obtainMessage(1, new Pair(paramc, paramDriveEvent)));
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      v.e(this.mContext, "EventCallback", "Don't know how to handle this event");
    case 1:
    }
    while (true)
    {
      return;
      Pair localPair = (Pair)paramMessage.obj;
      c localc = (c)localPair.first;
      DriveEvent localDriveEvent = (DriveEvent)localPair.second;
      switch (localDriveEvent.getType())
      {
      default:
        v.p("EventCallback", "Unexpected event: " + localDriveEvent);
        break;
      case 1:
        if ((localc instanceof DriveEvent.Listener))
        {
          ((DriveEvent.Listener)localc).onEvent((ChangeEvent)localDriveEvent);
          continue;
        }
        ((ChangeListener)localc).onChange((ChangeEvent)localDriveEvent);
        break;
      case 2:
        ((CompletionListener)localc).onCompletion((CompletionEvent)localDriveEvent);
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.y.a
 * JD-Core Version:    0.6.0
 */