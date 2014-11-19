package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;

public abstract interface lv extends IInterface
{
  public abstract void onAddGeofencesResult(int paramInt, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void onRemoveGeofencesByPendingIntentResult(int paramInt, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void onRemoveGeofencesByRequestIdsResult(int paramInt, String[] paramArrayOfString)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lv
 * JD-Core Version:    0.6.0
 */