package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

@ez
public final class gr
{
  public static final Handler wC = new Handler(Looper.getMainLooper());

  public static String R(String paramString)
  {
    int i = 0;
    if (i < 2);
    while (true)
    {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(paramString.getBytes());
        Locale localLocale = Locale.US;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = new BigInteger(1, localMessageDigest.digest());
        String str2 = String.format(localLocale, "%032X", arrayOfObject);
        str1 = str2;
        return str1;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i++;
      }
      break;
      String str1 = null;
    }
  }

  public static int a(Context paramContext, int paramInt)
  {
    return a(paramContext.getResources().getDisplayMetrics(), paramInt);
  }

  public static int a(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    return (int)TypedValue.applyDimension(1, paramInt, paramDisplayMetrics);
  }

  public static void a(ViewGroup paramViewGroup, ay paramay, String paramString)
  {
    a(paramViewGroup, paramay, paramString, -16777216, -1);
  }

  private static void a(ViewGroup paramViewGroup, ay paramay, String paramString, int paramInt1, int paramInt2)
  {
    if (paramViewGroup.getChildCount() != 0);
    while (true)
    {
      return;
      Context localContext = paramViewGroup.getContext();
      TextView localTextView = new TextView(localContext);
      localTextView.setGravity(17);
      localTextView.setText(paramString);
      localTextView.setTextColor(paramInt1);
      localTextView.setBackgroundColor(paramInt2);
      FrameLayout localFrameLayout = new FrameLayout(localContext);
      localFrameLayout.setBackgroundColor(paramInt1);
      int i = a(localContext, 3);
      localFrameLayout.addView(localTextView, new FrameLayout.LayoutParams(paramay.widthPixels - i, paramay.heightPixels - i, 17));
      paramViewGroup.addView(localFrameLayout, paramay.widthPixels, paramay.heightPixels);
    }
  }

  public static void a(ViewGroup paramViewGroup, ay paramay, String paramString1, String paramString2)
  {
    gs.W(paramString2);
    a(paramViewGroup, paramay, paramString1, -65536, -16777216);
  }

  public static boolean ds()
  {
    return Build.DEVICE.startsWith("generic");
  }

  public static boolean dt()
  {
    if (Looper.myLooper() == Looper.getMainLooper());
    for (int i = 1; ; i = 0)
      return i;
  }

  public static String v(Context paramContext)
  {
    String str = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
    if ((str == null) || (ds()))
      str = "emulator";
    return R(str);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gr
 * JD-Core Version:    0.6.0
 */