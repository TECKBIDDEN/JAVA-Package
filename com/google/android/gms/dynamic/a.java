package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.LinkedList;

public abstract class a<T extends LifecycleDelegate>
{
  private T RP;
  private Bundle RQ;
  private LinkedList<a> RR;
  private final f<T> RS = new a.1(this);

  private void a(Bundle paramBundle, a parama)
  {
    if (this.RP != null)
    {
      parama.b(this.RP);
      return;
    }
    if (this.RR == null)
      this.RR = new LinkedList();
    this.RR.add(parama);
    if (paramBundle != null)
    {
      if (this.RQ != null)
        break label78;
      this.RQ = ((Bundle)paramBundle.clone());
    }
    while (true)
    {
      a(this.RS);
      break;
      label78: this.RQ.putAll(paramBundle);
    }
  }

  public static void b(FrameLayout paramFrameLayout)
  {
    Context localContext = paramFrameLayout.getContext();
    int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(localContext);
    String str1 = GooglePlayServicesUtil.d(localContext, i);
    String str2 = GooglePlayServicesUtil.e(localContext, i);
    LinearLayout localLinearLayout = new LinearLayout(paramFrameLayout.getContext());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.addView(localLinearLayout);
    TextView localTextView = new TextView(paramFrameLayout.getContext());
    localTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    localTextView.setText(str1);
    localLinearLayout.addView(localTextView);
    if (str2 != null)
    {
      Button localButton = new Button(localContext);
      localButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
      localButton.setText(str2);
      localLinearLayout.addView(localButton);
      localButton.setOnClickListener(new View.OnClickListener(localContext, i)
      {
        public void onClick(View paramView)
        {
          this.mV.startActivity(GooglePlayServicesUtil.c(this.mV, this.Sa));
        }
      });
    }
  }

  private void cv(int paramInt)
  {
    while ((!this.RR.isEmpty()) && (((a)this.RR.getLast()).getState() >= paramInt))
      this.RR.removeLast();
  }

  protected void a(FrameLayout paramFrameLayout)
  {
    b(paramFrameLayout);
  }

  protected abstract void a(f<T> paramf);

  public T it()
  {
    return this.RP;
  }

  public void onCreate(Bundle paramBundle)
  {
    a(paramBundle, new a.3(this, paramBundle));
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramLayoutInflater.getContext());
    a(paramBundle, new a.4(this, localFrameLayout, paramLayoutInflater, paramViewGroup, paramBundle));
    if (this.RP == null)
      a(localFrameLayout);
    return localFrameLayout;
  }

  public void onDestroy()
  {
    if (this.RP != null)
      this.RP.onDestroy();
    while (true)
    {
      return;
      cv(1);
    }
  }

  public void onDestroyView()
  {
    if (this.RP != null)
      this.RP.onDestroyView();
    while (true)
    {
      return;
      cv(2);
    }
  }

  public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    a(paramBundle2, new a.2(this, paramActivity, paramBundle1, paramBundle2));
  }

  public void onLowMemory()
  {
    if (this.RP != null)
      this.RP.onLowMemory();
  }

  public void onPause()
  {
    if (this.RP != null)
      this.RP.onPause();
    while (true)
    {
      return;
      cv(5);
    }
  }

  public void onResume()
  {
    a(null, new a.7(this));
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (this.RP != null)
      this.RP.onSaveInstanceState(paramBundle);
    while (true)
    {
      return;
      if (this.RQ != null)
      {
        paramBundle.putAll(this.RQ);
        continue;
      }
    }
  }

  public void onStart()
  {
    a(null, new a.6(this));
  }

  public void onStop()
  {
    if (this.RP != null)
      this.RP.onStop();
    while (true)
    {
      return;
      cv(4);
    }
  }

  private static abstract interface a
  {
    public abstract void b(LifecycleDelegate paramLifecycleDelegate);

    public abstract int getState();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.a
 * JD-Core Version:    0.6.0
 */