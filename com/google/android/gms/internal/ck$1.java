package com.google.android.gms.internal;

import android.os.RemoteException;

class ck$1
  implements Runnable
{
  public void run()
  {
    try
    {
      this.pU.qz.destroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        gs.d("Could not destroy mediation adapter.", localRemoteException);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ck.1
 * JD-Core Version:    0.6.0
 */