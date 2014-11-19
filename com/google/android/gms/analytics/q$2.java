package com.google.android.gms.analytics;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class q$2
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    if ((1 == paramMessage.what) && (q.ef().equals(paramMessage.obj)))
    {
      t.eq().B(true);
      this.yp.dispatchLocalHits();
      t.eq().B(false);
      if ((q.b(this.yp) > 0) && (!q.c(this.yp)))
        q.d(this.yp).sendMessageDelayed(q.d(this.yp).obtainMessage(1, q.ef()), 1000 * q.b(this.yp));
    }
    return true;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.q.2
 * JD-Core Version:    0.6.0
 */