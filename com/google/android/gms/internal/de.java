package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.R.string;
import java.util.Map;

@ez
public class de
{
  private final Context mContext;
  private final gv md;
  private final Map<String, String> qM;

  public de(gv paramgv, Map<String, String> paramMap)
  {
    this.md = paramgv;
    this.qM = paramMap;
    this.mContext = paramgv.dA();
  }

  String B(String paramString)
  {
    return Uri.parse(paramString).getLastPathSegment();
  }

  DownloadManager.Request b(String paramString1, String paramString2)
  {
    DownloadManager.Request localRequest = new DownloadManager.Request(Uri.parse(paramString1));
    localRequest.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, paramString2);
    localRequest.allowScanningByMediaScanner();
    localRequest.setNotificationVisibility(1);
    return localRequest;
  }

  public void execute()
  {
    if (!new bl(this.mContext).bl())
      gs.W("Store picture feature is not supported on this device.");
    while (true)
    {
      return;
      if (TextUtils.isEmpty((CharSequence)this.qM.get("iurl")))
      {
        gs.W("Image url cannot be empty.");
        continue;
      }
      String str1 = (String)this.qM.get("iurl");
      if (!URLUtil.isValidUrl(str1))
      {
        gs.W("Invalid image url:" + str1);
        continue;
      }
      String str2 = B(str1);
      if (!gj.N(str2))
      {
        gs.W("Image type not recognized:");
        continue;
      }
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.mContext);
      localBuilder.setTitle(gb.c(R.string.store_picture_title, "Save image"));
      localBuilder.setMessage(gb.c(R.string.store_picture_message, "Allow Ad to store image in Picture gallery?"));
      localBuilder.setPositiveButton(gb.c(R.string.accept, "Accept"), new de.1(this, str1, str2));
      localBuilder.setNegativeButton(gb.c(R.string.decline, "Decline"), new de.2(this));
      localBuilder.create().show();
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.de
 * JD-Core Version:    0.6.0
 */