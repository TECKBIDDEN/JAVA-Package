package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;

class dx$1
  implements Runnable
{
  public void run()
  {
    try
    {
      if (dx.a(this.st).a(this.sr.sB, -1, this.ss))
        dx.c(this.st).a(new eb(dx.b(this.st), this.sr.sC, true, -1, this.ss, this.sr));
      else
        dx.c(this.st).a(new eb(dx.b(this.st), this.sr.sC, false, -1, this.ss, this.sr));
    }
    catch (RemoteException localRemoteException)
    {
      gs.W("Fail to verify and dispatch pending transaction");
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dx.1
 * JD-Core Version:    0.6.0
 */