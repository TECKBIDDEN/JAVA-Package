package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.d.a;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class aj
{
  private final Set<String> aoY;
  private final String aoZ;

  public aj(String paramString, String[] paramArrayOfString)
  {
    this.aoZ = paramString;
    this.aoY = new HashSet(paramArrayOfString.length);
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      this.aoY.add(str);
    }
  }

  public abstract d.a C(Map<String, d.a> paramMap);

  boolean a(Set<String> paramSet)
  {
    return paramSet.containsAll(this.aoY);
  }

  public abstract boolean nL();

  public String op()
  {
    return this.aoZ;
  }

  public Set<String> oq()
  {
    return this.aoY;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.aj
 * JD-Core Version:    0.6.0
 */