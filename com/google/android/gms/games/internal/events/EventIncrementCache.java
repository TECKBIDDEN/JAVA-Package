package com.google.android.gms.games.internal.events;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class EventIncrementCache
{
  final Object aaf = new Object();
  private Handler aag;
  private boolean aah;
  private HashMap<String, AtomicInteger> aai;
  private int aaj;

  public EventIncrementCache(Looper paramLooper, int paramInt)
  {
    this.aag = new Handler(paramLooper);
    this.aai = new HashMap();
    this.aaj = paramInt;
  }

  private void kN()
  {
    synchronized (this.aaf)
    {
      this.aah = false;
      flush();
      return;
    }
  }

  // ERROR //
  public void flush()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 22	com/google/android/gms/games/internal/events/EventIncrementCache:aaf	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 34	com/google/android/gms/games/internal/events/EventIncrementCache:aai	Ljava/util/HashMap;
    //   11: invokevirtual 50	java/util/HashMap:entrySet	()Ljava/util/Set;
    //   14: invokeinterface 56 1 0
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface 62 1 0
    //   26: ifeq +49 -> 75
    //   29: aload_3
    //   30: invokeinterface 66 1 0
    //   35: checkcast 68	java/util/Map$Entry
    //   38: astore 4
    //   40: aload_0
    //   41: aload 4
    //   43: invokeinterface 71 1 0
    //   48: checkcast 73	java/lang/String
    //   51: aload 4
    //   53: invokeinterface 76 1 0
    //   58: checkcast 78	java/util/concurrent/atomic/AtomicInteger
    //   61: invokevirtual 82	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   64: invokevirtual 86	com/google/android/gms/games/internal/events/EventIncrementCache:q	(Ljava/lang/String;I)V
    //   67: goto -47 -> 20
    //   70: astore_2
    //   71: aload_1
    //   72: monitorexit
    //   73: aload_2
    //   74: athrow
    //   75: aload_0
    //   76: getfield 34	com/google/android/gms/games/internal/events/EventIncrementCache:aai	Ljava/util/HashMap;
    //   79: invokevirtual 89	java/util/HashMap:clear	()V
    //   82: aload_1
    //   83: monitorexit
    //   84: return
    //
    // Exception table:
    //   from	to	target	type
    //   7	73	70	finally
    //   75	84	70	finally
  }

  protected abstract void q(String paramString, int paramInt);

  public void w(String paramString, int paramInt)
  {
    synchronized (this.aaf)
    {
      if (!this.aah)
      {
        this.aah = true;
        this.aag.postDelayed(new EventIncrementCache.1(this), this.aaj);
      }
      AtomicInteger localAtomicInteger = (AtomicInteger)this.aai.get(paramString);
      if (localAtomicInteger == null)
      {
        localAtomicInteger = new AtomicInteger();
        this.aai.put(paramString, localAtomicInteger);
      }
      localAtomicInteger.addAndGet(paramInt);
      return;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.events.EventIncrementCache
 * JD-Core Version:    0.6.0
 */