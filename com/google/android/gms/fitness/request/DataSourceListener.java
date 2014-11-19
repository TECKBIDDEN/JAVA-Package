package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.DataPoint;

public abstract interface DataSourceListener
{
  public abstract void onEvent(DataPoint paramDataPoint);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.DataSourceListener
 * JD-Core Version:    0.6.0
 */