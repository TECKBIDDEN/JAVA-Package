package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.n;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class c<T>
  implements Iterator<T>
{
  protected final DataBuffer<T> JO;
  protected int JP;

  public c(DataBuffer<T> paramDataBuffer)
  {
    this.JO = ((DataBuffer)n.i(paramDataBuffer));
    this.JP = -1;
  }

  public boolean hasNext()
  {
    if (this.JP < -1 + this.JO.getCount());
    for (int i = 1; ; i = 0)
      return i;
  }

  public T next()
  {
    if (!hasNext())
      throw new NoSuchElementException("Cannot advance the iterator beyond " + this.JP);
    DataBuffer localDataBuffer = this.JO;
    int i = 1 + this.JP;
    this.JP = i;
    return localDataBuffer.get(i);
  }

  public void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.c
 * JD-Core Version:    0.6.0
 */