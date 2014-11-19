package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TagManager
{
  private static TagManager arC;
  private final DataLayer anS;
  private final r aqj;
  private final cx arA;
  private final ConcurrentMap<n, Boolean> arB;
  private final a arz;
  private final Context mContext;

  TagManager(Context paramContext, a parama, DataLayer paramDataLayer, cx paramcx)
  {
    if (paramContext == null)
      throw new NullPointerException("context cannot be null");
    this.mContext = paramContext.getApplicationContext();
    this.arA = paramcx;
    this.arz = parama;
    this.arB = new ConcurrentHashMap();
    this.anS = paramDataLayer;
    this.anS.a(new TagManager.1(this));
    this.anS.a(new d(this.mContext));
    this.aqj = new r();
    pw();
  }

  private void cQ(String paramString)
  {
    Iterator localIterator = this.arB.keySet().iterator();
    while (localIterator.hasNext())
      ((n)localIterator.next()).cm(paramString);
  }

  // ERROR //
  public static TagManager getInstance(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 117	com/google/android/gms/tagmanager/TagManager:arC	Lcom/google/android/gms/tagmanager/TagManager;
    //   6: ifnonnull +62 -> 68
    //   9: aload_0
    //   10: ifnonnull +22 -> 32
    //   13: ldc 119
    //   15: invokestatic 124	com/google/android/gms/tagmanager/bh:T	(Ljava/lang/String;)V
    //   18: new 37	java/lang/NullPointerException
    //   21: dup
    //   22: invokespecial 125	java/lang/NullPointerException:<init>	()V
    //   25: athrow
    //   26: astore_1
    //   27: ldc 2
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    //   32: new 2	com/google/android/gms/tagmanager/TagManager
    //   35: dup
    //   36: aload_0
    //   37: new 8	com/google/android/gms/tagmanager/TagManager$2
    //   40: dup
    //   41: invokespecial 126	com/google/android/gms/tagmanager/TagManager$2:<init>	()V
    //   44: new 66	com/google/android/gms/tagmanager/DataLayer
    //   47: dup
    //   48: new 128	com/google/android/gms/tagmanager/v
    //   51: dup
    //   52: aload_0
    //   53: invokespecial 129	com/google/android/gms/tagmanager/v:<init>	(Landroid/content/Context;)V
    //   56: invokespecial 132	com/google/android/gms/tagmanager/DataLayer:<init>	(Lcom/google/android/gms/tagmanager/DataLayer$c;)V
    //   59: invokestatic 138	com/google/android/gms/tagmanager/cy:pu	()Lcom/google/android/gms/tagmanager/cy;
    //   62: invokespecial 140	com/google/android/gms/tagmanager/TagManager:<init>	(Landroid/content/Context;Lcom/google/android/gms/tagmanager/TagManager$a;Lcom/google/android/gms/tagmanager/DataLayer;Lcom/google/android/gms/tagmanager/cx;)V
    //   65: putstatic 117	com/google/android/gms/tagmanager/TagManager:arC	Lcom/google/android/gms/tagmanager/TagManager;
    //   68: getstatic 117	com/google/android/gms/tagmanager/TagManager:arC	Lcom/google/android/gms/tagmanager/TagManager;
    //   71: astore_2
    //   72: ldc 2
    //   74: monitorexit
    //   75: aload_2
    //   76: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   3	30	26	finally
    //   32	75	26	finally
  }

  private void pw()
  {
    if (Build.VERSION.SDK_INT >= 14)
      this.mContext.registerComponentCallbacks(new ComponentCallbacks2()
      {
        public void onConfigurationChanged(Configuration paramConfiguration)
        {
        }

        public void onLowMemory()
        {
        }

        public void onTrimMemory(int paramInt)
        {
          if (paramInt == 20)
            TagManager.this.dispatch();
        }
      });
  }

  void a(n paramn)
  {
    this.arB.put(paramn, Boolean.valueOf(true));
  }

  boolean b(n paramn)
  {
    if (this.arB.remove(paramn) != null);
    for (int i = 1; ; i = 0)
      return i;
  }

  public void dispatch()
  {
    this.arA.dispatch();
  }

  public DataLayer getDataLayer()
  {
    return this.anS;
  }

  boolean i(Uri paramUri)
  {
    monitorenter;
    while (true)
    {
      ce localce;
      String str;
      try
      {
        localce = ce.oH();
        if (!localce.i(paramUri))
          break label228;
        str = localce.getContainerId();
        int j = 4.arE[localce.oI().ordinal()];
        switch (j)
        {
        default:
          i = 1;
          return i;
        case 1:
          Iterator localIterator2 = this.arB.keySet().iterator();
          if (!localIterator2.hasNext())
            continue;
          n localn2 = (n)localIterator2.next();
          if (!localn2.getContainerId().equals(str))
            continue;
          localn2.co(null);
          localn2.refresh();
          continue;
        case 2:
        case 3:
        }
      }
      finally
      {
        monitorexit;
      }
      Iterator localIterator1 = this.arB.keySet().iterator();
      while (localIterator1.hasNext())
      {
        n localn1 = (n)localIterator1.next();
        if (localn1.getContainerId().equals(str))
        {
          localn1.co(localce.oJ());
          localn1.refresh();
          continue;
        }
        if (localn1.nS() == null)
          continue;
        localn1.co(null);
        localn1.refresh();
      }
      continue;
      label228: int i = 0;
    }
  }

  public PendingResult<ContainerHolder> loadContainerDefaultOnly(String paramString, int paramInt)
  {
    o localo = this.arz.a(this.mContext, this, null, paramString, paramInt, this.aqj);
    localo.nV();
    return localo;
  }

  public PendingResult<ContainerHolder> loadContainerDefaultOnly(String paramString, int paramInt, Handler paramHandler)
  {
    o localo = this.arz.a(this.mContext, this, paramHandler.getLooper(), paramString, paramInt, this.aqj);
    localo.nV();
    return localo;
  }

  public PendingResult<ContainerHolder> loadContainerPreferFresh(String paramString, int paramInt)
  {
    o localo = this.arz.a(this.mContext, this, null, paramString, paramInt, this.aqj);
    localo.nX();
    return localo;
  }

  public PendingResult<ContainerHolder> loadContainerPreferFresh(String paramString, int paramInt, Handler paramHandler)
  {
    o localo = this.arz.a(this.mContext, this, paramHandler.getLooper(), paramString, paramInt, this.aqj);
    localo.nX();
    return localo;
  }

  public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String paramString, int paramInt)
  {
    o localo = this.arz.a(this.mContext, this, null, paramString, paramInt, this.aqj);
    localo.nW();
    return localo;
  }

  public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String paramString, int paramInt, Handler paramHandler)
  {
    o localo = this.arz.a(this.mContext, this, paramHandler.getLooper(), paramString, paramInt, this.aqj);
    localo.nW();
    return localo;
  }

  public void setVerboseLoggingEnabled(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 2; ; i = 5)
    {
      bh.setLogLevel(i);
      return;
    }
  }

  static abstract interface a
  {
    public abstract o a(Context paramContext, TagManager paramTagManager, Looper paramLooper, String paramString, int paramInt, r paramr);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.TagManager
 * JD-Core Version:    0.6.0
 */