package com.google.android.gms.internal;

import android.content.Context;

class fr$1
  implements Runnable
{
  public void run()
  {
    gv localgv = gv.a(this.mV, new ay(), false, false, null, this.uk.lD);
    localgv.setWillNotDraw(true);
    this.ul.b(localgv);
    gw localgw = localgv.dv();
    localgw.a("/invalidRequest", this.ul.us);
    localgw.a("/loadAdURL", this.ul.ut);
    localgw.a("/log", bx.pG);
    localgw.a(this.um);
    gs.S("Loading the JS library.");
    localgv.loadUrl(this.un);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fr.1
 * JD-Core Version:    0.6.0
 */