package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class GoogleCloudMessaging
{
  public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
  public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
  public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
  public static final String MESSAGE_TYPE_MESSAGE = "gcm";
  public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";
  static GoogleCloudMessaging adk;
  private PendingIntent adl;
  final BlockingQueue<Intent> adm = new LinkedBlockingQueue();
  private Handler adn = new GoogleCloudMessaging.1(this, Looper.getMainLooper());
  private Messenger ado = new Messenger(this.adn);
  private Context lB;

  private void a(String paramString1, String paramString2, long paramLong, int paramInt, Bundle paramBundle)
    throws IOException
  {
    if (Looper.getMainLooper() == Looper.myLooper())
      throw new IOException("MAIN_THREAD");
    if (paramString1 == null)
      throw new IllegalArgumentException("Missing 'to'");
    Intent localIntent = new Intent("com.google.android.gcm.intent.SEND");
    localIntent.putExtras(paramBundle);
    j(localIntent);
    localIntent.setPackage("com.google.android.gms");
    localIntent.putExtra("google.to", paramString1);
    localIntent.putExtra("google.message_id", paramString2);
    localIntent.putExtra("google.ttl", Long.toString(paramLong));
    localIntent.putExtra("google.delay", Integer.toString(paramInt));
    this.lB.sendOrderedBroadcast(localIntent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
  }

  private void d(String[] paramArrayOfString)
  {
    String str = e(paramArrayOfString);
    Intent localIntent = new Intent("com.google.android.c2dm.intent.REGISTER");
    localIntent.setPackage("com.google.android.gms");
    localIntent.putExtra("google.messenger", this.ado);
    j(localIntent);
    localIntent.putExtra("sender", str);
    this.lB.startService(localIntent);
  }

  public static GoogleCloudMessaging getInstance(Context paramContext)
  {
    monitorenter;
    try
    {
      if (adk == null)
      {
        adk = new GoogleCloudMessaging();
        adk.lB = paramContext;
      }
      GoogleCloudMessaging localGoogleCloudMessaging = adk;
      monitorexit;
      return localGoogleCloudMessaging;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  private void lL()
  {
    Intent localIntent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
    localIntent.setPackage("com.google.android.gms");
    this.adm.clear();
    localIntent.putExtra("google.messenger", this.ado);
    j(localIntent);
    this.lB.startService(localIntent);
  }

  public void close()
  {
    lM();
  }

  String e(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      throw new IllegalArgumentException("No senderIds");
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfString[0]);
    for (int i = 1; i < paramArrayOfString.length; i++)
      localStringBuilder.append(',').append(paramArrayOfString[i]);
    return localStringBuilder.toString();
  }

  public String getMessageType(Intent paramIntent)
  {
    String str;
    if (!"com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction()))
      str = null;
    while (true)
    {
      return str;
      str = paramIntent.getStringExtra("message_type");
      if (str != null)
        continue;
      str = "gcm";
    }
  }

  void j(Intent paramIntent)
  {
    monitorenter;
    try
    {
      if (this.adl == null)
      {
        Intent localIntent = new Intent();
        localIntent.setPackage("com.google.example.invalidpackage");
        this.adl = PendingIntent.getBroadcast(this.lB, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", this.adl);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  void lM()
  {
    monitorenter;
    try
    {
      if (this.adl != null)
      {
        this.adl.cancel();
        this.adl = null;
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public String register(String[] paramArrayOfString)
    throws IOException
  {
    if (Looper.getMainLooper() == Looper.myLooper())
      throw new IOException("MAIN_THREAD");
    this.adm.clear();
    d(paramArrayOfString);
    Intent localIntent;
    try
    {
      localIntent = (Intent)this.adm.poll(5000L, TimeUnit.MILLISECONDS);
      if (localIntent == null)
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IOException(localInterruptedException.getMessage());
    }
    String str1 = localIntent.getStringExtra("registration_id");
    if (str1 != null)
      return str1;
    localIntent.getStringExtra("error");
    String str2 = localIntent.getStringExtra("error");
    if (str2 != null)
      throw new IOException(str2);
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }

  public void send(String paramString1, String paramString2, long paramLong, Bundle paramBundle)
    throws IOException
  {
    a(paramString1, paramString2, paramLong, -1, paramBundle);
  }

  public void send(String paramString1, String paramString2, Bundle paramBundle)
    throws IOException
  {
    send(paramString1, paramString2, -1L, paramBundle);
  }

  public void unregister()
    throws IOException
  {
    if (Looper.getMainLooper() == Looper.myLooper())
      throw new IOException("MAIN_THREAD");
    lL();
    Intent localIntent;
    try
    {
      localIntent = (Intent)this.adm.poll(5000L, TimeUnit.MILLISECONDS);
      if (localIntent == null)
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IOException(localInterruptedException.getMessage());
    }
    if (localIntent.getStringExtra("unregistered") != null)
      return;
    String str = localIntent.getStringExtra("error");
    if (str != null)
      throw new IOException(str);
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.GoogleCloudMessaging
 * JD-Core Version:    0.6.0
 */