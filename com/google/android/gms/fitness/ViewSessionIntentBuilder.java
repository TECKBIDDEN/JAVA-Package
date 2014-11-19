package com.google.android.gms.fitness;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.fitness.data.Session;

public class ViewSessionIntentBuilder
{
  private String Sj;
  private Session Sk;
  private boolean Sl = false;
  private final Context mContext;

  public ViewSessionIntentBuilder(Context paramContext)
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
    if (this.Sk != null);
    for (boolean bool = true; ; bool = false)
    {
      n.a(bool, "Session must be set");
      Intent localIntent = new Intent("vnd.google.fitness.VIEW");
      localIntent.setType(FitnessIntents.getSessionMimeType(this.Sk.getActivity()));
      c.a(this.Sk, localIntent, "vnd.google.fitness.session");
      if (!this.Sl)
        this.Sj = this.Sk.getAppPackageName();
      return i(localIntent);
    }
  }

  public ViewSessionIntentBuilder setPreferredApplication(String paramString)
  {
    this.Sj = paramString;
    this.Sl = true;
    return this;
  }

  public ViewSessionIntentBuilder setSession(Session paramSession)
  {
    this.Sk = paramSession;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.ViewSessionIntentBuilder
 * JD-Core Version:    0.6.0
 */