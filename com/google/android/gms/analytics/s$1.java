package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.util.Map;

class s$1
  implements Runnable
{
  public void run()
  {
    s.a(this.za, this.yZ);
    if (TextUtils.isEmpty((CharSequence)this.yZ.get("&cid")))
      this.yZ.put("&cid", h.dR().getValue("&cid"));
    if ((GoogleAnalytics.getInstance(s.a(this.za)).getAppOptOut()) || (s.b(this.za, this.yZ)));
    while (true)
    {
      return;
      if (!TextUtils.isEmpty(s.b(this.za)))
      {
        t.eq().B(true);
        this.yZ.putAll(new HitBuilders.HitBuilder().setCampaignParamsFromUrl(s.b(this.za)).build());
        t.eq().B(false);
        s.a(this.za, null);
      }
      s.c(this.za, this.yZ);
      Map localMap = x.z(this.yZ);
      s.d(this.za).b(localMap, Long.valueOf((String)this.yZ.get("&ht")).longValue(), s.d(this.za, this.yZ), s.c(this.za));
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.s.1
 * JD-Core Version:    0.6.0
 */