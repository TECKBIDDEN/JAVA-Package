package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.DriveEvent.Listener;
import java.util.Set;

public abstract interface DriveResource
{
  public abstract PendingResult<Status> addChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener);

  @Deprecated
  public abstract PendingResult<Status> addChangeListener(GoogleApiClient paramGoogleApiClient, DriveEvent.Listener<ChangeEvent> paramListener);

  public abstract PendingResult<Status> addChangeSubscription(GoogleApiClient paramGoogleApiClient);

  public abstract DriveId getDriveId();

  public abstract PendingResult<DriveResource.MetadataResult> getMetadata(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<DriveApi.MetadataBufferResult> listParents(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<Status> removeChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener);

  @Deprecated
  public abstract PendingResult<Status> removeChangeListener(GoogleApiClient paramGoogleApiClient, DriveEvent.Listener<ChangeEvent> paramListener);

  public abstract PendingResult<Status> removeChangeSubscription(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<Status> setParents(GoogleApiClient paramGoogleApiClient, Set<DriveId> paramSet);

  public abstract PendingResult<DriveResource.MetadataResult> updateMetadata(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.DriveResource
 * JD-Core Version:    0.6.0
 */