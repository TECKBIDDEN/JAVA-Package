package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.n;

public abstract class g<T>
{
  private final String Sd;
  private T Se;

  protected g(String paramString)
  {
    this.Sd = paramString;
  }

  protected final T L(Context paramContext)
    throws g.a
  {
    ClassLoader localClassLoader;
    if (this.Se == null)
    {
      n.i(paramContext);
      Context localContext = GooglePlayServicesUtil.getRemoteContext(paramContext);
      if (localContext == null)
        throw new a("Could not get remote context.");
      localClassLoader = localContext.getClassLoader();
    }
    try
    {
      this.Se = d((IBinder)localClassLoader.loadClass(this.Sd).newInstance());
      return this.Se;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new a("Could not load creator class.", localClassNotFoundException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new a("Could not instantiate creator.", localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    throw new a("Could not access creator.", localIllegalAccessException);
  }

  protected abstract T d(IBinder paramIBinder);

  public static class a extends Exception
  {
    public a(String paramString)
    {
      super();
    }

    public a(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.g
 * JD-Core Version:    0.6.0
 */