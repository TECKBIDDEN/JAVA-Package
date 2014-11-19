package com.google.android.gms.fitness.data;

import android.content.Context;
import com.google.android.gms.common.internal.n;

public final class DataSource$Builder
{
  private int FD = -1;
  private DataType SF;
  private Device SI;
  private a SJ;
  private String SK = "";
  private boolean SL = false;
  private String mName;

  public DataSource build()
  {
    boolean bool1 = true;
    boolean bool2;
    if (this.SF != null)
    {
      bool2 = bool1;
      n.a(bool2, "Must set data type");
      if (this.FD < 0)
        break label45;
    }
    while (true)
    {
      n.a(bool1, "Must set data source type");
      return new DataSource(this, null);
      bool2 = false;
      break;
      label45: bool1 = false;
    }
  }

  public Builder setAppPackageName(Context paramContext)
  {
    return setAppPackageName(paramContext.getPackageName());
  }

  public Builder setAppPackageName(String paramString)
  {
    this.SJ = new a(paramString, null, null);
    return this;
  }

  public Builder setDataType(DataType paramDataType)
  {
    this.SF = paramDataType;
    return this;
  }

  public Builder setDevice(Device paramDevice)
  {
    this.SI = paramDevice;
    return this;
  }

  public Builder setName(String paramString)
  {
    this.mName = paramString;
    return this;
  }

  public Builder setObfuscated(boolean paramBoolean)
  {
    this.SL = paramBoolean;
    return this;
  }

  public Builder setStreamName(String paramString)
  {
    if (paramString != null);
    for (boolean bool = true; ; bool = false)
    {
      n.b(bool, "Must specify a valid stream name");
      this.SK = paramString;
      return this;
    }
  }

  public Builder setType(int paramInt)
  {
    this.FD = paramInt;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.DataSource.Builder
 * JD-Core Version:    0.6.0
 */