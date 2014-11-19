package com.google.android.gms.plus.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.jp;
import java.util.List;

public abstract interface d extends IInterface
{
  public abstract i a(b paramb, int paramInt1, int paramInt2, int paramInt3, String paramString)
    throws RemoteException;

  public abstract void a(jp paramjp)
    throws RemoteException;

  public abstract void a(b paramb)
    throws RemoteException;

  public abstract void a(b paramb, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
    throws RemoteException;

  public abstract void a(b paramb, Uri paramUri, Bundle paramBundle)
    throws RemoteException;

  public abstract void a(b paramb, jp paramjp)
    throws RemoteException;

  public abstract void a(b paramb, String paramString)
    throws RemoteException;

  public abstract void a(b paramb, String paramString1, String paramString2)
    throws RemoteException;

  public abstract void a(b paramb, List<String> paramList)
    throws RemoteException;

  public abstract void a(String paramString, jb paramjb1, jb paramjb2)
    throws RemoteException;

  public abstract void b(b paramb)
    throws RemoteException;

  public abstract void b(b paramb, String paramString)
    throws RemoteException;

  public abstract void c(b paramb, String paramString)
    throws RemoteException;

  public abstract void clearDefaultAccount()
    throws RemoteException;

  public abstract void d(b paramb, String paramString)
    throws RemoteException;

  public abstract void e(b paramb, String paramString)
    throws RemoteException;

  public abstract String getAccountName()
    throws RemoteException;

  public abstract String mZ()
    throws RemoteException;

  public abstract boolean na()
    throws RemoteException;

  public abstract String nb()
    throws RemoteException;

  public abstract void removeMoment(String paramString)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.d
 * JD-Core Version:    0.6.0
 */