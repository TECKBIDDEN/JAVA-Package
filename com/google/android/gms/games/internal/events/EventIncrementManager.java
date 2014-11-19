package com.google.android.gms.games.internal.events;

import java.util.concurrent.atomic.AtomicReference;

public abstract class EventIncrementManager
{
  private final AtomicReference<EventIncrementCache> aal = new AtomicReference();

  public void flush()
  {
    EventIncrementCache localEventIncrementCache = (EventIncrementCache)this.aal.get();
    if (localEventIncrementCache != null)
      localEventIncrementCache.flush();
  }

  protected abstract EventIncrementCache kv();

  public void n(String paramString, int paramInt)
  {
    EventIncrementCache localEventIncrementCache = (EventIncrementCache)this.aal.get();
    if (localEventIncrementCache == null)
    {
      localEventIncrementCache = kv();
      if (!this.aal.compareAndSet(null, localEventIncrementCache))
        localEventIncrementCache = (EventIncrementCache)this.aal.get();
    }
    localEventIncrementCache.w(paramString, paramInt);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.events.EventIncrementManager
 * JD-Core Version:    0.6.0
 */