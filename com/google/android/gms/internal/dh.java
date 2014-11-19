package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

@ez
public final class dh
{
  public static boolean a(Context paramContext, dj paramdj, dq paramdq)
  {
    int i = 0;
    if (paramdj == null)
      gs.W("No intent data for launcher overlay.");
    while (true)
    {
      return i;
      Intent localIntent = new Intent();
      if (TextUtils.isEmpty(paramdj.rq))
      {
        gs.W("Open GMSG did not contain a URL.");
        continue;
      }
      if (!TextUtils.isEmpty(paramdj.mimeType))
        localIntent.setDataAndType(Uri.parse(paramdj.rq), paramdj.mimeType);
      String[] arrayOfString;
      while (true)
      {
        localIntent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(paramdj.packageName))
          localIntent.setPackage(paramdj.packageName);
        if (TextUtils.isEmpty(paramdj.rr))
          break label182;
        arrayOfString = paramdj.rr.split("/", 2);
        if (arrayOfString.length >= 2)
          break label168;
        gs.W("Could not parse component name from open GMSG: " + paramdj.rr);
        break;
        localIntent.setData(Uri.parse(paramdj.rq));
      }
      label168: localIntent.setClassName(arrayOfString[0], arrayOfString[1]);
      try
      {
        label182: gs.V("Launching an intent: " + localIntent);
        paramContext.startActivity(localIntent);
        paramdq.ab();
        i = 1;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        gs.W(localActivityNotFoundException.getMessage());
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dh
 * JD-Core Version:    0.6.0
 */