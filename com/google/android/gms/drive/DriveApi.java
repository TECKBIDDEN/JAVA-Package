package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.query.Query;

public abstract interface DriveApi
{
  @Deprecated
  public abstract PendingResult<Status> discardContents(GoogleApiClient paramGoogleApiClient, Contents paramContents);

  public abstract PendingResult<DriveApi.DriveIdResult> fetchDriveId(GoogleApiClient paramGoogleApiClient, String paramString);

  public abstract DriveFolder getAppFolder(GoogleApiClient paramGoogleApiClient);

  public abstract DriveFile getFile(GoogleApiClient paramGoogleApiClient, DriveId paramDriveId);

  public abstract DriveFolder getFolder(GoogleApiClient paramGoogleApiClient, DriveId paramDriveId);

  public abstract DriveFolder getRootFolder(GoogleApiClient paramGoogleApiClient);

  @Deprecated
  public abstract PendingResult<DriveApi.ContentsResult> newContents(GoogleApiClient paramGoogleApiClient);

  public abstract CreateFileActivityBuilder newCreateFileActivityBuilder();

  public abstract PendingResult<DriveApi.DriveContentsResult> newDriveContents(GoogleApiClient paramGoogleApiClient);

  public abstract OpenFileActivityBuilder newOpenFileActivityBuilder();

  public abstract PendingResult<DriveApi.MetadataBufferResult> query(GoogleApiClient paramGoogleApiClient, Query paramQuery);

  public abstract PendingResult<Status> requestSync(GoogleApiClient paramGoogleApiClient);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.DriveApi
 * JD-Core Version:    0.6.0
 */