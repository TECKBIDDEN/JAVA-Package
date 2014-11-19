package com.google.android.gms.fitness;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataSourceListener;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;

public abstract interface SensorsApi
{
  public abstract PendingResult<DataSourcesResult> findDataSources(GoogleApiClient paramGoogleApiClient, DataSourcesRequest paramDataSourcesRequest);

  public abstract PendingResult<Status> register(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, PendingIntent paramPendingIntent);

  public abstract PendingResult<Status> register(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, DataSourceListener paramDataSourceListener);

  public abstract PendingResult<Status> unregister(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);

  public abstract PendingResult<Status> unregister(GoogleApiClient paramGoogleApiClient, DataSourceListener paramDataSourceListener);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.SensorsApi
 * JD-Core Version:    0.6.0
 */