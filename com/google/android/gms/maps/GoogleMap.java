package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.c;
import com.google.android.gms.maps.model.internal.f;
import com.google.android.gms.maps.model.internal.h;

public final class GoogleMap
{
  public static final int MAP_TYPE_HYBRID = 4;
  public static final int MAP_TYPE_NONE = 0;
  public static final int MAP_TYPE_NORMAL = 1;
  public static final int MAP_TYPE_SATELLITE = 2;
  public static final int MAP_TYPE_TERRAIN = 3;
  private final IGoogleMapDelegate aic;
  private UiSettings aid;

  protected GoogleMap(IGoogleMapDelegate paramIGoogleMapDelegate)
  {
    this.aic = ((IGoogleMapDelegate)n.i(paramIGoogleMapDelegate));
  }

  public final Circle addCircle(CircleOptions paramCircleOptions)
  {
    try
    {
      Circle localCircle = new Circle(this.aic.addCircle(paramCircleOptions));
      return localCircle;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final GroundOverlay addGroundOverlay(GroundOverlayOptions paramGroundOverlayOptions)
  {
    try
    {
      c localc = this.aic.addGroundOverlay(paramGroundOverlayOptions);
      if (localc != null);
      for (GroundOverlay localGroundOverlay = new GroundOverlay(localc); ; localGroundOverlay = null)
        return localGroundOverlay;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final Marker addMarker(MarkerOptions paramMarkerOptions)
  {
    try
    {
      f localf = this.aic.addMarker(paramMarkerOptions);
      if (localf != null);
      for (Marker localMarker = new Marker(localf); ; localMarker = null)
        return localMarker;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final Polygon addPolygon(PolygonOptions paramPolygonOptions)
  {
    try
    {
      Polygon localPolygon = new Polygon(this.aic.addPolygon(paramPolygonOptions));
      return localPolygon;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final Polyline addPolyline(PolylineOptions paramPolylineOptions)
  {
    try
    {
      Polyline localPolyline = new Polyline(this.aic.addPolyline(paramPolylineOptions));
      return localPolyline;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final TileOverlay addTileOverlay(TileOverlayOptions paramTileOverlayOptions)
  {
    try
    {
      h localh = this.aic.addTileOverlay(paramTileOverlayOptions);
      if (localh != null);
      for (TileOverlay localTileOverlay = new TileOverlay(localh); ; localTileOverlay = null)
        return localTileOverlay;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void animateCamera(CameraUpdate paramCameraUpdate)
  {
    try
    {
      this.aic.animateCamera(paramCameraUpdate.mm());
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void animateCamera(CameraUpdate paramCameraUpdate, int paramInt, CancelableCallback paramCancelableCallback)
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.aic;
      com.google.android.gms.dynamic.d locald = paramCameraUpdate.mm();
      if (paramCancelableCallback == null);
      for (Object localObject = null; ; localObject = new GoogleMap.a(paramCancelableCallback))
      {
        localIGoogleMapDelegate.animateCameraWithDurationAndCallback(locald, paramInt, (b)localObject);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void animateCamera(CameraUpdate paramCameraUpdate, CancelableCallback paramCancelableCallback)
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.aic;
      com.google.android.gms.dynamic.d locald = paramCameraUpdate.mm();
      if (paramCancelableCallback == null);
      for (Object localObject = null; ; localObject = new GoogleMap.a(paramCancelableCallback))
      {
        localIGoogleMapDelegate.animateCameraWithCallback(locald, (b)localObject);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void clear()
  {
    try
    {
      this.aic.clear();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final CameraPosition getCameraPosition()
  {
    try
    {
      CameraPosition localCameraPosition = this.aic.getCameraPosition();
      return localCameraPosition;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public IndoorBuilding getFocusedBuilding()
  {
    try
    {
      com.google.android.gms.maps.model.internal.d locald = this.aic.getFocusedBuilding();
      if (locald != null);
      for (IndoorBuilding localIndoorBuilding = new IndoorBuilding(locald); ; localIndoorBuilding = null)
        return localIndoorBuilding;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final int getMapType()
  {
    try
    {
      int i = this.aic.getMapType();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final float getMaxZoomLevel()
  {
    try
    {
      float f = this.aic.getMaxZoomLevel();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final float getMinZoomLevel()
  {
    try
    {
      float f = this.aic.getMinZoomLevel();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  @Deprecated
  public final Location getMyLocation()
  {
    try
    {
      Location localLocation = this.aic.getMyLocation();
      return localLocation;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final Projection getProjection()
  {
    try
    {
      Projection localProjection = new Projection(this.aic.getProjection());
      return localProjection;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final UiSettings getUiSettings()
  {
    try
    {
      if (this.aid == null)
        this.aid = new UiSettings(this.aic.getUiSettings());
      UiSettings localUiSettings = this.aid;
      return localUiSettings;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final boolean isBuildingsEnabled()
  {
    try
    {
      boolean bool = this.aic.isBuildingsEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final boolean isIndoorEnabled()
  {
    try
    {
      boolean bool = this.aic.isIndoorEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final boolean isMyLocationEnabled()
  {
    try
    {
      boolean bool = this.aic.isMyLocationEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final boolean isTrafficEnabled()
  {
    try
    {
      boolean bool = this.aic.isTrafficEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  IGoogleMapDelegate mo()
  {
    return this.aic;
  }

  public final void moveCamera(CameraUpdate paramCameraUpdate)
  {
    try
    {
      this.aic.moveCamera(paramCameraUpdate.mm());
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setBuildingsEnabled(boolean paramBoolean)
  {
    try
    {
      this.aic.setBuildingsEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final boolean setIndoorEnabled(boolean paramBoolean)
  {
    try
    {
      boolean bool = this.aic.setIndoorEnabled(paramBoolean);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setInfoWindowAdapter(InfoWindowAdapter paramInfoWindowAdapter)
  {
    if (paramInfoWindowAdapter == null);
    try
    {
      this.aic.setInfoWindowAdapter(null);
      return;
      this.aic.setInfoWindowAdapter(new GoogleMap.13(this, paramInfoWindowAdapter));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public final void setLocationSource(LocationSource paramLocationSource)
  {
    if (paramLocationSource == null);
    try
    {
      this.aic.setLocationSource(null);
      return;
      this.aic.setLocationSource(new GoogleMap.6(this, paramLocationSource));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public final void setMapType(int paramInt)
  {
    try
    {
      this.aic.setMapType(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setMyLocationEnabled(boolean paramBoolean)
  {
    try
    {
      this.aic.setMyLocationEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setOnCameraChangeListener(OnCameraChangeListener paramOnCameraChangeListener)
  {
    if (paramOnCameraChangeListener == null);
    try
    {
      this.aic.setOnCameraChangeListener(null);
      return;
      this.aic.setOnCameraChangeListener(new GoogleMap.7(this, paramOnCameraChangeListener));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public final void setOnIndoorStateChangeListener(OnIndoorStateChangeListener paramOnIndoorStateChangeListener)
  {
    if (paramOnIndoorStateChangeListener == null);
    try
    {
      this.aic.setOnIndoorStateChangeListener(null);
      return;
      this.aic.setOnIndoorStateChangeListener(new GoogleMap.1(this, paramOnIndoorStateChangeListener));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public final void setOnInfoWindowClickListener(OnInfoWindowClickListener paramOnInfoWindowClickListener)
  {
    if (paramOnInfoWindowClickListener == null);
    try
    {
      this.aic.setOnInfoWindowClickListener(null);
      return;
      this.aic.setOnInfoWindowClickListener(new GoogleMap.12(this, paramOnInfoWindowClickListener));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public final void setOnMapClickListener(OnMapClickListener paramOnMapClickListener)
  {
    if (paramOnMapClickListener == null);
    try
    {
      this.aic.setOnMapClickListener(null);
      return;
      this.aic.setOnMapClickListener(new GoogleMap.8(this, paramOnMapClickListener));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public void setOnMapLoadedCallback(OnMapLoadedCallback paramOnMapLoadedCallback)
  {
    if (paramOnMapLoadedCallback == null);
    try
    {
      this.aic.setOnMapLoadedCallback(null);
      return;
      this.aic.setOnMapLoadedCallback(new GoogleMap.4(this, paramOnMapLoadedCallback));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public final void setOnMapLongClickListener(OnMapLongClickListener paramOnMapLongClickListener)
  {
    if (paramOnMapLongClickListener == null);
    try
    {
      this.aic.setOnMapLongClickListener(null);
      return;
      this.aic.setOnMapLongClickListener(new GoogleMap.9(this, paramOnMapLongClickListener));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public final void setOnMarkerClickListener(OnMarkerClickListener paramOnMarkerClickListener)
  {
    if (paramOnMarkerClickListener == null);
    try
    {
      this.aic.setOnMarkerClickListener(null);
      return;
      this.aic.setOnMarkerClickListener(new GoogleMap.10(this, paramOnMarkerClickListener));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public final void setOnMarkerDragListener(OnMarkerDragListener paramOnMarkerDragListener)
  {
    if (paramOnMarkerDragListener == null);
    try
    {
      this.aic.setOnMarkerDragListener(null);
      return;
      this.aic.setOnMarkerDragListener(new GoogleMap.11(this, paramOnMarkerDragListener));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public final void setOnMyLocationButtonClickListener(OnMyLocationButtonClickListener paramOnMyLocationButtonClickListener)
  {
    if (paramOnMyLocationButtonClickListener == null);
    try
    {
      this.aic.setOnMyLocationButtonClickListener(null);
      return;
      this.aic.setOnMyLocationButtonClickListener(new GoogleMap.3(this, paramOnMyLocationButtonClickListener));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  @Deprecated
  public final void setOnMyLocationChangeListener(OnMyLocationChangeListener paramOnMyLocationChangeListener)
  {
    if (paramOnMyLocationChangeListener == null);
    try
    {
      this.aic.setOnMyLocationChangeListener(null);
      return;
      this.aic.setOnMyLocationChangeListener(new GoogleMap.2(this, paramOnMyLocationChangeListener));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }

  public final void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      this.aic.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setTrafficEnabled(boolean paramBoolean)
  {
    try
    {
      this.aic.setTrafficEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void snapshot(SnapshotReadyCallback paramSnapshotReadyCallback)
  {
    snapshot(paramSnapshotReadyCallback, null);
  }

  public final void snapshot(SnapshotReadyCallback paramSnapshotReadyCallback, Bitmap paramBitmap)
  {
    com.google.android.gms.dynamic.d locald;
    if (paramBitmap != null)
      locald = e.k(paramBitmap);
    while (true)
    {
      e locale = (e)(e)locald;
      try
      {
        this.aic.snapshot(new GoogleMap.5(this, paramSnapshotReadyCallback), locale);
        return;
        locald = null;
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void stopAnimation()
  {
    try
    {
      this.aic.stopAnimation();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static abstract interface CancelableCallback
  {
    public abstract void onCancel();

    public abstract void onFinish();
  }

  public static abstract interface InfoWindowAdapter
  {
    public abstract View getInfoContents(Marker paramMarker);

    public abstract View getInfoWindow(Marker paramMarker);
  }

  public static abstract interface OnCameraChangeListener
  {
    public abstract void onCameraChange(CameraPosition paramCameraPosition);
  }

  public static abstract interface OnIndoorStateChangeListener
  {
    public abstract void onIndoorBuildingFocused();

    public abstract void onIndoorLevelActivated(IndoorBuilding paramIndoorBuilding);
  }

  public static abstract interface OnInfoWindowClickListener
  {
    public abstract void onInfoWindowClick(Marker paramMarker);
  }

  public static abstract interface OnMapClickListener
  {
    public abstract void onMapClick(LatLng paramLatLng);
  }

  public static abstract interface OnMapLoadedCallback
  {
    public abstract void onMapLoaded();
  }

  public static abstract interface OnMapLongClickListener
  {
    public abstract void onMapLongClick(LatLng paramLatLng);
  }

  public static abstract interface OnMarkerClickListener
  {
    public abstract boolean onMarkerClick(Marker paramMarker);
  }

  public static abstract interface OnMarkerDragListener
  {
    public abstract void onMarkerDrag(Marker paramMarker);

    public abstract void onMarkerDragEnd(Marker paramMarker);

    public abstract void onMarkerDragStart(Marker paramMarker);
  }

  public static abstract interface OnMyLocationButtonClickListener
  {
    public abstract boolean onMyLocationButtonClick();
  }

  @Deprecated
  public static abstract interface OnMyLocationChangeListener
  {
    public abstract void onMyLocationChange(Location paramLocation);
  }

  public static abstract interface SnapshotReadyCallback
  {
    public abstract void onSnapshotReady(Bitmap paramBitmap);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.GoogleMap
 * JD-Core Version:    0.6.0
 */