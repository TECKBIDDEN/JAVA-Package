package com.google.android.gms.wallet;

public abstract interface NotifyTransactionStatusRequest$Status
{
  public static final int SUCCESS = 1;

  public static abstract interface Error
  {
    public static final int AVS_DECLINE = 7;
    public static final int BAD_CARD = 4;
    public static final int BAD_CVC = 3;
    public static final int DECLINED = 5;
    public static final int FRAUD_DECLINE = 8;
    public static final int OTHER = 6;
    public static final int UNKNOWN = 2;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.NotifyTransactionStatusRequest.Status
 * JD-Core Version:    0.6.0
 */