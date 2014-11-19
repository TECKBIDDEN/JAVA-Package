package com.google.android.gms.plus;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.model.people.PersonBuffer;

@Deprecated
public abstract interface PlusClient$OnPeopleLoadedListener
{
  public abstract void onPeopleLoaded(ConnectionResult paramConnectionResult, PersonBuffer paramPersonBuffer, String paramString);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener
 * JD-Core Version:    0.6.0
 */