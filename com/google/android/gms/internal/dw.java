package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;

@ez
public class dw
{
  private final Context mContext;
  private Object sk;

  public dw(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public Bundle a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Class[] arrayOfClass = new Class[5];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = String.class;
      arrayOfClass[2] = String.class;
      arrayOfClass[3] = String.class;
      arrayOfClass[4] = String.class;
      Method localMethod = localClass.getDeclaredMethod("getBuyIntent", arrayOfClass);
      Object localObject = localClass.cast(this.sk);
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = Integer.valueOf(3);
      arrayOfObject[1] = paramString1;
      arrayOfObject[2] = paramString2;
      arrayOfObject[3] = "inapp";
      arrayOfObject[4] = paramString3;
      localBundle = (Bundle)localMethod.invoke(localObject, arrayOfObject);
      return localBundle;
    }
    catch (Exception localException)
    {
      while (true)
      {
        gs.d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
        Bundle localBundle = null;
      }
    }
  }

  public int c(String paramString1, String paramString2)
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Class[] arrayOfClass = new Class[3];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = String.class;
      arrayOfClass[2] = String.class;
      Method localMethod = localClass.getDeclaredMethod("consumePurchase", arrayOfClass);
      Object localObject = localClass.cast(this.sk);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(3);
      arrayOfObject[1] = paramString1;
      arrayOfObject[2] = paramString2;
      int j = ((Integer)localMethod.invoke(localObject, arrayOfObject)).intValue();
      i = j;
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        gs.d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
        int i = 5;
      }
    }
  }

  public Bundle d(String paramString1, String paramString2)
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Class[] arrayOfClass = new Class[4];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = String.class;
      arrayOfClass[2] = String.class;
      arrayOfClass[3] = String.class;
      Method localMethod = localClass.getDeclaredMethod("getPurchases", arrayOfClass);
      Object localObject = localClass.cast(this.sk);
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(3);
      arrayOfObject[1] = paramString1;
      arrayOfObject[2] = "inapp";
      arrayOfObject[3] = paramString2;
      localBundle = (Bundle)localMethod.invoke(localObject, arrayOfObject);
      return localBundle;
    }
    catch (Exception localException)
    {
      while (true)
      {
        gs.d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
        Bundle localBundle = null;
      }
    }
  }

  public void destroy()
  {
    this.sk = null;
  }

  public void r(IBinder paramIBinder)
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub");
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = IBinder.class;
      Method localMethod = localClass.getDeclaredMethod("asInterface", arrayOfClass);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = paramIBinder;
      this.sk = localMethod.invoke(null, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        gs.W("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dw
 * JD-Core Version:    0.6.0
 */