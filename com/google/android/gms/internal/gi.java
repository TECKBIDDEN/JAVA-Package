package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

@ez
public final class gi
{
  private static final ThreadFactory wh = new gi.3();
  private static final ExecutorService wi = Executors.newFixedThreadPool(10, wh);

  public static Future<Void> a(Runnable paramRunnable)
  {
    return submit(new gi.1(paramRunnable));
  }

  public static <T> Future<T> submit(Callable<T> paramCallable)
  {
    try
    {
      Future localFuture = wi.submit(new gi.2(paramCallable));
      localObject = localFuture;
      return localObject;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      while (true)
      {
        gs.d("Thread execution is rejected.", localRejectedExecutionException);
        Object localObject = new gl(null);
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gi
 * JD-Core Version:    0.6.0
 */