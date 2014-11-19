package com.google.android.gms.ads.mediation;

import android.location.Location;
import java.util.Date;
import java.util.Set;

public abstract interface MediationAdRequest
{
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

  public abstract Date getBirthday();

  public abstract int getGender();

  public abstract Set<String> getKeywords();

  public abstract Location getLocation();

  public abstract boolean isTesting();

  public abstract int taggedForChildDirectedTreatment();
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.MediationAdRequest
 * JD-Core Version:    0.6.0
 */