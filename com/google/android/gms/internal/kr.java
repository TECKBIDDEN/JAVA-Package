package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.SessionStopResult;

public abstract interface kr extends IInterface
{
  public abstract void a(SessionStopResult paramSessionStopResult)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kr
 * JD-Core Version:    0.6.0
 */