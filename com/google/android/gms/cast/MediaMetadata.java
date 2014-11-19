package com.google.android.gms.cast;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.internal.iu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaMetadata
{
  private static final String[] Fn;
  private static final a Fo;
  public static final String KEY_ALBUM_ARTIST = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
  public static final String KEY_ALBUM_TITLE = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
  public static final String KEY_ARTIST = "com.google.android.gms.cast.metadata.ARTIST";
  public static final String KEY_BROADCAST_DATE = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
  public static final String KEY_COMPOSER = "com.google.android.gms.cast.metadata.COMPOSER";
  public static final String KEY_CREATION_DATE = "com.google.android.gms.cast.metadata.CREATION_DATE";
  public static final String KEY_DISC_NUMBER = "com.google.android.gms.cast.metadata.DISC_NUMBER";
  public static final String KEY_EPISODE_NUMBER = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
  public static final String KEY_HEIGHT = "com.google.android.gms.cast.metadata.HEIGHT";
  public static final String KEY_LOCATION_LATITUDE = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
  public static final String KEY_LOCATION_LONGITUDE = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
  public static final String KEY_LOCATION_NAME = "com.google.android.gms.cast.metadata.LOCATION_NAME";
  public static final String KEY_RELEASE_DATE = "com.google.android.gms.cast.metadata.RELEASE_DATE";
  public static final String KEY_SEASON_NUMBER = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
  public static final String KEY_SERIES_TITLE = "com.google.android.gms.cast.metadata.SERIES_TITLE";
  public static final String KEY_STUDIO = "com.google.android.gms.cast.metadata.STUDIO";
  public static final String KEY_SUBTITLE = "com.google.android.gms.cast.metadata.SUBTITLE";
  public static final String KEY_TITLE = "com.google.android.gms.cast.metadata.TITLE";
  public static final String KEY_TRACK_NUMBER = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
  public static final String KEY_WIDTH = "com.google.android.gms.cast.metadata.WIDTH";
  public static final int MEDIA_TYPE_GENERIC = 0;
  public static final int MEDIA_TYPE_MOVIE = 1;
  public static final int MEDIA_TYPE_MUSIC_TRACK = 3;
  public static final int MEDIA_TYPE_PHOTO = 4;
  public static final int MEDIA_TYPE_TV_SHOW = 2;
  public static final int MEDIA_TYPE_USER = 100;
  private final List<WebImage> EA = new ArrayList();
  private final Bundle Fp = new Bundle();
  private int Fq;

  static
  {
    String[] arrayOfString = new String[5];
    arrayOfString[0] = null;
    arrayOfString[1] = "String";
    arrayOfString[2] = "int";
    arrayOfString[3] = "double";
    arrayOfString[4] = "ISO-8601 date String";
    Fn = arrayOfString;
    Fo = new a().a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).a("com.google.android.gms.cast.metadata.TITLE", "title", 1).a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).a("com.google.android.gms.cast.metadata.WIDTH", "width", 2).a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
  }

  public MediaMetadata()
  {
    this(0);
  }

  public MediaMetadata(int paramInt)
  {
    this.Fq = paramInt;
  }

  private void a(JSONObject paramJSONObject, String[] paramArrayOfString)
  {
    try
    {
      int i = paramArrayOfString.length;
      int j = 0;
      String str2;
      if (j < i)
      {
        str2 = paramArrayOfString[j];
        if (!this.Fp.containsKey(str2));
      }
      else
      {
        switch (Fo.aB(str2))
        {
        case 1:
        case 4:
          paramJSONObject.put(Fo.az(str2), this.Fp.getString(str2));
          break;
        case 2:
          paramJSONObject.put(Fo.az(str2), this.Fp.getInt(str2));
          break;
        case 3:
          paramJSONObject.put(Fo.az(str2), this.Fp.getDouble(str2));
          break;
          Iterator localIterator = this.Fp.keySet().iterator();
          while (localIterator.hasNext())
          {
            String str1 = (String)localIterator.next();
            if (str1.startsWith("com.google."))
              continue;
            Object localObject = this.Fp.get(str1);
            if ((localObject instanceof String))
            {
              paramJSONObject.put(str1, localObject);
              continue;
            }
            if ((localObject instanceof Integer))
            {
              paramJSONObject.put(str1, localObject);
              continue;
            }
            if (!(localObject instanceof Double))
              continue;
            paramJSONObject.put(str1, localObject);
          }
        }
      }
      while (true)
      {
        j++;
        break;
      }
    }
    catch (JSONException localJSONException)
    {
    }
  }

  private boolean a(Bundle paramBundle1, Bundle paramBundle2)
  {
    int i;
    if (paramBundle1.size() != paramBundle2.size())
      i = 0;
    while (true)
    {
      return i;
      Iterator localIterator = paramBundle1.keySet().iterator();
      Object localObject1;
      Object localObject2;
      label127: 
      do
      {
        String str;
        do
        {
          if (!localIterator.hasNext())
            break label143;
          str = (String)localIterator.next();
          localObject1 = paramBundle1.get(str);
          localObject2 = paramBundle2.get(str);
          if (((localObject1 instanceof Bundle)) && ((localObject2 instanceof Bundle)) && (!a((Bundle)localObject1, (Bundle)localObject2)))
          {
            i = 0;
            break;
          }
          if (localObject1 != null)
            break label127;
        }
        while ((localObject2 == null) && (paramBundle2.containsKey(str)));
        i = 0;
        break;
      }
      while (localObject1.equals(localObject2));
      i = 0;
      continue;
      label143: i = 1;
    }
  }

  private void b(JSONObject paramJSONObject, String[] paramArrayOfString)
  {
    HashSet localHashSet = new HashSet(Arrays.asList(paramArrayOfString));
    try
    {
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        if ("metadataType".equals(str1))
          continue;
        String str2 = Fo.aA(str1);
        if (str2 != null)
        {
          boolean bool = localHashSet.contains(str2);
          if (!bool)
            continue;
        }
        try
        {
          Object localObject2 = paramJSONObject.get(str1);
          if (localObject2 == null)
            continue;
          switch (Fo.aB(str2))
          {
          case 1:
            if (!(localObject2 instanceof String))
              continue;
            this.Fp.putString(str2, (String)localObject2);
            break;
          case 4:
            if ((!(localObject2 instanceof String)) || (iu.aL((String)localObject2) == null))
              continue;
            this.Fp.putString(str2, (String)localObject2);
            break;
          case 2:
            if (!(localObject2 instanceof Integer))
              continue;
            this.Fp.putInt(str2, ((Integer)localObject2).intValue());
            break;
          case 3:
            if (!(localObject2 instanceof Double))
              continue;
            this.Fp.putDouble(str2, ((Double)localObject2).doubleValue());
            continue;
            Object localObject1 = paramJSONObject.get(str1);
            if ((localObject1 instanceof String))
            {
              this.Fp.putString(str1, (String)localObject1);
              continue;
            }
            if ((localObject1 instanceof Integer))
            {
              this.Fp.putInt(str1, ((Integer)localObject1).intValue());
              continue;
            }
            if (!(localObject1 instanceof Double))
              continue;
            this.Fp.putDouble(str1, ((Double)localObject1).doubleValue());
            continue;
          }
        }
        catch (JSONException localJSONException2)
        {
        }
      }
    }
    catch (JSONException localJSONException1)
    {
    }
  }

  private void f(String paramString, int paramInt)
    throws IllegalArgumentException
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("null and empty keys are not allowed");
    int i = Fo.aB(paramString);
    if ((i != paramInt) && (i != 0))
      throw new IllegalArgumentException("Value for " + paramString + " must be a " + Fn[paramInt]);
  }

  public void addImage(WebImage paramWebImage)
  {
    this.EA.add(paramWebImage);
  }

  public JSONObject bL()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("metadataType", this.Fq);
      label20: iu.a(localJSONObject, this.EA);
      switch (this.Fq)
      {
      default:
        a(localJSONObject, new String[0]);
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      }
      while (true)
      {
        return localJSONObject;
        String[] arrayOfString5 = new String[4];
        arrayOfString5[0] = "com.google.android.gms.cast.metadata.TITLE";
        arrayOfString5[1] = "com.google.android.gms.cast.metadata.ARTIST";
        arrayOfString5[2] = "com.google.android.gms.cast.metadata.SUBTITLE";
        arrayOfString5[3] = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        a(localJSONObject, arrayOfString5);
        continue;
        String[] arrayOfString4 = new String[4];
        arrayOfString4[0] = "com.google.android.gms.cast.metadata.TITLE";
        arrayOfString4[1] = "com.google.android.gms.cast.metadata.STUDIO";
        arrayOfString4[2] = "com.google.android.gms.cast.metadata.SUBTITLE";
        arrayOfString4[3] = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        a(localJSONObject, arrayOfString4);
        continue;
        String[] arrayOfString3 = new String[5];
        arrayOfString3[0] = "com.google.android.gms.cast.metadata.TITLE";
        arrayOfString3[1] = "com.google.android.gms.cast.metadata.SERIES_TITLE";
        arrayOfString3[2] = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
        arrayOfString3[3] = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
        arrayOfString3[4] = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
        a(localJSONObject, arrayOfString3);
        continue;
        String[] arrayOfString2 = new String[8];
        arrayOfString2[0] = "com.google.android.gms.cast.metadata.TITLE";
        arrayOfString2[1] = "com.google.android.gms.cast.metadata.ARTIST";
        arrayOfString2[2] = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
        arrayOfString2[3] = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
        arrayOfString2[4] = "com.google.android.gms.cast.metadata.COMPOSER";
        arrayOfString2[5] = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
        arrayOfString2[6] = "com.google.android.gms.cast.metadata.DISC_NUMBER";
        arrayOfString2[7] = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        a(localJSONObject, arrayOfString2);
        continue;
        String[] arrayOfString1 = new String[8];
        arrayOfString1[0] = "com.google.android.gms.cast.metadata.TITLE";
        arrayOfString1[1] = "com.google.android.gms.cast.metadata.ARTIST";
        arrayOfString1[2] = "com.google.android.gms.cast.metadata.LOCATION_NAME";
        arrayOfString1[3] = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
        arrayOfString1[4] = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
        arrayOfString1[5] = "com.google.android.gms.cast.metadata.WIDTH";
        arrayOfString1[6] = "com.google.android.gms.cast.metadata.HEIGHT";
        arrayOfString1[7] = "com.google.android.gms.cast.metadata.CREATION_DATE";
        a(localJSONObject, arrayOfString1);
      }
    }
    catch (JSONException localJSONException)
    {
      break label20;
    }
  }

  public void c(JSONObject paramJSONObject)
  {
    clear();
    this.Fq = 0;
    try
    {
      this.Fq = paramJSONObject.getInt("metadataType");
      label20: iu.a(this.EA, paramJSONObject);
      switch (this.Fq)
      {
      default:
        b(paramJSONObject, new String[0]);
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      }
      while (true)
      {
        return;
        String[] arrayOfString5 = new String[4];
        arrayOfString5[0] = "com.google.android.gms.cast.metadata.TITLE";
        arrayOfString5[1] = "com.google.android.gms.cast.metadata.ARTIST";
        arrayOfString5[2] = "com.google.android.gms.cast.metadata.SUBTITLE";
        arrayOfString5[3] = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        b(paramJSONObject, arrayOfString5);
        continue;
        String[] arrayOfString4 = new String[4];
        arrayOfString4[0] = "com.google.android.gms.cast.metadata.TITLE";
        arrayOfString4[1] = "com.google.android.gms.cast.metadata.STUDIO";
        arrayOfString4[2] = "com.google.android.gms.cast.metadata.SUBTITLE";
        arrayOfString4[3] = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        b(paramJSONObject, arrayOfString4);
        continue;
        String[] arrayOfString3 = new String[5];
        arrayOfString3[0] = "com.google.android.gms.cast.metadata.TITLE";
        arrayOfString3[1] = "com.google.android.gms.cast.metadata.SERIES_TITLE";
        arrayOfString3[2] = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
        arrayOfString3[3] = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
        arrayOfString3[4] = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
        b(paramJSONObject, arrayOfString3);
        continue;
        String[] arrayOfString2 = new String[8];
        arrayOfString2[0] = "com.google.android.gms.cast.metadata.TITLE";
        arrayOfString2[1] = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
        arrayOfString2[2] = "com.google.android.gms.cast.metadata.ARTIST";
        arrayOfString2[3] = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
        arrayOfString2[4] = "com.google.android.gms.cast.metadata.COMPOSER";
        arrayOfString2[5] = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
        arrayOfString2[6] = "com.google.android.gms.cast.metadata.DISC_NUMBER";
        arrayOfString2[7] = "com.google.android.gms.cast.metadata.RELEASE_DATE";
        b(paramJSONObject, arrayOfString2);
        continue;
        String[] arrayOfString1 = new String[8];
        arrayOfString1[0] = "com.google.android.gms.cast.metadata.TITLE";
        arrayOfString1[1] = "com.google.android.gms.cast.metadata.ARTIST";
        arrayOfString1[2] = "com.google.android.gms.cast.metadata.LOCATION_NAME";
        arrayOfString1[3] = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
        arrayOfString1[4] = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
        arrayOfString1[5] = "com.google.android.gms.cast.metadata.WIDTH";
        arrayOfString1[6] = "com.google.android.gms.cast.metadata.HEIGHT";
        arrayOfString1[7] = "com.google.android.gms.cast.metadata.CREATION_DATE";
        b(paramJSONObject, arrayOfString1);
      }
    }
    catch (JSONException localJSONException)
    {
      break label20;
    }
  }

  public void clear()
  {
    this.Fp.clear();
    this.EA.clear();
  }

  public void clearImages()
  {
    this.EA.clear();
  }

  public boolean containsKey(String paramString)
  {
    return this.Fp.containsKey(paramString);
  }

  public boolean equals(Object paramObject)
  {
    int i = 1;
    if (this == paramObject);
    while (true)
    {
      return i;
      if (!(paramObject instanceof MediaMetadata))
      {
        i = 0;
        continue;
      }
      MediaMetadata localMediaMetadata = (MediaMetadata)paramObject;
      if ((a(this.Fp, localMediaMetadata.Fp)) && (this.EA.equals(localMediaMetadata.EA)))
        continue;
      i = 0;
    }
  }

  public Calendar getDate(String paramString)
  {
    f(paramString, 4);
    String str = this.Fp.getString(paramString);
    if (str != null);
    for (Calendar localCalendar = iu.aL(str); ; localCalendar = null)
      return localCalendar;
  }

  public String getDateAsString(String paramString)
  {
    f(paramString, 4);
    return this.Fp.getString(paramString);
  }

  public double getDouble(String paramString)
  {
    f(paramString, 3);
    return this.Fp.getDouble(paramString);
  }

  public List<WebImage> getImages()
  {
    return this.EA;
  }

  public int getInt(String paramString)
  {
    f(paramString, 2);
    return this.Fp.getInt(paramString);
  }

  public int getMediaType()
  {
    return this.Fq;
  }

  public String getString(String paramString)
  {
    f(paramString, 1);
    return this.Fp.getString(paramString);
  }

  public boolean hasImages()
  {
    if ((this.EA != null) && (!this.EA.isEmpty()));
    for (int i = 1; ; i = 0)
      return i;
  }

  public int hashCode()
  {
    Iterator localIterator = this.Fp.keySet().iterator();
    String str;
    for (int i = 17; localIterator.hasNext(); i = i * 31 + this.Fp.get(str).hashCode())
      str = (String)localIterator.next();
    return i * 31 + this.EA.hashCode();
  }

  public Set<String> keySet()
  {
    return this.Fp.keySet();
  }

  public void putDate(String paramString, Calendar paramCalendar)
  {
    f(paramString, 4);
    this.Fp.putString(paramString, iu.a(paramCalendar));
  }

  public void putDouble(String paramString, double paramDouble)
  {
    f(paramString, 3);
    this.Fp.putDouble(paramString, paramDouble);
  }

  public void putInt(String paramString, int paramInt)
  {
    f(paramString, 2);
    this.Fp.putInt(paramString, paramInt);
  }

  public void putString(String paramString1, String paramString2)
  {
    f(paramString1, 1);
    this.Fp.putString(paramString1, paramString2);
  }

  private static class a
  {
    private final Map<String, String> Fr = new HashMap();
    private final Map<String, String> Fs = new HashMap();
    private final Map<String, Integer> Ft = new HashMap();

    public a a(String paramString1, String paramString2, int paramInt)
    {
      this.Fr.put(paramString1, paramString2);
      this.Fs.put(paramString2, paramString1);
      this.Ft.put(paramString1, Integer.valueOf(paramInt));
      return this;
    }

    public String aA(String paramString)
    {
      return (String)this.Fs.get(paramString);
    }

    public int aB(String paramString)
    {
      Integer localInteger = (Integer)this.Ft.get(paramString);
      if (localInteger != null);
      for (int i = localInteger.intValue(); ; i = 0)
        return i;
    }

    public String az(String paramString)
    {
      return (String)this.Fr.get(paramString);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.MediaMetadata
 * JD-Core Version:    0.6.0
 */