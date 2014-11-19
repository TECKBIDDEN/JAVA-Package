package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;

class l<K, V>
{
  final a<K, V> anP = new l.1(this);

  public k<K, V> a(int paramInt, a<K, V> parama)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("maxSize <= 0");
    if (nN() < 12);
    for (Object localObject = new da(paramInt, parama); ; localObject = new bb(paramInt, parama))
      return localObject;
  }

  int nN()
  {
    return Build.VERSION.SDK_INT;
  }

  public static abstract interface a<K, V>
  {
    public abstract int sizeOf(K paramK, V paramV);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.l
 * JD-Core Version:    0.6.0
 */