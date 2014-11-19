package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public abstract interface DataApi
{
  public abstract PendingResult<Status> addListener(GoogleApiClient paramGoogleApiClient, DataListener paramDataListener);

  public abstract PendingResult<DataApi.DeleteDataItemsResult> deleteDataItems(GoogleApiClient paramGoogleApiClient, Uri paramUri);

  public abstract PendingResult<DataApi.DataItemResult> getDataItem(GoogleApiClient paramGoogleApiClient, Uri paramUri);

  public abstract PendingResult<DataItemBuffer> getDataItems(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<DataItemBuffer> getDataItems(GoogleApiClient paramGoogleApiClient, Uri paramUri);

  public abstract PendingResult<DataApi.GetFdForAssetResult> getFdForAsset(GoogleApiClient paramGoogleApiClient, Asset paramAsset);

  public abstract PendingResult<DataApi.GetFdForAssetResult> getFdForAsset(GoogleApiClient paramGoogleApiClient, DataItemAsset paramDataItemAsset);

  public abstract PendingResult<DataApi.DataItemResult> putDataItem(GoogleApiClient paramGoogleApiClient, PutDataRequest paramPutDataRequest);

  public abstract PendingResult<Status> removeListener(GoogleApiClient paramGoogleApiClient, DataListener paramDataListener);

  public static abstract interface DataListener
  {
    public abstract void onDataChanged(DataEventBuffer paramDataEventBuffer);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataApi
 * JD-Core Version:    0.6.0
 */