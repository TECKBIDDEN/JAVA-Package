package com.google.android.gms.internal;

import android.content.Intent;

@ez
public class ee
{
  private final String oA;

  public ee(String paramString)
  {
    this.oA = paramString;
  }

  public boolean a(String paramString, int paramInt, Intent paramIntent)
  {
    int i = 0;
    if ((paramString == null) || (paramIntent == null));
    while (true)
    {
      return i;
      String str1 = ed.e(paramIntent);
      String str2 = ed.f(paramIntent);
      if ((str1 == null) || (str2 == null))
        continue;
      if (!paramString.equals(ed.D(str1)))
      {
        gs.W("Developer payload not match.");
        continue;
      }
      if ((this.oA != null) && (!ef.b(this.oA, str1, str2)))
      {
        gs.W("Fail to verify signature.");
        continue;
      }
      i = 1;
    }
  }

  public String cu()
  {
    return gj.dp();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ee
 * JD-Core Version:    0.6.0
 */