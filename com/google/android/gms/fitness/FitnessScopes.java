package com.google.android.gms.fitness;

import com.google.android.gms.common.api.Scope;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class FitnessScopes
{
  public static final Scope SCOPE_ACTIVITY_READ = new Scope("https://www.googleapis.com/auth/fitness.activity.read");
  public static final Scope SCOPE_ACTIVITY_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.activity.write");
  public static final Scope SCOPE_BODY_READ;
  public static final Scope SCOPE_BODY_READ_WRITE;
  public static final Scope SCOPE_LOCATION_READ = new Scope("https://www.googleapis.com/auth/fitness.location.read");
  public static final Scope SCOPE_LOCATION_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.location.write");

  static
  {
    SCOPE_BODY_READ = new Scope("https://www.googleapis.com/auth/fitness.body.read");
    SCOPE_BODY_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.body.write");
  }

  public static String bp(String paramString)
  {
    if (paramString.equals("https://www.googleapis.com/auth/fitness.activity.read"))
      paramString = "https://www.googleapis.com/auth/fitness.activity.write";
    while (true)
    {
      return paramString;
      if (paramString.equals("https://www.googleapis.com/auth/fitness.location.read"))
      {
        paramString = "https://www.googleapis.com/auth/fitness.location.write";
        continue;
      }
      if (!paramString.equals("https://www.googleapis.com/auth/fitness.body.read"))
        continue;
      paramString = "https://www.googleapis.com/auth/fitness.body.write";
    }
  }

  public static String[] d(List<String> paramList)
  {
    HashSet localHashSet = new HashSet(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = bp(str1);
      if ((!str2.equals(str1)) && (paramList.contains(str2)))
        continue;
      localHashSet.add(str1);
    }
    return (String[])localHashSet.toArray(new String[localHashSet.size()]);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.FitnessScopes
 * JD-Core Version:    0.6.0
 */