package com.google.android.gms.plus;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.internal.i;

@Deprecated
public class PlusClient$Builder
{
  private final GooglePlayServicesClient.ConnectionCallbacks akX;
  private final GooglePlayServicesClient.OnConnectionFailedListener akY;
  private final i akZ;
  private final Context mContext;

  public PlusClient$Builder(Context paramContext, GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.mContext = paramContext;
    this.akX = paramConnectionCallbacks;
    this.akY = paramOnConnectionFailedListener;
    this.akZ = new i(this.mContext);
  }

  public PlusClient build()
  {
    return new PlusClient(new e(this.mContext, this.akX, this.akY, this.akZ.no()));
  }

  public Builder clearScopes()
  {
    this.akZ.nn();
    return this;
  }

  public Builder setAccountName(String paramString)
  {
    this.akZ.ce(paramString);
    return this;
  }

  public Builder setActions(String[] paramArrayOfString)
  {
    this.akZ.h(paramArrayOfString);
    return this;
  }

  public Builder setScopes(String[] paramArrayOfString)
  {
    this.akZ.g(paramArrayOfString);
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.PlusClient.Builder
 * JD-Core Version:    0.6.0
 */