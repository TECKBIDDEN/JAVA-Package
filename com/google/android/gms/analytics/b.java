package com.google.android.gms.analytics;

import com.google.android.gms.internal.hb;
import java.util.List;
import java.util.Map;

abstract interface b
{
  public abstract void a(Map<String, String> paramMap, long paramLong, String paramString, List<hb> paramList);

  public abstract void connect();

  public abstract void dI();

  public abstract void disconnect();
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.b
 * JD-Core Version:    0.6.0
 */