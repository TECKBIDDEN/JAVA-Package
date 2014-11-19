package com.google.android.gms.maps.model;

public final class CameraPosition$Builder
{
  private LatLng ajq;
  private float ajr;
  private float ajs;
  private float ajt;

  public CameraPosition$Builder()
  {
  }

  public CameraPosition$Builder(CameraPosition paramCameraPosition)
  {
    this.ajq = paramCameraPosition.target;
    this.ajr = paramCameraPosition.zoom;
    this.ajs = paramCameraPosition.tilt;
    this.ajt = paramCameraPosition.bearing;
  }

  public Builder bearing(float paramFloat)
  {
    this.ajt = paramFloat;
    return this;
  }

  public CameraPosition build()
  {
    return new CameraPosition(this.ajq, this.ajr, this.ajs, this.ajt);
  }

  public Builder target(LatLng paramLatLng)
  {
    this.ajq = paramLatLng;
    return this;
  }

  public Builder tilt(float paramFloat)
  {
    this.ajs = paramFloat;
    return this;
  }

  public Builder zoom(float paramFloat)
  {
    this.ajr = paramFloat;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.CameraPosition.Builder
 * JD-Core Version:    0.6.0
 */