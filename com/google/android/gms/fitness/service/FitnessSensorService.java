package com.google.android.gms.fitness.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.List;

public abstract class FitnessSensorService extends Service
{
  public static final String SERVICE_ACTION = "com.google.android.gms.fitness.service.FitnessSensorService";
  private FitnessSensorService.a UP;

  public final IBinder onBind(Intent paramIntent)
  {
    if ("com.google.android.gms.fitness.service.FitnessSensorService".equals(paramIntent.getAction()))
      if (Log.isLoggable("FitnessSensorService", 3))
        Log.d("FitnessSensorService", "Intent " + paramIntent + " received by " + getClass().getName());
    for (IBinder localIBinder = this.UP.asBinder(); ; localIBinder = null)
      return localIBinder;
  }

  public void onCreate()
  {
    super.onCreate();
    this.UP = new FitnessSensorService.a(this, null);
  }

  public abstract List<DataSource> onFindDataSources(List<DataType> paramList);

  public abstract boolean onRegister(FitnessSensorServiceRequest paramFitnessSensorServiceRequest);

  public abstract boolean onUnregister(DataSource paramDataSource);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.service.FitnessSensorService
 * JD-Core Version:    0.6.0
 */