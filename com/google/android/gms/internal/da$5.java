package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;

class da$5
  implements Runnable
{
  public void run()
  {
    try
    {
      da.a(this.qI).onAdFailedToLoad(db.a(this.qJ));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        gs.d("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.da.5
 * JD-Core Version:    0.6.0
 */