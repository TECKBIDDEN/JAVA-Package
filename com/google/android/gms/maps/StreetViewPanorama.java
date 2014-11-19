package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public class StreetViewPanorama
{
  private final IStreetViewPanoramaDelegate aiQ;

  protected StreetViewPanorama(IStreetViewPanoramaDelegate paramIStreetViewPanoramaDelegate)
  {
    this.aiQ = ((IStreetViewPanoramaDelegate)n.i(paramIStreetViewPanoramaDelegate));
  }

  public void animateTo(StreetViewPanoramaCamera paramStreetViewPanoramaCamera, long paramLong)
  {
    try
    {
      this.aiQ.animateTo(paramStreetViewPanoramaCamera, paramLong);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public StreetViewPanoramaLocation getLocation()
  {
    try
    {
      StreetViewPanoramaLocation localStreetViewPanoramaLocation = this.aiQ.getStreetViewPanoramaLocation();
      return localStreetViewPanoramaLocation;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public StreetViewPanoramaCamera getPanoramaCamera()
  {
    try
    {
      StreetViewPanoramaCamera localStreetViewPanoramaCamera = this.aiQ.getPanoramaCamera();
      return localStreetViewPanoramaCamera;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean isPanningGesturesEnabled()
  {
    try
    {
      boolean bool = this.aiQ.isPanningGesturesEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean isStreetNamesEnabled()
  {
    try
    {
      boolean bool = this.aiQ.isStreetNamesEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean isUserNavigationEnabled()
  {
    try
    {
      boolean bool = this.aiQ.isUserNavigationEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean isZoomGesturesEnabled()
  {
    try
    {
      boolean bool = this.aiQ.isZoomGesturesEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  IStreetViewPanoramaDelegate mA()
  {
    return this.aiQ;
  }

  public Point orientationToPoint(StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation)
  {
    Point localPoint;
    try
    {
      d locald = this.aiQ.orientationToPoint(paramStreetViewPanoramaOrientation);
      if (locald == null)
        localPoint = null;
      else
        localPoint = (Point)e.f(locald);
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    return localPoint;
  }

  public StreetViewPanoramaOrientation pointToOrientation(Point paramPoint)
  {
    try
    {
      StreetViewPanoramaOrientation localStreetViewPanoramaOrientation = this.aiQ.pointToOrientation(e.k(paramPoint));
      return localStreetViewPanoramaOrientation;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setOnStreetViewPanoramaCameraChangeListener(OnStreetViewPanoramaCameraChangeListener paramOnStreetViewPanoramaCameraChangeListener)
  {
    if (paramOnStreetViewPanoramaCameraChangeListener == null);
    try
    {
      this.aiQ.setOnStreetViewPanoramaCameraChangeListener(null);
      return;
      this.aiQ.setOnStreetViewPanoramaCameraChangeListener(new StreetViewPanorama.2(this, paramOnStreetViewPanoramaCameraChangeListener));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public final void setOnStreetViewPanoramaChangeListener(OnStreetViewPanoramaChangeListener paramOnStreetViewPanoramaChangeListener)
  {
    if (paramOnStreetViewPanoramaChangeListener == null);
    try
    {
      this.aiQ.setOnStreetViewPanoramaChangeListener(null);
      return;
      this.aiQ.setOnStreetViewPanoramaChangeListener(new StreetViewPanorama.1(this, paramOnStreetViewPanoramaChangeListener));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public final void setOnStreetViewPanoramaClickListener(OnStreetViewPanoramaClickListener paramOnStreetViewPanoramaClickListener)
  {
    if (paramOnStreetViewPanoramaClickListener == null);
    try
    {
      this.aiQ.setOnStreetViewPanoramaClickListener(null);
      return;
      this.aiQ.setOnStreetViewPanoramaClickListener(new StreetViewPanorama.3(this, paramOnStreetViewPanoramaClickListener));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public void setPanningGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      this.aiQ.enablePanning(paramBoolean);
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
      this.aiQ.setPosition(paramLatLng);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setPosition(LatLng paramLatLng, int paramInt)
  {
    try
    {
      this.aiQ.setPositionWithRadius(paramLatLng, paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setPosition(String paramString)
  {
    try
    {
      this.aiQ.setPositionWithID(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setStreetNamesEnabled(boolean paramBoolean)
  {
    try
    {
      this.aiQ.enableStreetNames(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setUserNavigationEnabled(boolean paramBoolean)
  {
    try
    {
      this.aiQ.enableUserNavigation(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setZoomGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      this.aiQ.enableZoom(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static abstract interface OnStreetViewPanoramaCameraChangeListener
  {
    public abstract void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera paramStreetViewPanoramaCamera);
  }

  public static abstract interface OnStreetViewPanoramaChangeListener
  {
    public abstract void onStreetViewPanoramaChange(StreetViewPanoramaLocation paramStreetViewPanoramaLocation);
  }

  public static abstract interface OnStreetViewPanoramaClickListener
  {
    public abstract void onStreetViewPanoramaClick(StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.StreetViewPanorama
 * JD-Core Version:    0.6.0
 */