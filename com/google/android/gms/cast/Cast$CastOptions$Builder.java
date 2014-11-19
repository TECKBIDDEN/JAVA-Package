package com.google.android.gms.cast;

import com.google.android.gms.common.internal.n;

public final class Cast$CastOptions$Builder
{
  CastDevice EN;
  Cast.Listener EO;
  private int EP;

  private Cast$CastOptions$Builder(CastDevice paramCastDevice, Cast.Listener paramListener)
  {
    n.b(paramCastDevice, "CastDevice parameter cannot be null");
    n.b(paramListener, "CastListener parameter cannot be null");
    this.EN = paramCastDevice;
    this.EO = paramListener;
    this.EP = 0;
  }

  public Cast.CastOptions build()
  {
    return new Cast.CastOptions(this, null);
  }

  public Builder setVerboseLoggingEnabled(boolean paramBoolean)
  {
    if (paramBoolean);
    for (this.EP = (0x1 | this.EP); ; this.EP = (0xFFFFFFFE & this.EP))
      return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.Cast.CastOptions.Builder
 * JD-Core Version:    0.6.0
 */