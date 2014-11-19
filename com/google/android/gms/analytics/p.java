package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

class p extends BroadcastReceiver
{
  static final String ya = p.class.getName();
  private final ae yb;

  p(ae paramae)
  {
    this.yb = paramae;
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
    boolean bool1 = false;
    String str = paramIntent.getAction();
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(str))
    {
      boolean bool2 = paramIntent.getBooleanExtra("noConnectivity", false);
      ae localae = this.yb;
      if (!bool2)
        bool1 = true;
      localae.A(bool1);
    }
    while (true)
    {
      return;
      if (("com.google.analytics.RADIO_POWERED".equals(str)) && (!paramIntent.hasExtra(ya)))
      {
        this.yb.ee();
        continue;
      }
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
 * Qualified Name:     com.google.android.gms.analytics.p
 * JD-Core Version:    0.6.0
 */