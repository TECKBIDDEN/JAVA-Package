package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.webkit.WebView;

@ez
public class fc
  implements Runnable
{
  private final int lf;
  private final int lg;
  protected final gv md;
  private final Handler td;
  private final long te;
  private long tf;
  private gw.a tg;
  protected boolean th;
  protected boolean ti;

  public fc(gw.a parama, gv paramgv, int paramInt1, int paramInt2)
  {
    this(parama, paramgv, paramInt1, paramInt2, 200L, 50L);
  }

  public fc(gw.a parama, gv paramgv, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    this.te = paramLong1;
    this.tf = paramLong2;
    this.td = new Handler(Looper.getMainLooper());
    this.md = paramgv;
    this.tg = parama;
    this.th = false;
    this.ti = false;
    this.lg = paramInt2;
    this.lf = paramInt1;
  }

  public void a(fk paramfk, ha paramha)
  {
    this.md.setWebViewClient(paramha);
    gv localgv = this.md;
    if (TextUtils.isEmpty(paramfk.rP));
    for (String str = null; ; str = gj.L(paramfk.rP))
    {
      localgv.loadDataWithBaseURL(str, paramfk.tG, "text/html", "UTF-8", null);
      return;
    }
  }

  public void b(fk paramfk)
  {
    a(paramfk, new ha(this, this.md, paramfk.tP));
  }

  public void cA()
  {
    monitorenter;
    try
    {
      this.th = true;
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

  public boolean cB()
  {
    monitorenter;
    try
    {
      boolean bool = this.th;
      monitorexit;
      return bool;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public boolean cC()
  {
    return this.ti;
  }

  public void cz()
  {
    this.td.postDelayed(this, this.te);
  }

  public void run()
  {
    if ((this.md == null) || (cB()))
      this.tg.a(this.md);
    while (true)
    {
      return;
      new a(this.md).execute(new Void[0]);
    }
  }

  protected final class a extends AsyncTask<Void, Void, Boolean>
  {
    private final WebView tj;
    private Bitmap tk;

    public a(WebView arg2)
    {
      Object localObject;
      this.tj = localObject;
    }

    protected Boolean a(Void[] paramArrayOfVoid)
    {
      monitorenter;
      while (true)
      {
        int k;
        int n;
        try
        {
          int i = this.tk.getWidth();
          int j = this.tk.getHeight();
          if ((i != 0) && (j != 0))
            continue;
          Boolean localBoolean1 = Boolean.valueOf(false);
          Object localObject2 = localBoolean1;
          return localObject2;
          k = 0;
          int m = 0;
          if (k >= i)
            continue;
          n = 0;
          if (n >= j)
            break label139;
          if (this.tk.getPixel(k, n) != 0)
          {
            m++;
            break label133;
            if (m / (i * j / 100.0D) <= 0.1D)
              continue;
            boolean bool = true;
            Boolean localBoolean2 = Boolean.valueOf(bool);
            localObject2 = localBoolean2;
            continue;
            bool = false;
            continue;
          }
        }
        finally
        {
          monitorexit;
        }
        label133: n += 10;
        continue;
        label139: k += 10;
      }
    }

    protected void a(Boolean paramBoolean)
    {
      fc.c(fc.this);
      if ((paramBoolean.booleanValue()) || (fc.this.cB()) || (fc.d(fc.this) <= 0L))
      {
        fc.this.ti = paramBoolean.booleanValue();
        fc.e(fc.this).a(fc.this.md);
      }
      while (true)
      {
        return;
        if (fc.d(fc.this) > 0L)
        {
          if (gs.u(2))
            gs.S("Ad not detected, scheduling another run.");
          fc.g(fc.this).postDelayed(fc.this, fc.f(fc.this));
          continue;
        }
      }
    }

    protected void onPreExecute()
    {
      monitorenter;
      try
      {
        this.tk = Bitmap.createBitmap(fc.a(fc.this), fc.b(fc.this), Bitmap.Config.ARGB_8888);
        this.tj.setVisibility(0);
        this.tj.measure(View.MeasureSpec.makeMeasureSpec(fc.a(fc.this), 0), View.MeasureSpec.makeMeasureSpec(fc.b(fc.this), 0));
        this.tj.layout(0, 0, fc.a(fc.this), fc.b(fc.this));
        Canvas localCanvas = new Canvas(this.tk);
        this.tj.draw(localCanvas);
        this.tj.invalidate();
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
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fc
 * JD-Core Version:    0.6.0
 */