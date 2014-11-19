package com.google.android.gms.fitness.data;

import java.util.List;

public class t
{
  public static <T> int a(T paramT, List<T> paramList)
  {
    int i;
    if (paramT == null)
      i = -1;
    while (true)
    {
      return i;
      i = paramList.indexOf(paramT);
      if (i >= 0)
        continue;
      paramList.add(paramT);
      i = -1 + paramList.size();
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.t
 * JD-Core Version:    0.6.0
 */