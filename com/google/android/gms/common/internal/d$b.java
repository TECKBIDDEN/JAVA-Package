package com.google.android.gms.common.internal;

import java.util.ArrayList;

public abstract class d$b<TListener>
{
  private boolean Ly;
  private TListener mListener;

  public d$b(TListener paramTListener)
  {
    Object localObject;
    this.mListener = localObject;
    this.Ly = false;
  }

  protected abstract void g(TListener paramTListener);

  protected abstract void gT();

  // ERROR //
  public void gU()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 24	com/google/android/gms/common/internal/d$b:mListener	Ljava/lang/Object;
    //   6: astore_2
    //   7: aload_0
    //   8: getfield 26	com/google/android/gms/common/internal/d$b:Ly	Z
    //   11: ifeq +33 -> 44
    //   14: ldc 34
    //   16: new 36	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 37	java/lang/StringBuilder:<init>	()V
    //   23: ldc 39
    //   25: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: aload_0
    //   29: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   32: ldc 48
    //   34: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokestatic 58	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   43: pop
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_2
    //   47: ifnull +36 -> 83
    //   50: aload_0
    //   51: aload_2
    //   52: invokevirtual 60	com/google/android/gms/common/internal/d$b:g	(Ljava/lang/Object;)V
    //   55: aload_0
    //   56: monitorenter
    //   57: aload_0
    //   58: iconst_1
    //   59: putfield 26	com/google/android/gms/common/internal/d$b:Ly	Z
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_0
    //   65: invokevirtual 63	com/google/android/gms/common/internal/d$b:unregister	()V
    //   68: return
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    //   74: astore 4
    //   76: aload_0
    //   77: invokevirtual 65	com/google/android/gms/common/internal/d$b:gT	()V
    //   80: aload 4
    //   82: athrow
    //   83: aload_0
    //   84: invokevirtual 65	com/google/android/gms/common/internal/d$b:gT	()V
    //   87: goto -32 -> 55
    //   90: astore_3
    //   91: aload_0
    //   92: monitorexit
    //   93: aload_3
    //   94: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   2	46	69	finally
    //   70	72	69	finally
    //   50	55	74	java/lang/RuntimeException
    //   57	64	90	finally
    //   91	93	90	finally
  }

  public void gV()
  {
    monitorenter;
    try
    {
      this.mListener = null;
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public void unregister()
  {
    gV();
    synchronized (d.b(this.Lx))
    {
      d.b(this.Lx).remove(this);
      return;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.d.b
 * JD-Core Version:    0.6.0
 */