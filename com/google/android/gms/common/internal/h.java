package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.ne;

public final class h
{
  private final String LX;

  public h(String paramString)
  {
    this.LX = ((String)n.i(paramString));
  }

  public void a(Context paramContext, String paramString1, String paramString2, Throwable paramThrowable)
  {
    StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; (i < arrayOfStackTraceElement.length) && (i < 2); i++)
    {
      localStringBuilder.append(arrayOfStackTraceElement[i].toString());
      localStringBuilder.append("\n");
    }
    ne localne = new ne(paramContext, 10);
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "GMS_WTF";
    arrayOfString[1] = localStringBuilder.toString();
    localne.a("GMS_WTF", null, arrayOfString);
    localne.send();
    if (aC(7))
    {
      Log.e(paramString1, paramString2, paramThrowable);
      Log.wtf(paramString1, paramString2, paramThrowable);
    }
  }

  public void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (aC(4))
      Log.i(paramString1, paramString2, paramThrowable);
  }

  public boolean aC(int paramInt)
  {
    return Log.isLoggable(this.LX, paramInt);
  }

  public void b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (aC(5))
      Log.w(paramString1, paramString2, paramThrowable);
  }

  public void c(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (aC(6))
      Log.e(paramString1, paramString2, paramThrowable);
  }

  public void n(String paramString1, String paramString2)
  {
    if (aC(3))
      Log.d(paramString1, paramString2);
  }

  public void o(String paramString1, String paramString2)
  {
    if (aC(2))
      Log.v(paramString1, paramString2);
  }

  public void p(String paramString1, String paramString2)
  {
    if (aC(5))
      Log.w(paramString1, paramString2);
  }

  public void q(String paramString1, String paramString2)
  {
    if (aC(6))
      Log.e(paramString1, paramString2);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.h
 * JD-Core Version:    0.6.0
 */