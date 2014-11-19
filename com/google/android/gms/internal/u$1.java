package com.google.android.gms.internal;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

class u$1
  implements ComponentCallbacks
{
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((u.a(this.lw) != null) && (u.a(this.lw).lI != null) && (u.a(this.lw).lI.rN != null))
      u.a(this.lw).lI.rN.bT();
  }

  public void onLowMemory()
  {
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.u.1
 * JD-Core Version:    0.6.0
 */