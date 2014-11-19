package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

class b$b extends Handler
{
  b$b(b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
      b.a(this.Jj).lock();
    while (true)
    {
      try
      {
        if ((this.Jj.isConnected()) || (this.Jj.isConnecting()))
          continue;
        boolean bool = b.e(this.Jj);
        if (!bool)
          return;
        b.h(this.Jj);
        this.Jj.connect();
        b.a(this.Jj).unlock();
        continue;
      }
      finally
      {
        b.a(this.Jj).unlock();
      }
      Log.wtf("GoogleApiClientImpl", "Don't know how to handle this message.");
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.b.b
 * JD-Core Version:    0.6.0
 */