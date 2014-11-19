package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class n$b extends Handler
{
  private final ContainerHolder.ContainerAvailableListener aoe;

  public n$b(n paramn, ContainerHolder.ContainerAvailableListener paramContainerAvailableListener, Looper paramLooper)
  {
    super(paramLooper);
    this.aoe = paramContainerAvailableListener;
  }

  public void cp(String paramString)
  {
    sendMessage(obtainMessage(1, paramString));
  }

  protected void cq(String paramString)
  {
    this.aoe.onContainerAvailable(this.aof, paramString);
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      bh.T("Don't know how to handle this message.");
    case 1:
    }
    while (true)
    {
      return;
      cq((String)paramMessage.obj);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.n.b
 * JD-Core Version:    0.6.0
 */