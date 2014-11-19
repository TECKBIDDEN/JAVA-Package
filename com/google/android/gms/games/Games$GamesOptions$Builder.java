package com.google.android.gms.games;

import java.util.ArrayList;

public final class Games$GamesOptions$Builder
{
  boolean Vs = false;
  boolean Vt = true;
  int Vu = 17;
  boolean Vv = false;
  int Vw = 4368;
  String Vx = null;
  ArrayList<String> Vy = new ArrayList();

  public Games.GamesOptions build()
  {
    return new Games.GamesOptions(this, null);
  }

  public Builder setSdkVariant(int paramInt)
  {
    this.Vw = paramInt;
    return this;
  }

  public Builder setShowConnectingPopup(boolean paramBoolean)
  {
    this.Vt = paramBoolean;
    this.Vu = 17;
    return this;
  }

  public Builder setShowConnectingPopup(boolean paramBoolean, int paramInt)
  {
    this.Vt = paramBoolean;
    this.Vu = paramInt;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.Games.GamesOptions.Builder
 * JD-Core Version:    0.6.0
 */