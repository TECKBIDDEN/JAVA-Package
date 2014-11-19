package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ph<M extends pg<M>, T>
{
  protected final boolean awA;
  protected final Class<T> awz;
  protected final int tag;
  protected final int type;

  private ph(int paramInt1, Class<T> paramClass, int paramInt2, boolean paramBoolean)
  {
    this.type = paramInt1;
    this.awz = paramClass;
    this.tag = paramInt2;
    this.awA = paramBoolean;
  }

  public static <M extends pg<M>, T extends pm> ph<M, T> a(int paramInt1, Class<T> paramClass, int paramInt2)
  {
    return new ph(paramInt1, paramClass, paramInt2, false);
  }

  private T m(List<po> paramList)
  {
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < paramList.size(); j++)
    {
      po localpo = (po)paramList.get(j);
      if (localpo.awK.length == 0)
        continue;
      a(localpo, localArrayList);
    }
    int k = localArrayList.size();
    Object localObject;
    if (k == 0)
      localObject = null;
    while (true)
    {
      return localObject;
      localObject = this.awz.cast(Array.newInstance(this.awz.getComponentType(), k));
      while (i < k)
      {
        Array.set(localObject, i, localArrayList.get(i));
        i++;
      }
    }
  }

  private T n(List<po> paramList)
  {
    if (paramList.isEmpty());
    po localpo;
    for (Object localObject = null; ; localObject = this.awz.cast(u(pe.p(localpo.awK))))
    {
      return localObject;
      localpo = (po)paramList.get(-1 + paramList.size());
    }
  }

  int A(Object paramObject)
  {
    if (this.awA);
    for (int i = B(paramObject); ; i = C(paramObject))
      return i;
  }

  protected int B(Object paramObject)
  {
    int i = 0;
    int j = Array.getLength(paramObject);
    for (int k = 0; k < j; k++)
    {
      if (Array.get(paramObject, k) == null)
        continue;
      i += C(Array.get(paramObject, k));
    }
    return i;
  }

  protected int C(Object paramObject)
  {
    int i = pp.gH(this.tag);
    switch (this.type)
    {
    default:
      throw new IllegalArgumentException("Unknown type " + this.type);
    case 10:
    case 11:
    }
    for (int j = pf.b(i, (pm)paramObject); ; j = pf.c(i, (pm)paramObject))
      return j;
  }

  protected void a(po parampo, List<Object> paramList)
  {
    paramList.add(u(pe.p(parampo.awK)));
  }

  void a(Object paramObject, pf parampf)
    throws IOException
  {
    if (this.awA)
      c(paramObject, parampf);
    while (true)
    {
      return;
      b(paramObject, parampf);
    }
  }

  protected void b(Object paramObject, pf parampf)
  {
    try
    {
      parampf.gz(this.tag);
      switch (this.type)
      {
      default:
        throw new IllegalArgumentException("Unknown type " + this.type);
      case 10:
      case 11:
      }
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
    pm localpm = (pm)paramObject;
    int i = pp.gH(this.tag);
    parampf.b(localpm);
    parampf.w(i, 4);
    return;
    parampf.c((pm)paramObject);
  }

  protected void c(Object paramObject, pf parampf)
  {
    int i = Array.getLength(paramObject);
    for (int j = 0; j < i; j++)
    {
      Object localObject = Array.get(paramObject, j);
      if (localObject == null)
        continue;
      b(localObject, parampf);
    }
  }

  final T l(List<po> paramList)
  {
    Object localObject;
    if (paramList == null)
      localObject = null;
    while (true)
    {
      return localObject;
      if (this.awA)
      {
        localObject = m(paramList);
        continue;
      }
      localObject = n(paramList);
    }
  }

  protected Object u(pe parampe)
  {
    Class localClass;
    if (this.awA)
      localClass = this.awz.getComponentType();
    pm localpm;
    try
    {
      switch (this.type)
      {
      default:
        throw new IllegalArgumentException("Unknown type " + this.type);
      case 10:
      case 11:
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      while (true)
      {
        throw new IllegalArgumentException("Error creating instance of class " + localClass, localInstantiationException);
        localClass = this.awz;
      }
      localpm = (pm)localClass.newInstance();
      parampe.a(localpm, pp.gH(this.tag));
      break label195;
      localpm = (pm)localClass.newInstance();
      parampe.a(localpm);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalArgumentException("Error creating instance of class " + localClass, localIllegalAccessException);
    }
    catch (IOException localIOException)
    {
      throw new IllegalArgumentException("Error reading extension field", localIOException);
    }
    label195: return localpm;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ph
 * JD-Core Version:    0.6.0
 */