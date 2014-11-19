package com.google.android.gms.analytics;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.hc.a;

final class c$a
  implements ServiceConnection
{
  c$a(c paramc)
  {
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    z.V("service connected, binder: " + paramIBinder);
    while (true)
    {
      try
      {
        if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(paramIBinder.getInterfaceDescriptor()))
        {
          z.V("bound to service");
          c.a(this.xK, hc.a.E(paramIBinder));
          c.a(this.xK);
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
      }
      try
      {
        c.b(this.xK).unbindService(this);
        label73: c.a(this.xK, null);
        c.c(this.xK).a(2, null);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        break label73;
      }
    }
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    z.V("service disconnected: " + paramComponentName);
    c.a(this.xK, null);
    c.d(this.xK).onDisconnected();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.c.a
 * JD-Core Version:    0.6.0
 */