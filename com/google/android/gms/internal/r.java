package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public abstract interface r extends IInterface
{
  public abstract Bundle a(String paramString, Bundle paramBundle)
    throws RemoteException;

  public abstract Bundle a(String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException;

  public abstract AccountChangeEventsResponse a(AccountChangeEventsRequest paramAccountChangeEventsRequest)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.r
 * JD-Core Version:    0.6.0
 */