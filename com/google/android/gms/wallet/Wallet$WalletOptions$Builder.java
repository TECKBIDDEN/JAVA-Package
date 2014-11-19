package com.google.android.gms.wallet;

import java.util.Locale;

public final class Wallet$WalletOptions$Builder
{
  private int atA = 0;
  private int mTheme = 0;

  public Wallet.WalletOptions build()
  {
    return new Wallet.WalletOptions(this, null);
  }

  public Builder setEnvironment(int paramInt)
  {
    if ((paramInt == 0) || (paramInt == 2) || (paramInt == 1))
    {
      this.atA = paramInt;
      return this;
    }
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    throw new IllegalArgumentException(String.format(localLocale, "Invalid environment value %d", arrayOfObject));
  }

  public Builder setTheme(int paramInt)
  {
    if ((paramInt == 0) || (paramInt == 1))
    {
      this.mTheme = paramInt;
      return this;
    }
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    throw new IllegalArgumentException(String.format(localLocale, "Invalid theme value %d", arrayOfObject));
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Wallet.WalletOptions.Builder
 * JD-Core Version:    0.6.0
 */