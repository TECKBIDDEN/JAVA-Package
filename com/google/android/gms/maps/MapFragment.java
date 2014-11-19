package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class MapFragment extends Fragment
{
  private final MapFragment.b aiF = new MapFragment.b(this);
  private GoogleMap aiG;

  public static MapFragment newInstance()
  {
    return new MapFragment();
  }

  public static MapFragment newInstance(GoogleMapOptions paramGoogleMapOptions)
  {
    MapFragment localMapFragment = new MapFragment();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", paramGoogleMapOptions);
    localMapFragment.setArguments(localBundle);
    return localMapFragment;
  }

  public final GoogleMap getMap()
  {
    GoogleMap localGoogleMap = null;
    IMapFragmentDelegate localIMapFragmentDelegate = mx();
    if (localIMapFragmentDelegate == null);
    while (true)
    {
      return localGoogleMap;
      try
      {
        IGoogleMapDelegate localIGoogleMapDelegate = localIMapFragmentDelegate.getMap();
        if (localIGoogleMapDelegate == null)
          continue;
        if ((this.aiG == null) || (this.aiG.mo().asBinder() != localIGoogleMapDelegate.asBinder()))
          this.aiG = new GoogleMap(localIGoogleMapDelegate);
        localGoogleMap = this.aiG;
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  protected IMapFragmentDelegate mx()
  {
    this.aiF.my();
    if (this.aiF.it() == null);
    for (IMapFragmentDelegate localIMapFragmentDelegate = null; ; localIMapFragmentDelegate = ((MapFragment.a)this.aiF.it()).mx())
      return localIMapFragmentDelegate;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    if (paramBundle != null)
      paramBundle.setClassLoader(MapFragment.class.getClassLoader());
    super.onActivityCreated(paramBundle);
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    MapFragment.b.a(this.aiF, paramActivity);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.aiF.onCreate(paramBundle);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return this.aiF.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }

  public void onDestroy()
  {
    this.aiF.onDestroy();
    super.onDestroy();
  }

  public void onDestroyView()
  {
    this.aiF.onDestroyView();
    super.onDestroyView();
  }

  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    MapFragment.b.a(this.aiF, paramActivity);
    GoogleMapOptions localGoogleMapOptions = GoogleMapOptions.createFromAttributes(paramActivity, paramAttributeSet);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", localGoogleMapOptions);
    this.aiF.onInflate(paramActivity, localBundle, paramBundle);
  }

  public void onLowMemory()
  {
    this.aiF.onLowMemory();
    super.onLowMemory();
  }

  public void onPause()
  {
    this.aiF.onPause();
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    this.aiF.onResume();
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (paramBundle != null)
      paramBundle.setClassLoader(MapFragment.class.getClassLoader());
    super.onSaveInstanceState(paramBundle);
    this.aiF.onSaveInstanceState(paramBundle);
  }

  public void setArguments(Bundle paramBundle)
  {
    super.setArguments(paramBundle);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.MapFragment
 * JD-Core Version:    0.6.0
 */