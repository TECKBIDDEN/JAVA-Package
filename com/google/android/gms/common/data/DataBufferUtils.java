package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public final class DataBufferUtils
{
  public static <T, E extends Freezable<T>> ArrayList<T> freezeAndClose(DataBuffer<E> paramDataBuffer)
  {
    ArrayList localArrayList = new ArrayList(paramDataBuffer.getCount());
    try
    {
      Iterator localIterator = paramDataBuffer.iterator();
      if (localIterator.hasNext())
        localArrayList.add(((Freezable)localIterator.next()).freeze());
    }
    finally
    {
      paramDataBuffer.close();
    }
    return localArrayList;
  }

  public static boolean hasData(DataBuffer<?> paramDataBuffer)
  {
    if ((paramDataBuffer != null) && (paramDataBuffer.getCount() > 0));
    for (int i = 1; ; i = 0)
      return i;
  }

  public static boolean hasNextPage(DataBuffer<?> paramDataBuffer)
  {
    Bundle localBundle = paramDataBuffer.gz();
    if ((localBundle != null) && (localBundle.getString("next_page_token") != null));
    for (int i = 1; ; i = 0)
      return i;
  }

  public static boolean hasPrevPage(DataBuffer<?> paramDataBuffer)
  {
    Bundle localBundle = paramDataBuffer.gz();
    if ((localBundle != null) && (localBundle.getString("prev_page_token") != null));
    for (int i = 1; ; i = 0)
      return i;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataBufferUtils
 * JD-Core Version:    0.6.0
 */