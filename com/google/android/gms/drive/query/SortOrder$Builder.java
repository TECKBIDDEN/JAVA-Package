package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;
import java.util.List;

public class SortOrder$Builder
{
  private final List<FieldWithSortOrder> QA = new ArrayList();
  private boolean QB = false;

  public Builder addSortAscending(SortableMetadataField paramSortableMetadataField)
  {
    this.QA.add(new FieldWithSortOrder(paramSortableMetadataField.getName(), true));
    return this;
  }

  public Builder addSortDescending(SortableMetadataField paramSortableMetadataField)
  {
    this.QA.add(new FieldWithSortOrder(paramSortableMetadataField.getName(), false));
    return this;
  }

  public SortOrder build()
  {
    return new SortOrder(this.QA, this.QB, null);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.SortOrder.Builder
 * JD-Core Version:    0.6.0
 */