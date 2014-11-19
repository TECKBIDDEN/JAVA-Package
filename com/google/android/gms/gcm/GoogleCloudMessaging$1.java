package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;

class GoogleCloudMessaging$1 extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    Intent localIntent = (Intent)paramMessage.obj;
    this.adp.adm.add(localIntent);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.GoogleCloudMessaging.1
 * JD-Core Version:    0.6.0
 */