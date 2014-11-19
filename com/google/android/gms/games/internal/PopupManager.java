package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.internal.kc;

public class PopupManager
{
  protected GamesClientImpl XO;
  protected PopupLocationInfo XP;

  private PopupManager(GamesClientImpl paramGamesClientImpl, int paramInt)
  {
    this.XO = paramGamesClientImpl;
    dG(paramInt);
  }

  public static PopupManager a(GamesClientImpl paramGamesClientImpl, int paramInt)
  {
    if (kc.hC());
    for (Object localObject = new PopupManager.PopupManagerHCMR1(paramGamesClientImpl, paramInt); ; localObject = new PopupManager(paramGamesClientImpl, paramInt))
      return localObject;
  }

  protected void dG(int paramInt)
  {
    this.XP = new PopupLocationInfo(paramInt, new Binder(), null);
  }

  public void kJ()
  {
    this.XO.a(this.XP.XQ, this.XP.kM());
  }

  public Bundle kK()
  {
    return this.XP.kM();
  }

  public IBinder kL()
  {
    return this.XP.XQ;
  }

  public void l(View paramView)
  {
  }

  public void setGravity(int paramInt)
  {
    this.XP.gravity = paramInt;
  }

  public static final class PopupLocationInfo
  {
    public IBinder XQ;
    public int XR = -1;
    public int bottom = 0;
    public int gravity;
    public int left = 0;
    public int right = 0;
    public int top = 0;

    private PopupLocationInfo(int paramInt, IBinder paramIBinder)
    {
      this.gravity = paramInt;
      this.XQ = paramIBinder;
    }

    public Bundle kM()
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("popupLocationInfo.gravity", this.gravity);
      localBundle.putInt("popupLocationInfo.displayId", this.XR);
      localBundle.putInt("popupLocationInfo.left", this.left);
      localBundle.putInt("popupLocationInfo.top", this.top);
      localBundle.putInt("popupLocationInfo.right", this.right);
      localBundle.putInt("popupLocationInfo.bottom", this.bottom);
      return localBundle;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.PopupManager
 * JD-Core Version:    0.6.0
 */