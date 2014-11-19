package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Api<O extends ApiOptions>
{
  private final b<?, O> Ij;
  private final c<?> Ik;
  private final ArrayList<Scope> Il;

  public <C extends a> Api(b<C, O> paramb, c<C> paramc, Scope[] paramArrayOfScope)
  {
    this.Ij = paramb;
    this.Ik = paramc;
    this.Il = new ArrayList(Arrays.asList(paramArrayOfScope));
  }

  public b<?, O> gd()
  {
    return this.Ij;
  }

  public List<Scope> ge()
  {
    return this.Il;
  }

  public c<?> gf()
  {
    return this.Ik;
  }

  public static abstract interface ApiOptions
  {
  }

  public static abstract interface a
  {
    public abstract void connect();

    public abstract void disconnect();

    public abstract Looper getLooper();

    public abstract boolean isConnected();
  }

  public static abstract interface b<T extends Api.a, O>
  {
    public abstract T a(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, O paramO, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);

    public abstract int getPriority();
  }

  public static final class c<C extends Api.a>
  {
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Api
 * JD-Core Version:    0.6.0
 */