package com.google.android.gms.analytics;

import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

abstract interface f
{
  public abstract void dI();

  public abstract void dO();

  public abstract LinkedBlockingQueue<Runnable> dP();

  public abstract void dispatch();

  public abstract Thread getThread();

  public abstract void u(Map<String, String> paramMap);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.f
 * JD-Core Version:    0.6.0
 */