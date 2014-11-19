package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ez
public class gk<T>
  implements Future<T>
{
  private final Object mw = new Object();
  private boolean pS = false;
  private T wq = null;
  private boolean wr = false;

  // ERROR //
  public void a(T paramT)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 21	com/google/android/gms/internal/gk:mw	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 25	com/google/android/gms/internal/gk:wr	Z
    //   11: ifeq +18 -> 29
    //   14: new 31	java/lang/IllegalStateException
    //   17: dup
    //   18: ldc 33
    //   20: invokespecial 36	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   23: athrow
    //   24: astore_3
    //   25: aload_2
    //   26: monitorexit
    //   27: aload_3
    //   28: athrow
    //   29: aload_0
    //   30: iconst_1
    //   31: putfield 25	com/google/android/gms/internal/gk:wr	Z
    //   34: aload_0
    //   35: aload_1
    //   36: putfield 23	com/google/android/gms/internal/gk:wq	Ljava/lang/Object;
    //   39: aload_0
    //   40: getfield 21	com/google/android/gms/internal/gk:mw	Ljava/lang/Object;
    //   43: invokevirtual 39	java/lang/Object:notifyAll	()V
    //   46: aload_2
    //   47: monitorexit
    //   48: return
    //
    // Exception table:
    //   from	to	target	type
    //   7	27	24	finally
    //   29	48	24	finally
  }

  // ERROR //
  public boolean cancel(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_1
    //   3: ifne +5 -> 8
    //   6: iload_2
    //   7: ireturn
    //   8: aload_0
    //   9: getfield 21	com/google/android/gms/internal/gk:mw	Ljava/lang/Object;
    //   12: astore_3
    //   13: aload_3
    //   14: monitorenter
    //   15: aload_0
    //   16: getfield 25	com/google/android/gms/internal/gk:wr	Z
    //   19: ifeq +15 -> 34
    //   22: aload_3
    //   23: monitorexit
    //   24: goto -18 -> 6
    //   27: astore 4
    //   29: aload_3
    //   30: monitorexit
    //   31: aload 4
    //   33: athrow
    //   34: aload_0
    //   35: iconst_1
    //   36: putfield 27	com/google/android/gms/internal/gk:pS	Z
    //   39: aload_0
    //   40: iconst_1
    //   41: putfield 25	com/google/android/gms/internal/gk:wr	Z
    //   44: aload_0
    //   45: getfield 21	com/google/android/gms/internal/gk:mw	Ljava/lang/Object;
    //   48: invokevirtual 39	java/lang/Object:notifyAll	()V
    //   51: aload_3
    //   52: monitorexit
    //   53: iconst_1
    //   54: istore_2
    //   55: goto -49 -> 6
    //
    // Exception table:
    //   from	to	target	type
    //   15	31	27	finally
    //   34	53	27	finally
  }

  public T get()
  {
    synchronized (this.mw)
    {
      boolean bool = this.wr;
      if (bool);
    }
    try
    {
      this.mw.wait();
      label23: if (this.pS)
      {
        throw new CancellationException("CallbackFuture was cancelled.");
        localObject2 = finally;
        monitorexit;
        throw localObject2;
      }
      Object localObject3 = this.wq;
      monitorexit;
      return localObject3;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label23;
    }
  }

  public T get(long paramLong, TimeUnit paramTimeUnit)
    throws TimeoutException
  {
    synchronized (this.mw)
    {
      boolean bool = this.wr;
      if (bool);
    }
    try
    {
      long l = paramTimeUnit.toMillis(paramLong);
      if (l != 0L)
        this.mw.wait(l);
      label43: if (!this.wr)
      {
        throw new TimeoutException("CallbackFuture timed out.");
        localObject2 = finally;
        monitorexit;
        throw localObject2;
      }
      if (this.pS)
        throw new CancellationException("CallbackFuture was cancelled.");
      Object localObject3 = this.wq;
      monitorexit;
      return localObject3;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label43;
    }
  }

  public boolean isCancelled()
  {
    synchronized (this.mw)
    {
      boolean bool = this.pS;
      return bool;
    }
  }

  public boolean isDone()
  {
    synchronized (this.mw)
    {
      boolean bool = this.wr;
      return bool;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gk
 * JD-Core Version:    0.6.0
 */