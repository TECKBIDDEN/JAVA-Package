package com.google.android.gms.internal;

import com.google.android.gms.common.internal.n;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class ji
{
  private void a(StringBuilder paramStringBuilder, ji.a parama, Object paramObject)
  {
    if (parama.hd() == 11)
      paramStringBuilder.append(((ji)parama.hn().cast(paramObject)).toString());
    while (true)
    {
      return;
      if (parama.hd() == 7)
      {
        paramStringBuilder.append("\"");
        paramStringBuilder.append(jz.bf((String)paramObject));
        paramStringBuilder.append("\"");
        continue;
      }
      paramStringBuilder.append(paramObject);
    }
  }

  private void a(StringBuilder paramStringBuilder, ji.a parama, ArrayList<Object> paramArrayList)
  {
    paramStringBuilder.append("[");
    int i = 0;
    int j = paramArrayList.size();
    while (i < j)
    {
      if (i > 0)
        paramStringBuilder.append(",");
      Object localObject = paramArrayList.get(i);
      if (localObject != null)
        a(paramStringBuilder, parama, localObject);
      i++;
    }
    paramStringBuilder.append("]");
  }

  protected <O, I> I a(ji.a<I, O> parama, Object paramObject)
  {
    if (ji.a.c(parama) != null)
      paramObject = parama.convertBack(paramObject);
    return paramObject;
  }

  protected boolean a(ji.a parama)
  {
    boolean bool;
    if (parama.he() == 11)
      if (parama.hk())
        bool = bd(parama.hl());
    while (true)
    {
      return bool;
      bool = bc(parama.hl());
      continue;
      bool = bb(parama.hl());
    }
  }

  protected Object b(ji.a parama)
  {
    String str1 = parama.hl();
    boolean bool;
    HashMap localHashMap;
    if (parama.hn() != null)
      if (ba(parama.hl()) == null)
      {
        bool = true;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = parama.hl();
        n.a(bool, "Concrete field shouldn't be value object: %s", arrayOfObject);
        if (!parama.hk())
          break label84;
        localHashMap = hh();
        label62: if (localHashMap == null)
          break label93;
      }
    for (Object localObject1 = localHashMap.get(str1); ; localObject1 = ba(parama.hl()))
      while (true)
      {
        return localObject1;
        bool = false;
        break;
        label84: localHashMap = hg();
        break label62;
        try
        {
          label93: String str2 = "get" + Character.toUpperCase(str1.charAt(0)) + str1.substring(1);
          Object localObject2 = getClass().getMethod(str2, new Class[0]).invoke(this, new Object[0]);
          localObject1 = localObject2;
        }
        catch (Exception localException)
        {
          throw new RuntimeException(localException);
        }
      }
  }

  protected abstract Object ba(String paramString);

  protected abstract boolean bb(String paramString);

  protected boolean bc(String paramString)
  {
    throw new UnsupportedOperationException("Concrete types not supported");
  }

  protected boolean bd(String paramString)
  {
    throw new UnsupportedOperationException("Concrete type arrays not supported");
  }

  public abstract HashMap<String, ji.a<?, ?>> hf();

  public HashMap<String, Object> hg()
  {
    return null;
  }

  public HashMap<String, Object> hh()
  {
    return null;
  }

  public String toString()
  {
    HashMap localHashMap = hf();
    StringBuilder localStringBuilder = new StringBuilder(100);
    Iterator localIterator = localHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ji.a locala = (ji.a)localHashMap.get(str);
      if (!a(locala))
        continue;
      Object localObject = a(locala, b(locala));
      if (localStringBuilder.length() == 0)
        localStringBuilder.append("{");
      while (true)
      {
        localStringBuilder.append("\"").append(str).append("\":");
        if (localObject != null)
          break label135;
        localStringBuilder.append("null");
        break;
        localStringBuilder.append(",");
      }
      label135: switch (locala.he())
      {
      default:
        if (locala.hj())
          a(localStringBuilder, locala, (ArrayList)localObject);
        break;
      case 8:
        localStringBuilder.append("\"").append(js.d((byte[])(byte[])localObject)).append("\"");
        break;
      case 9:
        localStringBuilder.append("\"").append(js.e((byte[])(byte[])localObject)).append("\"");
        break;
      case 10:
        ka.a(localStringBuilder, (HashMap)localObject);
        continue;
        a(localStringBuilder, locala, localObject);
      }
    }
    if (localStringBuilder.length() > 0)
      localStringBuilder.append("}");
    while (true)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("{}");
    }
  }

  public static abstract interface b<I, O>
  {
    public abstract I convertBack(O paramO);

    public abstract int hd();

    public abstract int he();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ji
 * JD-Core Version:    0.6.0
 */