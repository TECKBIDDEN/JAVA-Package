package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.maps.model.internal.a;

public final class BitmapDescriptorFactory
{
  public static final float HUE_AZURE = 210.0F;
  public static final float HUE_BLUE = 240.0F;
  public static final float HUE_CYAN = 180.0F;
  public static final float HUE_GREEN = 120.0F;
  public static final float HUE_MAGENTA = 300.0F;
  public static final float HUE_ORANGE = 30.0F;
  public static final float HUE_RED = 0.0F;
  public static final float HUE_ROSE = 330.0F;
  public static final float HUE_VIOLET = 270.0F;
  public static final float HUE_YELLOW = 60.0F;
  private static a ajp;

  public static void a(a parama)
  {
    if (ajp != null);
    while (true)
    {
      return;
      ajp = (a)n.i(parama);
    }
  }

  public static BitmapDescriptor defaultMarker()
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new BitmapDescriptor(mL().mQ());
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static BitmapDescriptor defaultMarker(float paramFloat)
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new BitmapDescriptor(mL().c(paramFloat));
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static BitmapDescriptor fromAsset(String paramString)
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new BitmapDescriptor(mL().bX(paramString));
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static BitmapDescriptor fromBitmap(Bitmap paramBitmap)
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new BitmapDescriptor(mL().b(paramBitmap));
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static BitmapDescriptor fromFile(String paramString)
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new BitmapDescriptor(mL().bY(paramString));
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static BitmapDescriptor fromPath(String paramString)
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new BitmapDescriptor(mL().bZ(paramString));
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static BitmapDescriptor fromResource(int paramInt)
  {
    try
    {
      BitmapDescriptor localBitmapDescriptor = new BitmapDescriptor(mL().eM(paramInt));
      return localBitmapDescriptor;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  private static a mL()
  {
    return (a)n.b(ajp, "IBitmapDescriptorFactory is not initialized");
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.BitmapDescriptorFactory
 * JD-Core Version:    0.6.0
 */