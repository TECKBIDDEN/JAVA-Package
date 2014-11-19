package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.q;

public final class ExecutionOptions
{
  public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
  public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
  public static final int MAX_TRACKING_TAG_STRING_LENGTH = 65536;
  private final String Nf;
  private final boolean Ng;
  private final int Nh;

  private ExecutionOptions(String paramString, boolean paramBoolean, int paramInt)
  {
    this.Nf = paramString;
    this.Ng = paramBoolean;
    this.Nh = paramInt;
  }

  public static void a(GoogleApiClient paramGoogleApiClient, ExecutionOptions paramExecutionOptions)
  {
    q localq = (q)paramGoogleApiClient.a(Drive.CU);
    if ((paramExecutionOptions.hP()) && (!localq.ib()))
      throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
  }

  public static boolean aV(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 1:
    }
    for (int i = 0; ; i = 1)
      return i;
  }

  public static boolean aW(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    for (int i = 0; ; i = 1)
      return i;
  }

  public static boolean bh(String paramString)
  {
    if ((paramString != null) && (!paramString.isEmpty()) && (paramString.length() <= 65536));
    for (int i = 1; ; i = 0)
      return i;
  }

  public String hO()
  {
    return this.Nf;
  }

  public boolean hP()
  {
    return this.Ng;
  }

  public int hQ()
  {
    return this.Nh;
  }

  public static final class Builder
  {
    private String Nf;
    private boolean Ng;
    private int Nh = 0;

    public ExecutionOptions build()
    {
      if ((this.Nh == 1) && (!this.Ng))
        throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
      return new ExecutionOptions(this.Nf, this.Ng, this.Nh, null);
    }

    public Builder setConflictStrategy(int paramInt)
    {
      if (!ExecutionOptions.aW(paramInt))
        throw new IllegalArgumentException("Unrecognized value for conflict strategy: " + paramInt);
      this.Nh = paramInt;
      return this;
    }

    public Builder setNotifyOnCompletion(boolean paramBoolean)
    {
      this.Ng = paramBoolean;
      return this;
    }

    public Builder setTrackingTag(String paramString)
    {
      if (!ExecutionOptions.bh(paramString))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(65536);
        throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", arrayOfObject));
      }
      this.Nf = paramString;
      return this;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.ExecutionOptions
 * JD-Core Version:    0.6.0
 */