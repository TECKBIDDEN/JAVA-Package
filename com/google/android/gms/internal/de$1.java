package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class de$1
  implements DialogInterface.OnClickListener
{
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    DownloadManager localDownloadManager = (DownloadManager)de.a(this.ra).getSystemService("download");
    try
    {
      localDownloadManager.enqueue(this.ra.b(this.qY, this.qZ));
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
        gs.U("Could not store picture.");
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.de.1
 * JD-Core Version:    0.6.0
 */