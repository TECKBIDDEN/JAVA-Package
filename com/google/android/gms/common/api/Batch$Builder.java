package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

public final class Batch$Builder
{
  private List<PendingResult<?>> IA = new ArrayList();
  private Looper IB;

  public Batch$Builder(GoogleApiClient paramGoogleApiClient)
  {
    this.IB = paramGoogleApiClient.getLooper();
  }

  public <R extends Result> BatchResultToken<R> add(PendingResult<R> paramPendingResult)
  {
    BatchResultToken localBatchResultToken = new BatchResultToken(this.IA.size());
    this.IA.add(paramPendingResult);
    return localBatchResultToken;
  }

  public Batch build()
  {
    return new Batch(this.IA, this.IB, null);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Batch.Builder
 * JD-Core Version:    0.6.0
 */