package com.google.android.gms.ads.purchase;

import android.content.Intent;

public abstract interface InAppPurchaseResult
{
  public abstract void finishPurchase();

  public abstract String getProductId();

  public abstract Intent getPurchaseData();

  public abstract int getResultCode();

  public abstract boolean isVerified();
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.purchase.InAppPurchaseResult
 * JD-Core Version:    0.6.0
 */