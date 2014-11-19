package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.fitness.data.DataType;

public class StartBleScanRequest$Builder
{
  private k UF;
  private int UG = 10;
  private DataType[] Un = new DataType[0];

  public Builder a(k paramk)
  {
    this.UF = paramk;
    return this;
  }

  public StartBleScanRequest build()
  {
    if (this.UF != null);
    for (boolean bool = true; ; bool = false)
    {
      n.a(bool, "Must set BleScanCallback");
      return new StartBleScanRequest(this, null);
    }
  }

  public Builder setBleScanCallback(BleScanCallback paramBleScanCallback)
  {
    a(a.a.iV().a(paramBleScanCallback));
    return this;
  }

  public Builder setDataTypes(DataType[] paramArrayOfDataType)
  {
    this.Un = paramArrayOfDataType;
    return this;
  }

  public Builder setTimeoutSecs(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt > 0)
    {
      bool2 = bool1;
      n.b(bool2, "Stop time must be greater than zero");
      if (paramInt > 60)
        break label38;
    }
    while (true)
    {
      n.b(bool1, "Stop time must be less than 1 minute");
      this.UG = paramInt;
      return this;
      bool2 = false;
      break;
      label38: bool1 = false;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.StartBleScanRequest.Builder
 * JD-Core Version:    0.6.0
 */