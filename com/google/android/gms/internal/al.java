package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ez
public class al
{
  private final Object mw = new Object();
  private int np;
  private List<ak> nq = new LinkedList();

  public boolean a(ak paramak)
  {
    int i;
    synchronized (this.mw)
    {
      if (this.nq.contains(paramak))
        i = 1;
      else
        i = 0;
    }
    return i;
  }

  public ak aU()
  {
    Object localObject4;
    for (Object localObject1 = null; ; localObject1 = localObject4)
    {
      int k;
      ak localak1;
      label155: synchronized (this.mw)
      {
        if (this.nq.size() == 0)
        {
          gs.S("Queue empty");
        }
        else if (this.nq.size() >= 2)
        {
          i = -2147483648;
          Iterator localIterator = this.nq.iterator();
          if (localIterator.hasNext())
          {
            ak localak2 = (ak)localIterator.next();
            int j = localak2.getScore();
            if (j <= i)
              break label155;
            localObject4 = localak2;
            k = j;
            break label167;
          }
          this.nq.remove(localObject1);
        }
      }
      label167: int i = k;
    }
  }

  public boolean b(ak paramak)
  {
    int i;
    synchronized (this.mw)
    {
      Iterator localIterator = this.nq.iterator();
      while (localIterator.hasNext())
      {
        ak localak = (ak)localIterator.next();
        if ((paramak == localak) || (!localak.aO().equals(paramak.aO())))
          continue;
        this.nq.remove(paramak);
        i = 1;
        break label93;
      }
      i = 0;
    }
    label93: return i;
  }

  public void c(ak paramak)
  {
    synchronized (this.mw)
    {
      if (this.nq.size() >= 10)
      {
        gs.S("Queue is full, current size = " + this.nq.size());
        this.nq.remove(0);
      }
      int i = this.np;
      this.np = (i + 1);
      paramak.c(i);
      this.nq.add(paramak);
      return;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.al
 * JD-Core Version:    0.6.0
 */