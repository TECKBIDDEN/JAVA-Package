package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import java.util.ArrayList;
import java.util.Iterator;

public final class e
{
  private final b LE;
  private final ArrayList<GoogleApiClient.ConnectionCallbacks> LF = new ArrayList();
  final ArrayList<GoogleApiClient.ConnectionCallbacks> LG = new ArrayList();
  private boolean LH = false;
  private final ArrayList<GooglePlayServicesClient.OnConnectionFailedListener> LI = new ArrayList();
  private final Handler mHandler;

  public e(Context paramContext, Looper paramLooper, b paramb)
  {
    this.LE = paramb;
    this.mHandler = new a(paramLooper);
  }

  public void aB(int paramInt)
  {
    this.mHandler.removeMessages(1);
    synchronized (this.LF)
    {
      this.LH = true;
      Iterator localIterator = new ArrayList(this.LF).iterator();
      GoogleApiClient.ConnectionCallbacks localConnectionCallbacks;
      do
      {
        if (localIterator.hasNext())
        {
          localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)localIterator.next();
          if (this.LE.gr())
            continue;
        }
        this.LH = false;
        return;
      }
      while (!this.LF.contains(localConnectionCallbacks));
      localConnectionCallbacks.onConnectionSuspended(paramInt);
    }
  }

  // ERROR //
  public void b(com.google.android.gms.common.ConnectionResult paramConnectionResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 45	com/google/android/gms/common/internal/e:mHandler	Landroid/os/Handler;
    //   4: iconst_1
    //   5: invokevirtual 54	android/os/Handler:removeMessages	(I)V
    //   8: aload_0
    //   9: getfield 38	com/google/android/gms/common/internal/e:LI	Ljava/util/ArrayList;
    //   12: astore_2
    //   13: aload_2
    //   14: monitorenter
    //   15: new 29	java/util/ArrayList
    //   18: dup
    //   19: aload_0
    //   20: getfield 38	com/google/android/gms/common/internal/e:LI	Ljava/util/ArrayList;
    //   23: invokespecial 57	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   26: invokevirtual 61	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   29: astore 4
    //   31: aload 4
    //   33: invokeinterface 67 1 0
    //   38: ifeq +60 -> 98
    //   41: aload 4
    //   43: invokeinterface 71 1 0
    //   48: checkcast 86	com/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener
    //   51: astore 5
    //   53: aload_0
    //   54: getfield 40	com/google/android/gms/common/internal/e:LE	Lcom/google/android/gms/common/internal/e$b;
    //   57: invokeinterface 76 1 0
    //   62: ifne +8 -> 70
    //   65: aload_2
    //   66: monitorexit
    //   67: goto +33 -> 100
    //   70: aload_0
    //   71: getfield 38	com/google/android/gms/common/internal/e:LI	Ljava/util/ArrayList;
    //   74: aload 5
    //   76: invokevirtual 80	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   79: ifeq -48 -> 31
    //   82: aload 5
    //   84: aload_1
    //   85: invokeinterface 89 2 0
    //   90: goto -59 -> 31
    //   93: astore_3
    //   94: aload_2
    //   95: monitorexit
    //   96: aload_3
    //   97: athrow
    //   98: aload_2
    //   99: monitorexit
    //   100: return
    //
    // Exception table:
    //   from	to	target	type
    //   15	96	93	finally
    //   98	100	93	finally
  }

  public void d(Bundle paramBundle)
  {
    boolean bool1 = true;
    while (true)
    {
      boolean bool2;
      synchronized (this.LF)
      {
        if (this.LH)
          continue;
        bool2 = bool1;
        n.I(bool2);
        this.mHandler.removeMessages(1);
        this.LH = true;
        if (this.LG.size() != 0)
          break label164;
        n.I(bool1);
        Iterator localIterator = new ArrayList(this.LF).iterator();
        if (!localIterator.hasNext())
          continue;
        GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)localIterator.next();
        if ((this.LE.gr()) && (this.LE.isConnected()))
          continue;
        this.LG.clear();
        this.LH = false;
        return;
        if (this.LG.contains(localConnectionCallbacks))
          continue;
        localConnectionCallbacks.onConnected(paramBundle);
      }
      continue;
      label164: bool1 = false;
    }
  }

  protected void dM()
  {
    synchronized (this.LF)
    {
      d(this.LE.fD());
      return;
    }
  }

  public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    n.i(paramConnectionCallbacks);
    synchronized (this.LF)
    {
      boolean bool = this.LF.contains(paramConnectionCallbacks);
      return bool;
    }
  }

  public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    n.i(paramOnConnectionFailedListener);
    synchronized (this.LI)
    {
      boolean bool = this.LI.contains(paramOnConnectionFailedListener);
      return bool;
    }
  }

  public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    n.i(paramConnectionCallbacks);
    synchronized (this.LF)
    {
      if (this.LF.contains(paramConnectionCallbacks))
      {
        Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + paramConnectionCallbacks + " is already registered");
        if (this.LE.isConnected())
          this.mHandler.sendMessage(this.mHandler.obtainMessage(1, paramConnectionCallbacks));
        return;
      }
      this.LF.add(paramConnectionCallbacks);
    }
  }

  public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    n.i(paramOnConnectionFailedListener);
    synchronized (this.LI)
    {
      if (this.LI.contains(paramOnConnectionFailedListener))
      {
        Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + paramOnConnectionFailedListener + " is already registered");
        return;
      }
      this.LI.add(paramOnConnectionFailedListener);
    }
  }

  public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    n.i(paramConnectionCallbacks);
    synchronized (this.LF)
    {
      if (this.LF != null)
      {
        if (this.LF.remove(paramConnectionCallbacks))
          break label63;
        Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + paramConnectionCallbacks + " not found");
      }
      label63: 
      do
        return;
      while (!this.LH);
      this.LG.add(paramConnectionCallbacks);
    }
  }

  public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    n.i(paramOnConnectionFailedListener);
    synchronized (this.LI)
    {
      if ((this.LI != null) && (!this.LI.remove(paramOnConnectionFailedListener)))
        Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + paramOnConnectionFailedListener + " not found");
      return;
    }
  }

  final class a extends Handler
  {
    public a(Looper arg2)
    {
      super();
    }

    public void handleMessage(Message paramMessage)
    {
      if (paramMessage.what == 1)
        synchronized (e.a(e.this))
        {
          if ((e.b(e.this).gr()) && (e.b(e.this).isConnected()) && (e.a(e.this).contains(paramMessage.obj)))
          {
            Bundle localBundle = e.b(e.this).fD();
            ((GoogleApiClient.ConnectionCallbacks)paramMessage.obj).onConnected(localBundle);
          }
        }
      Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
    }
  }

  public static abstract interface b
  {
    public abstract Bundle fD();

    public abstract boolean gr();

    public abstract boolean isConnected();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.e
 * JD-Core Version:    0.6.0
 */