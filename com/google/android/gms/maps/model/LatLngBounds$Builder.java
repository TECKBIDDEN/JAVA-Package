package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.n;

public final class LatLngBounds$Builder
{
  private double ajN = (1.0D / 0.0D);
  private double ajO = (-1.0D / 0.0D);
  private double ajP = (0.0D / 0.0D);
  private double ajQ = (0.0D / 0.0D);

  private boolean d(double paramDouble)
  {
    int i = 1;
    int j = 0;
    if (this.ajP <= this.ajQ)
      if ((this.ajP > paramDouble) || (paramDouble > this.ajQ));
    while (true)
    {
      return i;
      i = 0;
      continue;
      if ((this.ajP <= paramDouble) || (paramDouble <= this.ajQ))
        j = i;
      i = j;
    }
  }

  public LatLngBounds build()
  {
    if (!Double.isNaN(this.ajP));
    for (boolean bool = true; ; bool = false)
    {
      n.a(bool, "no included points");
      return new LatLngBounds(new LatLng(this.ajN, this.ajP), new LatLng(this.ajO, this.ajQ));
    }
  }

  public Builder include(LatLng paramLatLng)
  {
    this.ajN = Math.min(this.ajN, paramLatLng.latitude);
    this.ajO = Math.max(this.ajO, paramLatLng.latitude);
    double d = paramLatLng.longitude;
    if (Double.isNaN(this.ajP))
    {
      this.ajP = d;
      this.ajQ = d;
    }
    while (true)
    {
      return this;
      if (d(d))
        continue;
      if (LatLngBounds.d(this.ajP, d) < LatLngBounds.e(this.ajQ, d))
      {
        this.ajP = d;
        continue;
      }
      this.ajQ = d;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.LatLngBounds.Builder
 * JD-Core Version:    0.6.0
 */