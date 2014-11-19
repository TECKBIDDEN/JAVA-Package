package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.SortableMetadataField;
import com.google.android.gms.internal.kd;
import com.google.android.gms.internal.kf;
import java.util.Date;

public class SortableField
{
  public static final SortableMetadataField<Date> CREATED_DATE;
  public static final SortableMetadataField<Date> LAST_VIEWED_BY_ME;
  public static final SortableMetadataField<Date> MODIFIED_BY_ME_DATE;
  public static final SortableMetadataField<Date> MODIFIED_DATE;
  public static final SortableMetadataField<Long> QUOTA_USED;
  public static final SortableMetadataField<Date> SHARED_WITH_ME_DATE;
  public static final SortableMetadataField<String> TITLE = kd.Qe;

  static
  {
    CREATED_DATE = kf.Ql;
    MODIFIED_DATE = kf.Qn;
    MODIFIED_BY_ME_DATE = kf.Qo;
    LAST_VIEWED_BY_ME = kf.Qm;
    SHARED_WITH_ME_DATE = kf.Qp;
    QUOTA_USED = kd.Qb;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.SortableField
 * JD-Core Version:    0.6.0
 */