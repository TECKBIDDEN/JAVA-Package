package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public abstract interface GoogleApiClient
{
  public abstract <C extends Api.a> C a(Api.c<C> paramc);

  public abstract <A extends Api.a, R extends Result, T extends BaseImplementation.a<R, A>> T a(T paramT);

  public abstract boolean a(Scope paramScope);

  public abstract <A extends Api.a, T extends BaseImplementation.a<? extends Result, A>> T b(T paramT);

  public abstract ConnectionResult blockingConnect();

  public abstract ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit);

  public abstract <L> c<L> c(L paramL);

  public abstract void connect();

  public abstract void disconnect();

  public abstract Looper getLooper();

  public abstract boolean isConnected();

  public abstract boolean isConnecting();

  public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks paramConnectionCallbacks);

  public abstract boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);

  public abstract void reconnect();

  public abstract void registerConnectionCallbacks(ConnectionCallbacks paramConnectionCallbacks);

  public abstract void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);

  public abstract void stopAutoManage(FragmentActivity paramFragmentActivity);

  public abstract void unregisterConnectionCallbacks(ConnectionCallbacks paramConnectionCallbacks);

  public abstract void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);

  public static final class Builder
  {
    private String Dd;
    private Looper IB;
    private final Set<String> IE = new HashSet();
    private int IF;
    private View IG;
    private String IH;
    private final Map<Api<?>, Api.ApiOptions> II = new HashMap();
    private FragmentActivity IJ;
    private int IK = -1;
    private GoogleApiClient.OnConnectionFailedListener IL;
    private final Set<GoogleApiClient.ConnectionCallbacks> IM = new HashSet();
    private final Set<GoogleApiClient.OnConnectionFailedListener> IN = new HashSet();
    private final Context mContext;

    public Builder(Context paramContext)
    {
      this.mContext = paramContext;
      this.IB = paramContext.getMainLooper();
      this.IH = paramContext.getPackageName();
    }

    public Builder(Context paramContext, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      this(paramContext);
      n.b(paramConnectionCallbacks, "Must provide a connected listener");
      this.IM.add(paramConnectionCallbacks);
      n.b(paramOnConnectionFailedListener, "Must provide a connection failed listener");
      this.IN.add(paramOnConnectionFailedListener);
    }

    private GoogleApiClient gm()
    {
      d locald = d.a(this.IJ);
      Object localObject = locald.ak(this.IK);
      if (localObject == null)
        localObject = new b(this.mContext.getApplicationContext(), this.IB, gl(), this.II, this.IM, this.IN, this.IK);
      locald.a(this.IK, (GoogleApiClient)localObject, this.IL);
      return (GoogleApiClient)localObject;
    }

    public Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> paramApi)
    {
      this.II.put(paramApi, null);
      List localList = paramApi.ge();
      int i = localList.size();
      for (int j = 0; j < i; j++)
        this.IE.add(((Scope)localList.get(j)).gt());
      return this;
    }

    public <O extends Api.ApiOptions.HasOptions> Builder addApi(Api<O> paramApi, O paramO)
    {
      n.b(paramO, "Null options are not permitted for this Api");
      this.II.put(paramApi, paramO);
      List localList = paramApi.ge();
      int i = localList.size();
      for (int j = 0; j < i; j++)
        this.IE.add(((Scope)localList.get(j)).gt());
      return this;
    }

    public Builder addConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
    {
      this.IM.add(paramConnectionCallbacks);
      return this;
    }

    public Builder addOnConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      this.IN.add(paramOnConnectionFailedListener);
      return this;
    }

    public Builder addScope(Scope paramScope)
    {
      this.IE.add(paramScope.gt());
      return this;
    }

    public GoogleApiClient build()
    {
      boolean bool;
      if (!this.II.isEmpty())
      {
        bool = true;
        n.b(bool, "must call addApi() to add at least one API");
        if (this.IK < 0)
          break label39;
      }
      label39: for (Object localObject = gm(); ; localObject = new b(this.mContext, this.IB, gl(), this.II, this.IM, this.IN, -1))
      {
        return localObject;
        bool = false;
        break;
      }
    }

    public Builder enableAutoManage(FragmentActivity paramFragmentActivity, int paramInt, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      if (paramInt >= 0);
      for (boolean bool = true; ; bool = false)
      {
        n.b(bool, "clientId must be non-negative");
        this.IK = paramInt;
        this.IJ = ((FragmentActivity)n.b(paramFragmentActivity, "Null activity is not permitted."));
        this.IL = paramOnConnectionFailedListener;
        return this;
      }
    }

    public ClientSettings gl()
    {
      return new ClientSettings(this.Dd, this.IE, this.IF, this.IG, this.IH);
    }

    public Builder setAccountName(String paramString)
    {
      this.Dd = paramString;
      return this;
    }

    public Builder setGravityForPopups(int paramInt)
    {
      this.IF = paramInt;
      return this;
    }

    public Builder setHandler(Handler paramHandler)
    {
      n.b(paramHandler, "Handler must not be null");
      this.IB = paramHandler.getLooper();
      return this;
    }

    public Builder setViewForPopups(View paramView)
    {
      this.IG = paramView;
      return this;
    }

    public Builder useDefaultAccount()
    {
      return setAccountName("<<default account>>");
    }
  }

  public static abstract interface ConnectionCallbacks
  {
    public static final int CAUSE_NETWORK_LOST = 2;
    public static final int CAUSE_SERVICE_DISCONNECTED = 1;

    public abstract void onConnected(Bundle paramBundle);

    public abstract void onConnectionSuspended(int paramInt);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.GoogleApiClient
 * JD-Core Version:    0.6.0
 */