package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;

@ez
public class ey
  implements Thread.UncaughtExceptionHandler
{
  private Context mContext;
  private Thread.UncaughtExceptionHandler sR;
  private Thread.UncaughtExceptionHandler sS;
  private gt sT;

  public ey(Context paramContext, gt paramgt, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler1, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler2)
  {
    this.sR = paramUncaughtExceptionHandler1;
    this.sS = paramUncaughtExceptionHandler2;
    this.mContext = paramContext;
    this.sT = paramgt;
  }

  public static ey a(Context paramContext, Thread paramThread, gt paramgt)
  {
    Object localObject;
    if ((paramContext == null) || (paramThread == null) || (paramgt == null))
      localObject = null;
    while (true)
    {
      return localObject;
      gb.bD();
      if (!k(paramContext))
      {
        localObject = null;
        continue;
      }
      Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = paramThread.getUncaughtExceptionHandler();
      ey localey = new ey(paramContext, paramgt, localUncaughtExceptionHandler, Thread.getDefaultUncaughtExceptionHandler());
      if ((localUncaughtExceptionHandler == null) || (!(localUncaughtExceptionHandler instanceof ey)))
      {
        try
        {
          paramThread.setUncaughtExceptionHandler(localey);
          localObject = localey;
        }
        catch (SecurityException localSecurityException)
        {
          gs.c("Fail to set UncaughtExceptionHandler.", localSecurityException);
          localObject = null;
        }
        continue;
      }
      localObject = (ey)localUncaughtExceptionHandler;
    }
  }

  private String cx()
  {
    String str1 = Build.MANUFACTURER;
    String str2 = Build.MODEL;
    if (str2.startsWith(str1));
    while (true)
    {
      return str2;
      str2 = str1 + " " + str2;
    }
  }

  private Throwable d(Throwable paramThrowable)
  {
    Bundle localBundle = gb.bD();
    if ((localBundle != null) && (localBundle.getBoolean("gads:sdk_crash_report_full_stacktrace", false)))
      return paramThrowable;
    LinkedList localLinkedList = new LinkedList();
    while (paramThrowable != null)
    {
      localLinkedList.push(paramThrowable);
      paramThrowable = paramThrowable.getCause();
    }
    Object localObject1 = null;
    label48: Throwable localThrowable;
    Object localObject2;
    if (!localLinkedList.isEmpty())
    {
      localThrowable = (Throwable)localLinkedList.pop();
      StackTraceElement[] arrayOfStackTraceElement = localThrowable.getStackTrace();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new StackTraceElement(localThrowable.getClass().getName(), "<filtered>", "<filtered>", 1));
      int i = arrayOfStackTraceElement.length;
      int j = 0;
      int k = 0;
      if (j < i)
      {
        StackTraceElement localStackTraceElement = arrayOfStackTraceElement[j];
        if (G(localStackTraceElement.getClassName()))
        {
          localArrayList.add(localStackTraceElement);
          k = 1;
        }
        while (true)
        {
          j++;
          break;
          if (H(localStackTraceElement.getClassName()))
          {
            localArrayList.add(localStackTraceElement);
            continue;
          }
          localArrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
        }
      }
      if (k == 0)
        break label279;
      if (localObject1 == null)
      {
        localObject2 = new Throwable(localThrowable.getMessage());
        label230: ((Throwable)localObject2).setStackTrace((StackTraceElement[])localArrayList.toArray(new StackTraceElement[0]));
      }
    }
    while (true)
    {
      localObject1 = localObject2;
      break label48;
      localObject2 = new Throwable(localThrowable.getMessage(), localObject1);
      break label230;
      paramThrowable = localObject1;
      break;
      label279: localObject2 = localObject1;
    }
  }

  private static boolean k(Context paramContext)
  {
    int i = 0;
    Bundle localBundle = gb.bD();
    if (localBundle == null);
    while (true)
    {
      return i;
      if (!localBundle.getBoolean("gads:sdk_crash_report_enabled", false))
        continue;
      i = 1;
    }
  }

  protected boolean G(String paramString)
  {
    int i = 0;
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return i;
      if (paramString.startsWith("com.google.android.gms.ads"))
      {
        i = 1;
        continue;
      }
      if (paramString.startsWith("com.google.ads"))
      {
        i = 1;
        continue;
      }
      try
      {
        boolean bool = Class.forName(paramString).isAnnotationPresent(ez.class);
        i = bool;
      }
      catch (Exception localException)
      {
        gs.a("Fail to check class type for class " + paramString, localException);
      }
    }
  }

  protected boolean H(String paramString)
  {
    int i = 0;
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return i;
      if ((!paramString.startsWith("android.")) && (!paramString.startsWith("java.")))
        continue;
      i = 1;
    }
  }

  protected boolean a(Throwable paramThrowable)
  {
    int i = 1;
    int j = 0;
    if (paramThrowable == null)
      return j;
    int k = 0;
    int m = 0;
    while (paramThrowable != null)
    {
      for (StackTraceElement localStackTraceElement : paramThrowable.getStackTrace())
      {
        if (G(localStackTraceElement.getClassName()))
          m = i;
        if (!getClass().getName().equals(localStackTraceElement.getClassName()))
          continue;
        k = i;
      }
      paramThrowable = paramThrowable.getCause();
    }
    if ((m != 0) && (k == 0));
    while (true)
    {
      j = i;
      break;
      i = 0;
    }
  }

  public void b(Throwable paramThrowable)
  {
    if (!k(this.mContext));
    while (true)
    {
      return;
      Throwable localThrowable = d(paramThrowable);
      if (localThrowable == null)
        continue;
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(c(localThrowable));
      gj.a(this.mContext, this.sT.wD, localArrayList, gb.df());
    }
  }

  protected String c(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("device", cx()).appendQueryParameter("js", this.sT.wD).appendQueryParameter("appid", this.mContext.getApplicationContext().getPackageName()).appendQueryParameter("stacktrace", localStringWriter.toString()).toString();
  }

  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if (a(paramThrowable))
    {
      b(paramThrowable);
      if (Looper.getMainLooper().getThread() == paramThread);
    }
    while (true)
    {
      return;
      if (this.sR != null)
      {
        this.sR.uncaughtException(paramThread, paramThrowable);
        continue;
      }
      if (this.sS == null)
        continue;
      this.sS.uncaughtException(paramThread, paramThrowable);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ey
 * JD-Core Version:    0.6.0
 */