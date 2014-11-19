package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionReadRequest$Builder
{
  private long KL = 0L;
  private long Si = 0L;
  private List<DataType> Su = new ArrayList();
  private List<DataSource> TZ = new ArrayList();
  private String UC;
  private boolean UD = false;
  private List<String> UE = new ArrayList();
  private boolean Uk = false;
  private String vL;

  public SessionReadRequest build()
  {
    boolean bool1;
    if (this.KL > 0L)
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(this.KL);
      n.b(bool1, "Invalid start time: %s", arrayOfObject1);
      if ((this.Si <= 0L) || (this.Si <= this.KL))
        break label96;
    }
    label96: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(this.Si);
      n.b(bool2, "Invalid end time: %s", arrayOfObject2);
      return new SessionReadRequest(this, null);
      bool1 = false;
      break;
    }
  }

  public Builder enableServerQueries()
  {
    this.Uk = true;
    return this;
  }

  public Builder excludePackage(String paramString)
  {
    n.b(paramString, "Attempting to use a null package name");
    if (!this.UE.contains(paramString))
      this.UE.add(paramString);
    return this;
  }

  public Builder read(DataSource paramDataSource)
  {
    n.b(paramDataSource, "Attempting to add a null data source");
    if (!this.TZ.contains(paramDataSource))
      this.TZ.add(paramDataSource);
    return this;
  }

  public Builder read(DataType paramDataType)
  {
    n.b(paramDataType, "Attempting to use a null data type");
    if (!this.Su.contains(paramDataType))
      this.Su.add(paramDataType);
    return this;
  }

  public Builder readSessionsFromAllApps()
  {
    this.UD = true;
    return this;
  }

  public Builder setSessionId(String paramString)
  {
    this.vL = paramString;
    return this;
  }

  public Builder setSessionName(String paramString)
  {
    this.UC = paramString;
    return this;
  }

  public Builder setTimeInterval(long paramLong1, long paramLong2)
  {
    this.KL = paramLong1;
    this.Si = paramLong2;
    return this;
  }

  public Builder setTimeInterval(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    return setTimeInterval(paramTimeUnit.toMillis(paramLong1), paramTimeUnit.toMillis(paramLong2));
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.SessionReadRequest.Builder
 * JD-Core Version:    0.6.0
 */