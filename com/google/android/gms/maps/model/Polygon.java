package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.maps.model.internal.g;
import java.util.List;

public final class Polygon
{
  private final g ajZ;

  public Polygon(g paramg)
  {
    this.ajZ = ((g)n.i(paramg));
  }

  public boolean equals(Object paramObject)
  {
    int i;
    if (!(paramObject instanceof Polygon))
      i = 0;
    while (true)
    {
      return i;
      try
      {
        boolean bool = this.ajZ.a(((Polygon)paramObject).ajZ);
        i = bool;
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public int getFillColor()
  {
    try
    {
      int i = this.ajZ.getFillColor();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public List<List<LatLng>> getHoles()
  {
    try
    {
      List localList = this.ajZ.getHoles();
      return localList;
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
      String str = this.ajZ.getId();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public List<LatLng> getPoints()
  {
    try
    {
      List localList = this.ajZ.getPoints();
      return localList;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public int getStrokeColor()
  {
    try
    {
      int i = this.ajZ.getStrokeColor();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public float getStrokeWidth()
  {
    try
    {
      float f = this.ajZ.getStrokeWidth();
      return f;
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
      float f = this.ajZ.getZIndex();
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
      int i = this.ajZ.hashCodeRemote();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean isGeodesic()
  {
    try
    {
      boolean bool = this.ajZ.isGeodesic();
      return bool;
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
      boolean bool = this.ajZ.isVisible();
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
      this.ajZ.remove();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setFillColor(int paramInt)
  {
    try
    {
      this.ajZ.setFillColor(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setGeodesic(boolean paramBoolean)
  {
    try
    {
      this.ajZ.setGeodesic(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setHoles(List<? extends List<LatLng>> paramList)
  {
    try
    {
      this.ajZ.setHoles(paramList);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setPoints(List<LatLng> paramList)
  {
    try
    {
      this.ajZ.setPoints(paramList);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setStrokeColor(int paramInt)
  {
    try
    {
      this.ajZ.setStrokeColor(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setStrokeWidth(float paramFloat)
  {
    try
    {
      this.ajZ.setStrokeWidth(paramFloat);
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
      this.ajZ.setVisible(paramBoolean);
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
      this.ajZ.setZIndex(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.Polygon
 * JD-Core Version:    0.6.0
 */