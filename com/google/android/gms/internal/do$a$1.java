package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

class do$a$1
  implements Runnable
{
  private final WeakReference<do> sd = new WeakReference(this.se);

  public void run()
  {
    do localdo = (do)this.sd.get();
    if ((!do.a.a(this.sf)) && (localdo != null))
    {
      localdo.cj();
      this.sf.ck();
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.do.a.1
 * JD-Core Version:    0.6.0
 */