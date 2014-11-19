package com.google.android.gms.fitness.data;

import com.google.android.gms.common.internal.n;
import com.google.android.gms.fitness.FitnessActivities;

public class Session$Builder
{
  private long KL = 0L;
  private a SJ;
  private long Si = 0L;
  private int Sv = 4;
  private String Tf;
  private String Tg;
  private String mName = null;

  public Session build()
  {
    boolean bool1 = false;
    boolean bool2;
    StringBuilder localStringBuilder;
    if (this.KL > 0L)
    {
      bool2 = true;
      n.a(bool2, "Start time should be specified.");
      if ((this.Si == 0L) || (this.Si > this.KL))
        bool1 = true;
      n.a(bool1, "End time should be later than start time.");
      if (this.Tf == null)
      {
        localStringBuilder = new StringBuilder();
        if (this.mName != null)
          break label109;
      }
    }
    label109: for (String str = ""; ; str = this.mName)
    {
      this.Tf = (str + this.KL);
      return new Session(this, null);
      bool2 = false;
      break;
    }
  }

  public Builder setActivity(int paramInt)
  {
    this.Sv = FitnessActivities.cw(paramInt);
    return this;
  }

  public Builder setDescription(String paramString)
  {
    if (paramString.length() <= 1000);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(1000);
      n.b(bool, "Session description cannot exceed %d characters", arrayOfObject);
      this.Tg = paramString;
      return this;
    }
  }

  public Builder setEndTimeMillis(long paramLong)
  {
    if (paramLong >= 0L);
    for (boolean bool = true; ; bool = false)
    {
      n.a(bool, "End time should be positive.");
      this.Si = paramLong;
      return this;
    }
  }

  public Builder setIdentifier(String paramString)
  {
    this.Tf = paramString;
    return this;
  }

  public Builder setName(String paramString)
  {
    if (paramString.length() <= 100);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(100);
      n.b(bool, "Session name cannot exceed %d characters", arrayOfObject);
      this.mName = paramString;
      return this;
    }
  }

  public Builder setStartTimeMillis(long paramLong)
  {
    if (paramLong > 0L);
    for (boolean bool = true; ; bool = false)
    {
      n.a(bool, "Start time should be positive.");
      this.KL = paramLong;
      return this;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.Session.Builder
 * JD-Core Version:    0.6.0
 */