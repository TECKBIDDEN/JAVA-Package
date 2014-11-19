package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public abstract interface MessageApi
{
  public static final int UNKNOWN_REQUEST_ID = -1;

  public abstract PendingResult<Status> addListener(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener);

  public abstract PendingResult<Status> removeListener(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener);

  public abstract PendingResult<MessageApi.SendMessageResult> sendMessage(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, byte[] paramArrayOfByte);

  public static abstract interface MessageListener
  {
    public abstract void onMessageReceived(MessageEvent paramMessageEvent);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.MessageApi
 * JD-Core Version:    0.6.0
 */