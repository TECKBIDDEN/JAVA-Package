package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.n;
import java.util.ArrayList;
import java.util.HashMap;

public class DataHolder$a
{
  private final String[] JU;
  private final ArrayList<HashMap<String, Object>> Kd;
  private final String Ke;
  private final HashMap<Object, Integer> Kf;
  private boolean Kg;
  private String Kh;

  private DataHolder$a(String[] paramArrayOfString, String paramString)
  {
    this.JU = ((String[])n.i(paramArrayOfString));
    this.Kd = new ArrayList();
    this.Ke = paramString;
    this.Kf = new HashMap();
    this.Kg = false;
    this.Kh = null;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataHolder.a
 * JD-Core Version:    0.6.0
 */