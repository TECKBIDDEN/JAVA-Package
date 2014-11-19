package com.google.android.gms.cast;

import com.google.android.gms.internal.ik;
import java.util.Locale;

public final class LaunchOptions$Builder
{
  private LaunchOptions Fd = new LaunchOptions();

  public LaunchOptions build()
  {
    return this.Fd;
  }

  public Builder setLocale(Locale paramLocale)
  {
    this.Fd.setLanguage(ik.b(paramLocale));
    return this;
  }

  public Builder setRelaunchIfRunning(boolean paramBoolean)
  {
    this.Fd.setRelaunchIfRunning(paramBoolean);
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.LaunchOptions.Builder
 * JD-Core Version:    0.6.0
 */