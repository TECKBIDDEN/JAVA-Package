package com.google.android.gms.auth.api;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;

public abstract interface IGoogleAuthApiCallbacks extends IInterface
{
  public abstract void onConnectionSuccess(GoogleAuthApiResponse paramGoogleAuthApiResponse)
    throws RemoteException;

  public abstract void onError(int paramInt, String paramString, PendingIntent paramPendingIntent)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.IGoogleAuthApiCallbacks
 * JD-Core Version:    0.6.0
 */