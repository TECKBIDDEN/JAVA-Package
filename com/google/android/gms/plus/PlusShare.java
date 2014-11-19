package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ny;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PlusShare
{
  public static final String EXTRA_CALL_TO_ACTION = "com.google.android.apps.plus.CALL_TO_ACTION";
  public static final String EXTRA_CONTENT_DEEP_LINK_ID = "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID";
  public static final String EXTRA_CONTENT_DEEP_LINK_METADATA = "com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA";
  public static final String EXTRA_CONTENT_URL = "com.google.android.apps.plus.CONTENT_URL";
  public static final String EXTRA_IS_INTERACTIVE_POST = "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST";
  public static final String EXTRA_SENDER_ID = "com.google.android.apps.plus.SENDER_ID";
  public static final String KEY_CALL_TO_ACTION_DEEP_LINK_ID = "deepLinkId";
  public static final String KEY_CALL_TO_ACTION_LABEL = "label";
  public static final String KEY_CALL_TO_ACTION_URL = "url";
  public static final String KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION = "description";
  public static final String KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL = "thumbnailUrl";
  public static final String KEY_CONTENT_DEEP_LINK_METADATA_TITLE = "title";
  public static final String PARAM_CONTENT_DEEP_LINK_ID = "deep_link_id";

  @Deprecated
  protected PlusShare()
  {
    throw new AssertionError();
  }

  public static Bundle a(String paramString1, String paramString2, Uri paramUri)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("title", paramString1);
    localBundle.putString("description", paramString2);
    if (paramUri != null)
      localBundle.putString("thumbnailUrl", paramUri.toString());
    return localBundle;
  }

  protected static boolean ca(String paramString)
  {
    int i = 0;
    if (TextUtils.isEmpty(paramString))
      Log.e("GooglePlusPlatform", "The provided deep-link ID is empty.");
    while (true)
    {
      return i;
      if (paramString.contains(" "))
      {
        Log.e("GooglePlusPlatform", "Spaces are not allowed in deep-link IDs.");
        continue;
      }
      i = 1;
    }
  }

  public static Person createPerson(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1))
      throw new IllegalArgumentException("MinimalPerson ID must not be empty.");
    if (TextUtils.isEmpty(paramString2))
      throw new IllegalArgumentException("Display name must not be empty.");
    return new ny(paramString2, paramString1, null, 0, null);
  }

  public static String getDeepLinkId(Intent paramIntent)
  {
    String str = null;
    if ((paramIntent != null) && (paramIntent.getData() != null))
      str = paramIntent.getData().getQueryParameter("deep_link_id");
    return str;
  }

  public static class Builder
  {
    private boolean alg;
    private ArrayList<Uri> alh;
    private final Context mContext;
    private final Intent mIntent;

    public Builder(Activity paramActivity)
    {
      this.mContext = paramActivity;
      this.mIntent = new Intent().setAction("android.intent.action.SEND");
      this.mIntent.addFlags(524288);
      if ((paramActivity != null) && (paramActivity.getComponentName() != null))
        this.alg = true;
    }

    @Deprecated
    public Builder(Activity paramActivity, PlusClient paramPlusClient)
    {
      this(paramActivity);
      boolean bool;
      Person localPerson;
      if (paramPlusClient != null)
      {
        bool = true;
        n.a(bool, "PlusClient must not be null.");
        n.a(paramPlusClient.isConnected(), "PlusClient must be connected to create an interactive post.");
        n.a(paramPlusClient.mX().cd("https://www.googleapis.com/auth/plus.login"), "Must request PLUS_LOGIN scope in PlusClient to create an interactive post.");
        localPerson = paramPlusClient.getCurrentPerson();
        if (localPerson == null)
          break label78;
      }
      label78: for (String str = localPerson.getId(); ; str = "0")
      {
        this.mIntent.putExtra("com.google.android.apps.plus.SENDER_ID", str);
        return;
        bool = false;
        break;
      }
    }

    public Builder(Context paramContext)
    {
      this.mContext = paramContext;
      this.mIntent = new Intent().setAction("android.intent.action.SEND");
    }

    public Builder addCallToAction(String paramString1, Uri paramUri, String paramString2)
    {
      n.a(this.alg, "Must include the launching activity with PlusShare.Builder constructor before setting call-to-action");
      if ((paramUri != null) && (!TextUtils.isEmpty(paramUri.toString())));
      for (boolean bool = true; ; bool = false)
      {
        n.b(bool, "Must provide a call to action URL");
        Bundle localBundle = new Bundle();
        if (!TextUtils.isEmpty(paramString1))
          localBundle.putString("label", paramString1);
        localBundle.putString("url", paramUri.toString());
        if (!TextUtils.isEmpty(paramString2))
        {
          n.a(PlusShare.ca(paramString2), "The specified deep-link ID was malformed.");
          localBundle.putString("deepLinkId", paramString2);
        }
        this.mIntent.putExtra("com.google.android.apps.plus.CALL_TO_ACTION", localBundle);
        this.mIntent.putExtra("com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST", true);
        this.mIntent.setType("text/plain");
        return this;
      }
    }

    public Builder addStream(Uri paramUri)
    {
      Uri localUri = (Uri)this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
      if (localUri == null)
        this = setStream(paramUri);
      while (true)
      {
        return this;
        if (this.alh == null)
          this.alh = new ArrayList();
        this.alh.add(localUri);
        this.alh.add(paramUri);
      }
    }

    public Intent getIntent()
    {
      int i = 1;
      label59: label86: label122: Intent localIntent;
      if ((this.alh != null) && (this.alh.size() > i))
      {
        int k = i;
        boolean bool1 = "android.intent.action.SEND_MULTIPLE".equals(this.mIntent.getAction());
        boolean bool2 = this.mIntent.getBooleanExtra("com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST", false);
        if ((k != 0) && (bool2))
          break label306;
        int n = i;
        n.a(n, "Call-to-action buttons are only available for URLs.");
        if ((bool2) && (!this.mIntent.hasExtra("com.google.android.apps.plus.CONTENT_URL")))
          break label312;
        int i2 = i;
        n.a(i2, "The content URL is required for interactive posts.");
        if ((bool2) && (!this.mIntent.hasExtra("com.google.android.apps.plus.CONTENT_URL")) && (!this.mIntent.hasExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID")))
          break label318;
        n.a(i, "Must set content URL or content deep-link ID to use a call-to-action button.");
        if (this.mIntent.hasExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID"))
          n.a(PlusShare.ca(this.mIntent.getStringExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID")), "The specified deep-link ID was malformed.");
        if ((k == 0) && (bool1))
        {
          this.mIntent.setAction("android.intent.action.SEND");
          if ((this.alh == null) || (this.alh.isEmpty()))
            break label323;
          this.mIntent.putExtra("android.intent.extra.STREAM", (Parcelable)this.alh.get(0));
          label213: this.alh = null;
        }
        if ((k != 0) && (!bool1))
        {
          this.mIntent.setAction("android.intent.action.SEND_MULTIPLE");
          if ((this.alh == null) || (this.alh.isEmpty()))
            break label335;
          this.mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.alh);
        }
        label267: if (!"com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(this.mIntent.getAction()))
          break label347;
        this.mIntent.setPackage("com.google.android.gms");
        localIntent = this.mIntent;
      }
      while (true)
      {
        return localIntent;
        int m = 0;
        break;
        label306: int i1 = 0;
        break label59;
        label312: int i3 = 0;
        break label86;
        label318: int j = 0;
        break label122;
        label323: this.mIntent.removeExtra("android.intent.extra.STREAM");
        break label213;
        label335: this.mIntent.removeExtra("android.intent.extra.STREAM");
        break label267;
        label347: if (!this.mIntent.hasExtra("android.intent.extra.STREAM"))
        {
          this.mIntent.setAction("com.google.android.gms.plus.action.SHARE_GOOGLE");
          this.mIntent.setPackage("com.google.android.gms");
          localIntent = this.mIntent;
          continue;
        }
        this.mIntent.setPackage("com.google.android.apps.plus");
        localIntent = this.mIntent;
      }
    }

    public Builder setContentDeepLinkId(String paramString)
    {
      return setContentDeepLinkId(paramString, null, null, null);
    }

    public Builder setContentDeepLinkId(String paramString1, String paramString2, String paramString3, Uri paramUri)
    {
      n.b(this.alg, "Must include the launching activity with PlusShare.Builder constructor before setting deep links");
      if (!TextUtils.isEmpty(paramString1));
      for (boolean bool = true; ; bool = false)
      {
        n.b(bool, "The deepLinkId parameter is required.");
        Bundle localBundle = PlusShare.a(paramString2, paramString3, paramUri);
        this.mIntent.putExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID", paramString1);
        this.mIntent.putExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA", localBundle);
        this.mIntent.setType("text/plain");
        return this;
      }
    }

    public Builder setContentUrl(Uri paramUri)
    {
      String str = null;
      if (paramUri != null)
        str = paramUri.toString();
      if (TextUtils.isEmpty(str))
        this.mIntent.removeExtra("com.google.android.apps.plus.CONTENT_URL");
      while (true)
      {
        return this;
        this.mIntent.putExtra("com.google.android.apps.plus.CONTENT_URL", str);
      }
    }

    public Builder setRecipients(Person paramPerson, List<Person> paramList)
    {
      Intent localIntent = this.mIntent;
      if (paramPerson != null);
      for (String str = paramPerson.getId(); ; str = "0")
      {
        localIntent.putExtra("com.google.android.apps.plus.SENDER_ID", str);
        return setRecipients(paramList);
      }
    }

    @Deprecated
    public Builder setRecipients(List<Person> paramList)
    {
      int i;
      if (paramList != null)
      {
        i = paramList.size();
        if (i != 0)
          break label42;
        this.mIntent.removeExtra("com.google.android.apps.plus.RECIPIENT_IDS");
        this.mIntent.removeExtra("com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES");
      }
      while (true)
      {
        return this;
        i = 0;
        break;
        label42: ArrayList localArrayList1 = new ArrayList(i);
        ArrayList localArrayList2 = new ArrayList(i);
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          Person localPerson = (Person)localIterator.next();
          localArrayList1.add(localPerson.getId());
          localArrayList2.add(localPerson.getDisplayName());
        }
        this.mIntent.putStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_IDS", localArrayList1);
        this.mIntent.putStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES", localArrayList2);
      }
    }

    public Builder setStream(Uri paramUri)
    {
      this.alh = null;
      this.mIntent.putExtra("android.intent.extra.STREAM", paramUri);
      return this;
    }

    public Builder setText(CharSequence paramCharSequence)
    {
      this.mIntent.putExtra("android.intent.extra.TEXT", paramCharSequence);
      return this;
    }

    public Builder setType(String paramString)
    {
      this.mIntent.setType(paramString);
      return this;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.PlusShare
 * JD-Core Version:    0.6.0
 */