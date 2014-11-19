package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class MapView extends FrameLayout
{
  private GoogleMap aiG;
  private final MapView.b aiJ;

  public MapView(Context paramContext)
  {
    super(paramContext);
    this.aiJ = new MapView.b(this, paramContext, null);
  }

  public MapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.aiJ = new MapView.b(this, paramContext, GoogleMapOptions.createFromAttributes(paramContext, paramAttributeSet));
  }

  public MapView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.aiJ = new MapView.b(this, paramContext, GoogleMapOptions.createFromAttributes(paramContext, paramAttributeSet));
  }

  public MapView(Context paramContext, GoogleMapOptions paramGoogleMapOptions)
  {
    super(paramContext);
    this.aiJ = new MapView.b(this, paramContext, paramGoogleMapOptions);
  }

  public final GoogleMap getMap()
  {
    GoogleMap localGoogleMap;
    if (this.aiG != null)
      localGoogleMap = this.aiG;
    while (true)
    {
      return localGoogleMap;
      this.aiJ.my();
      if (this.aiJ.it() == null)
      {
        localGoogleMap = null;
        continue;
      }
      try
      {
        this.aiG = new GoogleMap(((MapView.a)this.aiJ.it()).mz().getMap());
        localGoogleMap = this.aiG;
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void onCreate(Bundle paramBundle)
  {
    this.aiJ.onCreate(paramBundle);
    if (this.aiJ.it() == null)
      MapView.b.b(this);
  }

  public final void onDestroy()
  {
    this.aiJ.onDestroy();
  }

  public final void onLowMemory()
  {
    this.aiJ.onLowMemory();
  }

  public final void onPause()
  {
    this.aiJ.onPause();
  }

  public final void onResume()
  {
    this.aiJ.onResume();
  }

  public final void onSaveInstanceState(Bundle paramBundle)
  {
    this.aiJ.onSaveInstanceState(paramBundle);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.MapView
 * JD-Core Version:    0.6.0
 */