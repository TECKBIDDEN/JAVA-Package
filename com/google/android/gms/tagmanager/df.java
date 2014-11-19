package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

class df
{
  private GoogleAnalytics arF;
  private Context mContext;
  private Tracker xY;

  df(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private void cS(String paramString)
  {
    monitorenter;
    try
    {
      if (this.arF == null)
      {
        this.arF = GoogleAnalytics.getInstance(this.mContext);
        this.arF.setLogger(new df.a());
        this.xY = this.arF.newTracker(paramString);
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public Tracker cR(String paramString)
  {
    cS(paramString);
    return this.xY;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.df
 * JD-Core Version:    0.6.0
 */