package com.google.android.gms.ads.mediation.customevent;

public abstract interface CustomEventListener
{
  public abstract void onAdClicked();

  public abstract void onAdClosed();

  public abstract void onAdFailedToLoad(int paramInt);

  public abstract void onAdLeftApplication();

  public abstract void onAdOpened();
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventListener
 * JD-Core Version:    0.6.0
 */