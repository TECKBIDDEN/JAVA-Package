package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

class gi$3
  implements ThreadFactory
{
  private final AtomicInteger wl = new AtomicInteger(1);

  public Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, "AdWorker #" + this.wl.getAndIncrement());
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gi.3
 * JD-Core Version:    0.6.0
 */