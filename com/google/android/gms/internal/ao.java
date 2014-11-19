package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class ao
{
  private static MessageDigest nI = null;
  protected Object mw = new Object();

  protected MessageDigest ba()
  {
    while (true)
    {
      MessageDigest localMessageDigest;
      int i;
      synchronized (this.mw)
      {
        if (nI == null)
          continue;
        localMessageDigest = nI;
        return localMessageDigest;
        i = 0;
        if (i >= 2);
      }
      try
      {
        nI = MessageDigest.getInstance("MD5");
        label38: i++;
        continue;
        localMessageDigest = nI;
        monitorexit;
        continue;
        localObject2 = finally;
        monitorexit;
        throw localObject2;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        break label38;
      }
    }
  }

  abstract byte[] l(String paramString);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ao
 * JD-Core Version:    0.6.0
 */