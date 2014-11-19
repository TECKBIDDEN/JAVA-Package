package com.google.android.gms.maps.model;

public abstract interface TileProvider
{
  public static final Tile NO_TILE = new Tile(-1, -1, null);

  public abstract Tile getTile(int paramInt1, int paramInt2, int paramInt3);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.TileProvider
 * JD-Core Version:    0.6.0
 */