package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HitBuilders
{
  protected static class HitBuilder<T extends HitBuilder>
  {
    private Map<String, String> AI = new HashMap();
    ProductAction AJ;
    Map<String, List<Product>> AK = new HashMap();
    List<Promotion> AL = new ArrayList();
    List<Product> AM = new ArrayList();

    public T addImpression(Product paramProduct, String paramString)
    {
      if (paramProduct == null)
        z.W("product should be non-null");
      while (true)
      {
        return this;
        if (paramString == null)
          paramString = "";
        if (!this.AK.containsKey(paramString))
          this.AK.put(paramString, new ArrayList());
        ((List)this.AK.get(paramString)).add(paramProduct);
      }
    }

    public T addProduct(Product paramProduct)
    {
      if (paramProduct == null)
        z.W("product should be non-null");
      while (true)
      {
        return this;
        this.AM.add(paramProduct);
      }
    }

    public T addPromotion(Promotion paramPromotion)
    {
      if (paramPromotion == null)
        z.W("promotion should be non-null");
      while (true)
      {
        return this;
        this.AL.add(paramPromotion);
      }
    }

    public Map<String, String> build()
    {
      HashMap localHashMap = new HashMap(this.AI);
      if (this.AJ != null)
        localHashMap.putAll(this.AJ.build());
      Iterator localIterator1 = this.AL.iterator();
      for (int i = 1; localIterator1.hasNext(); i++)
        localHashMap.putAll(((Promotion)localIterator1.next()).aq(n.A(i)));
      Iterator localIterator2 = this.AM.iterator();
      for (int j = 1; localIterator2.hasNext(); j++)
        localHashMap.putAll(((Product)localIterator2.next()).aq(n.z(j)));
      Iterator localIterator3 = this.AK.entrySet().iterator();
      for (int k = 1; localIterator3.hasNext(); k++)
      {
        Map.Entry localEntry = (Map.Entry)localIterator3.next();
        List localList = (List)localEntry.getValue();
        String str = n.C(k);
        Iterator localIterator4 = localList.iterator();
        for (int m = 1; localIterator4.hasNext(); m++)
          localHashMap.putAll(((Product)localIterator4.next()).aq(str + n.B(m)));
        if (TextUtils.isEmpty((CharSequence)localEntry.getKey()))
          continue;
        localHashMap.put(str + "nm", localEntry.getKey());
      }
      return localHashMap;
    }

    protected String get(String paramString)
    {
      return (String)this.AI.get(paramString);
    }

    public final T set(String paramString1, String paramString2)
    {
      t.eq().a(t.a.zf);
      if (paramString1 != null)
        this.AI.put(paramString1, paramString2);
      while (true)
      {
        return this;
        z.W(" HitBuilder.set() called with a null paramName.");
      }
    }

    public final T setAll(Map<String, String> paramMap)
    {
      t.eq().a(t.a.zg);
      if (paramMap == null);
      while (true)
      {
        return this;
        this.AI.putAll(new HashMap(paramMap));
      }
    }

    public T setCampaignParamsFromUrl(String paramString)
    {
      t.eq().a(t.a.zi);
      String str = aj.ao(paramString);
      if (TextUtils.isEmpty(str));
      while (true)
      {
        return this;
        Map localMap = aj.an(str);
        set("&cc", (String)localMap.get("utm_content"));
        set("&cm", (String)localMap.get("utm_medium"));
        set("&cn", (String)localMap.get("utm_campaign"));
        set("&cs", (String)localMap.get("utm_source"));
        set("&ck", (String)localMap.get("utm_term"));
        set("&ci", (String)localMap.get("utm_id"));
        set("&gclid", (String)localMap.get("gclid"));
        set("&dclid", (String)localMap.get("dclid"));
        set("&gmob_t", (String)localMap.get("gmob_t"));
      }
    }

    public T setCustomDimension(int paramInt, String paramString)
    {
      set(n.x(paramInt), paramString);
      return this;
    }

    public T setCustomMetric(int paramInt, float paramFloat)
    {
      set(n.y(paramInt), Float.toString(paramFloat));
      return this;
    }

    protected T setHitType(String paramString)
    {
      set("&t", paramString);
      return this;
    }

    public T setNewSession()
    {
      set("&sc", "start");
      return this;
    }

    public T setNonInteraction(boolean paramBoolean)
    {
      set("&ni", aj.C(paramBoolean));
      return this;
    }

    public T setProductAction(ProductAction paramProductAction)
    {
      this.AJ = paramProductAction;
      return this;
    }

    public T setPromotionAction(String paramString)
    {
      this.AI.put("&promoa", paramString);
      return this;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.HitBuilders
 * JD-Core Version:    0.6.0
 */