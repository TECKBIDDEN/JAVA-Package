package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.maps.model.internal.b;

public final class Circle
{
  private final b aju;

  public Circle(b paramb)
  {
    this.aju = ((b)n.i(paramb));
  }

  public boolean equals(Object paramObject)
  {
    int i;
    if (!(paramObject instanceof Circle))
      i = 0;
    while (true)
    {
      return i;
      try
      {
        boolean bool = this.aju.a(((Circle)paramObject).aju);
        i = bool;
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public LatLng getCenter()
  {
    try
    {
      LatLng localLatLng = this.aju.getCenter();
      return localLatLng;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public int getFillColor()
  {
    try
    {
      int i = this.aju.getFillColor();
      return i;
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
      String str = this.aju.getId();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public double getRadius()
  {
    try
    {
      double d = this.aju.getRadius();
      return d;
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
      int i = this.aju.getStrokeColor();
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
      float f = this.aju.getStrokeWidth();
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
      float f = this.aju.getZIndex();
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
      int i = this.aju.hashCodeRemote();
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
      boolean bool = this.aju.isVisible();
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
      this.aju.remove();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setCenter(LatLng paramLatLng)
  {
    try
    {
      this.aju.setCenter(paramLatLng);
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
      this.aju.setFillColor(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setRadius(double paramDouble)
  {
    try
    {
      this.aju.setRadius(paramDouble);
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
      this.aju.setStrokeColor(paramInt);
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
      this.aju.setStrokeWidth(paramFloat);
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
      this.aju.setVisible(paramBoolean);
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
      this.aju.setZIndex(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.Circle
 * JD-Core Version:    0.6.0
 */