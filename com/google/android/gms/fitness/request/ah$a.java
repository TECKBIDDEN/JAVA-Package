package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

public class ah$a
{
  private DataType SF;
  private DataSource Sh;

  public a d(DataSource paramDataSource)
  {
    this.Sh = paramDataSource;
    return this;
  }

  public a d(DataType paramDataType)
  {
    this.SF = paramDataType;
    return this;
  }

  public ah jE()
  {
    if ((this.SF != null) && (this.Sh != null))
      throw new IllegalArgumentException("Cannot specify both dataType and dataSource");
    return new ah(this, null);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.ah.a
 * JD-Core Version:    0.6.0
 */