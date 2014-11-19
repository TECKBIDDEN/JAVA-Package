package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

final class d$f
  implements ServiceConnection
{
  d$f(d paramd)
  {
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.Lx.N(paramIBinder);
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.Lx.mHandler.sendMessage(this.Lx.mHandler.obtainMessage(4, Integer.valueOf(1)));
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.d.f
 * JD-Core Version:    0.6.0
 */