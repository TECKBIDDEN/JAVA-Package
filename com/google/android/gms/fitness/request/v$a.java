package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.fitness.data.Session;

public class v$a
{
  private Session Sk;

  public a b(Session paramSession)
  {
    if (paramSession.getEndTimeMillis() == 0L);
    for (boolean bool = true; ; bool = false)
    {
      n.b(bool, "Cannot start a session which has already ended");
      this.Sk = paramSession;
      return this;
    }
  }

  public v jx()
  {
    return new v(this, null);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.v.a
 * JD-Core Version:    0.6.0
 */