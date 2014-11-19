package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.identity.intents.UserAddressRequest;

public abstract interface ln extends IInterface
{
  public abstract void a(lm paramlm, UserAddressRequest paramUserAddressRequest, Bundle paramBundle)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ln
 * JD-Core Version:    0.6.0
 */