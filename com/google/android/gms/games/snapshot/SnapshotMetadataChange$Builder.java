package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.a;

public final class SnapshotMetadataChange$Builder
{
  private String Tg;
  private Uri acZ;
  private Long adb;
  private a adc;

  public SnapshotMetadataChange build()
  {
    return new SnapshotMetadataChange(this.Tg, this.adb, this.adc, this.acZ);
  }

  public Builder fromMetadata(SnapshotMetadata paramSnapshotMetadata)
  {
    this.Tg = paramSnapshotMetadata.getDescription();
    this.adb = Long.valueOf(paramSnapshotMetadata.getPlayedTime());
    if (this.adb.longValue() == -1L)
      this.adb = null;
    this.acZ = paramSnapshotMetadata.getCoverImageUri();
    if (this.acZ != null)
      this.adc = null;
    return this;
  }

  public Builder setCoverImage(Bitmap paramBitmap)
  {
    this.adc = new a(paramBitmap);
    this.acZ = null;
    return this;
  }

  public Builder setDescription(String paramString)
  {
    this.Tg = paramString;
    return this;
  }

  public Builder setPlayedTimeMillis(long paramLong)
  {
    this.adb = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder
 * JD-Core Version:    0.6.0
 */