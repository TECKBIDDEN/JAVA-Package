package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

public class b
  implements DialogInterface.OnClickListener
{
  private final Fragment Ll;
  private final int Lm;
  private final Intent mIntent;
  private final Activity nr;

  public b(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    this.nr = paramActivity;
    this.Ll = null;
    this.mIntent = paramIntent;
    this.Lm = paramInt;
  }

  public b(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    this.nr = null;
    this.Ll = paramFragment;
    this.mIntent = paramIntent;
    this.Lm = paramInt;
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      if ((this.mIntent != null) && (this.Ll != null))
        this.Ll.startActivityForResult(this.mIntent, this.Lm);
      while (true)
      {
        paramDialogInterface.dismiss();
        break;
        if (this.mIntent == null)
          continue;
        this.nr.startActivityForResult(this.mIntent, this.Lm);
      }
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.b
 * JD-Core Version:    0.6.0
 */