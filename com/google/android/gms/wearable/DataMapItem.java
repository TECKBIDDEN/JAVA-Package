package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.internal.pb;
import com.google.android.gms.internal.pb.a;
import com.google.android.gms.internal.pc;
import com.google.android.gms.internal.pl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataMapItem
{
  private final DataMap auM;
  private final Uri mUri;

  private DataMapItem(DataItem paramDataItem)
  {
    this.mUri = paramDataItem.getUri();
    this.auM = a((DataItem)paramDataItem.freeze());
  }

  private DataMap a(DataItem paramDataItem)
  {
    if ((paramDataItem.getData() == null) && (paramDataItem.getAssets().size() > 0))
      throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
    if (paramDataItem.getData() == null);
    DataMap localDataMap;
    for (Object localObject = new DataMap(); ; localObject = localDataMap)
    {
      return localObject;
      ArrayList localArrayList;
      while (true)
      {
        int j;
        DataItemAsset localDataItemAsset;
        try
        {
          localArrayList = new ArrayList();
          int i = paramDataItem.getAssets().size();
          j = 0;
          if (j >= i)
            break;
          localDataItemAsset = (DataItemAsset)paramDataItem.getAssets().get(Integer.toString(j));
          if (localDataItemAsset == null)
            throw new IllegalStateException("Cannot find DataItemAsset referenced in data at " + j + " for " + paramDataItem);
        }
        catch (pl localpl)
        {
          throw new IllegalStateException("Unable to parse. Not a DataItem.");
        }
        localArrayList.add(Asset.createFromRef(localDataItemAsset.getId()));
        j++;
      }
      localDataMap = pb.a(new pb.a(pc.n(paramDataItem.getData()), localArrayList));
    }
  }

  public static DataMapItem fromDataItem(DataItem paramDataItem)
  {
    if (paramDataItem == null)
      throw new IllegalStateException("provided dataItem is null");
    return new DataMapItem(paramDataItem);
  }

  public DataMap getDataMap()
  {
    return this.auM;
  }

  public Uri getUri()
  {
    return this.mUri;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataMapItem
 * JD-Core Version:    0.6.0
 */