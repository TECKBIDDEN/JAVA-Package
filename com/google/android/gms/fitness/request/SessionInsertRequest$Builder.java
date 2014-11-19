package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionInsertRequest$Builder
{
  private Session Sk;
  private List<DataSet> Sw = new ArrayList();
  private List<DataPoint> UA = new ArrayList();
  private List<DataSource> UB = new ArrayList();

  private void c(DataPoint paramDataPoint)
  {
    long l1 = TimeUnit.MILLISECONDS.toNanos(this.Sk.getStartTimeMillis());
    long l2 = TimeUnit.MILLISECONDS.toNanos(this.Sk.getEndTimeMillis());
    long l3 = paramDataPoint.getTimestampNanos();
    boolean bool2;
    if (l3 != 0L)
    {
      if ((l3 >= l1) && (l3 <= l2))
      {
        bool2 = true;
        Object[] arrayOfObject2 = new Object[3];
        arrayOfObject2[0] = paramDataPoint;
        arrayOfObject2[1] = Long.valueOf(l1);
        arrayOfObject2[2] = Long.valueOf(l2);
        n.a(bool2, "Data point %s has time stamp outside session interval [%d, %d]", arrayOfObject2);
      }
    }
    else
    {
      long l4 = paramDataPoint.getStartTimeNanos();
      long l5 = paramDataPoint.getEndTimeNanos();
      if ((l4 != 0L) && (l5 != 0L))
        if ((l4 < l1) || (l5 > l2))
          break label185;
    }
    label185: for (boolean bool1 = true; ; bool1 = false)
    {
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = paramDataPoint;
      arrayOfObject1[1] = Long.valueOf(l1);
      arrayOfObject1[2] = Long.valueOf(l2);
      n.a(bool1, "Data point %s has start and end times outside session interval [%d, %d]", arrayOfObject1);
      return;
      bool2 = false;
      break;
    }
  }

  private void jt()
  {
    Iterator localIterator1 = this.Sw.iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator3 = ((DataSet)localIterator1.next()).getDataPoints().iterator();
      while (localIterator3.hasNext())
        c((DataPoint)localIterator3.next());
    }
    Iterator localIterator2 = this.UA.iterator();
    while (localIterator2.hasNext())
      c((DataPoint)localIterator2.next());
  }

  public Builder addAggregateDataPoint(DataPoint paramDataPoint)
  {
    boolean bool1;
    boolean bool2;
    label39: DataSource localDataSource;
    if (paramDataPoint != null)
    {
      bool1 = true;
      n.b(bool1, "Must specify a valid aggregate data point.");
      long l1 = paramDataPoint.getStartTimeNanos();
      long l2 = paramDataPoint.getEndTimeNanos();
      if ((l1 <= 0L) || (l2 <= l1))
        break label133;
      bool2 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = paramDataPoint;
      n.b(bool2, "Aggregate data point should have valid start and end times: %s", arrayOfObject1);
      localDataSource = paramDataPoint.getDataSource();
      if (this.UB.contains(localDataSource))
        break label139;
    }
    label133: label139: for (boolean bool3 = true; ; bool3 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localDataSource;
      n.a(bool3, "Data set/Aggregate data point for this data source %s is already added.", arrayOfObject2);
      this.UB.add(localDataSource);
      this.UA.add(paramDataPoint);
      return this;
      bool1 = false;
      break;
      bool2 = false;
      break label39;
    }
  }

  public Builder addDataSet(DataSet paramDataSet)
  {
    boolean bool1 = true;
    boolean bool2;
    DataSource localDataSource;
    boolean bool3;
    if (paramDataSet != null)
    {
      bool2 = bool1;
      n.b(bool2, "Must specify a valid data set.");
      localDataSource = paramDataSet.getDataSource();
      if (this.UB.contains(localDataSource))
        break label106;
      bool3 = bool1;
      label37: Object[] arrayOfObject = new Object[bool1];
      arrayOfObject[0] = localDataSource;
      n.a(bool3, "Data set for this data source %s is already added.", arrayOfObject);
      if (paramDataSet.getDataPoints().isEmpty())
        break label112;
    }
    while (true)
    {
      n.b(bool1, "No data points specified in the input data set.");
      this.UB.add(localDataSource);
      this.Sw.add(paramDataSet);
      return this;
      bool2 = false;
      break;
      label106: bool3 = false;
      break label37;
      label112: bool1 = false;
    }
  }

  public SessionInsertRequest build()
  {
    boolean bool1 = true;
    boolean bool2;
    if (this.Sk != null)
    {
      bool2 = bool1;
      n.a(bool2, "Must specify a valid session.");
      if (this.Sk.getEndTimeMillis() == 0L)
        break label54;
    }
    while (true)
    {
      n.a(bool1, "Must specify a valid end time, cannot insert a continuing session.");
      jt();
      return new SessionInsertRequest(this, null);
      bool2 = false;
      break;
      label54: bool1 = false;
    }
  }

  public Builder setSession(Session paramSession)
  {
    this.Sk = paramSession;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.SessionInsertRequest.Builder
 * JD-Core Version:    0.6.0
 */