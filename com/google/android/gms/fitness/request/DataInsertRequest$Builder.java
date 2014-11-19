package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import java.util.List;

public class DataInsertRequest$Builder
{
  private DataSet Th;

  public DataInsertRequest build()
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    if (this.Th != null)
    {
      bool2 = bool1;
      n.a(bool2, "Must set the data set");
      if (this.Th.getDataPoints().isEmpty())
        break label74;
      bool3 = bool1;
      label34: n.a(bool3, "Cannot use an empty data set");
      if (this.Th.getDataSource().iH() == null)
        break label79;
    }
    while (true)
    {
      n.a(bool1, "Must set the app package name for the data source");
      return new DataInsertRequest(this, null);
      bool2 = false;
      break;
      label74: bool3 = false;
      break label34;
      label79: bool1 = false;
    }
  }

  public Builder setDataSet(DataSet paramDataSet)
  {
    this.Th = paramDataSet;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.DataInsertRequest.Builder
 * JD-Core Version:    0.6.0
 */