package com.google.android.gms.drive.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.realtime.internal.m;

public abstract interface ac extends IInterface
{
  public abstract void a(OnContentsResponse paramOnContentsResponse)
    throws RemoteException;

  public abstract void a(OnDownloadProgressResponse paramOnDownloadProgressResponse)
    throws RemoteException;

  public abstract void a(OnDriveIdResponse paramOnDriveIdResponse)
    throws RemoteException;

  public abstract void a(OnDrivePreferencesResponse paramOnDrivePreferencesResponse)
    throws RemoteException;

  public abstract void a(OnListEntriesResponse paramOnListEntriesResponse)
    throws RemoteException;

  public abstract void a(OnListParentsResponse paramOnListParentsResponse)
    throws RemoteException;

  public abstract void a(OnLoadRealtimeResponse paramOnLoadRealtimeResponse, m paramm)
    throws RemoteException;

  public abstract void a(OnMetadataResponse paramOnMetadataResponse)
    throws RemoteException;

  public abstract void a(OnResourceIdSetResponse paramOnResourceIdSetResponse)
    throws RemoteException;

  public abstract void a(OnStorageStatsResponse paramOnStorageStatsResponse)
    throws RemoteException;

  public abstract void a(OnSyncMoreResponse paramOnSyncMoreResponse)
    throws RemoteException;

  public abstract void o(Status paramStatus)
    throws RemoteException;

  public abstract void onSuccess()
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.ac
 * JD-Core Version:    0.6.0
 */