package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.maps.model.internal.c;

public final class GroundOverlay
{
  private final c ajC;

  public GroundOverlay(c paramc)
  {
    this.ajC = ((c)n.i(paramc));
  }

  public boolean equals(Object paramObject)
  {
    int i;
    if (!(paramObject instanceof GroundOverlay))
      i = 0;
    while (true)
    {
      return i;
      try
      {
        boolean bool = this.ajC.a(((GroundOverlay)paramObject).ajC);
        i = bool;
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public float getBearing()
  {
    try
    {
      float f = this.ajC.getBearing();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public LatLngBounds getBounds()
  {
    try
    {
      LatLngBounds localLatLngBounds = this.ajC.getBounds();
      return localLatLngBounds;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public float getHeight()
  {
    try
    {
      float f = this.ajC.getHeight();
      return f;
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
      String str = this.ajC.getId();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public LatLng getPosition()
  {
    try
    {
      LatLng localLatLng = this.ajC.getPosition();
      return localLatLng;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public float getTransparency()
  {
    try
    {
      float f = this.ajC.getTransparency();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public float getWidth()
  {
    try
    {
      float f = this.ajC.getWidth();
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
      float f = this.ajC.getZIndex();
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
      int i = this.ajC.hashCodeRemote();
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
      boolean bool = this.ajC.isVisible();
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
      this.ajC.remove();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setBearing(float paramFloat)
  {
    try
    {
      this.ajC.setBearing(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setDimensions(float paramFloat)
  {
    try
    {
      this.ajC.setDimensions(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setDimensions(float paramFloat1, float paramFloat2)
  {
    try
    {
      this.ajC.a(paramFloat1, paramFloat2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setImage(BitmapDescriptor paramBitmapDescriptor)
  {
    try
    {
      this.ajC.m(paramBitmapDescriptor.mm());
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setPosition(LatLng paramLatLng)
  {
    try
    {
      this.ajC.setPosition(paramLatLng);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setPositionFromBounds(LatLngBounds paramLatLngBounds)
  {
    try
    {
      this.ajC.setPositionFromBounds(paramLatLngBounds);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setTransparency(float paramFloat)
  {
    try
    {
      this.ajC.setTransparency(paramFloat);
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
      this.ajC.setVisible(paramBoolean);
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
      this.ajC.setZIndex(paramFloat);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.GroundOverlay
 * JD-Core Version:    0.6.0
 */