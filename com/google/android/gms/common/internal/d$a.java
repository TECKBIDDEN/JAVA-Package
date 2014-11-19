package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class d$a extends Handler
{
  public d$a(d paramd, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    if ((paramMessage.what == 1) && (!this.Lx.isConnecting()))
    {
      d.b localb2 = (d.b)paramMessage.obj;
      localb2.gT();
      localb2.unregister();
    }
    while (true)
    {
      return;
      if (paramMessage.what == 3)
      {
        d.a(this.Lx).b(new ConnectionResult(((Integer)paramMessage.obj).intValue(), null));
        continue;
      }
      if (paramMessage.what == 4)
      {
        d.a(this.Lx, 1);
        d.a(this.Lx, null);
        d.a(this.Lx).aB(((Integer)paramMessage.obj).intValue());
        continue;
      }
      if ((paramMessage.what == 2) && (!this.Lx.isConnected()))
      {
        d.b localb1 = (d.b)paramMessage.obj;
        localb1.gT();
        localb1.unregister();
        continue;
      }
      if ((paramMessage.what == 2) || (paramMessage.what == 1))
      {
        ((d.b)paramMessage.obj).gU();
        continue;
      }
      Log.wtf("GmsClient", "Don't know how to handle this message.");
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.d.a
 * JD-Core Version:    0.6.0
 */