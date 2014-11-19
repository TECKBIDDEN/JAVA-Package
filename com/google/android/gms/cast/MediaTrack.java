package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.internal.ik;
import com.google.android.gms.internal.jz;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack
{
  public static final int SUBTYPE_CAPTIONS = 2;
  public static final int SUBTYPE_CHAPTERS = 4;
  public static final int SUBTYPE_DESCRIPTIONS = 3;
  public static final int SUBTYPE_METADATA = 5;
  public static final int SUBTYPE_NONE = 0;
  public static final int SUBTYPE_SUBTITLES = 1;
  public static final int SUBTYPE_UNKNOWN = -1;
  public static final int TYPE_AUDIO = 2;
  public static final int TYPE_TEXT = 1;
  public static final int TYPE_UNKNOWN = 0;
  public static final int TYPE_VIDEO = 3;
  private long Dj;
  private int FD;
  private int FE;
  private String Fc;
  private String Fe;
  private String Fg;
  private JSONObject Fl;
  private String mName;

  MediaTrack(long paramLong, int paramInt)
    throws IllegalArgumentException
  {
    clear();
    this.Dj = paramLong;
    if ((paramInt <= 0) || (paramInt > 3))
      throw new IllegalArgumentException("invalid type " + paramInt);
    this.FD = paramInt;
  }

  MediaTrack(JSONObject paramJSONObject)
    throws JSONException
  {
    c(paramJSONObject);
  }

  private void c(JSONObject paramJSONObject)
    throws JSONException
  {
    clear();
    this.Dj = paramJSONObject.getLong("trackId");
    String str1 = paramJSONObject.getString("type");
    String str2;
    if ("TEXT".equals(str1))
    {
      this.FD = 1;
      this.Fe = paramJSONObject.optString("trackContentId", null);
      this.Fg = paramJSONObject.optString("trackContentType", null);
      this.mName = paramJSONObject.optString("name", null);
      this.Fc = paramJSONObject.optString("language", null);
      if (!paramJSONObject.has("subtype"))
        break label276;
      str2 = paramJSONObject.getString("subtype");
      if (!"SUBTITLES".equals(str2))
        break label181;
      this.FE = 1;
    }
    while (true)
    {
      this.Fl = paramJSONObject.optJSONObject("customData");
      return;
      if ("AUDIO".equals(str1))
      {
        this.FD = 2;
        break;
      }
      if ("VIDEO".equals(str1))
      {
        this.FD = 3;
        break;
      }
      throw new JSONException("invalid type: " + str1);
      label181: if ("CAPTIONS".equals(str2))
      {
        this.FE = 2;
        continue;
      }
      if ("DESCRIPTIONS".equals(str2))
      {
        this.FE = 3;
        continue;
      }
      if ("CHAPTERS".equals(str2))
      {
        this.FE = 4;
        continue;
      }
      if ("METADATA".equals(str2))
      {
        this.FE = 5;
        continue;
      }
      throw new JSONException("invalid subtype: " + str2);
      label276: this.FE = 0;
    }
  }

  private void clear()
  {
    this.Dj = 0L;
    this.FD = 0;
    this.Fe = null;
    this.mName = null;
    this.Fc = null;
    this.FE = -1;
    this.Fl = null;
  }

  void aa(int paramInt)
    throws IllegalArgumentException
  {
    if ((paramInt <= -1) || (paramInt > 5))
      throw new IllegalArgumentException("invalid subtype " + paramInt);
    if ((paramInt != 0) && (this.FD != 1))
      throw new IllegalArgumentException("subtypes are only valid for text tracks");
    this.FE = paramInt;
  }

  public JSONObject bL()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("trackId", this.Dj);
      switch (this.FD)
      {
      default:
        if (this.Fe != null)
          localJSONObject.put("trackContentId", this.Fe);
        if (this.Fg != null)
          localJSONObject.put("trackContentType", this.Fg);
        if (this.mName != null)
          localJSONObject.put("name", this.mName);
        if (!TextUtils.isEmpty(this.Fc))
          localJSONObject.put("language", this.Fc);
        switch (this.FE)
        {
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        if (this.Fl == null)
          break label277;
        localJSONObject.put("customData", this.Fl);
        break label277;
        localJSONObject.put("type", "TEXT");
        break;
        localJSONObject.put("type", "AUDIO");
        break;
        localJSONObject.put("type", "VIDEO");
        break;
        localJSONObject.put("subtype", "SUBTITLES");
        continue;
        localJSONObject.put("subtype", "CAPTIONS");
        continue;
        localJSONObject.put("subtype", "DESCRIPTIONS");
        continue;
        localJSONObject.put("subtype", "CHAPTERS");
        continue;
        localJSONObject.put("subtype", "METADATA");
      }
      label277: return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      break label277;
    }
  }

  public boolean equals(Object paramObject)
  {
    int i = 1;
    int j = 0;
    if (this == paramObject)
      j = i;
    do
      return j;
    while (!(paramObject instanceof MediaTrack));
    MediaTrack localMediaTrack = (MediaTrack)paramObject;
    int k;
    label36: int m;
    if (this.Fl == null)
    {
      k = i;
      if (localMediaTrack.Fl != null)
        break label192;
      m = i;
      label47: if ((k != m) || ((this.Fl != null) && (localMediaTrack.Fl != null) && (!jz.d(this.Fl, localMediaTrack.Fl))))
        break label196;
      if ((this.Dj != localMediaTrack.Dj) || (this.FD != localMediaTrack.FD) || (!ik.a(this.Fe, localMediaTrack.Fe)) || (!ik.a(this.Fg, localMediaTrack.Fg)) || (!ik.a(this.mName, localMediaTrack.mName)) || (!ik.a(this.Fc, localMediaTrack.Fc)) || (this.FE != localMediaTrack.FE))
        break label198;
    }
    while (true)
    {
      j = i;
      break;
      k = 0;
      break label36;
      label192: m = 0;
      break label47;
      label196: break;
      label198: i = 0;
    }
  }

  public String getContentId()
  {
    return this.Fe;
  }

  public String getContentType()
  {
    return this.Fg;
  }

  public JSONObject getCustomData()
  {
    return this.Fl;
  }

  public long getId()
  {
    return this.Dj;
  }

  public String getLanguage()
  {
    return this.Fc;
  }

  public String getName()
  {
    return this.mName;
  }

  public int getSubtype()
  {
    return this.FE;
  }

  public int getType()
  {
    return this.FD;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = Long.valueOf(this.Dj);
    arrayOfObject[1] = Integer.valueOf(this.FD);
    arrayOfObject[2] = this.Fe;
    arrayOfObject[3] = this.Fg;
    arrayOfObject[4] = this.mName;
    arrayOfObject[5] = this.Fc;
    arrayOfObject[6] = Integer.valueOf(this.FE);
    arrayOfObject[7] = this.Fl;
    return m.hashCode(arrayOfObject);
  }

  public void setContentId(String paramString)
  {
    this.Fe = paramString;
  }

  public void setContentType(String paramString)
  {
    this.Fg = paramString;
  }

  void setCustomData(JSONObject paramJSONObject)
  {
    this.Fl = paramJSONObject;
  }

  void setLanguage(String paramString)
  {
    this.Fc = paramString;
  }

  void setName(String paramString)
  {
    this.mName = paramString;
  }

  public static class Builder
  {
    private final MediaTrack FF;

    public Builder(long paramLong, int paramInt)
      throws IllegalArgumentException
    {
      this.FF = new MediaTrack(paramLong, paramInt);
    }

    public MediaTrack build()
    {
      return this.FF;
    }

    public Builder setContentId(String paramString)
    {
      this.FF.setContentId(paramString);
      return this;
    }

    public Builder setContentType(String paramString)
    {
      this.FF.setContentType(paramString);
      return this;
    }

    public Builder setCustomData(JSONObject paramJSONObject)
    {
      this.FF.setCustomData(paramJSONObject);
      return this;
    }

    public Builder setLanguage(String paramString)
    {
      this.FF.setLanguage(paramString);
      return this;
    }

    public Builder setLanguage(Locale paramLocale)
    {
      this.FF.setLanguage(ik.b(paramLocale));
      return this;
    }

    public Builder setName(String paramString)
    {
      this.FF.setName(paramString);
      return this;
    }

    public Builder setSubtype(int paramInt)
      throws IllegalArgumentException
    {
      this.FF.aa(paramInt);
      return this;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.MediaTrack
 * JD-Core Version:    0.6.0
 */