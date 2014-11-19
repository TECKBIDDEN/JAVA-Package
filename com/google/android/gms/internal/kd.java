package com.google.android.gms.internal;

import com.google.android.gms.common.data.a;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.g;
import com.google.android.gms.drive.metadata.internal.k;
import com.google.android.gms.drive.metadata.internal.l;
import com.google.android.gms.drive.metadata.internal.m;
import java.util.Collections;

public class kd
{
  public static final MetadataField<DriveId> PE = kg.Qq;
  public static final MetadataField<String> PF = new l("alternateLink", 4300000);
  public static final kd.a PG = new kd.a(5000000);
  public static final MetadataField<String> PH = new l("description", 4300000);
  public static final MetadataField<String> PI = new l("embedLink", 4300000);
  public static final MetadataField<String> PJ = new l("fileExtension", 4300000);
  public static final MetadataField<Long> PK = new g("fileSize", 4300000);
  public static final MetadataField<Boolean> PL = new com.google.android.gms.drive.metadata.internal.b("hasThumbnail", 4300000);
  public static final MetadataField<String> PM = new l("indexableText", 4300000);
  public static final MetadataField<Boolean> PN = new com.google.android.gms.drive.metadata.internal.b("isAppData", 4300000);
  public static final MetadataField<Boolean> PO = new com.google.android.gms.drive.metadata.internal.b("isCopyable", 4300000);
  public static final MetadataField<Boolean> PP = new com.google.android.gms.drive.metadata.internal.b("isEditable", 4100000);
  public static final kd.b PQ = new kd.b("isPinned", 4100000);
  public static final MetadataField<Boolean> PR = new com.google.android.gms.drive.metadata.internal.b("isRestricted", 4300000);
  public static final MetadataField<Boolean> PS = new com.google.android.gms.drive.metadata.internal.b("isShared", 4300000);
  public static final MetadataField<Boolean> PT = new com.google.android.gms.drive.metadata.internal.b("isTrashable", 4400000);
  public static final MetadataField<Boolean> PU = new com.google.android.gms.drive.metadata.internal.b("isViewed", 4300000);
  public static final kd.c PV = new kd.c("mimeType", 4100000);
  public static final MetadataField<String> PW = new l("originalFilename", 4300000);
  public static final com.google.android.gms.drive.metadata.b<String> PX = new k("ownerNames", 4300000);
  public static final m PY = new m("lastModifyingUser", 6000000);
  public static final m PZ = new m("sharingUser", 6000000);
  public static final kd.d Qa = new kd.d("parents", 4100000);
  public static final kd.e Qb = new kd.e("quotaBytesUsed", 4300000);
  public static final kd.f Qc = new kd.f("starred", 4100000);
  public static final MetadataField<a> Qd = new kd.1("thumbnail", Collections.emptySet(), Collections.emptySet(), 4400000);
  public static final kd.g Qe = new kd.g("title", 4100000);
  public static final kd.h Qf = new kd.h("trashed", 4100000);
  public static final MetadataField<String> Qg = new l("webContentLink", 4300000);
  public static final MetadataField<String> Qh = new l("webViewLink", 4300000);
  public static final MetadataField<String> Qi = new l("uniqueIdentifier", 5000000);
  public static final com.google.android.gms.drive.metadata.internal.b Qj = new com.google.android.gms.drive.metadata.internal.b("writersCanShare", 6000000);
  public static final MetadataField<String> Qk = new l("role", 6000000);
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kd
 * JD-Core Version:    0.6.0
 */