package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.fitness.data.Subscription;

public class ae$a
{
  private Subscription UH;
  private boolean UI = false;

  public a b(Subscription paramSubscription)
  {
    this.UH = paramSubscription;
    return this;
  }

  public ae jD()
  {
    if (this.UH != null);
    for (boolean bool = true; ; bool = false)
    {
      n.a(bool, "Must call setSubscription()");
      return new ae(this, null);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.ae.a
 * JD-Core Version:    0.6.0
 */