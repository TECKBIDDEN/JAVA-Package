package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;

public abstract interface ab extends IInterface
{
  public abstract IntentSender a(CreateFileIntentSenderRequest paramCreateFileIntentSenderRequest)
    throws RemoteException;

  public abstract IntentSender a(OpenFileIntentSenderRequest paramOpenFileIntentSenderRequest)
    throws RemoteException;

  public abstract void a(RealtimeDocumentSyncRequest paramRealtimeDocumentSyncRequest, ac paramac)
    throws RemoteException;

  public abstract void a(AddEventListenerRequest paramAddEventListenerRequest, ad paramad, String paramString, ac paramac)
    throws RemoteException;

  public abstract void a(AuthorizeAccessRequest paramAuthorizeAccessRequest, ac paramac)
    throws RemoteException;

  public abstract void a(CheckResourceIdsExistRequest paramCheckResourceIdsExistRequest, ac paramac)
    throws RemoteException;

  public abstract void a(CloseContentsAndUpdateMetadataRequest paramCloseContentsAndUpdateMetadataRequest, ac paramac)
    throws RemoteException;

  public abstract void a(CloseContentsRequest paramCloseContentsRequest, ac paramac)
    throws RemoteException;

  public abstract void a(CreateContentsRequest paramCreateContentsRequest, ac paramac)
    throws RemoteException;

  public abstract void a(CreateFileRequest paramCreateFileRequest, ac paramac)
    throws RemoteException;

  public abstract void a(CreateFolderRequest paramCreateFolderRequest, ac paramac)
    throws RemoteException;

  public abstract void a(DeleteResourceRequest paramDeleteResourceRequest, ac paramac)
    throws RemoteException;

  public abstract void a(DisconnectRequest paramDisconnectRequest)
    throws RemoteException;

  public abstract void a(GetDriveIdFromUniqueIdentifierRequest paramGetDriveIdFromUniqueIdentifierRequest, ac paramac)
    throws RemoteException;

  public abstract void a(GetMetadataRequest paramGetMetadataRequest, ac paramac)
    throws RemoteException;

  public abstract void a(ListParentsRequest paramListParentsRequest, ac paramac)
    throws RemoteException;

  public abstract void a(LoadRealtimeRequest paramLoadRealtimeRequest, ac paramac)
    throws RemoteException;

  public abstract void a(OpenContentsRequest paramOpenContentsRequest, ac paramac)
    throws RemoteException;

  public abstract void a(QueryRequest paramQueryRequest, ac paramac)
    throws RemoteException;

  public abstract void a(RemoveEventListenerRequest paramRemoveEventListenerRequest, ad paramad, String paramString, ac paramac)
    throws RemoteException;

  public abstract void a(SetDrivePreferencesRequest paramSetDrivePreferencesRequest, ac paramac)
    throws RemoteException;

  public abstract void a(SetResourceParentsRequest paramSetResourceParentsRequest, ac paramac)
    throws RemoteException;

  public abstract void a(TrashResourceRequest paramTrashResourceRequest, ac paramac)
    throws RemoteException;

  public abstract void a(UpdateMetadataRequest paramUpdateMetadataRequest, ac paramac)
    throws RemoteException;

  public abstract void a(ac paramac)
    throws RemoteException;

  public abstract void b(QueryRequest paramQueryRequest, ac paramac)
    throws RemoteException;

  public abstract void b(ac paramac)
    throws RemoteException;

  public abstract void c(ac paramac)
    throws RemoteException;

  public abstract void d(ac paramac)
    throws RemoteException;

  public abstract void e(ac paramac)
    throws RemoteException;

  public abstract void f(ac paramac)
    throws RemoteException;

  public abstract void g(ac paramac)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.ab
 * JD-Core Version:    0.6.0
 */