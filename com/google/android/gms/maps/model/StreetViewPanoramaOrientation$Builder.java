package com.google.android.gms.maps.model;

public final class StreetViewPanoramaOrientation$Builder
{
  public float bearing;
  public float tilt;

  public StreetViewPanoramaOrientation$Builder()
  {
  }

  public StreetViewPanoramaOrientation$Builder(StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation)
  {
    this.bearing = paramStreetViewPanoramaOrientation.bearing;
    this.tilt = paramStreetViewPanoramaOrientation.tilt;
  }

  public Builder bearing(float paramFloat)
  {
    this.bearing = paramFloat;
    return this;
  }

  public StreetViewPanoramaOrientation build()
  {
    return new StreetViewPanoramaOrientation(this.tilt, this.bearing);
  }

  public Builder tilt(float paramFloat)
  {
    this.tilt = paramFloat;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder
 * JD-Core Version:    0.6.0
 */