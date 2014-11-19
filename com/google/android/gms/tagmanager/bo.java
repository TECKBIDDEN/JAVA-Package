package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

class bo extends BroadcastReceiver
{
  static final String ya = bo.class.getName();
  private final cx apH;

  bo(cx paramcx)
  {
    this.apH = paramcx;
  }

  public static void A(Context paramContext)
  {
    Intent localIntent = new Intent("com.google.analytics.RADIO_POWERED");
    localIntent.addCategory(paramContext.getPackageName());
    localIntent.putExtra(ya, true);
    paramContext.sendBroadcast(localIntent);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getAction();
    boolean bool;
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(str))
    {
      Bundle localBundle = paramIntent.getExtras();
      Boolean localBoolean = Boolean.FALSE;
      if (localBundle != null)
        localBoolean = Boolean.valueOf(paramIntent.getExtras().getBoolean("noConnectivity"));
      cx localcx = this.apH;
      if (!localBoolean.booleanValue())
      {
        bool = true;
        localcx.A(bool);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      if ((!"com.google.analytics.RADIO_POWERED".equals(str)) || (paramIntent.hasExtra(ya)))
        continue;
      this.apH.ee();
    }
  }

  public void z(Context paramContext)
  {
    IntentFilter localIntentFilter1 = new IntentFilter();
    localIntentFilter1.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    paramContext.registerReceiver(this, localIntentFilter1);
    IntentFilter localIntentFilter2 = new IntentFilter();
    localIntentFilter2.addAction("com.google.analytics.RADIO_POWERED");
    localIntentFilter2.addCategory(paramContext.getPackageName());
    paramContext.registerReceiver(this, localIntentFilter2);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.bo
 * JD-Core Version:    0.6.0
 */