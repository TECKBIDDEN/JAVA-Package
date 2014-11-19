package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragment extends Fragment
{
  private final Fragment Sb = this;
  private WalletFragmentOptions atJ;
  private WalletFragmentInitParams atK;
  private MaskedWalletRequest atL;
  private MaskedWallet atM;
  private Boolean atN;
  private WalletFragment.b atS;
  private final b atT = b.a(this);
  private final WalletFragment.c atU = new WalletFragment.c(this, null);
  private WalletFragment.a atV = new WalletFragment.a(this);
  private boolean mCreated = false;

  public static WalletFragment newInstance(WalletFragmentOptions paramWalletFragmentOptions)
  {
    WalletFragment localWalletFragment = new WalletFragment();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("extraWalletFragmentOptions", paramWalletFragmentOptions);
    localWalletFragment.Sb.setArguments(localBundle);
    return localWalletFragment;
  }

  public int getState()
  {
    if (this.atS != null);
    for (int i = WalletFragment.b.a(this.atS); ; i = 0)
      return i;
  }

  public void initialize(WalletFragmentInitParams paramWalletFragmentInitParams)
  {
    if (this.atS != null)
    {
      WalletFragment.b.a(this.atS, paramWalletFragmentInitParams);
      this.atK = null;
    }
    while (true)
    {
      return;
      if (this.atK == null)
      {
        this.atK = paramWalletFragmentInitParams;
        if (this.atL != null)
          Log.w("WalletFragment", "updateMaskedWalletRequest() was called before initialize()");
        if (this.atM == null)
          continue;
        Log.w("WalletFragment", "updateMaskedWallet() was called before initialize()");
        continue;
      }
      Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.atS != null)
      WalletFragment.b.a(this.atS, paramInt1, paramInt2, paramIntent);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      paramBundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
      WalletFragmentInitParams localWalletFragmentInitParams = (WalletFragmentInitParams)paramBundle.getParcelable("walletFragmentInitParams");
      if (localWalletFragmentInitParams != null)
      {
        if (this.atK != null)
          Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
        this.atK = localWalletFragmentInitParams;
      }
      if (this.atL == null)
        this.atL = ((MaskedWalletRequest)paramBundle.getParcelable("maskedWalletRequest"));
      if (this.atM == null)
        this.atM = ((MaskedWallet)paramBundle.getParcelable("maskedWallet"));
      if (paramBundle.containsKey("walletFragmentOptions"))
        this.atJ = ((WalletFragmentOptions)paramBundle.getParcelable("walletFragmentOptions"));
      if (paramBundle.containsKey("enabled"))
        this.atN = Boolean.valueOf(paramBundle.getBoolean("enabled"));
    }
    while (true)
    {
      this.mCreated = true;
      this.atU.onCreate(paramBundle);
      return;
      if (this.Sb.getArguments() == null)
        continue;
      WalletFragmentOptions localWalletFragmentOptions = (WalletFragmentOptions)this.Sb.getArguments().getParcelable("extraWalletFragmentOptions");
      if (localWalletFragmentOptions == null)
        continue;
      localWalletFragmentOptions.Z(this.Sb.getActivity());
      this.atJ = localWalletFragmentOptions;
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return this.atU.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.mCreated = false;
  }

  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    if (this.atJ == null)
      this.atJ = WalletFragmentOptions.a(paramActivity, paramAttributeSet);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("attrKeyWalletFragmentOptions", this.atJ);
    this.atU.onInflate(paramActivity, localBundle, paramBundle);
  }

  public void onPause()
  {
    super.onPause();
    this.atU.onPause();
  }

  public void onResume()
  {
    super.onResume();
    this.atU.onResume();
    FragmentManager localFragmentManager = this.Sb.getActivity().getFragmentManager();
    Fragment localFragment = localFragmentManager.findFragmentByTag("GooglePlayServicesErrorDialog");
    if (localFragment != null)
    {
      localFragmentManager.beginTransaction().remove(localFragment).commit();
      GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.Sb.getActivity()), this.Sb.getActivity(), -1);
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
    this.atU.onSaveInstanceState(paramBundle);
    if (this.atK != null)
    {
      paramBundle.putParcelable("walletFragmentInitParams", this.atK);
      this.atK = null;
    }
    if (this.atL != null)
    {
      paramBundle.putParcelable("maskedWalletRequest", this.atL);
      this.atL = null;
    }
    if (this.atM != null)
    {
      paramBundle.putParcelable("maskedWallet", this.atM);
      this.atM = null;
    }
    if (this.atJ != null)
    {
      paramBundle.putParcelable("walletFragmentOptions", this.atJ);
      this.atJ = null;
    }
    if (this.atN != null)
    {
      paramBundle.putBoolean("enabled", this.atN.booleanValue());
      this.atN = null;
    }
  }

  public void onStart()
  {
    super.onStart();
    this.atU.onStart();
  }

  public void onStop()
  {
    super.onStop();
    this.atU.onStop();
  }

  public void setEnabled(boolean paramBoolean)
  {
    if (this.atS != null)
      WalletFragment.b.a(this.atS, paramBoolean);
    for (this.atN = null; ; this.atN = Boolean.valueOf(paramBoolean))
      return;
  }

  public void setOnStateChangedListener(OnStateChangedListener paramOnStateChangedListener)
  {
    this.atV.a(paramOnStateChangedListener);
  }

  public void updateMaskedWallet(MaskedWallet paramMaskedWallet)
  {
    if (this.atS != null)
      WalletFragment.b.a(this.atS, paramMaskedWallet);
    for (this.atM = null; ; this.atM = paramMaskedWallet)
      return;
  }

  public void updateMaskedWalletRequest(MaskedWalletRequest paramMaskedWalletRequest)
  {
    if (this.atS != null)
      WalletFragment.b.a(this.atS, paramMaskedWalletRequest);
    for (this.atL = null; ; this.atL = paramMaskedWalletRequest)
      return;
  }

  public static abstract interface OnStateChangedListener
  {
    public abstract void onStateChanged(WalletFragment paramWalletFragment, int paramInt1, int paramInt2, Bundle paramBundle);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragment
 * JD-Core Version:    0.6.0
 */