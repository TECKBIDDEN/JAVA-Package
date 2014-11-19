package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class StreetViewPanoramaView extends FrameLayout
{
  private StreetViewPanorama aiW;
  private final StreetViewPanoramaView.a ajf;

  public StreetViewPanoramaView(Context paramContext)
  {
    super(paramContext);
    this.ajf = new StreetViewPanoramaView.a(this, paramContext, null);
  }

  public StreetViewPanoramaView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.ajf = new StreetViewPanoramaView.a(this, paramContext, null);
  }

  public StreetViewPanoramaView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.ajf = new StreetViewPanoramaView.a(this, paramContext, null);
  }

  public StreetViewPanoramaView(Context paramContext, StreetViewPanoramaOptions paramStreetViewPanoramaOptions)
  {
    super(paramContext);
    this.ajf = new StreetViewPanoramaView.a(this, paramContext, paramStreetViewPanoramaOptions);
  }

  public final StreetViewPanorama getStreetViewPanorama()
  {
    StreetViewPanorama localStreetViewPanorama;
    if (this.aiW != null)
      localStreetViewPanorama = this.aiW;
    while (true)
    {
      return localStreetViewPanorama;
      this.ajf.my();
      if (this.ajf.it() == null)
      {
        localStreetViewPanorama = null;
        continue;
      }
      try
      {
        this.aiW = new StreetViewPanorama(((StreetViewPanoramaView.b)this.ajf.it()).mF().getStreetViewPanorama());
        localStreetViewPanorama = this.aiW;
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void onCreate(Bundle paramBundle)
  {
    this.ajf.onCreate(paramBundle);
    if (this.ajf.it() == null)
      StreetViewPanoramaView.a.b(this);
  }

  public final void onDestroy()
  {
    this.ajf.onDestroy();
  }

  public final void onLowMemory()
  {
    this.ajf.onLowMemory();
  }

  public final void onPause()
  {
    this.ajf.onPause();
  }

  public final void onResume()
  {
    this.ajf.onResume();
  }

  public final void onSaveInstanceState(Bundle paramBundle)
  {
    this.ajf.onSaveInstanceState(paramBundle);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.StreetViewPanoramaView
 * JD-Core Version:    0.6.0
 */