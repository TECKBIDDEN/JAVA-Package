package android.support.v4.util;

public class DebugUtils
{
  public static void buildShortClassTag(Object paramObject, StringBuilder paramStringBuilder)
  {
    if (paramObject == null)
      paramStringBuilder.append("null");
    while (true)
    {
      return;
      String str = paramObject.getClass().getSimpleName();
      if ((str == null) || (str.length() <= 0))
      {
        str = paramObject.getClass().getName();
        int i = str.lastIndexOf('.');
        if (i > 0)
          str = str.substring(i + 1);
      }
      paramStringBuilder.append(str);
      paramStringBuilder.append('{');
      paramStringBuilder.append(Integer.toHexString(System.identityHashCode(paramObject)));
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.util.DebugUtils
 * JD-Core Version:    0.6.0
 */