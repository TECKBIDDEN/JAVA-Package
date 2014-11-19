package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.maps.model.internal.d;
import com.google.android.gms.maps.model.internal.e.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class IndoorBuilding
{
  private final d ajL;

  public IndoorBuilding(d paramd)
  {
    this.ajL = ((d)n.i(paramd));
  }

  public boolean equals(Object paramObject)
  {
    int i;
    if (!(paramObject instanceof IndoorBuilding))
      i = 0;
    while (true)
    {
      return i;
      try
      {
        boolean bool = this.ajL.b(((IndoorBuilding)paramObject).ajL);
        i = bool;
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public int getActiveLevelIndex()
  {
    try
    {
      int i = this.ajL.getActiveLevelIndex();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public int getDefaultLevelIndex()
  {
    try
    {
      int i = this.ajL.getActiveLevelIndex();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public List<IndoorLevel> getLevels()
  {
    ArrayList localArrayList;
    try
    {
      List localList = this.ajL.getLevels();
      localArrayList = new ArrayList(localList.size());
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
        localArrayList.add(new IndoorLevel(e.a.bt((IBinder)localIterator.next())));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    return localArrayList;
  }

  public int hashCode()
  {
    try
    {
      int i = this.ajL.hashCodeRemote();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean isUnderground()
  {
    try
    {
      boolean bool = this.ajL.isUnderground();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.IndoorBuilding
 * JD-Core Version:    0.6.0
 */