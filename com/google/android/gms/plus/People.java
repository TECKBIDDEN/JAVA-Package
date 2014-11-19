package com.google.android.gms.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.model.people.Person;
import java.util.Collection;

public abstract interface People
{
  public abstract Person getCurrentPerson(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<People.LoadPeopleResult> load(GoogleApiClient paramGoogleApiClient, Collection<String> paramCollection);

  public abstract PendingResult<People.LoadPeopleResult> load(GoogleApiClient paramGoogleApiClient, String[] paramArrayOfString);

  public abstract PendingResult<People.LoadPeopleResult> loadConnected(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<People.LoadPeopleResult> loadVisible(GoogleApiClient paramGoogleApiClient, int paramInt, String paramString);

  public abstract PendingResult<People.LoadPeopleResult> loadVisible(GoogleApiClient paramGoogleApiClient, String paramString);

  public static abstract interface OrderBy
  {
    public static final int ALPHABETICAL = 0;
    public static final int BEST = 1;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.People
 * JD-Core Version:    0.6.0
 */