package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.maps.model.internal.h;

public final class TileOverlay
{
  private final h akf;

  public TileOverlay(h paramh)
  {
    this.akf = ((h)n.i(paramh));
  }

  public void clearTileCache()
  {
    try
    {
      this.akf.clearTileCache();
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
    if (!(paramObject instanceof TileOverlay))
      i = 0;
    while (true)
    {
      return i;
      try
      {
        boolean bool = this.akf.a(((TileOverlay)paramObject).akf);
        i = bool;
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean getFadeIn()
  {
    try
    {
      boolean bool = this.akf.getFadeIn();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public String getId()
  {
    try
    {
      String str = this.akf.getId();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public float getZIndex()
  {
    try
    {
      float f = this.akf.getZIndex();
      return f;
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
      int i = this.akf.hashCodeRemote();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean isVisible()
  {
    try
    {
      boolean bool = this.akf.isVisible();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void remove()
  {
    try
    {
      this.akf.remove();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setFadeIn(boolean paramBoolean)
  {
    try
    {
      this.akf.setFadeIn(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setVisible(boolean paramBoolean)
  {
    try
    {
      this.akf.setVisible(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setZIndex(float paramFloat)
  {
    try
    {
      this.akf.setZIndex(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.TileOverlay
 * JD-Core Version:    0.6.0
 */