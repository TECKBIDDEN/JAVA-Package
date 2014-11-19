package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class h
{
  private String No;
  private DriveId Nq;
  protected MetadataChangeSet Oa;
  private Integer Ob;
  private final int Oc;

  public h(int paramInt)
  {
    this.Oc = paramInt;
  }

  public void a(DriveId paramDriveId)
  {
    this.Nq = ((DriveId)n.i(paramDriveId));
  }

  public void a(MetadataChangeSet paramMetadataChangeSet)
  {
    this.Oa = ((MetadataChangeSet)n.i(paramMetadataChangeSet));
  }

  public void bi(String paramString)
  {
    this.No = ((String)n.i(paramString));
  }

  public void bk(int paramInt)
  {
    this.Ob = Integer.valueOf(paramInt);
  }

  public IntentSender build(GoogleApiClient paramGoogleApiClient)
  {
    n.b(this.Oa, "Must provide initial metadata to CreateFileActivityBuilder.");
    n.a(paramGoogleApiClient.isConnected(), "Client must be connected");
    q localq = (q)paramGoogleApiClient.a(Drive.CU);
    this.Oa.hS().setContext(localq.getContext());
    ab localab = localq.hY();
    int i;
    if (this.Ob == null)
      i = -1;
    try
    {
      while (true)
      {
        IntentSender localIntentSender = localab.a(new CreateFileIntentSenderRequest(this.Oa.hS(), i, this.No, this.Nq, this.Oc));
        return localIntentSender;
        i = this.Ob.intValue();
      }
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeException("Unable to connect Drive Play Service", localRemoteException);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.h
 * JD-Core Version:    0.6.0
 */