package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class CampaignTrackingReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("referrer");
    if ((!"com.android.vending.INSTALL_REFERRER".equals(paramIntent.getAction())) || (str == null));
    while (true)
    {
      return;
      Intent localIntent = new Intent(paramContext, CampaignTrackingService.class);
      localIntent.putExtra("referrer", str);
      paramContext.startService(localIntent);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.CampaignTrackingReceiver
 * JD-Core Version:    0.6.0
 */