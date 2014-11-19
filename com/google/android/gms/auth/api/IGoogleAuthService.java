package com.google.android.gms.auth.api;

import android.os.IInterface;
import android.os.RemoteException;

public abstract interface IGoogleAuthService extends IInterface
{
  public abstract void sendConnection(IGoogleAuthApiCallbacks paramIGoogleAuthApiCallbacks, GoogleAuthApiRequest paramGoogleAuthApiRequest)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.IGoogleAuthService
 * JD-Core Version:    0.6.0
 */