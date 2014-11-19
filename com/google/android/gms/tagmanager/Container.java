package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.c.f;
import com.google.android.gms.internal.c.i;
import com.google.android.gms.internal.c.j;
import com.google.android.gms.internal.d.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Container
{
  private final String anR;
  private final DataLayer anS;
  private ct anT;
  private Map<String, FunctionCallMacroCallback> anU = new HashMap();
  private Map<String, FunctionCallTagCallback> anV = new HashMap();
  private volatile long anW;
  private volatile String anX = "";
  private final Context mContext;

  Container(Context paramContext, DataLayer paramDataLayer, String paramString, long paramLong, c.j paramj)
  {
    this.mContext = paramContext;
    this.anS = paramDataLayer;
    this.anR = paramString;
    this.anW = paramLong;
    a(paramj.gs);
    if (paramj.gr != null)
      a(paramj.gr);
  }

  Container(Context paramContext, DataLayer paramDataLayer, String paramString, long paramLong, cr.c paramc)
  {
    this.mContext = paramContext;
    this.anS = paramDataLayer;
    this.anR = paramString;
    this.anW = paramLong;
    a(paramc);
  }

  private void a(c.f paramf)
  {
    if (paramf == null)
      throw new NullPointerException();
    try
    {
      cr.c localc = cr.b(paramf);
      a(localc);
      return;
    }
    catch (cr.g localg)
    {
      while (true)
        bh.T("Not loading resource: " + paramf + " because it is invalid: " + localg.toString());
    }
  }

  private void a(cr.c paramc)
  {
    this.anX = paramc.getVersion();
    ag localag = cn(this.anX);
    a(new ct(this.mContext, paramc, this.anS, new Container.a(this, null), new Container.b(this, null), localag));
  }

  private void a(ct paramct)
  {
    monitorenter;
    try
    {
      this.anT = paramct;
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  private void a(c.i[] paramArrayOfi)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfi.length;
    for (int j = 0; j < i; j++)
      localArrayList.add(paramArrayOfi[j]);
    nR().k(localArrayList);
  }

  private ct nR()
  {
    monitorenter;
    try
    {
      ct localct = this.anT;
      monitorexit;
      return localct;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  FunctionCallMacroCallback ck(String paramString)
  {
    synchronized (this.anU)
    {
      FunctionCallMacroCallback localFunctionCallMacroCallback = (FunctionCallMacroCallback)this.anU.get(paramString);
      return localFunctionCallMacroCallback;
    }
  }

  FunctionCallTagCallback cl(String paramString)
  {
    synchronized (this.anV)
    {
      FunctionCallTagCallback localFunctionCallTagCallback = (FunctionCallTagCallback)this.anV.get(paramString);
      return localFunctionCallTagCallback;
    }
  }

  void cm(String paramString)
  {
    nR().cm(paramString);
  }

  ag cn(String paramString)
  {
    if (ce.oH().oI().equals(ce.a.apY));
    return new br();
  }

  public boolean getBoolean(String paramString)
  {
    ct localct = nR();
    boolean bool1;
    if (localct == null)
    {
      bh.T("getBoolean called for closed container.");
      bool1 = di.pF().booleanValue();
    }
    while (true)
    {
      return bool1;
      try
      {
        boolean bool2 = di.n((d.a)localct.cO(paramString).getObject()).booleanValue();
        bool1 = bool2;
      }
      catch (Exception localException)
      {
        bh.T("Calling getBoolean() threw an exception: " + localException.getMessage() + " Returning default value.");
        bool1 = di.pF().booleanValue();
      }
    }
  }

  public String getContainerId()
  {
    return this.anR;
  }

  public double getDouble(String paramString)
  {
    ct localct = nR();
    double d1;
    if (localct == null)
    {
      bh.T("getDouble called for closed container.");
      d1 = di.pE().doubleValue();
    }
    while (true)
    {
      return d1;
      try
      {
        double d2 = di.m((d.a)localct.cO(paramString).getObject()).doubleValue();
        d1 = d2;
      }
      catch (Exception localException)
      {
        bh.T("Calling getDouble() threw an exception: " + localException.getMessage() + " Returning default value.");
        d1 = di.pE().doubleValue();
      }
    }
  }

  public long getLastRefreshTime()
  {
    return this.anW;
  }

  public long getLong(String paramString)
  {
    ct localct = nR();
    long l1;
    if (localct == null)
    {
      bh.T("getLong called for closed container.");
      l1 = di.pD().longValue();
    }
    while (true)
    {
      return l1;
      try
      {
        long l2 = di.l((d.a)localct.cO(paramString).getObject()).longValue();
        l1 = l2;
      }
      catch (Exception localException)
      {
        bh.T("Calling getLong() threw an exception: " + localException.getMessage() + " Returning default value.");
        l1 = di.pD().longValue();
      }
    }
  }

  public String getString(String paramString)
  {
    ct localct = nR();
    Object localObject;
    if (localct == null)
    {
      bh.T("getString called for closed container.");
      localObject = di.pH();
    }
    while (true)
    {
      return localObject;
      try
      {
        String str = di.j((d.a)localct.cO(paramString).getObject());
        localObject = str;
      }
      catch (Exception localException)
      {
        bh.T("Calling getString() threw an exception: " + localException.getMessage() + " Returning default value.");
        localObject = di.pH();
      }
    }
  }

  public boolean isDefault()
  {
    if (getLastRefreshTime() == 0L);
    for (int i = 1; ; i = 0)
      return i;
  }

  String nQ()
  {
    return this.anX;
  }

  public void registerFunctionCallMacroCallback(String paramString, FunctionCallMacroCallback paramFunctionCallMacroCallback)
  {
    if (paramFunctionCallMacroCallback == null)
      throw new NullPointerException("Macro handler must be non-null");
    synchronized (this.anU)
    {
      this.anU.put(paramString, paramFunctionCallMacroCallback);
      return;
    }
  }

  public void registerFunctionCallTagCallback(String paramString, FunctionCallTagCallback paramFunctionCallTagCallback)
  {
    if (paramFunctionCallTagCallback == null)
      throw new NullPointerException("Tag callback must be non-null");
    synchronized (this.anV)
    {
      this.anV.put(paramString, paramFunctionCallTagCallback);
      return;
    }
  }

  void release()
  {
    this.anT = null;
  }

  public void unregisterFunctionCallMacroCallback(String paramString)
  {
    synchronized (this.anU)
    {
      this.anU.remove(paramString);
      return;
    }
  }

  public void unregisterFunctionCallTagCallback(String paramString)
  {
    synchronized (this.anV)
    {
      this.anV.remove(paramString);
      return;
    }
  }

  public static abstract interface FunctionCallMacroCallback
  {
    public abstract Object getValue(String paramString, Map<String, Object> paramMap);
  }

  public static abstract interface FunctionCallTagCallback
  {
    public abstract void execute(String paramString, Map<String, Object> paramMap);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.Container
 * JD-Core Version:    0.6.0
 */