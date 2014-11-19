package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

public abstract interface hc extends IInterface
{
  public abstract void a(Map paramMap, long paramLong, String paramString, List<hb> paramList)
    throws RemoteException;

  public abstract void dI()
    throws RemoteException;

  public abstract String getVersion()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hc
 * JD-Core Version:    0.6.0
 */