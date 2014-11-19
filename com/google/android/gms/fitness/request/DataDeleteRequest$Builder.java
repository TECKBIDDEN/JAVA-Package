package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataDeleteRequest$Builder
{
  private long KL;
  private long Si;
  private List<DataType> Su = new ArrayList();
  private List<DataSource> TZ = new ArrayList();
  private List<Session> Ua = new ArrayList();
  private boolean Ub = false;
  private boolean Uc = false;

  private void iZ()
  {
    if (this.Ua.isEmpty())
      return;
    Iterator localIterator = this.Ua.iterator();
    label23: Session localSession;
    if (localIterator.hasNext())
    {
      localSession = (Session)localIterator.next();
      if ((localSession.getStartTimeMillis() < this.KL) || (localSession.getEndTimeMillis() > this.Si))
        break label112;
    }
    label112: for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = localSession;
      arrayOfObject[1] = Long.valueOf(this.KL);
      arrayOfObject[2] = Long.valueOf(this.Si);
      n.a(bool, "Session %s is outside the time interval [%d, %d]", arrayOfObject);
      break label23;
      break;
    }
  }

  public Builder addDataSource(DataSource paramDataSource)
  {
    boolean bool1 = true;
    boolean bool2;
    if (!this.Ub)
    {
      bool2 = bool1;
      n.b(bool2, "All data is already marked for deletion");
      if (paramDataSource == null)
        break label58;
    }
    while (true)
    {
      n.b(bool1, "Must specify a valid data source");
      if (!this.TZ.contains(paramDataSource))
        this.TZ.add(paramDataSource);
      return this;
      bool2 = false;
      break;
      label58: bool1 = false;
    }
  }

  public Builder addDataType(DataType paramDataType)
  {
    boolean bool1 = true;
    boolean bool2;
    if (!this.Ub)
    {
      bool2 = bool1;
      n.b(bool2, "All data is already marked for deletion");
      if (paramDataType == null)
        break label58;
    }
    while (true)
    {
      n.b(bool1, "Must specify a valid data type");
      if (!this.Su.contains(paramDataType))
        this.Su.add(paramDataType);
      return this;
      bool2 = false;
      break;
      label58: bool1 = false;
    }
  }

  public Builder addSession(Session paramSession)
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    if (!this.Uc)
    {
      bool2 = bool1;
      n.b(bool2, "All sessions already marked for deletion");
      if (paramSession == null)
        break label64;
      bool3 = bool1;
      label24: n.b(bool3, "Must specify a valid session");
      if (paramSession.getEndTimeMillis() <= 0L)
        break label70;
    }
    while (true)
    {
      n.b(bool1, "Must specify a session that has already ended");
      this.Ua.add(paramSession);
      return this;
      bool2 = false;
      break;
      label64: bool3 = false;
      break label24;
      label70: bool1 = false;
    }
  }

  public DataDeleteRequest build()
  {
    boolean bool1 = false;
    boolean bool2;
    int i;
    if ((this.KL > 0L) && (this.Si > this.KL))
    {
      bool2 = true;
      n.a(bool2, "Must specify a valid time interval");
      if ((!this.Ub) && (this.TZ.isEmpty()) && (this.Su.isEmpty()))
        break label122;
      i = 1;
      label64: if ((!this.Uc) && (this.Ua.isEmpty()))
        break label127;
    }
    label122: label127: for (int j = 1; ; j = 0)
    {
      if ((i != 0) || (j != 0))
        bool1 = true;
      n.a(bool1, "No data or session marked for deletion");
      iZ();
      return new DataDeleteRequest(this, null);
      bool2 = false;
      break;
      i = 0;
      break label64;
    }
  }

  public Builder deleteAllData()
  {
    if ((this.Su.isEmpty()) && (this.TZ.isEmpty()));
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.TZ;
      arrayOfObject[1] = this.Su;
      n.b(bool, "Specific data source/type already specified for deletion. DataSources: %s DataTypes: %s", arrayOfObject);
      this.Ub = true;
      return this;
    }
  }

  public Builder deleteAllSessions()
  {
    boolean bool = this.Ua.isEmpty();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.Ua;
    n.b(bool, "Specific sessions already added for deletion: %s", arrayOfObject);
    this.Uc = true;
    return this;
  }

  public Builder setTimeInterval(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    boolean bool1;
    if (paramLong1 > 0L)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(paramLong1);
      n.b(bool1, "Invalid start time :%d", arrayOfObject1);
      if (paramLong2 <= paramLong1)
        break label92;
    }
    label92: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(paramLong2);
      n.b(bool2, "Invalid end time :%d", arrayOfObject2);
      this.KL = paramTimeUnit.toMillis(paramLong1);
      this.Si = paramTimeUnit.toMillis(paramLong2);
      return this;
      bool1 = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.DataDeleteRequest.Builder
 * JD-Core Version:    0.6.0
 */