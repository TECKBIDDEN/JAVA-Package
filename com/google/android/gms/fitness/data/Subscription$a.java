package com.google.android.gms.fitness.data;

import com.google.android.gms.common.internal.n;

public class Subscription$a
{
  private DataType SF;
  private DataSource Sh;
  private long Ti = -1L;
  private int Tj = 2;

  public a b(DataSource paramDataSource)
  {
    this.Sh = paramDataSource;
    return this;
  }

  public a b(DataType paramDataType)
  {
    this.SF = paramDataType;
    return this;
  }

  public Subscription iR()
  {
    boolean bool1 = false;
    if ((this.Sh != null) || (this.SF != null));
    for (boolean bool2 = true; ; bool2 = false)
    {
      n.a(bool2, "Must call setDataSource() or setDataType()");
      if ((this.SF == null) || (this.Sh == null) || (this.SF.equals(this.Sh.getDataType())))
        bool1 = true;
      n.a(bool1, "Specified data type is incompatible with specified data source");
      return new Subscription(this, null);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.Subscription.a
 * JD-Core Version:    0.6.0
 */