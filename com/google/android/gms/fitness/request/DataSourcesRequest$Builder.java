package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.fitness.data.DataType;

public class DataSourcesRequest$Builder
{
  private boolean Um;
  private DataType[] Un = new DataType[0];
  private int[] Uo;

  public DataSourcesRequest$Builder()
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 1;
    this.Uo = arrayOfInt;
    this.Um = false;
  }

  public DataSourcesRequest build()
  {
    boolean bool1 = true;
    boolean bool2;
    if (this.Un.length > 0)
    {
      bool2 = bool1;
      n.a(bool2, "Must add at least one data type");
      if (this.Uo.length <= 0)
        break label47;
    }
    while (true)
    {
      n.a(bool1, "Must add at least one data source type");
      return new DataSourcesRequest(this, null);
      bool2 = false;
      break;
      label47: bool1 = false;
    }
  }

  public Builder setDataSourceTypes(int[] paramArrayOfInt)
  {
    this.Uo = paramArrayOfInt;
    return this;
  }

  public Builder setDataTypes(DataType[] paramArrayOfDataType)
  {
    this.Un = paramArrayOfDataType;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.DataSourcesRequest.Builder
 * JD-Core Version:    0.6.0
 */