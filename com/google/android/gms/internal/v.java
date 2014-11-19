package com.google.android.gms.internal;

import android.os.Bundle;

@ez
public class v
{
  private a lZ;
  private boolean ma;
  private boolean mb;

  public v()
  {
    Bundle localBundle = gb.bD();
    if ((localBundle != null) && (localBundle.getBoolean("gads:block_autoclicks", false)))
      bool = true;
    this.mb = bool;
  }

  public v(boolean paramBoolean)
  {
    this.mb = paramBoolean;
  }

  public void a(a parama)
  {
    this.lZ = parama;
  }

  public void ar()
  {
    this.ma = true;
  }

  public boolean av()
  {
    if ((!this.mb) || (this.ma));
    for (int i = 1; ; i = 0)
      return i;
  }

  public void d(String paramString)
  {
    gs.S("Action was blocked because no click was detected.");
    if (this.lZ != null)
      this.lZ.e(paramString);
  }

  public static abstract interface a
  {
    public abstract void e(String paramString);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.v
 * JD-Core Version:    0.6.0
 */