package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.m;
import java.net.URI;
import java.net.URISyntaxException;

@ez
public class ha extends WebViewClient
{
  private final gv md;
  private final String xc = Z(paramString);
  private boolean xd = false;
  private final fc xe;

  public ha(fc paramfc, gv paramgv, String paramString)
  {
    this.md = paramgv;
    this.xe = paramfc;
  }

  private String Z(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return paramString;
      try
      {
        if (!paramString.endsWith("/"))
          continue;
        String str = paramString.substring(0, -1 + paramString.length());
        paramString = str;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        gs.T(localIndexOutOfBoundsException.getMessage());
      }
    }
  }

  protected boolean Y(String paramString)
  {
    int i = 0;
    String str1 = Z(paramString);
    if (TextUtils.isEmpty(str1));
    while (true)
    {
      return i;
      try
      {
        URI localURI1 = new URI(str1);
        if ("passback".equals(localURI1.getScheme()))
        {
          gs.S("Passback received");
          this.xe.cA();
          i = 1;
          continue;
        }
        if (TextUtils.isEmpty(this.xc))
          continue;
        URI localURI2 = new URI(this.xc);
        String str2 = localURI2.getHost();
        String str3 = localURI1.getHost();
        String str4 = localURI2.getPath();
        String str5 = localURI1.getPath();
        if ((!m.equal(str2, str3)) || (!m.equal(str4, str5)))
          continue;
        gs.S("Passback received");
        this.xe.cA();
        i = 1;
      }
      catch (URISyntaxException localURISyntaxException)
      {
        gs.T(localURISyntaxException.getMessage());
      }
    }
  }

  public void onLoadResource(WebView paramWebView, String paramString)
  {
    gs.S("JavascriptAdWebViewClient::onLoadResource: " + paramString);
    if (!Y(paramString))
      this.md.dv().onLoadResource(this.md, paramString);
  }

  public void onPageFinished(WebView paramWebView, String paramString)
  {
    gs.S("JavascriptAdWebViewClient::onPageFinished: " + paramString);
    if (!this.xd)
    {
      this.xe.cz();
      this.xd = true;
    }
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    gs.S("JavascriptAdWebViewClient::shouldOverrideUrlLoading: " + paramString);
    if (Y(paramString))
      gs.S("shouldOverrideUrlLoading: received passback url");
    for (boolean bool = true; ; bool = this.md.dv().shouldOverrideUrlLoading(this.md, paramString))
      return bool;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ha
 * JD-Core Version:    0.6.0
 */