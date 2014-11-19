package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

class cz
{
  static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramString1, 0).edit();
    localEditor.putString(paramString2, paramString3);
    a(localEditor);
  }

  static void a(SharedPreferences.Editor paramEditor)
  {
    if (Build.VERSION.SDK_INT >= 9)
      paramEditor.apply();
    while (true)
    {
      return;
      new Thread(new cz.1(paramEditor)).start();
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.cz
 * JD-Core Version:    0.6.0
 */