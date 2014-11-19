package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class StreetViewPanoramaFragment extends Fragment
{
  private final StreetViewPanoramaFragment.b aiV = new StreetViewPanoramaFragment.b(this);
  private StreetViewPanorama aiW;

  public static StreetViewPanoramaFragment newInstance()
  {
    return new StreetViewPanoramaFragment();
  }

  public static StreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions paramStreetViewPanoramaOptions)
  {
    StreetViewPanoramaFragment localStreetViewPanoramaFragment = new StreetViewPanoramaFragment();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("StreetViewPanoramaOptions", paramStreetViewPanoramaOptions);
    localStreetViewPanoramaFragment.setArguments(localBundle);
    return localStreetViewPanoramaFragment;
  }

  public final StreetViewPanorama getStreetViewPanorama()
  {
    StreetViewPanorama localStreetViewPanorama = null;
    IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = mB();
    if (localIStreetViewPanoramaFragmentDelegate == null);
    while (true)
    {
      return localStreetViewPanorama;
      try
      {
        IStreetViewPanoramaDelegate localIStreetViewPanoramaDelegate = localIStreetViewPanoramaFragmentDelegate.getStreetViewPanorama();
        if (localIStreetViewPanoramaDelegate == null)
          continue;
        if ((this.aiW == null) || (this.aiW.mA().asBinder() != localIStreetViewPanoramaDelegate.asBinder()))
          this.aiW = new StreetViewPanorama(localIStreetViewPanoramaDelegate);
        localStreetViewPanorama = this.aiW;
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  protected IStreetViewPanoramaFragmentDelegate mB()
  {
    this.aiV.my();
    if (this.aiV.it() == null);
    for (IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = null; ; localIStreetViewPanoramaFragmentDelegate = ((StreetViewPanoramaFragment.a)this.aiV.it()).mB())
      return localIStreetViewPanoramaFragmentDelegate;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    if (paramBundle != null)
      paramBundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
    super.onActivityCreated(paramBundle);
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    StreetViewPanoramaFragment.b.a(this.aiV, paramActivity);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.aiV.onCreate(paramBundle);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return this.aiV.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }

  public void onDestroy()
  {
    this.aiV.onDestroy();
    super.onDestroy();
  }

  public void onDestroyView()
  {
    this.aiV.onDestroyView();
    super.onDestroyView();
  }

  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    StreetViewPanoramaFragment.b.a(this.aiV, paramActivity);
    Bundle localBundle = new Bundle();
    this.aiV.onInflate(paramActivity, localBundle, paramBundle);
  }

  public void onLowMemory()
  {
    this.aiV.onLowMemory();
    super.onLowMemory();
  }

  public void onPause()
  {
    this.aiV.onPause();
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    this.aiV.onResume();
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (paramBundle != null)
      paramBundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
    super.onSaveInstanceState(paramBundle);
    this.aiV.onSaveInstanceState(paramBundle);
  }

  public void setArguments(Bundle paramBundle)
  {
    super.setArguments(paramBundle);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.StreetViewPanoramaFragment
 * JD-Core Version:    0.6.0
 */