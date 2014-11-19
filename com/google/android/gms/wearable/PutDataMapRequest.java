package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.pb;
import com.google.android.gms.internal.pb.a;
import com.google.android.gms.internal.pm;
import java.util.List;

public class PutDataMapRequest
{
  private final DataMap auM;
  private final PutDataRequest auN;

  private PutDataMapRequest(PutDataRequest paramPutDataRequest, DataMap paramDataMap)
  {
    this.auN = paramPutDataRequest;
    this.auM = new DataMap();
    if (paramDataMap != null)
      this.auM.putAll(paramDataMap);
  }

  public static PutDataMapRequest create(String paramString)
  {
    return new PutDataMapRequest(PutDataRequest.create(paramString), null);
  }

  public static PutDataMapRequest createFromDataMapItem(DataMapItem paramDataMapItem)
  {
    return new PutDataMapRequest(PutDataRequest.k(paramDataMapItem.getUri()), paramDataMapItem.getDataMap());
  }

  public static PutDataMapRequest createWithAutoAppendedId(String paramString)
  {
    return new PutDataMapRequest(PutDataRequest.createWithAutoAppendedId(paramString), null);
  }

  public PutDataRequest asPutDataRequest()
  {
    pb.a locala = pb.a(this.auM);
    this.auN.setData(pm.f(locala.avQ));
    int i = locala.avR.size();
    for (int j = 0; j < i; j++)
    {
      String str = Integer.toString(j);
      Asset localAsset = (Asset)locala.avR.get(j);
      if (str == null)
        throw new IllegalStateException("asset key cannot be null: " + localAsset);
      if (localAsset == null)
        throw new IllegalStateException("asset cannot be null: key=" + str);
      if (Log.isLoggable("DataMap", 3))
        Log.d("DataMap", "asPutDataRequest: adding asset: " + str + " " + localAsset);
      this.auN.putAsset(str, localAsset);
    }
    return this.auN;
  }

  public DataMap getDataMap()
  {
    return this.auM;
  }

  public Uri getUri()
  {
    return this.auN.getUri();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.PutDataMapRequest
 * JD-Core Version:    0.6.0
 */