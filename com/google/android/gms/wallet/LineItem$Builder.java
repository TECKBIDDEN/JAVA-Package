package com.google.android.gms.wallet;

public final class LineItem$Builder
{
  private LineItem$Builder(LineItem paramLineItem)
  {
  }

  public LineItem build()
  {
    return this.asH;
  }

  public Builder setCurrencyCode(String paramString)
  {
    this.asH.asl = paramString;
    return this;
  }

  public Builder setDescription(String paramString)
  {
    this.asH.description = paramString;
    return this;
  }

  public Builder setQuantity(String paramString)
  {
    this.asH.asE = paramString;
    return this;
  }

  public Builder setRole(int paramInt)
  {
    this.asH.asG = paramInt;
    return this;
  }

  public Builder setTotalPrice(String paramString)
  {
    this.asH.ask = paramString;
    return this;
  }

  public Builder setUnitPrice(String paramString)
  {
    this.asH.asF = paramString;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.LineItem.Builder
 * JD-Core Version:    0.6.0
 */