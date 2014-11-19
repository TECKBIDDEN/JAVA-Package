package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import org.json.JSONException;
import org.json.JSONObject;

@ez
public class dg
{
  private final Context mContext;
  private final WindowManager mG;
  private final gv md;
  private final bl rg;
  DisplayMetrics rh;
  private float ri;
  int rj = -1;
  int rk = -1;
  private int rl;
  private int rm = -1;
  private int rn = -1;
  private int[] ro = new int[2];

  public dg(gv paramgv, Context paramContext, bl parambl)
  {
    this.md = paramgv;
    this.mContext = paramContext;
    this.rg = parambl;
    this.mG = ((WindowManager)paramContext.getSystemService("window"));
    bN();
    bO();
    bP();
  }

  private void bN()
  {
    this.rh = new DisplayMetrics();
    Display localDisplay = this.mG.getDefaultDisplay();
    localDisplay.getMetrics(this.rh);
    this.ri = this.rh.density;
    this.rl = localDisplay.getRotation();
  }

  private void bP()
  {
    this.md.getLocationOnScreen(this.ro);
    this.md.measure(0, 0);
    float f = 160.0F / this.rh.densityDpi;
    this.rm = Math.round(f * this.md.getMeasuredWidth());
    this.rn = Math.round(f * this.md.getMeasuredHeight());
  }

  private df bV()
  {
    return new df.a().j(this.rg.bj()).i(this.rg.bk()).k(this.rg.bo()).l(this.rg.bl()).m(this.rg.bm()).bM();
  }

  void bO()
  {
    int i = gj.s(this.mContext);
    float f = 160.0F / this.rh.densityDpi;
    this.rj = Math.round(f * this.rh.widthPixels);
    this.rk = Math.round(f * (this.rh.heightPixels - i));
  }

  public void bQ()
  {
    bT();
    bU();
    bS();
    bR();
  }

  public void bR()
  {
    if (gs.u(2))
      gs.U("Dispatching Ready Event.");
    this.md.b("onReadyEventReceived", new JSONObject());
  }

  public void bS()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("x", this.ro[0]).put("y", this.ro[1]).put("width", this.rm).put("height", this.rn);
      this.md.b("onDefaultPositionReceived", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        gs.b("Error occured while dispatching default position.", localJSONException);
    }
  }

  public void bT()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("width", this.rj).put("height", this.rk).put("density", this.ri).put("rotation", this.rl);
      this.md.b("onScreenInfoChanged", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        gs.b("Error occured while obtaining screen information.", localJSONException);
    }
  }

  public void bU()
  {
    df localdf = bV();
    this.md.b("onDeviceFeaturesReceived", localdf.bL());
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dg
 * JD-Core Version:    0.6.0
 */