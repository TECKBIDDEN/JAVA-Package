package com.google.android.gms.internal;

import android.os.RemoteException;

class da$3
  implements Runnable
{
  public void run()
  {
    try
    {
      da.a(this.qI).onAdLoaded();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        gs.d("Could not call onAdLoaded.", localRemoteException);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.da.3
 * JD-Core Version:    0.6.0
 */