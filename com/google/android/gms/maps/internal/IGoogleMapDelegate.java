package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.c;
import com.google.android.gms.maps.model.internal.h;

public abstract interface IGoogleMapDelegate extends IInterface
{
  public abstract com.google.android.gms.maps.model.internal.b addCircle(CircleOptions paramCircleOptions)
    throws RemoteException;

  public abstract c addGroundOverlay(GroundOverlayOptions paramGroundOverlayOptions)
    throws RemoteException;

  public abstract com.google.android.gms.maps.model.internal.f addMarker(MarkerOptions paramMarkerOptions)
    throws RemoteException;

  public abstract com.google.android.gms.maps.model.internal.g addPolygon(PolygonOptions paramPolygonOptions)
    throws RemoteException;

  public abstract IPolylineDelegate addPolyline(PolylineOptions paramPolylineOptions)
    throws RemoteException;

  public abstract h addTileOverlay(TileOverlayOptions paramTileOverlayOptions)
    throws RemoteException;

  public abstract void animateCamera(com.google.android.gms.dynamic.d paramd)
    throws RemoteException;

  public abstract void animateCameraWithCallback(com.google.android.gms.dynamic.d paramd, b paramb)
    throws RemoteException;

  public abstract void animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.d paramd, int paramInt, b paramb)
    throws RemoteException;

  public abstract void clear()
    throws RemoteException;

  public abstract CameraPosition getCameraPosition()
    throws RemoteException;

  public abstract com.google.android.gms.maps.model.internal.d getFocusedBuilding()
    throws RemoteException;

  public abstract int getMapType()
    throws RemoteException;

  public abstract float getMaxZoomLevel()
    throws RemoteException;

  public abstract float getMinZoomLevel()
    throws RemoteException;

  public abstract Location getMyLocation()
    throws RemoteException;

  public abstract IProjectionDelegate getProjection()
    throws RemoteException;

  public abstract IUiSettingsDelegate getUiSettings()
    throws RemoteException;

  public abstract boolean isBuildingsEnabled()
    throws RemoteException;

  public abstract boolean isIndoorEnabled()
    throws RemoteException;

  public abstract boolean isMyLocationEnabled()
    throws RemoteException;

  public abstract boolean isTrafficEnabled()
    throws RemoteException;

  public abstract void moveCamera(com.google.android.gms.dynamic.d paramd)
    throws RemoteException;

  public abstract void setBuildingsEnabled(boolean paramBoolean)
    throws RemoteException;

  public abstract boolean setIndoorEnabled(boolean paramBoolean)
    throws RemoteException;

  public abstract void setInfoWindowAdapter(d paramd)
    throws RemoteException;

  public abstract void setLocationSource(ILocationSourceDelegate paramILocationSourceDelegate)
    throws RemoteException;

  public abstract void setMapType(int paramInt)
    throws RemoteException;

  public abstract void setMyLocationEnabled(boolean paramBoolean)
    throws RemoteException;

  public abstract void setOnCameraChangeListener(e parame)
    throws RemoteException;

  public abstract void setOnIndoorStateChangeListener(f paramf)
    throws RemoteException;

  public abstract void setOnInfoWindowClickListener(g paramg)
    throws RemoteException;

  public abstract void setOnMapClickListener(i parami)
    throws RemoteException;

  public abstract void setOnMapLoadedCallback(j paramj)
    throws RemoteException;

  public abstract void setOnMapLongClickListener(k paramk)
    throws RemoteException;

  public abstract void setOnMarkerClickListener(l paraml)
    throws RemoteException;

  public abstract void setOnMarkerDragListener(m paramm)
    throws RemoteException;

  public abstract void setOnMyLocationButtonClickListener(n paramn)
    throws RemoteException;

  public abstract void setOnMyLocationChangeListener(o paramo)
    throws RemoteException;

  public abstract void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws RemoteException;

  public abstract void setTrafficEnabled(boolean paramBoolean)
    throws RemoteException;

  public abstract void snapshot(s params, com.google.android.gms.dynamic.d paramd)
    throws RemoteException;

  public abstract void stopAnimation()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IGoogleMapDelegate
 * JD-Core Version:    0.6.0
 */