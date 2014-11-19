package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

class WearableListenerService$a$1
  implements Runnable
{
  public void run()
  {
    DataEventBuffer localDataEventBuffer = new DataEventBuffer(this.auV);
    try
    {
      this.auW.auU.onDataChanged(localDataEventBuffer);
      return;
    }
    finally
    {
      localDataEventBuffer.release();
    }
    throw localObject;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.WearableListenerService.a.1
 * JD-Core Version:    0.6.0
 */