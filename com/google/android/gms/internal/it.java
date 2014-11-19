package com.google.android.gms.internal;

import android.os.SystemClock;
import org.json.JSONObject;

public final class it
{
  private static final ip Gr = new ip("RequestTracker");
  public static final Object Hz = new Object();
  private long Hv;
  private long Hw;
  private long Hx;
  private is Hy;

  public it(long paramLong)
  {
    this.Hv = paramLong;
    this.Hw = -1L;
    this.Hx = 0L;
  }

  private void fV()
  {
    this.Hw = -1L;
    this.Hy = null;
    this.Hx = 0L;
  }

  public void a(long paramLong, is paramis)
  {
    synchronized (Hz)
    {
      is localis = this.Hy;
      long l = this.Hw;
      this.Hw = paramLong;
      this.Hy = paramis;
      this.Hx = SystemClock.elapsedRealtime();
      if (localis != null)
        localis.n(l);
      return;
    }
  }

  public boolean b(long paramLong, int paramInt, JSONObject paramJSONObject)
  {
    int i = 1;
    is localis = null;
    while (true)
    {
      synchronized (Hz)
      {
        if ((this.Hw != -1L) && (this.Hw == paramLong))
        {
          ip localip = Gr;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Long.valueOf(this.Hw);
          localip.b("request %d completed", arrayOfObject);
          localis = this.Hy;
          fV();
          if (localis == null)
            continue;
          localis.a(paramLong, paramInt, paramJSONObject);
          return i;
        }
      }
      i = 0;
    }
  }

  public void clear()
  {
    synchronized (Hz)
    {
      if (this.Hw != -1L)
        fV();
      return;
    }
  }

  public boolean d(long paramLong, int paramInt)
  {
    return b(paramLong, paramInt, null);
  }

  public boolean e(long paramLong, int paramInt)
  {
    int i = 1;
    long l = 0L;
    while (true)
    {
      synchronized (Hz)
      {
        if ((this.Hw != -1L) && (paramLong - this.Hx >= this.Hv))
        {
          ip localip = Gr;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Long.valueOf(this.Hw);
          localip.b("request %d timed out", arrayOfObject);
          l = this.Hw;
          localis = this.Hy;
          fV();
          if (localis == null)
            continue;
          localis.a(l, paramInt, null);
          return i;
        }
      }
      i = 0;
      is localis = null;
    }
  }

  public boolean fW()
  {
    while (true)
    {
      synchronized (Hz)
      {
        if (this.Hw != -1L)
        {
          i = 1;
          return i;
        }
      }
      int i = 0;
    }
  }

  public boolean p(long paramLong)
  {
    while (true)
    {
      synchronized (Hz)
      {
        if ((this.Hw != -1L) && (this.Hw == paramLong))
        {
          i = 1;
          return i;
        }
      }
      int i = 0;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.it
 * JD-Core Version:    0.6.0
 */