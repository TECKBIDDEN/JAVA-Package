package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.maps.model.internal.e;

public final class IndoorLevel
{
  private final e ajM;

  public IndoorLevel(e parame)
  {
    this.ajM = ((e)n.i(parame));
  }

  public void activate()
  {
    try
    {
      this.ajM.activate();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean equals(Object paramObject)
  {
    int i;
    if (!(paramObject instanceof IndoorLevel))
      i = 0;
    while (true)
    {
      return i;
      try
      {
        boolean bool = this.ajM.a(((IndoorLevel)paramObject).ajM);
        i = bool;
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public String getName()
  {
    try
    {
      String str = this.ajM.getName();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public String getShortName()
  {
    try
    {
      String str = this.ajM.getShortName();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public int hashCode()
  {
    try
    {
      int i = this.ajM.hashCodeRemote();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.IndoorLevel
 * JD-Core Version:    0.6.0
 */