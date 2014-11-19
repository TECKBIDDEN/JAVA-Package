package com.google.android.gms.fitness.request;

import java.util.HashMap;
import java.util.Map;

public class a$a
{
  private static final a TV = new a();
  private final Map<BleScanCallback, a> TW = new HashMap();

  public static a iV()
  {
    return TV;
  }

  public a a(BleScanCallback paramBleScanCallback)
  {
    synchronized (this.TW)
    {
      a locala = (a)this.TW.get(paramBleScanCallback);
      if (locala == null)
      {
        locala = new a(paramBleScanCallback, null);
        this.TW.put(paramBleScanCallback, locala);
      }
      return locala;
    }
  }

  public a b(BleScanCallback paramBleScanCallback)
  {
    a locala;
    synchronized (this.TW)
    {
      locala = (a)this.TW.get(paramBleScanCallback);
      if (locala == null)
        locala = new a(paramBleScanCallback, null);
    }
    return locala;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.a.a
 * JD-Core Version:    0.6.0
 */