package com.google.android.gms.cast;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ij;
import java.io.IOException;

public final class Cast
{
  public static final Api<Cast.CastOptions> API;
  static final Api.c<ij> CU = new Api.c();
  private static final Api.b<ij, Cast.CastOptions> CV = new Cast.1();
  public static final CastApi CastApi;
  public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
  public static final int MAX_MESSAGE_LENGTH = 65536;
  public static final int MAX_NAMESPACE_LENGTH = 128;

  static
  {
    API = new Api(CV, CU, new Scope[0]);
    CastApi = new Cast.CastApi.a();
  }

  public static abstract interface CastApi
  {
    public abstract ApplicationMetadata getApplicationMetadata(GoogleApiClient paramGoogleApiClient)
      throws IllegalStateException;

    public abstract String getApplicationStatus(GoogleApiClient paramGoogleApiClient)
      throws IllegalStateException;

    public abstract double getVolume(GoogleApiClient paramGoogleApiClient)
      throws IllegalStateException;

    public abstract boolean isMute(GoogleApiClient paramGoogleApiClient)
      throws IllegalStateException;

    public abstract PendingResult<Cast.ApplicationConnectionResult> joinApplication(GoogleApiClient paramGoogleApiClient);

    public abstract PendingResult<Cast.ApplicationConnectionResult> joinApplication(GoogleApiClient paramGoogleApiClient, String paramString);

    public abstract PendingResult<Cast.ApplicationConnectionResult> joinApplication(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2);

    public abstract PendingResult<Cast.ApplicationConnectionResult> launchApplication(GoogleApiClient paramGoogleApiClient, String paramString);

    public abstract PendingResult<Cast.ApplicationConnectionResult> launchApplication(GoogleApiClient paramGoogleApiClient, String paramString, LaunchOptions paramLaunchOptions);

    @Deprecated
    public abstract PendingResult<Cast.ApplicationConnectionResult> launchApplication(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean);

    public abstract PendingResult<Status> leaveApplication(GoogleApiClient paramGoogleApiClient);

    public abstract void removeMessageReceivedCallbacks(GoogleApiClient paramGoogleApiClient, String paramString)
      throws IOException, IllegalArgumentException;

    public abstract void requestStatus(GoogleApiClient paramGoogleApiClient)
      throws IOException, IllegalStateException;

    public abstract PendingResult<Status> sendMessage(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2);

    public abstract void setMessageReceivedCallbacks(GoogleApiClient paramGoogleApiClient, String paramString, Cast.MessageReceivedCallback paramMessageReceivedCallback)
      throws IOException, IllegalStateException;

    public abstract void setMute(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
      throws IOException, IllegalStateException;

    public abstract void setVolume(GoogleApiClient paramGoogleApiClient, double paramDouble)
      throws IOException, IllegalArgumentException, IllegalStateException;

    public abstract PendingResult<Status> stopApplication(GoogleApiClient paramGoogleApiClient);

    public abstract PendingResult<Status> stopApplication(GoogleApiClient paramGoogleApiClient, String paramString);
  }

  public static class Listener
  {
    public void W(int paramInt)
    {
    }

    public void X(int paramInt)
    {
    }

    public void onApplicationDisconnected(int paramInt)
    {
    }

    public void onApplicationStatusChanged()
    {
    }

    public void onVolumeChanged()
    {
    }
  }

  public static abstract interface MessageReceivedCallback
  {
    public abstract void onMessageReceived(CastDevice paramCastDevice, String paramString1, String paramString2);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.Cast
 * JD-Core Version:    0.6.0
 */