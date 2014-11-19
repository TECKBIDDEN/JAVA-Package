package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;

public class lx
{
  private final md<lw> Dh;
  private ContentProviderClient aeG = null;
  private boolean aeH = false;
  private HashMap<LocationListener, lx.b> aeI = new HashMap();
  private final Context mContext;

  public lx(Context paramContext, md<lw> parammd)
  {
    this.mContext = paramContext;
    this.Dh = parammd;
  }

  private lx.b a(LocationListener paramLocationListener, Looper paramLooper)
  {
    if (paramLooper == null)
      n.b(Looper.myLooper(), "Can't create handler inside thread that has not called Looper.prepare()");
    synchronized (this.aeI)
    {
      lx.b localb = (lx.b)this.aeI.get(paramLocationListener);
      if (localb == null)
        localb = new lx.b(paramLocationListener, paramLooper);
      this.aeI.put(paramLocationListener, localb);
      return localb;
    }
  }

  public void a(lz paramlz, LocationListener paramLocationListener, Looper paramLooper)
    throws RemoteException
  {
    this.Dh.dK();
    lx.b localb = a(paramLocationListener, paramLooper);
    ((lw)this.Dh.gS()).a(paramlz, localb);
  }

  public void b(lz paramlz, PendingIntent paramPendingIntent)
    throws RemoteException
  {
    this.Dh.dK();
    ((lw)this.Dh.gS()).a(paramlz, paramPendingIntent);
  }

  public Location getLastLocation()
  {
    this.Dh.dK();
    try
    {
      Location localLocation = ((lw)this.Dh.gS()).bT(this.mContext.getPackageName());
      return localLocation;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new IllegalStateException(localRemoteException);
  }

  public void lW()
  {
    if (this.aeH);
    try
    {
      setMockMode(false);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new IllegalStateException(localRemoteException);
  }

  // ERROR //
  public void removeAllListeners()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 36	com/google/android/gms/internal/lx:aeI	Ljava/util/HashMap;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 36	com/google/android/gms/internal/lx:aeI	Ljava/util/HashMap;
    //   11: invokevirtual 113	java/util/HashMap:values	()Ljava/util/Collection;
    //   14: invokeinterface 119 1 0
    //   19: astore 4
    //   21: aload 4
    //   23: invokeinterface 125 1 0
    //   28: ifeq +57 -> 85
    //   31: aload 4
    //   33: invokeinterface 129 1 0
    //   38: checkcast 9	com/google/android/gms/internal/lx$b
    //   41: astore 5
    //   43: aload 5
    //   45: ifnull -24 -> 21
    //   48: aload_0
    //   49: getfield 40	com/google/android/gms/internal/lx:Dh	Lcom/google/android/gms/internal/md;
    //   52: invokeinterface 78 1 0
    //   57: checkcast 80	com/google/android/gms/internal/lw
    //   60: aload 5
    //   62: invokeinterface 132 2 0
    //   67: goto -46 -> 21
    //   70: astore_3
    //   71: aload_2
    //   72: monitorexit
    //   73: aload_3
    //   74: athrow
    //   75: astore_1
    //   76: new 100	java/lang/IllegalStateException
    //   79: dup
    //   80: aload_1
    //   81: invokespecial 103	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   84: athrow
    //   85: aload_0
    //   86: getfield 36	com/google/android/gms/internal/lx:aeI	Ljava/util/HashMap;
    //   89: invokevirtual 135	java/util/HashMap:clear	()V
    //   92: aload_2
    //   93: monitorexit
    //   94: return
    //
    // Exception table:
    //   from	to	target	type
    //   7	73	70	finally
    //   85	94	70	finally
    //   0	7	75	android/os/RemoteException
    //   73	75	75	android/os/RemoteException
  }

  public void removeLocationUpdates(PendingIntent paramPendingIntent)
    throws RemoteException
  {
    this.Dh.dK();
    ((lw)this.Dh.gS()).a(paramPendingIntent);
  }

  public void removeLocationUpdates(LocationListener paramLocationListener)
    throws RemoteException
  {
    this.Dh.dK();
    n.b(paramLocationListener, "Invalid null listener");
    synchronized (this.aeI)
    {
      lx.b localb = (lx.b)this.aeI.remove(paramLocationListener);
      if ((this.aeG != null) && (this.aeI.isEmpty()))
      {
        this.aeG.release();
        this.aeG = null;
      }
      if (localb != null)
      {
        localb.release();
        ((lw)this.Dh.gS()).a(localb);
      }
      return;
    }
  }

  public void requestLocationUpdates(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
    throws RemoteException
  {
    this.Dh.dK();
    ((lw)this.Dh.gS()).a(paramLocationRequest, paramPendingIntent);
  }

  public void requestLocationUpdates(LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper)
    throws RemoteException
  {
    this.Dh.dK();
    lx.b localb = a(paramLocationListener, paramLooper);
    ((lw)this.Dh.gS()).a(paramLocationRequest, localb);
  }

  public void setMockLocation(Location paramLocation)
    throws RemoteException
  {
    this.Dh.dK();
    ((lw)this.Dh.gS()).setMockLocation(paramLocation);
  }

  public void setMockMode(boolean paramBoolean)
    throws RemoteException
  {
    this.Dh.dK();
    ((lw)this.Dh.gS()).setMockMode(paramBoolean);
    this.aeH = paramBoolean;
  }

  private static class a extends Handler
  {
    private final LocationListener aeJ;

    public a(LocationListener paramLocationListener)
    {
      this.aeJ = paramLocationListener;
    }

    public a(LocationListener paramLocationListener, Looper paramLooper)
    {
      super();
      this.aeJ = paramLocationListener;
    }

    public void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default:
        Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
      case 1:
      }
      while (true)
      {
        return;
        Location localLocation = new Location((Location)paramMessage.obj);
        this.aeJ.onLocationChanged(localLocation);
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lx
 * JD-Core Version:    0.6.0
 */