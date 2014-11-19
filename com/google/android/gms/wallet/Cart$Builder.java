package com.google.android.gms.wallet;

import java.util.ArrayList;
import java.util.List;

public final class Cart$Builder
{
  private Cart$Builder(Cart paramCart)
  {
  }

  public Builder addLineItem(LineItem paramLineItem)
  {
    this.asn.asm.add(paramLineItem);
    return this;
  }

  public Cart build()
  {
    return this.asn;
  }

  public Builder setCurrencyCode(String paramString)
  {
    this.asn.asl = paramString;
    return this;
  }

  public Builder setLineItems(List<LineItem> paramList)
  {
    this.asn.asm.clear();
    this.asn.asm.addAll(paramList);
    return this;
  }

  public Builder setTotalPrice(String paramString)
  {
    this.asn.ask = paramString;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Cart.Builder
 * JD-Core Version:    0.6.0
 */