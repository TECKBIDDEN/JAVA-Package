package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

@ez
public final class fw
{
  public final int uS;
  public final boolean uT;
  public final boolean uU;
  public final String uV;
  public final String uW;
  public final boolean uX;
  public final boolean uY;
  public final boolean uZ;
  public final String va;
  public final String vb;
  public final int vc;
  public final int vd;
  public final int ve;
  public final int vf;
  public final int vg;
  public final int vh;
  public final float vi;
  public final int vj;
  public final int vk;
  public final double vl;
  public final boolean vm;
  public final boolean vn;
  public final int vo;

  public fw(Context paramContext)
  {
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    Locale localLocale = Locale.getDefault();
    PackageManager localPackageManager = paramContext.getPackageManager();
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    Intent localIntent = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    this.uS = localAudioManager.getMode();
    boolean bool2;
    boolean bool3;
    if (a(localPackageManager, "geo:0,0?q=donuts") != null)
    {
      bool2 = bool1;
      this.uT = bool2;
      if (a(localPackageManager, "http://www.google.com") == null)
        break label376;
      bool3 = bool1;
      label114: this.uU = bool3;
      this.uV = localTelephonyManager.getNetworkOperator();
      this.uW = localLocale.getCountry();
      this.uX = gr.ds();
      this.uY = localAudioManager.isMusicActive();
      this.uZ = localAudioManager.isSpeakerphoneOn();
      this.va = localLocale.getLanguage();
      this.vb = a(localPackageManager);
      this.vc = localAudioManager.getStreamVolume(3);
      this.vd = a(paramContext, localConnectivityManager, localPackageManager);
      this.ve = localTelephonyManager.getNetworkType();
      this.vf = localTelephonyManager.getPhoneType();
      this.vg = localAudioManager.getRingerMode();
      this.vh = localAudioManager.getStreamVolume(2);
      this.vi = localDisplayMetrics.density;
      this.vj = localDisplayMetrics.widthPixels;
      this.vk = localDisplayMetrics.heightPixels;
      if (localIntent == null)
        break label387;
      int i = localIntent.getIntExtra("status", -1);
      int j = localIntent.getIntExtra("level", -1);
      int k = localIntent.getIntExtra("scale", -1);
      this.vl = (j / k);
      if ((i != 2) && (i != 5))
        break label382;
      label324: this.vm = bool1;
      label329: if (Build.VERSION.SDK_INT < 16)
        break label411;
      this.vn = localConnectivityManager.isActiveNetworkMetered();
      if (localConnectivityManager.getActiveNetworkInfo() == null)
        break label402;
      this.vo = localConnectivityManager.getActiveNetworkInfo().getDetailedState().ordinal();
    }
    while (true)
    {
      return;
      bool2 = false;
      break;
      label376: bool3 = false;
      break label114;
      label382: bool1 = false;
      break label324;
      label387: this.vl = -1.0D;
      this.vm = false;
      break label329;
      label402: this.vo = -1;
      continue;
      label411: this.vn = false;
      this.vo = -1;
    }
  }

  private static int a(Context paramContext, ConnectivityManager paramConnectivityManager, PackageManager paramPackageManager)
  {
    int i = -2;
    NetworkInfo localNetworkInfo;
    if (gj.a(paramPackageManager, paramContext.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
    {
      localNetworkInfo = paramConnectivityManager.getActiveNetworkInfo();
      if (localNetworkInfo == null)
        break label35;
    }
    label35: for (i = localNetworkInfo.getType(); ; i = -1)
      return i;
  }

  private static ResolveInfo a(PackageManager paramPackageManager, String paramString)
  {
    return paramPackageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)), 65536);
  }

  private static String a(PackageManager paramPackageManager)
  {
    Object localObject = null;
    ResolveInfo localResolveInfo = a(paramPackageManager, "market://details?id=com.google.android.gms.ads");
    if (localResolveInfo == null);
    while (true)
    {
      return localObject;
      ActivityInfo localActivityInfo = localResolveInfo.activityInfo;
      if (localActivityInfo == null)
        continue;
      try
      {
        PackageInfo localPackageInfo = paramPackageManager.getPackageInfo(localActivityInfo.packageName, 0);
        if (localPackageInfo == null)
          continue;
        String str = localPackageInfo.versionCode + "." + localActivityInfo.packageName;
        localObject = str;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fw
 * JD-Core Version:    0.6.0
 */