package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.m.a;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

public class SensorRequest
{
  public static final int ACCURACY_MODE_DEFAULT = 2;
  public static final int ACCURACY_MODE_HIGH = 3;
  public static final int ACCURACY_MODE_LOW = 1;
  private final DataType SF;
  private final DataSource Sh;
  private final long Ti;
  private final int Tj;
  private final long Us;
  private final long Ut;
  private final LocationRequest Ux;
  private final long Uy;

  private SensorRequest(DataSource paramDataSource, LocationRequest paramLocationRequest)
  {
    this.Ux = paramLocationRequest;
    this.Ti = TimeUnit.MILLISECONDS.toMicros(paramLocationRequest.getInterval());
    this.Ut = TimeUnit.MILLISECONDS.toMicros(paramLocationRequest.getFastestInterval());
    this.Us = this.Ti;
    this.SF = paramDataSource.getDataType();
    this.Tj = a(paramLocationRequest);
    this.Sh = paramDataSource;
    long l = paramLocationRequest.getExpirationTime();
    if (l == 9223372036854775807L);
    for (this.Uy = 9223372036854775807L; ; this.Uy = TimeUnit.MILLISECONDS.toMicros(l - SystemClock.elapsedRealtime()))
      return;
  }

  private SensorRequest(Builder paramBuilder)
  {
    this.Sh = Builder.a(paramBuilder);
    this.SF = Builder.b(paramBuilder);
    this.Ti = Builder.c(paramBuilder);
    this.Ut = Builder.d(paramBuilder);
    this.Us = Builder.e(paramBuilder);
    this.Tj = Builder.f(paramBuilder);
    this.Ux = null;
    this.Uy = Builder.g(paramBuilder);
  }

  private static int a(LocationRequest paramLocationRequest)
  {
    int i;
    switch (paramLocationRequest.getPriority())
    {
    default:
      i = 2;
    case 100:
    case 104:
    }
    while (true)
    {
      return i;
      i = 3;
      continue;
      i = 1;
    }
  }

  private boolean a(SensorRequest paramSensorRequest)
  {
    if ((m.equal(this.Sh, paramSensorRequest.Sh)) && (m.equal(this.SF, paramSensorRequest.SF)) && (this.Ti == paramSensorRequest.Ti) && (this.Ut == paramSensorRequest.Ut) && (this.Us == paramSensorRequest.Us) && (this.Tj == paramSensorRequest.Tj) && (m.equal(this.Ux, paramSensorRequest.Ux)) && (this.Uy == paramSensorRequest.Uy));
    for (int i = 1; ; i = 0)
      return i;
  }

  public static int da(int paramInt)
  {
    switch (paramInt)
    {
    case 2:
    default:
      paramInt = 2;
    case 1:
    case 3:
    }
    return paramInt;
  }

  public static SensorRequest fromLocationRequest(DataSource paramDataSource, LocationRequest paramLocationRequest)
  {
    return new SensorRequest(paramDataSource, paramLocationRequest);
  }

  public boolean equals(Object paramObject)
  {
    if ((this == paramObject) || (((paramObject instanceof SensorRequest)) && (a((SensorRequest)paramObject))));
    for (int i = 1; ; i = 0)
      return i;
  }

  public DataSource getDataSource()
  {
    return this.Sh;
  }

  public DataType getDataType()
  {
    return this.SF;
  }

  public long getSamplingRateMicros()
  {
    return this.Ti;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = this.Sh;
    arrayOfObject[1] = this.SF;
    arrayOfObject[2] = Long.valueOf(this.Ti);
    arrayOfObject[3] = Long.valueOf(this.Ut);
    arrayOfObject[4] = Long.valueOf(this.Us);
    arrayOfObject[5] = Integer.valueOf(this.Tj);
    arrayOfObject[6] = this.Ux;
    arrayOfObject[7] = Long.valueOf(this.Uy);
    return m.hashCode(arrayOfObject);
  }

  public int iQ()
  {
    return this.Tj;
  }

  public long jm()
  {
    return this.Ut;
  }

  public long jn()
  {
    return this.Us;
  }

  public long jr()
  {
    return this.Uy;
  }

  public String toString()
  {
    return m.h(this).a("dataSource", this.Sh).a("dataType", this.SF).a("samplingRateMicros", Long.valueOf(this.Ti)).a("deliveryLatencyMicros", Long.valueOf(this.Us)).a("timeOutMicros", Long.valueOf(this.Uy)).toString();
  }

  public static class Builder
  {
    private DataType SF;
    private DataSource Sh;
    private long Ti = -1L;
    private int Tj = 2;
    private long Us = 0L;
    private long Ut = 0L;
    private long Uy = 9223372036854775807L;
    private boolean Uz = false;

    public SensorRequest build()
    {
      boolean bool1 = false;
      if ((this.Sh != null) || (this.SF != null));
      for (boolean bool2 = true; ; bool2 = false)
      {
        n.a(bool2, "Must call setDataSource() or setDataType()");
        if ((this.SF == null) || (this.Sh == null) || (this.SF.equals(this.Sh.getDataType())))
          bool1 = true;
        n.a(bool1, "Specified data type is incompatible with specified data source");
        return new SensorRequest(this, null);
      }
    }

    public Builder setAccuracyMode(int paramInt)
    {
      this.Tj = SensorRequest.da(paramInt);
      return this;
    }

    public Builder setDataSource(DataSource paramDataSource)
    {
      this.Sh = paramDataSource;
      return this;
    }

    public Builder setDataType(DataType paramDataType)
    {
      this.SF = paramDataType;
      return this;
    }

    public Builder setFastestRate(int paramInt, TimeUnit paramTimeUnit)
    {
      if (paramInt >= 0);
      for (boolean bool = true; ; bool = false)
      {
        n.b(bool, "Cannot use a negative interval");
        this.Uz = true;
        this.Ut = paramTimeUnit.toMicros(paramInt);
        return this;
      }
    }

    public Builder setMaxDeliveryLatency(int paramInt, TimeUnit paramTimeUnit)
    {
      if (paramInt >= 0);
      for (boolean bool = true; ; bool = false)
      {
        n.b(bool, "Cannot use a negative delivery interval");
        this.Us = paramTimeUnit.toMicros(paramInt);
        return this;
      }
    }

    public Builder setSamplingRate(long paramLong, TimeUnit paramTimeUnit)
    {
      if (paramLong >= 0L);
      for (boolean bool = true; ; bool = false)
      {
        n.b(bool, "Cannot use a negative sampling interval");
        this.Ti = paramTimeUnit.toMicros(paramLong);
        if (!this.Uz)
          this.Ut = (this.Ti / 2L);
        return this;
      }
    }

    public Builder setTimeout(long paramLong, TimeUnit paramTimeUnit)
    {
      boolean bool1 = true;
      boolean bool2;
      if (paramLong > 0L)
      {
        bool2 = bool1;
        Object[] arrayOfObject = new Object[bool1];
        arrayOfObject[0] = Long.valueOf(paramLong);
        n.b(bool2, "Invalid time out value specified: %d", arrayOfObject);
        if (paramTimeUnit == null)
          break label65;
      }
      while (true)
      {
        n.b(bool1, "Invalid time unit specified");
        this.Uy = paramTimeUnit.toMicros(paramLong);
        return this;
        bool2 = false;
        break;
        label65: bool1 = false;
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.SensorRequest
 * JD-Core Version:    0.6.0
 */