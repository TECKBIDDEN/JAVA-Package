package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Future;

@ez
public class ai
{
  protected ah a(Context paramContext, gt paramgt, gk<ah> paramgk)
  {
    aj localaj = new aj(paramContext, paramgt);
    localaj.a(new ai.2(this, paramgk, localaj));
    return localaj;
  }

  public Future<ah> a(Context paramContext, gt paramgt, String paramString)
  {
    gk localgk = new gk();
    gr.wC.post(new ai.1(this, paramContext, paramgt, localgk, paramString));
    return localgk;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ai
 * JD-Core Version:    0.6.0
 */