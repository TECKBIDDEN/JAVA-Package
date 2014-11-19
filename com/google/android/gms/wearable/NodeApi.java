package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public abstract interface NodeApi
{
  public abstract PendingResult<Status> addListener(GoogleApiClient paramGoogleApiClient, NodeListener paramNodeListener);

  public abstract PendingResult<NodeApi.GetConnectedNodesResult> getConnectedNodes(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<NodeApi.GetLocalNodeResult> getLocalNode(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<Status> removeListener(GoogleApiClient paramGoogleApiClient, NodeListener paramNodeListener);

  public static abstract interface NodeListener
  {
    public abstract void onPeerConnected(Node paramNode);

    public abstract void onPeerDisconnected(Node paramNode);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.NodeApi
 * JD-Core Version:    0.6.0
 */