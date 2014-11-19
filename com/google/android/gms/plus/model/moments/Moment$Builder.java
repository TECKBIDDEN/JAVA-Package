package com.google.android.gms.plus.model.moments;

import com.google.android.gms.internal.nt;
import com.google.android.gms.internal.nv;
import java.util.HashSet;
import java.util.Set;

public class Moment$Builder
{
  private String BL;
  private final Set<Integer> alR = new HashSet();
  private String amE;
  private nt amM;
  private nt amN;
  private String uO;

  public Moment build()
  {
    return new nv(this.alR, this.BL, this.amM, this.amE, this.amN, this.uO);
  }

  public Builder setId(String paramString)
  {
    this.BL = paramString;
    this.alR.add(Integer.valueOf(2));
    return this;
  }

  public Builder setResult(ItemScope paramItemScope)
  {
    this.amM = ((nt)paramItemScope);
    this.alR.add(Integer.valueOf(4));
    return this;
  }

  public Builder setStartDate(String paramString)
  {
    this.amE = paramString;
    this.alR.add(Integer.valueOf(5));
    return this;
  }

  public Builder setTarget(ItemScope paramItemScope)
  {
    this.amN = ((nt)paramItemScope);
    this.alR.add(Integer.valueOf(6));
    return this;
  }

  public Builder setType(String paramString)
  {
    this.uO = paramString;
    this.alR.add(Integer.valueOf(7));
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.model.moments.Moment.Builder
 * JD-Core Version:    0.6.0
 */