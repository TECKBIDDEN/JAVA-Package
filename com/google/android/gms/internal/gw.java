package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ez
public class gw extends WebViewClient
{
  protected final gv md;
  private final Object mw = new Object();
  private cb pJ;
  private bz pL;
  private v pM;
  private bw pz;
  private a tg;
  private final HashMap<String, by> wP = new HashMap();
  private t wQ;
  private dn wR;
  private boolean wS = false;
  private boolean wT;
  private dq wU;
  private final dg wV;

  public gw(gv paramgv, boolean paramBoolean)
  {
    this(paramgv, paramBoolean, new dg(paramgv, paramgv.getContext(), new bl(paramgv.getContext())));
  }

  gw(gv paramgv, boolean paramBoolean, dg paramdg)
  {
    this.md = paramgv;
    this.wT = paramBoolean;
    this.wV = paramdg;
  }

  private static boolean d(Uri paramUri)
  {
    String str = paramUri.getScheme();
    if (("http".equalsIgnoreCase(str)) || ("https".equalsIgnoreCase(str)));
    for (int i = 1; ; i = 0)
      return i;
  }

  private void e(Uri paramUri)
  {
    String str1 = paramUri.getPath();
    by localby = (by)this.wP.get(str1);
    if (localby != null)
    {
      Map localMap = gj.c(paramUri);
      if (gs.u(2))
      {
        gs.V("Received GMSG: " + str1);
        Iterator localIterator = localMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          gs.V("  " + str2 + ": " + (String)localMap.get(str2));
        }
      }
      localby.a(this.md, localMap);
    }
    while (true)
    {
      return;
      gs.V("No GMSG handler found for GMSG: " + paramUri);
    }
  }

  public final void a(dj paramdj)
  {
    dn localdn = null;
    boolean bool = this.md.dz();
    t localt;
    if ((bool) && (!this.md.Y().og))
    {
      localt = null;
      if (!bool)
        break label70;
    }
    while (true)
    {
      a(new dm(paramdj, localt, localdn, this.wU, this.md.dy()));
      return;
      localt = this.wQ;
      break;
      label70: localdn = this.wR;
    }
  }

  protected void a(dm paramdm)
  {
    dk.a(this.md.getContext(), paramdm);
  }

  public final void a(a parama)
  {
    this.tg = parama;
  }

  public void a(t paramt, dn paramdn, bw parambw, dq paramdq, boolean paramBoolean, bz parambz, cb paramcb, v paramv)
  {
    a(paramt, paramdn, parambw, paramdq, paramBoolean, parambz, paramv);
    a("/setInterstitialProperties", new ca(paramcb));
    this.pJ = paramcb;
  }

  public void a(t paramt, dn paramdn, bw parambw, dq paramdq, boolean paramBoolean, bz parambz, v paramv)
  {
    if (paramv == null)
      paramv = new v(false);
    a("/appEvent", new bv(parambw));
    a("/canOpenURLs", bx.pB);
    a("/click", bx.pC);
    a("/close", bx.pD);
    a("/customClose", bx.pE);
    a("/httpTrack", bx.pF);
    a("/log", bx.pG);
    a("/open", new cd(parambz, paramv));
    a("/touch", bx.pH);
    a("/video", bx.pI);
    a("/mraid", new cc());
    this.wQ = paramt;
    this.wR = paramdn;
    this.pz = parambw;
    this.pL = parambz;
    this.wU = paramdq;
    this.pM = paramv;
    y(paramBoolean);
  }

  public final void a(String paramString, by paramby)
  {
    this.wP.put(paramString, paramby);
  }

  public final void a(boolean paramBoolean, int paramInt)
  {
    if ((this.md.dz()) && (!this.md.Y().og));
    for (t localt = null; ; localt = this.wQ)
    {
      a(new dm(localt, this.wR, this.wU, this.md, paramBoolean, paramInt, this.md.dy()));
      return;
    }
  }

  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    dn localdn = null;
    boolean bool = this.md.dz();
    t localt;
    if ((bool) && (!this.md.Y().og))
    {
      localt = null;
      if (!bool)
        break label89;
    }
    while (true)
    {
      a(new dm(localt, localdn, this.pz, this.wU, this.md, paramBoolean, paramInt, paramString, this.md.dy(), this.pL));
      return;
      localt = this.wQ;
      break;
      label89: localdn = this.wR;
    }
  }

  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    boolean bool = this.md.dz();
    t localt;
    if ((bool) && (!this.md.Y().og))
    {
      localt = null;
      if (!bool)
        break label91;
    }
    label91: for (dn localdn = null; ; localdn = this.wR)
    {
      a(new dm(localt, localdn, this.pz, this.wU, this.md, paramBoolean, paramInt, paramString1, paramString2, this.md.dy(), this.pL));
      return;
      localt = this.wQ;
      break;
    }
  }

  public final void bY()
  {
    synchronized (this.mw)
    {
      this.wS = false;
      this.wT = true;
      dk localdk = this.md.du();
      if (localdk != null)
      {
        if (!gr.dt())
          gr.wC.post(new Runnable(localdk)
          {
            public void run()
            {
              this.wW.bY();
            }
          });
      }
      else
        return;
      localdk.bY();
    }
  }

  public v dE()
  {
    return this.pM;
  }

  public boolean dF()
  {
    synchronized (this.mw)
    {
      boolean bool = this.wT;
      return bool;
    }
  }

  public void dG()
  {
    if (dF())
      this.wV.bQ();
  }

  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    gs.V("Loading resource: " + paramString);
    Uri localUri = Uri.parse(paramString);
    if (("gmsg".equalsIgnoreCase(localUri.getScheme())) && ("mobileads.google.com".equalsIgnoreCase(localUri.getHost())))
      e(localUri);
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (this.tg != null)
    {
      this.tg.a(this.md);
      this.tg = null;
    }
  }

  public final void reset()
  {
    synchronized (this.mw)
    {
      this.wP.clear();
      this.wQ = null;
      this.wR = null;
      this.tg = null;
      this.pz = null;
      this.wS = false;
      this.wT = false;
      this.pL = null;
      this.wU = null;
      return;
    }
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    gs.V("AdWebView shouldOverrideUrlLoading: " + paramString);
    Object localObject1 = Uri.parse(paramString);
    if (("gmsg".equalsIgnoreCase(((Uri)localObject1).getScheme())) && ("mobileads.google.com".equalsIgnoreCase(((Uri)localObject1).getHost())))
      e((Uri)localObject1);
    while (true)
    {
      for (boolean bool = true; ; bool = super.shouldOverrideUrlLoading(paramWebView, paramString))
      {
        return bool;
        if ((!this.wS) || (paramWebView != this.md) || (!d((Uri)localObject1)))
          break;
      }
      if (!this.md.willNotDraw())
      {
        try
        {
          k localk = this.md.dx();
          if ((localk != null) && (localk.b((Uri)localObject1)))
          {
            Uri localUri = localk.a((Uri)localObject1, this.md.getContext());
            localObject1 = localUri;
          }
          localObject2 = localObject1;
          if ((this.pM == null) || (this.pM.av()))
            a(new dj("android.intent.action.VIEW", localObject2.toString(), null, null, null, null, null));
        }
        catch (l locall)
        {
          while (true)
          {
            gs.W("Unable to append parameter to URL: " + paramString);
            Object localObject2 = localObject1;
          }
          this.pM.d(paramString);
        }
        continue;
      }
      gs.W("AdWebView unable to handle URL: " + paramString);
    }
  }

  public final void y(boolean paramBoolean)
  {
    this.wS = paramBoolean;
  }

  public static abstract interface a
  {
    public abstract void a(gv paramgv);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gw
 * JD-Core Version:    0.6.0
 */