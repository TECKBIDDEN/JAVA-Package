package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.d.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

class dm
{
  private static bz<d.a> a(bz<d.a> parambz)
  {
    try
    {
      bz localbz = new bz(di.u(db(di.j((d.a)parambz.getObject()))), parambz.oE());
      parambz = localbz;
      return parambz;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        bh.b("Escape URI: unsupported encoding", localUnsupportedEncodingException);
    }
  }

  private static bz<d.a> a(bz<d.a> parambz, int paramInt)
  {
    if (!q((d.a)parambz.getObject()))
      bh.T("Escaping can only be applied to strings.");
    while (true)
    {
      return parambz;
      switch (paramInt)
      {
      default:
        bh.T("Unsupported Value Escaping: " + paramInt);
        break;
      case 12:
        parambz = a(parambz);
      }
    }
  }

  static bz<d.a> a(bz<d.a> parambz, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
      parambz = a(parambz, paramArrayOfInt[j]);
    return parambz;
  }

  static String db(String paramString)
    throws UnsupportedEncodingException
  {
    return URLEncoder.encode(paramString, "UTF-8").replaceAll("\\+", "%20");
  }

  private static boolean q(d.a parama)
  {
    return di.o(parama) instanceof String;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.dm
 * JD-Core Version:    0.6.0
 */