package com.google.android.gms.drive.query;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.kd;
import com.google.android.gms.internal.kf;
import java.util.Date;

public class SearchableField
{
  public static final SearchableMetadataField<Boolean> IS_PINNED;
  public static final SearchableOrderedMetadataField<Date> LAST_VIEWED_BY_ME;
  public static final SearchableMetadataField<String> MIME_TYPE;
  public static final SearchableOrderedMetadataField<Date> MODIFIED_DATE;
  public static final SearchableCollectionMetadataField<DriveId> PARENTS;
  public static final SearchableOrderedMetadataField<Date> Qy;
  public static final SearchableMetadataField<AppVisibleCustomProperties> Qz;
  public static final SearchableMetadataField<Boolean> STARRED;
  public static final SearchableMetadataField<String> TITLE = kd.Qe;
  public static final SearchableMetadataField<Boolean> TRASHED;

  static
  {
    MIME_TYPE = kd.PV;
    TRASHED = kd.Qf;
    PARENTS = kd.Qa;
    Qy = kf.Qp;
    STARRED = kd.Qc;
    MODIFIED_DATE = kf.Qn;
    LAST_VIEWED_BY_ME = kf.Qm;
    IS_PINNED = kd.PQ;
    Qz = kd.PG;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.SearchableField
 * JD-Core Version:    0.6.0
 */