package com.google.android.gms.wallet;

import android.text.TextUtils;
import com.google.android.gms.common.internal.n;

public final class NotifyTransactionStatusRequest$Builder
{
  private NotifyTransactionStatusRequest$Builder(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
  }

  public NotifyTransactionStatusRequest build()
  {
    int i = 1;
    if (!TextUtils.isEmpty(this.atr.asq))
    {
      int k = i;
      n.b(k, "googleTransactionId is required");
      if ((this.atr.status < i) || (this.atr.status > 8))
        break label62;
    }
    while (true)
    {
      n.b(i, "status is an unrecognized value");
      return this.atr;
      int m = 0;
      break;
      label62: int j = 0;
    }
  }

  public Builder setDetailedReason(String paramString)
  {
    this.atr.atq = paramString;
    return this;
  }

  public Builder setGoogleTransactionId(String paramString)
  {
    this.atr.asq = paramString;
    return this;
  }

  public Builder setStatus(int paramInt)
  {
    this.atr.status = paramInt;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.NotifyTransactionStatusRequest.Builder
 * JD-Core Version:    0.6.0
 */