package com.google.android.gms.internal;

import android.os.RemoteException;

class da$9
  implements Runnable
{
  public void run()
  {
    try
    {
      da.a(this.qI).onAdClosed();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        gs.d("Could not call onAdClosed.", localRemoteException);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.da.9
 * JD-Core Version:    0.6.0
 */