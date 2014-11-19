package com.google.android.gms.games.internal;

import android.os.IInterface;
import android.os.RemoteException;

public abstract interface IGamesSignInService extends IInterface
{
  public abstract void a(IGamesSignInCallbacks paramIGamesSignInCallbacks, String paramString1, String paramString2)
    throws RemoteException;

  public abstract void a(IGamesSignInCallbacks paramIGamesSignInCallbacks, String paramString1, String paramString2, String paramString3)
    throws RemoteException;

  public abstract void a(IGamesSignInCallbacks paramIGamesSignInCallbacks, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void a(IGamesSignInCallbacks paramIGamesSignInCallbacks, String paramString1, String paramString2, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void a(IGamesSignInCallbacks paramIGamesSignInCallbacks, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3)
    throws RemoteException;

  public abstract void b(IGamesSignInCallbacks paramIGamesSignInCallbacks, String paramString1, String paramString2, String paramString3)
    throws RemoteException;

  public abstract String bI(String paramString)
    throws RemoteException;

  public abstract String bJ(String paramString)
    throws RemoteException;

  public abstract String h(String paramString, boolean paramBoolean)
    throws RemoteException;

  public abstract void w(String paramString1, String paramString2)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.IGamesSignInService
 * JD-Core Version:    0.6.0
 */