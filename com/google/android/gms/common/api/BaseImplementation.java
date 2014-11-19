package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;

public class BaseImplementation
{
  static void a(Result paramResult)
  {
    if ((paramResult instanceof Releasable));
    try
    {
      ((Releasable)paramResult).release();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
        Log.w("GoogleApi", "Unable to release " + paramResult, localRuntimeException);
    }
  }

  public static class CallbackHandler<R extends Result> extends Handler
  {
    public static final int CALLBACK_ON_COMPLETE = 1;
    public static final int CALLBACK_ON_TIMEOUT = 2;

    public CallbackHandler()
    {
      this(Looper.getMainLooper());
    }

    public CallbackHandler(Looper paramLooper)
    {
      super();
    }

    protected void deliverResultCallback(ResultCallback<R> paramResultCallback, R paramR)
    {
      try
      {
        paramResultCallback.onResult(paramR);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        BaseImplementation.a(paramR);
      }
      throw localRuntimeException;
    }

    public void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default:
        Log.wtf("GoogleApi", "Don't know how to handle this message.");
      case 1:
      case 2:
      }
      while (true)
      {
        return;
        Pair localPair = (Pair)paramMessage.obj;
        deliverResultCallback((ResultCallback)localPair.first, (Result)localPair.second);
        continue;
        BaseImplementation.AbstractPendingResult.a((BaseImplementation.AbstractPendingResult)paramMessage.obj);
      }
    }

    public void removeTimeoutMessages()
    {
      removeMessages(2);
    }

    public void sendResultCallback(ResultCallback<R> paramResultCallback, R paramR)
    {
      sendMessage(obtainMessage(1, new Pair(paramResultCallback, paramR)));
    }

    public void sendTimeoutResultCallback(BaseImplementation.AbstractPendingResult<R> paramAbstractPendingResult, long paramLong)
    {
      sendMessageDelayed(obtainMessage(2, paramAbstractPendingResult), paramLong);
    }
  }

  public static abstract interface b<R>
  {
    public abstract void b(R paramR);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.BaseImplementation
 * JD-Core Version:    0.6.0
 */