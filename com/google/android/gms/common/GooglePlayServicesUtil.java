package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.string;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.jt;
import com.google.android.gms.internal.kc;
import java.util.Arrays;
import java.util.Set;

public final class GooglePlayServicesUtil
{
  public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 6111000;
  public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
  public static boolean Id = false;
  public static boolean Ie = false;
  private static int If = -1;
  private static final Object Ig = new Object();

  public static void D(Context paramContext)
    throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
  {
    int i = isGooglePlayServicesAvailable(paramContext);
    if (i != 0)
    {
      Intent localIntent = c(paramContext, i);
      Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + i);
      if (localIntent == null)
        throw new GooglePlayServicesNotAvailableException(i);
      throw new GooglePlayServicesRepairableException(i, "Google Play Services not available", localIntent);
    }
  }

  private static void E(Context paramContext)
  {
    Object localObject = null;
    int i;
    try
    {
      ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      localObject = localApplicationInfo;
      Bundle localBundle = localObject.metaData;
      if (localBundle == null)
        break label115;
      i = localBundle.getInt("com.google.android.gms.version");
      if (i == 6111000)
        return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", localNameNotFoundException);
    }
    throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 6111000 but found " + i + ".  You must have the" + " following declaration within the <application> element: " + "    <meta-data android:name=\"" + "com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />");
    label115: throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
  }

  private static String F(Context paramContext)
  {
    String str = paramContext.getApplicationInfo().name;
    PackageManager localPackageManager;
    if (TextUtils.isEmpty(str))
    {
      str = paramContext.getPackageName();
      localPackageManager = paramContext.getApplicationContext().getPackageManager();
    }
    try
    {
      ApplicationInfo localApplicationInfo2 = localPackageManager.getApplicationInfo(paramContext.getPackageName(), 0);
      localApplicationInfo1 = localApplicationInfo2;
      if (localApplicationInfo1 != null)
        str = localPackageManager.getApplicationLabel(localApplicationInfo1).toString();
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        ApplicationInfo localApplicationInfo1 = null;
    }
  }

  private static Dialog a(int paramInt1, Activity paramActivity, Fragment paramFragment, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    if ((jt.K(paramActivity)) && (paramInt1 == 2))
      paramInt1 = 42;
    if (kc.hE())
    {
      TypedValue localTypedValue = new TypedValue();
      paramActivity.getTheme().resolveAttribute(16843529, localTypedValue, true);
      if (!"Theme.Dialog.Alert".equals(paramActivity.getResources().getResourceEntryName(localTypedValue.resourceId)));
    }
    for (AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity, 5); ; localBuilder = null)
    {
      if (localBuilder == null)
        localBuilder = new AlertDialog.Builder(paramActivity);
      localBuilder.setMessage(d(paramActivity, paramInt1));
      if (paramOnCancelListener != null)
        localBuilder.setOnCancelListener(paramOnCancelListener);
      Intent localIntent = c(paramActivity, paramInt1);
      com.google.android.gms.common.internal.b localb;
      AlertDialog localAlertDialog;
      if (paramFragment == null)
      {
        localb = new com.google.android.gms.common.internal.b(paramActivity, localIntent, paramInt2);
        String str = e(paramActivity, paramInt1);
        if (str != null)
          localBuilder.setPositiveButton(str, localb);
        switch (paramInt1)
        {
        default:
          Log.e("GooglePlayServicesUtil", "Unexpected error code " + paramInt1);
          localAlertDialog = localBuilder.create();
        case 0:
        case 4:
        case 6:
        case 1:
        case 3:
        case 2:
        case 42:
        case 9:
        case 7:
        case 8:
        case 10:
        case 5:
        case 11:
        }
      }
      while (true)
      {
        return localAlertDialog;
        localb = new com.google.android.gms.common.internal.b(paramFragment, localIntent, paramInt2);
        break;
        localAlertDialog = null;
        continue;
        localAlertDialog = localBuilder.create();
        continue;
        localAlertDialog = localBuilder.setTitle(R.string.common_google_play_services_install_title).create();
        continue;
        localAlertDialog = localBuilder.setTitle(R.string.common_google_play_services_enable_title).create();
        continue;
        localAlertDialog = localBuilder.setTitle(R.string.common_google_play_services_update_title).create();
        continue;
        localAlertDialog = localBuilder.setTitle(R.string.common_android_wear_update_title).create();
        continue;
        Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
        localAlertDialog = localBuilder.setTitle(R.string.common_google_play_services_unsupported_title).create();
        continue;
        Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
        localAlertDialog = localBuilder.setTitle(R.string.common_google_play_services_network_error_title).create();
        continue;
        Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
        localAlertDialog = localBuilder.create();
        continue;
        Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
        localAlertDialog = localBuilder.create();
        continue;
        Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
        localAlertDialog = localBuilder.setTitle(R.string.common_google_play_services_invalid_account_title).create();
        continue;
        Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
        localAlertDialog = localBuilder.create();
      }
    }
  }

  public static boolean a(PackageManager paramPackageManager, PackageInfo paramPackageInfo)
  {
    boolean bool = true;
    int i = 0;
    if (paramPackageInfo == null);
    while (true)
    {
      return i;
      if (c(paramPackageManager))
      {
        if (a(paramPackageInfo, bool) != null);
        while (true)
        {
          i = bool;
          break;
          bool = false;
        }
      }
      if (a(paramPackageInfo, false) != null)
        i = bool;
      if ((i != 0) || (a(paramPackageInfo, bool) == null))
        continue;
      Log.w("GooglePlayServicesUtil", "Test-keys aren't accepted on this build.");
    }
  }

  public static boolean a(Resources paramResources)
  {
    int i = 0;
    if (paramResources == null);
    label49: 
    while (true)
    {
      return i;
      if ((0xF & paramResources.getConfiguration().screenLayout) > 3);
      for (int j = 1; ; j = 0)
      {
        if (((!kc.hB()) || (j == 0)) && (!b(paramResources)))
          break label49;
        i = 1;
        break;
      }
    }
  }

  private static byte[] a(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    Object localObject;
    if (paramPackageInfo.signatures.length != 1)
    {
      Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
      localObject = null;
    }
    while (true)
    {
      return localObject;
      byte[] arrayOfByte = paramPackageInfo.signatures[0].toByteArray();
      if (paramBoolean);
      for (Set localSet = b.fZ(); ; localSet = b.ga())
      {
        if (!localSet.contains(arrayOfByte))
          break label65;
        localObject = arrayOfByte;
        break;
      }
      label65: if (Log.isLoggable("GooglePlayServicesUtil", 2))
        Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(arrayOfByte, 0));
      localObject = null;
    }
  }

  private static byte[] a(PackageInfo paramPackageInfo, byte[][] paramArrayOfByte)
  {
    Object localObject;
    if (paramPackageInfo.signatures.length != 1)
    {
      Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
      localObject = null;
    }
    while (true)
    {
      return localObject;
      byte[] arrayOfByte1 = paramPackageInfo.signatures[0].toByteArray();
      for (int i = 0; ; i++)
      {
        if (i >= paramArrayOfByte.length)
          break label69;
        byte[] arrayOfByte2 = paramArrayOfByte[i];
        if (!Arrays.equals(arrayOfByte2, arrayOfByte1))
          continue;
        localObject = arrayOfByte2;
        break;
      }
      label69: if (Log.isLoggable("GooglePlayServicesUtil", 2))
        Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(arrayOfByte1, 0));
      localObject = null;
    }
  }

  public static Intent ai(int paramInt)
  {
    Intent localIntent;
    switch (paramInt)
    {
    default:
      localIntent = null;
    case 1:
    case 2:
    case 42:
    case 3:
    }
    while (true)
    {
      return localIntent;
      localIntent = g.aY("com.google.android.gms");
      continue;
      localIntent = g.gZ();
      continue;
      localIntent = g.aW("com.google.android.gms");
    }
  }

  public static boolean b(PackageManager paramPackageManager)
  {
    for (int i = 1; ; i = 0)
      synchronized (Ig)
      {
        int j = If;
        if (j == -1);
        try
        {
          PackageInfo localPackageInfo = paramPackageManager.getPackageInfo("com.google.android.gms", 64);
          byte[][] arrayOfByte = new byte[1][];
          arrayOfByte[0] = b.HZ[1];
          if (a(localPackageInfo, arrayOfByte) != null)
            If = 1;
          while (If != 0)
          {
            return i;
            If = 0;
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          while (true)
            If = 0;
        }
      }
  }

  public static boolean b(PackageManager paramPackageManager, String paramString)
  {
    try
    {
      PackageInfo localPackageInfo = paramPackageManager.getPackageInfo(paramString, 64);
      bool = a(paramPackageManager, localPackageInfo);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
      {
        if (Log.isLoggable("GooglePlayServicesUtil", 3))
          Log.d("GooglePlayServicesUtil", "Package manager can't find package " + paramString + ", defaulting to false");
        boolean bool = false;
      }
    }
  }

  private static boolean b(Resources paramResources)
  {
    int i = 0;
    Configuration localConfiguration = paramResources.getConfiguration();
    if ((kc.hD()) && ((0xF & localConfiguration.screenLayout) <= 3) && (localConfiguration.smallestScreenWidthDp >= 600))
      i = 1;
    return i;
  }

  @Deprecated
  public static Intent c(Context paramContext, int paramInt)
  {
    return ai(paramInt);
  }

  public static boolean c(PackageManager paramPackageManager)
  {
    if ((b(paramPackageManager)) || (!gb()));
    for (int i = 1; ; i = 0)
      return i;
  }

  public static String d(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    String str;
    switch (paramInt)
    {
    default:
      str = localResources.getString(R.string.common_google_play_services_unknown_issue);
    case 1:
    case 3:
    case 2:
    case 42:
    case 9:
    case 7:
    case 5:
    }
    while (true)
    {
      return str;
      if (a(paramContext.getResources()))
      {
        str = localResources.getString(R.string.common_google_play_services_install_text_tablet);
        continue;
      }
      str = localResources.getString(R.string.common_google_play_services_install_text_phone);
      continue;
      str = localResources.getString(R.string.common_google_play_services_enable_text);
      continue;
      str = localResources.getString(R.string.common_google_play_services_update_text);
      continue;
      str = localResources.getString(R.string.common_android_wear_update_text);
      continue;
      str = localResources.getString(R.string.common_google_play_services_unsupported_text);
      continue;
      str = localResources.getString(R.string.common_google_play_services_network_error_text);
      continue;
      str = localResources.getString(R.string.common_google_play_services_invalid_account_text);
    }
  }

  public static String e(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    String str;
    switch (paramInt)
    {
    default:
      str = localResources.getString(17039370);
    case 1:
    case 3:
    case 2:
    case 42:
    }
    while (true)
    {
      return str;
      str = localResources.getString(R.string.common_google_play_services_install_button);
      continue;
      str = localResources.getString(R.string.common_google_play_services_enable_button);
      continue;
      str = localResources.getString(R.string.common_google_play_services_update_button);
    }
  }

  public static String f(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    String str;
    switch (paramInt)
    {
    default:
      str = localResources.getString(R.string.common_google_play_services_unknown_issue);
    case 1:
    case 2:
    case 42:
    case 3:
    case 9:
    case 7:
    case 5:
    }
    while (true)
    {
      return str;
      str = localResources.getString(R.string.common_google_play_services_notification_needs_installation_title);
      continue;
      str = localResources.getString(R.string.common_google_play_services_notification_needs_update_title);
      continue;
      str = localResources.getString(R.string.common_android_wear_notification_needs_update_text);
      continue;
      str = localResources.getString(R.string.common_google_play_services_needs_enabling_title);
      continue;
      str = localResources.getString(R.string.common_google_play_services_unsupported_text);
      continue;
      str = localResources.getString(R.string.common_google_play_services_network_error_text);
      continue;
      str = localResources.getString(R.string.common_google_play_services_invalid_account_text);
    }
  }

  public static boolean gb()
  {
    if (Id);
    for (boolean bool = Ie; ; bool = "user".equals(Build.TYPE))
      return bool;
  }

  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return getErrorDialog(paramInt1, paramActivity, paramInt2, null);
  }

  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return a(paramInt1, paramActivity, null, paramInt2, paramOnCancelListener);
  }

  public static PendingIntent getErrorPendingIntent(int paramInt1, Context paramContext, int paramInt2)
  {
    Intent localIntent = c(paramContext, paramInt1);
    if (localIntent == null);
    for (PendingIntent localPendingIntent = null; ; localPendingIntent = PendingIntent.getActivity(paramContext, paramInt2, localIntent, 268435456))
      return localPendingIntent;
  }

  public static String getErrorString(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "UNKNOWN_ERROR_CODE";
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    }
    while (true)
    {
      return str;
      str = "SUCCESS";
      continue;
      str = "SERVICE_MISSING";
      continue;
      str = "SERVICE_VERSION_UPDATE_REQUIRED";
      continue;
      str = "SERVICE_DISABLED";
      continue;
      str = "SIGN_IN_REQUIRED";
      continue;
      str = "INVALID_ACCOUNT";
      continue;
      str = "RESOLUTION_REQUIRED";
      continue;
      str = "NETWORK_ERROR";
      continue;
      str = "INTERNAL_ERROR";
      continue;
      str = "SERVICE_INVALID";
      continue;
      str = "DEVELOPER_ERROR";
      continue;
      str = "LICENSE_CHECK_FAILED";
    }
  }

  // ERROR //
  public static String getOpenSourceSoftwareLicenseInfo(Context paramContext)
  {
    // Byte code:
    //   0: new 531	android/net/Uri$Builder
    //   3: dup
    //   4: invokespecial 532	android/net/Uri$Builder:<init>	()V
    //   7: ldc_w 534
    //   10: invokevirtual 538	android/net/Uri$Builder:scheme	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   13: ldc 11
    //   15: invokevirtual 541	android/net/Uri$Builder:authority	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   18: ldc_w 543
    //   21: invokevirtual 546	android/net/Uri$Builder:appendPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   24: ldc_w 548
    //   27: invokevirtual 546	android/net/Uri$Builder:appendPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   30: invokevirtual 552	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   33: astore_1
    //   34: aload_0
    //   35: invokevirtual 556	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   38: aload_1
    //   39: invokevirtual 562	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   42: astore 4
    //   44: new 564	java/util/Scanner
    //   47: dup
    //   48: aload 4
    //   50: invokespecial 567	java/util/Scanner:<init>	(Ljava/io/InputStream;)V
    //   53: ldc_w 569
    //   56: invokevirtual 573	java/util/Scanner:useDelimiter	(Ljava/lang/String;)Ljava/util/Scanner;
    //   59: invokevirtual 576	java/util/Scanner:next	()Ljava/lang/String;
    //   62: astore 7
    //   64: aload 7
    //   66: astore_3
    //   67: aload 4
    //   69: ifnull +44 -> 113
    //   72: aload 4
    //   74: invokevirtual 581	java/io/InputStream:close	()V
    //   77: goto +36 -> 113
    //   80: astore 6
    //   82: aload 4
    //   84: ifnull +31 -> 115
    //   87: aload 4
    //   89: invokevirtual 581	java/io/InputStream:close	()V
    //   92: goto +23 -> 115
    //   95: astore 5
    //   97: aload 4
    //   99: ifnull +8 -> 107
    //   102: aload 4
    //   104: invokevirtual 581	java/io/InputStream:close	()V
    //   107: aload 5
    //   109: athrow
    //   110: astore_2
    //   111: aconst_null
    //   112: astore_3
    //   113: aload_3
    //   114: areturn
    //   115: aconst_null
    //   116: astore_3
    //   117: goto -4 -> 113
    //
    // Exception table:
    //   from	to	target	type
    //   44	64	80	java/util/NoSuchElementException
    //   44	64	95	finally
    //   34	44	110	java/lang/Exception
    //   72	110	110	java/lang/Exception
  }

  public static Context getRemoteContext(Context paramContext)
  {
    try
    {
      Context localContext2 = paramContext.createPackageContext("com.google.android.gms", 3);
      localContext1 = localContext2;
      return localContext1;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        Context localContext1 = null;
    }
  }

  public static Resources getRemoteResource(Context paramContext)
  {
    try
    {
      Resources localResources2 = paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
      localResources1 = localResources2;
      return localResources1;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        Resources localResources1 = null;
    }
  }

  public static int isGooglePlayServicesAvailable(Context paramContext)
  {
    int i = 1;
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      paramContext.getResources().getString(R.string.common_google_play_services_unknown_issue);
      E(paramContext);
    }
    catch (Throwable localThrowable)
    {
      try
      {
        localPackageInfo1 = localPackageManager.getPackageInfo("com.google.android.gms", 64);
        if (jt.aP(localPackageInfo1.versionCode))
          if (gb())
          {
            k = 0;
            byte[][] arrayOfByte2 = new byte[2][];
            arrayOfByte2[0] = b.HH[k];
            arrayOfByte2[i] = b.HM[k];
            if (a(localPackageInfo1, arrayOfByte2) != null)
              break label135;
            Log.w("GooglePlayServicesUtil", "Google Play Services signature invalid on Glass.");
            i = 9;
            return i;
            localThrowable = localThrowable;
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
          }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        while (true)
        {
          PackageInfo localPackageInfo1;
          Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
          continue;
          int k = i;
          continue;
          label135: String str = paramContext.getPackageName();
          try
          {
            PackageInfo localPackageInfo3 = localPackageManager.getPackageInfo(str, 64);
            if (a(localPackageManager, localPackageInfo3))
              break label364;
            Log.w("GooglePlayServicesUtil", "Calling package " + localPackageInfo3.packageName + " signature invalid on Glass.");
            i = 9;
          }
          catch (PackageManager.NameNotFoundException localNameNotFoundException4)
          {
            Log.w("GooglePlayServicesUtil", "Could not get info for calling package: " + str);
            i = 9;
          }
          continue;
          byte[] arrayOfByte;
          label327: byte[][] arrayOfByte1;
          if (jt.K(paramContext))
          {
            if (a(localPackageInfo1, b.HH) == null)
            {
              Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
              i = 9;
              continue;
            }
          }
          else
          {
            try
            {
              PackageInfo localPackageInfo2 = localPackageManager.getPackageInfo("com.android.vending", 64);
              arrayOfByte = a(localPackageInfo2, b.HH);
              if (arrayOfByte != null)
                break label327;
              Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
              i = 9;
            }
            catch (PackageManager.NameNotFoundException localNameNotFoundException2)
            {
              Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
              i = 9;
            }
            continue;
            arrayOfByte1 = new byte[i][];
            arrayOfByte1[0] = arrayOfByte;
            if (a(localPackageInfo1, arrayOfByte1) == null)
            {
              Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
              i = 9;
              continue;
            }
          }
          label364: int j = jt.aN(6111000);
          if (jt.aN(localPackageInfo1.versionCode) < j)
          {
            Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires 6111000 but found " + localPackageInfo1.versionCode);
            i = 2;
            continue;
          }
          try
          {
            ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo("com.google.android.gms", 0);
            if (localApplicationInfo.enabled)
              break label460;
            i = 3;
          }
          catch (PackageManager.NameNotFoundException localNameNotFoundException3)
          {
            Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
            localNameNotFoundException3.printStackTrace();
          }
          continue;
          label460: i = 0;
        }
      }
    }
  }

  public static boolean isGoogleSignedUid(PackageManager paramPackageManager, int paramInt)
  {
    if (paramPackageManager == null)
      throw new SecurityException("Unknown error: invalid Package Manager");
    String[] arrayOfString = paramPackageManager.getPackagesForUid(paramInt);
    if ((arrayOfString.length == 0) || (!b(paramPackageManager, arrayOfString[0])))
      throw new SecurityException("Uid is not Google Signed");
    return true;
  }

  public static boolean isUserRecoverableError(int paramInt)
  {
    switch (paramInt)
    {
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    default:
    case 1:
    case 2:
    case 3:
    case 9:
    }
    for (int i = 0; ; i = 1)
      return i;
  }

  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return showErrorDialogFragment(paramInt1, paramActivity, paramInt2, null);
  }

  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return showErrorDialogFragment(paramInt1, paramActivity, null, paramInt2, paramOnCancelListener);
  }

  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, Fragment paramFragment, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    boolean bool = false;
    Dialog localDialog = a(paramInt1, paramActivity, paramFragment, paramInt2, paramOnCancelListener);
    if (localDialog == null);
    while (true)
    {
      return bool;
      try
      {
        bool = paramActivity instanceof FragmentActivity;
        label28: if (bool)
        {
          android.support.v4.app.FragmentManager localFragmentManager1 = ((FragmentActivity)paramActivity).getSupportFragmentManager();
          SupportErrorDialogFragment.newInstance(localDialog, paramOnCancelListener).show(localFragmentManager1, "GooglePlayServicesErrorDialog");
        }
        while (true)
        {
          bool = true;
          break;
          if (!kc.hB())
            break label91;
          android.app.FragmentManager localFragmentManager = paramActivity.getFragmentManager();
          ErrorDialogFragment.newInstance(localDialog, paramOnCancelListener).show(localFragmentManager, "GooglePlayServicesErrorDialog");
        }
        label91: throw new RuntimeException("This Activity does not support Fragments.");
      }
      catch (NoClassDefFoundError localNoClassDefFoundError)
      {
        break label28;
      }
    }
  }

  public static void showErrorNotification(int paramInt, Context paramContext)
  {
    boolean bool = jt.K(paramContext);
    if ((bool) && (paramInt == 2))
      paramInt = 42;
    Resources localResources = paramContext.getResources();
    String str1 = f(paramContext, paramInt);
    int i = R.string.common_google_play_services_error_notification_requested_by_msg;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = F(paramContext);
    String str2 = localResources.getString(i, arrayOfObject);
    PendingIntent localPendingIntent = getErrorPendingIntent(paramInt, paramContext, 0);
    if (bool)
      n.I(kc.hF());
    Notification localNotification;
    for (Object localObject = new Notification.Builder(paramContext).setSmallIcon(R.drawable.common_ic_googleplayservices).setPriority(2).setAutoCancel(true).setStyle(new Notification.BigTextStyle().bigText(str1 + " " + str2)).addAction(R.drawable.common_full_open_on_phone, localResources.getString(R.string.common_open_on_phone), localPendingIntent).build(); ; localObject = localNotification)
    {
      ((NotificationManager)paramContext.getSystemService("notification")).notify(39789, (Notification)localObject);
      return;
      localNotification = new Notification(17301642, localResources.getString(R.string.common_google_play_services_notification_ticker), System.currentTimeMillis());
      localNotification.flags = (0x10 | localNotification.flags);
      localNotification.setLatestEventInfo(paramContext, str1, str2, localPendingIntent);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GooglePlayServicesUtil
 * JD-Core Version:    0.6.0
 */