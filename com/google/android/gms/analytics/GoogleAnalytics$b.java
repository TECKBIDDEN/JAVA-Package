package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

class GoogleAnalytics$b
  implements Application.ActivityLifecycleCallbacks
{
  GoogleAnalytics$b(GoogleAnalytics paramGoogleAnalytics)
  {
  }

  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
  }

  public void onActivityDestroyed(Activity paramActivity)
  {
  }

  public void onActivityPaused(Activity paramActivity)
  {
  }

  public void onActivityResumed(Activity paramActivity)
  {
  }

  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
  }

  public void onActivityStarted(Activity paramActivity)
  {
    this.AD.g(paramActivity);
  }

  public void onActivityStopped(Activity paramActivity)
  {
    this.AD.h(paramActivity);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.GoogleAnalytics.b
 * JD-Core Version:    0.6.0
 */