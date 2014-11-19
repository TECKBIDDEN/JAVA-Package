package com.google.android.gms.fitness.data;

import com.google.android.gms.fitness.request.DataSourceListener;
import java.util.HashMap;
import java.util.Map;

public class l$a
{
  private static final a SZ = new a();
  private final Map<DataSourceListener, l> Ta = new HashMap();

  public static a iO()
  {
    return SZ;
  }

  public l a(DataSourceListener paramDataSourceListener)
  {
    synchronized (this.Ta)
    {
      l locall = (l)this.Ta.get(paramDataSourceListener);
      if (locall == null)
      {
        locall = new l(paramDataSourceListener, null);
        this.Ta.put(paramDataSourceListener, locall);
      }
      return locall;
    }
  }

  public l b(DataSourceListener paramDataSourceListener)
  {
    synchronized (this.Ta)
    {
      l locall = (l)this.Ta.get(paramDataSourceListener);
      return locall;
    }
  }

  public l c(DataSourceListener paramDataSourceListener)
  {
    l locall;
    synchronized (this.Ta)
    {
      locall = (l)this.Ta.remove(paramDataSourceListener);
      if (locall == null)
        locall = new l(paramDataSourceListener, null);
    }
    return locall;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.l.a
 * JD-Core Version:    0.6.0
 */