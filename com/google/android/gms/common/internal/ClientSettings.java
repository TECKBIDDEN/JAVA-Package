package com.google.android.gms.common.internal;

import android.view.View;
import java.util.Collection;
import java.util.List;

public final class ClientSettings
{
  private final View IG;
  private final ClientSettings.ParcelableClientSettings Lk;

  public ClientSettings(String paramString1, Collection<String> paramCollection, int paramInt, View paramView, String paramString2)
  {
    this.Lk = new ClientSettings.ParcelableClientSettings(paramString1, paramCollection, paramInt, paramString2);
    this.IG = paramView;
  }

  public String getAccountName()
  {
    return this.Lk.getAccountName();
  }

  public String getAccountNameOrDefault()
  {
    return this.Lk.getAccountNameOrDefault();
  }

  public int getGravityForPopups()
  {
    return this.Lk.getGravityForPopups();
  }

  public ClientSettings.ParcelableClientSettings getParcelableClientSettings()
  {
    return this.Lk;
  }

  public String getRealClientPackageName()
  {
    return this.Lk.getRealClientPackageName();
  }

  public List<String> getScopes()
  {
    return this.Lk.getScopes();
  }

  public String[] getScopesArray()
  {
    return (String[])this.Lk.getScopes().toArray(new String[0]);
  }

  public View getViewForPopups()
  {
    return this.IG;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ClientSettings
 * JD-Core Version:    0.6.0
 */