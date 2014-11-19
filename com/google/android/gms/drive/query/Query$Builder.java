package com.google.android.gms.drive.query;

import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.List;

public class Query$Builder
{
  private String Qu;
  private SortOrder Qv;
  private List<String> Qw;
  private final List<Filter> Qx = new ArrayList();

  public Query$Builder()
  {
  }

  public Query$Builder(Query paramQuery)
  {
    this.Qx.add(paramQuery.getFilter());
    this.Qu = paramQuery.getPageToken();
    this.Qv = paramQuery.getSortOrder();
    this.Qw = paramQuery.iq();
  }

  public Builder addFilter(Filter paramFilter)
  {
    if (!(paramFilter instanceof MatchAllFilter))
      this.Qx.add(paramFilter);
    return this;
  }

  public Query build()
  {
    return new Query(new LogicalFilter(Operator.QW, this.Qx), this.Qu, this.Qv, this.Qw);
  }

  public Builder setPageToken(String paramString)
  {
    this.Qu = paramString;
    return this;
  }

  public Builder setSortOrder(SortOrder paramSortOrder)
  {
    this.Qv = paramSortOrder;
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.Query.Builder
 * JD-Core Version:    0.6.0
 */