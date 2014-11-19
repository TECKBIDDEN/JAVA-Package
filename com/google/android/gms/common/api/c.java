package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.n;

public final class c<L>
{
  private final c<L>.a Jl;
  private volatile L mListener;

  c(Looper paramLooper, L paramL)
  {
    this.Jl = new a(paramLooper);
    this.mListener = n.b(paramL, "Listener must not be null");
  }

  public void a(b<L> paramb)
  {
    n.b(paramb, "Notifier must not be null");
    Message localMessage = this.Jl.obtainMessage(1, paramb);
    this.Jl.sendMessage(localMessage);
  }

  void b(b<L> paramb)
  {
    Object localObject = this.mListener;
    if (localObject == null)
      paramb.gs();
    while (true)
    {
      return;
      try
      {
        paramb.d(localObject);
      }
      catch (Exception localException)
      {
        Log.w("ListenerHolder", "Notifying listener failed", localException);
        paramb.gs();
      }
    }
  }

  public void clear()
  {
    this.mListener = null;
  }

  private final class a extends Handler
  {
    public a(Looper arg2)
    {
      super();
    }

    public void handleMessage(Message paramMessage)
    {
      int i = 1;
      if (paramMessage.what == i);
      while (true)
      {
        n.K(i);
        c.this.b((c.b)paramMessage.obj);
        return;
        int j = 0;
      }
    }
  }

  public static abstract interface b<L>
  {
    public abstract void d(L paramL);

    public abstract void gs();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.c
 * JD-Core Version:    0.6.0
 */