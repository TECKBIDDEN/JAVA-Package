package android.sec.multiwindow;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Pair;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

public class MultiWindowImpl
{
  private static Field sArrangeField = null;
  protected Context mContext;
  private HashMap<String, Pair<Object, Method>> mMethodMap;

  public MultiWindowImpl(Context paramContext)
  {
    this.mContext = paramContext;
    this.mMethodMap = new HashMap();
    Class localClass = findClass("android.view.WindowManagerPolicy$WindowModeHelper");
    Class[] arrayOfClass1 = new Class[1];
    arrayOfClass1[0] = Integer.TYPE;
    putMethod(localClass, null, "mode", arrayOfClass1);
    Class[] arrayOfClass2 = new Class[1];
    arrayOfClass2[0] = Integer.TYPE;
    putMethod(localClass, null, "option", arrayOfClass2);
  }

  protected Class<?> findClass(String paramString)
  {
    try
    {
      Class localClass2 = Class.forName(paramString);
      localClass1 = localClass2;
      return localClass1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
        Class localClass1 = null;
    }
  }

  protected int getArrange(Configuration paramConfiguration)
  {
    try
    {
      if (sArrangeField == null)
        sArrangeField = paramConfiguration.getClass().getField("arrange");
      int j = sArrangeField.getInt(paramConfiguration);
      i = j;
      return i;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      while (true)
      {
        localNoSuchFieldException.printStackTrace();
        int i = 0;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        localIllegalArgumentException.printStackTrace();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
        localIllegalAccessException.printStackTrace();
    }
  }

  protected Object invoke(String paramString, Object[] paramArrayOfObject)
  {
    try
    {
      Pair localPair = (Pair)this.mMethodMap.get(paramString);
      Object localObject2 = ((Method)localPair.second).invoke(localPair.first, paramArrayOfObject);
      localObject1 = localObject2;
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localException.printStackTrace();
        Object localObject1 = null;
      }
    }
  }

  protected int mode(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    return ((Integer)invoke("mode", arrayOfObject)).intValue();
  }

  protected int option(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    return ((Integer)invoke("option", arrayOfObject)).intValue();
  }

  protected void putMethod(Class<?> paramClass, Object paramObject, String paramString, Class<?>[] paramArrayOfClass)
  {
    try
    {
      Method localMethod = paramClass.getMethod(paramString, paramArrayOfClass);
      this.mMethodMap.put(paramString, new Pair(paramObject, localMethod));
      label28: return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label28;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     android.sec.multiwindow.MultiWindowImpl
 * JD-Core Version:    0.6.0
 */