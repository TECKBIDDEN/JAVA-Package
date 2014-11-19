package com.google.android.gms.drive.events;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.v;

final class DriveEventService$a extends Handler
{
  DriveEventService$a(DriveEventService paramDriveEventService)
  {
  }

  private Message b(OnEventResponse paramOnEventResponse)
  {
    return obtainMessage(1, paramOnEventResponse);
  }

  private Message hW()
  {
    return obtainMessage(2);
  }

  public void handleMessage(Message paramMessage)
  {
    v.n("DriveEventService", "handleMessage message type:" + paramMessage.what);
    switch (paramMessage.what)
    {
    default:
      v.p("DriveEventService", "Unexpected message type:" + paramMessage.what);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      DriveEventService.a(this.NR, (OnEventResponse)paramMessage.obj);
      continue;
      getLooper().quit();
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.events.DriveEventService.a
 * JD-Core Version:    0.6.0
 */