package com.google.android.gms.plus;

import com.google.android.gms.common.internal.n;
import java.util.HashSet;
import java.util.Set;

public final class Plus$PlusOptions$Builder
{
  String akQ;
  final Set<String> akR = new HashSet();

  public Builder addActivityTypes(String[] paramArrayOfString)
  {
    n.b(paramArrayOfString, "activityTypes may not be null.");
    for (int i = 0; i < paramArrayOfString.length; i++)
      this.akR.add(paramArrayOfString[i]);
    return this;
  }

  public Plus.PlusOptions build()
  {
    return new Plus.PlusOptions(this, null);
  }

  public Builder setServerClientId(String paramString)
  {
    this.akQ = paramString;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.Plus.PlusOptions.Builder
 * JD-Core Version:    0.6.0
 */