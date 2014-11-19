package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;

public class ip
{
  private static boolean GX = false;
  private boolean GY;
  private boolean GZ;
  private String Ha;
  private final String mTag;

  public ip(String paramString)
  {
    this(paramString, fT());
  }

  public ip(String paramString, boolean paramBoolean)
  {
    this.mTag = paramString;
    this.GY = paramBoolean;
    this.GZ = false;
  }

  private String e(String paramString, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length == 0);
    while (true)
    {
      if (!TextUtils.isEmpty(this.Ha))
        paramString = this.Ha + paramString;
      return paramString;
      paramString = String.format(paramString, paramArrayOfObject);
    }
  }

  public static boolean fT()
  {
    return GX;
  }

  public void a(String paramString, Object[] paramArrayOfObject)
  {
    if (fS())
      Log.v(this.mTag, e(paramString, paramArrayOfObject));
  }

  public void a(Throwable paramThrowable, String paramString, Object[] paramArrayOfObject)
  {
    if ((fR()) || (GX))
      Log.d(this.mTag, e(paramString, paramArrayOfObject), paramThrowable);
  }

  public void aK(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    Object[] arrayOfObject;
    for (String str = null; ; str = String.format("[%s] ", arrayOfObject))
    {
      this.Ha = str;
      return;
      arrayOfObject = new Object[1];
      arrayOfObject[0] = paramString;
    }
  }

  public void b(String paramString, Object[] paramArrayOfObject)
  {
    if ((fR()) || (GX))
      Log.d(this.mTag, e(paramString, paramArrayOfObject));
  }

  public void c(String paramString, Object[] paramArrayOfObject)
  {
    Log.i(this.mTag, e(paramString, paramArrayOfObject));
  }

  public void d(String paramString, Object[] paramArrayOfObject)
  {
    Log.w(this.mTag, e(paramString, paramArrayOfObject));
  }

  public boolean fR()
  {
    return this.GY;
  }

  public boolean fS()
  {
    return this.GZ;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ip
 * JD-Core Version:    0.6.0
 */