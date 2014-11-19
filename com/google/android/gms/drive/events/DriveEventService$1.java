package com.google.android.gms.drive.events;

import android.os.Looper;
import com.google.android.gms.drive.internal.v;
import java.util.concurrent.CountDownLatch;

class DriveEventService$1 extends Thread
{
  public void run()
  {
    try
    {
      Looper.prepare();
      this.NR.NO = new DriveEventService.a(this.NR);
      this.NQ.countDown();
      v.n("DriveEventService", "Bound and starting loop");
      Looper.loop();
      v.n("DriveEventService", "Finished loop");
      return;
    }
    finally
    {
      DriveEventService.b(this.NR).countDown();
    }
    throw localObject;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.events.DriveEventService.1
 * JD-Core Version:    0.6.0
 */