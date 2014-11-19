package com.google.android.gms.fitness;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.fitness.data.DataSource;

public class ViewDataIntentBuilder
{
  private long KL;
  private DataSource Sh;
  private long Si;
  private String Sj;
  private final Context mContext;

  public ViewDataIntentBuilder(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private Intent i(Intent paramIntent)
  {
    int i = 0;
    if (this.Sj == null);
    while (true)
    {
      return paramIntent;
      Intent localIntent = new Intent(paramIntent).setPackage(this.Sj);
      if (this.mContext.getPackageManager().resolveActivity(localIntent, 0) != null)
        i = 1;
      if (i == 0)
        continue;
      paramIntent = localIntent;
    }
  }

  public Intent build()
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    if (this.Sh != null)
    {
      bool2 = bool1;
      n.a(bool2, "Data source must be set");
      if (this.KL <= 0L)
        break label126;
      bool3 = bool1;
      label28: n.a(bool3, "Start time must be set");
      if (this.Si <= this.KL)
        break label131;
    }
    while (true)
    {
      n.a(bool1, "End time must be set and after start time");
      Intent localIntent = new Intent("vnd.google.fitness.VIEW");
      localIntent.setType(FitnessIntents.getDataTypeMimeType(this.Sh.getDataType()));
      localIntent.putExtra("vnd.google.fitness.start_time", this.KL);
      localIntent.putExtra("vnd.google.fitness.end_time", this.Si);
      c.a(this.Sh, localIntent, "vnd.google.fitness.data_source");
      return i(localIntent);
      bool2 = false;
      break;
      label126: bool3 = false;
      break label28;
      label131: bool1 = false;
    }
  }

  public ViewDataIntentBuilder setDataSource(DataSource paramDataSource)
  {
    this.Sh = paramDataSource;
    return this;
  }

  public ViewDataIntentBuilder setPreferredApplication(String paramString)
  {
    this.Sj = paramString;
    return this;
  }

  public ViewDataIntentBuilder setTimeInterval(long paramLong1, long paramLong2)
  {
    this.KL = paramLong1;
    this.Si = paramLong2;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.ViewDataIntentBuilder
 * JD-Core Version:    0.6.0
 */