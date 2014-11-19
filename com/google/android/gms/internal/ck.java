package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;

@ez
public final class ck
{
  private final ct lq;
  private final Context mContext;
  private final Object mw = new Object();
  private final fi pQ;
  private final cm pR;
  private boolean pS = false;
  private cp pT;

  public ck(Context paramContext, fi paramfi, ct paramct, cm paramcm)
  {
    this.mContext = paramContext;
    this.pQ = paramfi;
    this.lq = paramct;
    this.pR = paramcm;
  }

  public cq a(long paramLong1, long paramLong2)
  {
    gs.S("Starting mediation.");
    Iterator localIterator1 = this.pR.qd.iterator();
    cq localcq;
    while (true)
    {
      if (localIterator1.hasNext())
      {
        cl localcl = (cl)localIterator1.next();
        gs.U("Trying mediation network: " + localcl.pX);
        Iterator localIterator2 = localcl.pY.iterator();
        while (localIterator2.hasNext())
        {
          String str = (String)localIterator2.next();
          synchronized (this.mw)
          {
            if (this.pS)
            {
              localcq = new cq(-1);
              break label258;
            }
            this.pT = new cp(this.mContext, str, this.lq, this.pR, localcl, this.pQ.tx, this.pQ.lH, this.pQ.lD);
            localcq = this.pT.b(paramLong1, paramLong2);
            if (localcq.qx == 0)
              gs.S("Adapter succeeded.");
          }
          if (localcq.qz == null)
            continue;
          gr.wC.post(new ck.1(this, localcq));
        }
        continue;
      }
      localcq = new cq(1);
    }
    label258: return localcq;
  }

  public void cancel()
  {
    synchronized (this.mw)
    {
      this.pS = true;
      if (this.pT != null)
        this.pT.cancel();
      return;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ck
 * JD-Core Version:    0.6.0
 */