package com.google.android.gms.internal;

import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import java.util.Map;

class ij$c$4
  implements Runnable
{
  public void run()
  {
    while (true)
    {
      synchronized (ij.g(this.GT.GQ))
      {
        Cast.MessageReceivedCallback localMessageReceivedCallback = (Cast.MessageReceivedCallback)ij.g(this.GT.GQ).get(this.EE);
        if (localMessageReceivedCallback != null)
        {
          localMessageReceivedCallback.onMessageReceived(ij.h(this.GT.GQ), this.EE, this.GW);
          return;
        }
      }
      ip localip = ij.fI();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.EE;
      localip.b("Discarded message for unknown namespace '%s'", arrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ij.c.4
 * JD-Core Version:    0.6.0
 */