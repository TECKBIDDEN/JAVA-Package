package com.google.android.gms.analytics;

import com.google.android.gms.internal.hb;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class r$d
{
  private final Map<String, String> yP;
  private final long yQ;
  private final String yR;
  private final List<hb> yS;

  public r$d(Map<String, String> paramMap, long paramLong, String paramString, List<hb> paramList)
  {
    this.yP = paramMap;
    this.yQ = paramLong;
    this.yR = paramString;
    this.yS = paramList;
  }

  public Map<String, String> en()
  {
    return this.yP;
  }

  public long eo()
  {
    return this.yQ;
  }

  public List<hb> ep()
  {
    return this.yS;
  }

  public String getPath()
  {
    return this.yR;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PATH: ");
    localStringBuilder.append(this.yR);
    if (this.yP != null)
    {
      localStringBuilder.append("  PARAMS: ");
      Iterator localIterator = this.yP.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localStringBuilder.append((String)localEntry.getKey());
        localStringBuilder.append("=");
        localStringBuilder.append((String)localEntry.getValue());
        localStringBuilder.append(",  ");
      }
    }
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.r.d
 * JD-Core Version:    0.6.0
 */