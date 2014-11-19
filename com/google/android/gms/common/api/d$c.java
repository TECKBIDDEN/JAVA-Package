package com.google.android.gms.common.api;

import android.content.IntentSender.SendIntentException;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

class d$c
  implements Runnable
{
  private final int JD;
  private final ConnectionResult JE;

  public d$c(d paramd, int paramInt, ConnectionResult paramConnectionResult)
  {
    this.JD = paramInt;
    this.JE = paramConnectionResult;
  }

  public void run()
  {
    if (this.JE.hasResolution());
    while (true)
    {
      try
      {
        int i = 1 + (1 + this.JF.getActivity().getSupportFragmentManager().getFragments().indexOf(this.JF) << 16);
        this.JE.startResolutionForResult(this.JF.getActivity(), i);
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        d.a(this.JF);
        continue;
      }
      if (GooglePlayServicesUtil.isUserRecoverableError(this.JE.getErrorCode()))
      {
        GooglePlayServicesUtil.showErrorDialogFragment(this.JE.getErrorCode(), this.JF.getActivity(), this.JF, 2, this.JF);
        continue;
      }
      d.a(this.JF, this.JD, this.JE);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.d.c
 * JD-Core Version:    0.6.0
 */