package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.Callable;

class gi$2
  implements Callable<T>
{
  public T call()
    throws Exception
  {
    try
    {
      Process.setThreadPriority(10);
      Object localObject2 = this.wk.call();
      localObject1 = localObject2;
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        gb.e(localException);
        Object localObject1 = null;
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gi.2
 * JD-Core Version:    0.6.0
 */