package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.gr;

public final class AdSize
{
  public static final int AUTO_HEIGHT = -2;
  public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
  public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
  public static final int FULL_WIDTH = -1;
  public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
  public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
  public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
  public static final AdSize SMART_BANNER;
  public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
  private final int lf;
  private final int lg;
  private final String lh;

  static
  {
    SMART_BANNER = new AdSize(-1, -2, "smart_banner");
  }

  public AdSize(int paramInt1, int paramInt2)
  {
  }

  AdSize(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 < 0) && (paramInt1 != -1))
      throw new IllegalArgumentException("Invalid width for AdSize: " + paramInt1);
    if ((paramInt2 < 0) && (paramInt2 != -2))
      throw new IllegalArgumentException("Invalid height for AdSize: " + paramInt2);
    this.lf = paramInt1;
    this.lg = paramInt2;
    this.lh = paramString;
  }

  public boolean equals(Object paramObject)
  {
    int i = 1;
    if (paramObject == this);
    while (true)
    {
      return i;
      if (!(paramObject instanceof AdSize))
      {
        i = 0;
        continue;
      }
      AdSize localAdSize = (AdSize)paramObject;
      if ((this.lf == localAdSize.lf) && (this.lg == localAdSize.lg) && (this.lh.equals(localAdSize.lh)))
        continue;
      i = 0;
    }
  }

  public int getHeight()
  {
    return this.lg;
  }

  public int getHeightInPixels(Context paramContext)
  {
    if (this.lg == -2);
    for (int i = ay.b(paramContext.getResources().getDisplayMetrics()); ; i = gr.a(paramContext, this.lg))
      return i;
  }

  public int getWidth()
  {
    return this.lf;
  }

  public int getWidthInPixels(Context paramContext)
  {
    if (this.lf == -1);
    for (int i = ay.a(paramContext.getResources().getDisplayMetrics()); ; i = gr.a(paramContext, this.lf))
      return i;
  }

  public int hashCode()
  {
    return this.lh.hashCode();
  }

  public boolean isAutoHeight()
  {
    if (this.lg == -2);
    for (int i = 1; ; i = 0)
      return i;
  }

  public boolean isFullWidth()
  {
    if (this.lf == -1);
    for (int i = 1; ; i = 0)
      return i;
  }

  public String toString()
  {
    return this.lh;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdSize
 * JD-Core Version:    0.6.0
 */