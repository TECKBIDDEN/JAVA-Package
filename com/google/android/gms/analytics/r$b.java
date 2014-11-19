package com.google.android.gms.analytics;

import com.google.android.gms.internal.ju;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

class r$b extends TimerTask
{
  private r$b(r paramr)
  {
  }

  public void run()
  {
    if ((r.b(this.yF) == r.a.yI) && (r.e(this.yF).isEmpty()) && (r.f(this.yF) + r.g(this.yF) < r.h(this.yF).elapsedRealtime()))
    {
      z.V("Disconnecting due to inactivity");
      r.i(this.yF);
    }
    while (true)
    {
      return;
      r.j(this.yF).schedule(new b(this.yF), r.g(this.yF));
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.r.b
 * JD-Core Version:    0.6.0
 */