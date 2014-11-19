package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.fitness.data.AggregateDataTypes;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.DataTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DataReadRequest$Builder
{
  private long KL;
  private long Si;
  private List<DataType> Su = new ArrayList();
  private int Sx = 0;
  private List<DataSource> TZ = new ArrayList();
  private List<DataType> Ud = new ArrayList();
  private List<DataSource> Ue = new ArrayList();
  private long Uf = 0L;
  private DataSource Ug;
  private int Uh = 0;
  private boolean Ui = false;
  private boolean Uj = false;
  private boolean Uk = false;

  public Builder aggregate(DataSource paramDataSource, DataType paramDataType)
  {
    n.b(paramDataSource, "Attempting to add a null data source");
    if (!this.TZ.contains(paramDataSource));
    for (boolean bool1 = true; ; bool1 = false)
    {
      n.a(bool1, "Cannot add the same data source for aggregated and detailed");
      DataType localDataType = paramDataSource.getDataType();
      boolean bool2 = AggregateDataTypes.INPUT_TYPES.contains(localDataType);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localDataType;
      n.b(bool2, "Unsupported input data type specified for aggregation: %s", arrayOfObject1);
      boolean bool3 = AggregateDataTypes.getForInput(localDataType).contains(paramDataType);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = localDataType;
      arrayOfObject2[1] = paramDataType;
      n.b(bool3, "Invalid output aggregate data type specified: %s -> %s", arrayOfObject2);
      if (!this.Ue.contains(paramDataSource))
        this.Ue.add(paramDataSource);
      return this;
    }
  }

  public Builder aggregate(DataType paramDataType1, DataType paramDataType2)
  {
    n.b(paramDataType1, "Attempting to use a null data type");
    if (!this.Su.contains(paramDataType1));
    for (boolean bool1 = true; ; bool1 = false)
    {
      n.a(bool1, "Cannot add the same data type as aggregated and detailed");
      boolean bool2 = AggregateDataTypes.INPUT_TYPES.contains(paramDataType1);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = paramDataType1;
      n.b(bool2, "Unsupported input data type specified for aggregation: %s", arrayOfObject1);
      boolean bool3 = AggregateDataTypes.getForInput(paramDataType1).contains(paramDataType2);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = paramDataType1;
      arrayOfObject2[1] = paramDataType2;
      n.b(bool3, "Invalid output aggregate data type specified: %s -> %s", arrayOfObject2);
      if (!this.Ud.contains(paramDataType1))
        this.Ud.add(paramDataType1);
      return this;
    }
  }

  public Builder bucketByActivitySegment(int paramInt, TimeUnit paramTimeUnit)
  {
    boolean bool1;
    if (this.Sx == 0)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.Sx);
      n.b(bool1, "Bucketing strategy already set to %s", arrayOfObject1);
      if (paramInt <= 0)
        break label86;
    }
    label86: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      n.b(bool2, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject2);
      this.Sx = 4;
      this.Uf = paramTimeUnit.toMillis(paramInt);
      return this;
      bool1 = false;
      break;
    }
  }

  public Builder bucketByActivitySegment(int paramInt, TimeUnit paramTimeUnit, DataSource paramDataSource)
  {
    boolean bool1;
    boolean bool2;
    if (this.Sx == 0)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.Sx);
      n.b(bool1, "Bucketing strategy already set to %s", arrayOfObject1);
      if (paramInt <= 0)
        break label140;
      bool2 = true;
      label43: Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      n.b(bool2, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject2);
      if (paramDataSource == null)
        break label146;
    }
    label140: label146: for (boolean bool3 = true; ; bool3 = false)
    {
      n.b(bool3, "Invalid activity data source specified");
      boolean bool4 = paramDataSource.getDataType().equals(DataTypes.ACTIVITY_SEGMENT);
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = paramDataSource;
      n.b(bool4, "Invalid activity data source specified: %s", arrayOfObject3);
      this.Ug = paramDataSource;
      this.Sx = 4;
      this.Uf = paramTimeUnit.toMillis(paramInt);
      return this;
      bool1 = false;
      break;
      bool2 = false;
      break label43;
    }
  }

  public Builder bucketByActivityType(int paramInt, TimeUnit paramTimeUnit)
  {
    boolean bool1;
    if (this.Sx == 0)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.Sx);
      n.b(bool1, "Bucketing strategy already set to %s", arrayOfObject1);
      if (paramInt <= 0)
        break label86;
    }
    label86: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      n.b(bool2, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject2);
      this.Sx = 3;
      this.Uf = paramTimeUnit.toMillis(paramInt);
      return this;
      bool1 = false;
      break;
    }
  }

  public Builder bucketByActivityType(int paramInt, TimeUnit paramTimeUnit, DataSource paramDataSource)
  {
    boolean bool1;
    boolean bool2;
    if (this.Sx == 0)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.Sx);
      n.b(bool1, "Bucketing strategy already set to %s", arrayOfObject1);
      if (paramInt <= 0)
        break label140;
      bool2 = true;
      label43: Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      n.b(bool2, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject2);
      if (paramDataSource == null)
        break label146;
    }
    label140: label146: for (boolean bool3 = true; ; bool3 = false)
    {
      n.b(bool3, "Invalid activity data source specified");
      boolean bool4 = paramDataSource.getDataType().equals(DataTypes.ACTIVITY_SEGMENT);
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = paramDataSource;
      n.b(bool4, "Invalid activity data source specified: %s", arrayOfObject3);
      this.Ug = paramDataSource;
      this.Sx = 3;
      this.Uf = paramTimeUnit.toMillis(paramInt);
      return this;
      bool1 = false;
      break;
      bool2 = false;
      break label43;
    }
  }

  public Builder bucketBySession(int paramInt, TimeUnit paramTimeUnit)
  {
    boolean bool1;
    if (this.Sx == 0)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.Sx);
      n.b(bool1, "Bucketing strategy already set to %s", arrayOfObject1);
      if (paramInt <= 0)
        break label86;
    }
    label86: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      n.b(bool2, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject2);
      this.Sx = 2;
      this.Uf = paramTimeUnit.toMillis(paramInt);
      return this;
      bool1 = false;
      break;
    }
  }

  public Builder bucketByTime(int paramInt, TimeUnit paramTimeUnit)
  {
    boolean bool1;
    if (this.Sx == 0)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.Sx);
      n.b(bool1, "Bucketing strategy already set to %s", arrayOfObject1);
      if (paramInt <= 0)
        break label86;
    }
    label86: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      n.b(bool2, "Must specify a valid minimum duration for an activity segment: %d", arrayOfObject2);
      this.Sx = 1;
      this.Uf = paramTimeUnit.toMillis(paramInt);
      return this;
      bool1 = false;
      break;
    }
  }

  public DataReadRequest build()
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    label69: boolean bool4;
    label118: boolean bool5;
    if ((!this.TZ.isEmpty()) || (!this.Su.isEmpty()) || (!this.Ue.isEmpty()) || (!this.Ud.isEmpty()))
    {
      bool2 = bool1;
      n.a(bool2, "Must add at least one data source (aggregated or detailed)");
      if (this.KL <= 0L)
        break label216;
      bool3 = bool1;
      Object[] arrayOfObject1 = new Object[bool1];
      arrayOfObject1[0] = Long.valueOf(this.KL);
      n.a(bool3, "Invalid start time: %s", arrayOfObject1);
      if ((this.Si <= 0L) || (this.Si <= this.KL))
        break label221;
      bool4 = bool1;
      Object[] arrayOfObject2 = new Object[bool1];
      arrayOfObject2[0] = Long.valueOf(this.Si);
      n.a(bool4, "Invalid end time: %s", arrayOfObject2);
      if ((!this.Ue.isEmpty()) || (!this.Ud.isEmpty()))
        break label227;
      bool5 = bool1;
      label171: if (((!bool5) || (this.Sx != 0)) && ((bool5) || (this.Sx == 0)))
        break label233;
    }
    while (true)
    {
      n.a(bool1, "Must specify a valid bucketing strategy while requesting aggregation");
      return new DataReadRequest(this, null);
      bool2 = false;
      break;
      label216: bool3 = false;
      break label69;
      label221: bool4 = false;
      break label118;
      label227: bool5 = false;
      break label171;
      label233: bool1 = false;
    }
  }

  public Builder enableServerQueries()
  {
    this.Uk = true;
    return this;
  }

  public Builder read(DataSource paramDataSource)
  {
    n.b(paramDataSource, "Attempting to add a null data source");
    if (!this.Ue.contains(paramDataSource));
    for (boolean bool = true; ; bool = false)
    {
      n.b(bool, "Cannot add the same data source as aggregated and detailed");
      if (!this.TZ.contains(paramDataSource))
        this.TZ.add(paramDataSource);
      return this;
    }
  }

  public Builder read(DataType paramDataType)
  {
    n.b(paramDataType, "Attempting to use a null data type");
    if (!this.Ud.contains(paramDataType));
    for (boolean bool = true; ; bool = false)
    {
      n.a(bool, "Cannot add the same data type as aggregated and detailed");
      if (!this.Su.contains(paramDataType))
        this.Su.add(paramDataType);
      return this;
    }
  }

  public Builder setTimeRange(long paramLong1, long paramLong2)
  {
    this.KL = paramLong1;
    this.Si = paramLong2;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.DataReadRequest.Builder
 * JD-Core Version:    0.6.0
 */