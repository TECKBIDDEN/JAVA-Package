package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class ce
{
  private static ce apS;
  private volatile String anR;
  private volatile a apT;
  private volatile String apU;
  private volatile String apV;

  ce()
  {
    clear();
  }

  private String cF(String paramString)
  {
    return paramString.split("&")[0].split("=")[1];
  }

  private String j(Uri paramUri)
  {
    return paramUri.getQuery().replace("&gtm_debug=x", "");
  }

  static ce oH()
  {
    monitorenter;
    try
    {
      if (apS == null)
        apS = new ce();
      ce localce = apS;
      monitorexit;
      return localce;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  void clear()
  {
    this.apT = a.apW;
    this.apU = null;
    this.anR = null;
    this.apV = null;
  }

  String getContainerId()
  {
    return this.anR;
  }

  boolean i(Uri paramUri)
  {
    int i = 1;
    monitorenter;
    while (true)
    {
      String str;
      try
      {
        str = URLDecoder.decode(paramUri.toString(), "UTF-8");
        if (str.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$"))
        {
          bh.V("Container preview url: " + str);
          if (!str.matches(".*?&gtm_debug=x$"))
            continue;
          this.apT = a.apY;
          this.apV = j(paramUri);
          if ((this.apT != a.apX) && (this.apT != a.apY))
            continue;
          this.apU = ("/r?" + this.apV);
          this.anR = cF(this.apV);
          return i;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        i = 0;
        continue;
        this.apT = a.apX;
        continue;
      }
      finally
      {
        monitorexit;
      }
      if (str.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"))
      {
        if (cF(paramUri.getQuery()).equals(this.anR))
        {
          bh.V("Exit preview mode for container: " + this.anR);
          this.apT = a.apW;
          this.apU = null;
          continue;
        }
      }
      else
      {
        bh.W("Invalid preview uri: " + str);
        i = 0;
        continue;
      }
      i = 0;
    }
  }

  a oI()
  {
    return this.apT;
  }

  String oJ()
  {
    return this.apU;
  }

  static enum a
  {
    static
    {
      a[] arrayOfa = new a[3];
      arrayOfa[0] = apW;
      arrayOfa[1] = apX;
      arrayOfa[2] = apY;
      apZ = arrayOfa;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ce
 * JD-Core Version:    0.6.0
 */