package com.google.android.gms.common.api;

import android.os.DeadObjectException;

abstract interface b$c<A extends Api.a>
{
  public abstract void a(b.a parama);

  public abstract void b(A paramA)
    throws DeadObjectException;

  public abstract void cancel();

  public abstract Api.c<A> gf();

  public abstract int gk();

  public abstract void m(Status paramStatus);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.b.c
 * JD-Core Version:    0.6.0
 */