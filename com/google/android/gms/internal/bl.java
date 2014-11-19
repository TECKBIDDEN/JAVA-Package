package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import com.google.android.gms.common.internal.n;
import java.util.List;

@ez
public class bl
{
  private final Context mContext;

  public bl(Context paramContext)
  {
    n.b(paramContext, "Context can not be null");
    this.mContext = paramContext;
  }

  public static boolean bn()
  {
    return "mounted".equals(Environment.getExternalStorageState());
  }

  public boolean a(Intent paramIntent)
  {
    int i = 0;
    n.b(paramIntent, "Intent can not be null");
    if (!this.mContext.getPackageManager().queryIntentActivities(paramIntent, 0).isEmpty())
      i = 1;
    return i;
  }

  public boolean bj()
  {
    Intent localIntent = new Intent("android.intent.action.DIAL");
    localIntent.setData(Uri.parse("tel:"));
    return a(localIntent);
  }

  public boolean bk()
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("sms:"));
    return a(localIntent);
  }

  public boolean bl()
  {
    if ((bn()) && (this.mContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0));
    for (int i = 1; ; i = 0)
      return i;
  }

  public boolean bm()
  {
    return false;
  }

  public boolean bo()
  {
    Intent localIntent = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
    if ((Build.VERSION.SDK_INT >= 14) && (a(localIntent)));
    for (int i = 1; ; i = 0)
      return i;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bl
 * JD-Core Version:    0.6.0
 */