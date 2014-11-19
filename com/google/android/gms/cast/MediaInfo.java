package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.internal.ik;
import com.google.android.gms.internal.jz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaInfo
{
  public static final int STREAM_TYPE_BUFFERED = 1;
  public static final int STREAM_TYPE_INVALID = -1;
  public static final int STREAM_TYPE_LIVE = 2;
  public static final int STREAM_TYPE_NONE;
  private final String Fe;
  private int Ff;
  private String Fg;
  private MediaMetadata Fh;
  private long Fi;
  private List<MediaTrack> Fj;
  private TextTrackStyle Fk;
  private JSONObject Fl;

  MediaInfo(String paramString)
    throws IllegalArgumentException
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("content ID cannot be null or empty");
    this.Fe = paramString;
    this.Ff = -1;
  }

  MediaInfo(JSONObject paramJSONObject)
    throws JSONException
  {
    this.Fe = paramJSONObject.getString("contentId");
    String str = paramJSONObject.getString("streamType");
    if ("NONE".equals(str))
      this.Ff = 0;
    while (true)
    {
      this.Fg = paramJSONObject.getString("contentType");
      if (paramJSONObject.has("metadata"))
      {
        JSONObject localJSONObject2 = paramJSONObject.getJSONObject("metadata");
        this.Fh = new MediaMetadata(localJSONObject2.getInt("metadataType"));
        this.Fh.c(localJSONObject2);
      }
      this.Fi = ik.b(paramJSONObject.optDouble("duration", 0.0D));
      if (paramJSONObject.has("tracks"))
      {
        this.Fj = new ArrayList();
        JSONArray localJSONArray = paramJSONObject.getJSONArray("tracks");
        while (i < localJSONArray.length())
        {
          MediaTrack localMediaTrack = new MediaTrack(localJSONArray.getJSONObject(i));
          this.Fj.add(localMediaTrack);
          i++;
        }
        if ("BUFFERED".equals(str))
        {
          this.Ff = 1;
          continue;
        }
        if ("LIVE".equals(str))
        {
          this.Ff = 2;
          continue;
        }
        this.Ff = -1;
        continue;
      }
      this.Fj = null;
    }
    TextTrackStyle localTextTrackStyle;
    if (paramJSONObject.has("textTrackStyle"))
    {
      JSONObject localJSONObject1 = paramJSONObject.getJSONObject("textTrackStyle");
      localTextTrackStyle = new TextTrackStyle();
      localTextTrackStyle.c(localJSONObject1);
    }
    for (this.Fk = localTextTrackStyle; ; this.Fk = null)
    {
      this.Fl = paramJSONObject.optJSONObject("customData");
      return;
    }
  }

  void a(MediaMetadata paramMediaMetadata)
  {
    this.Fh = paramMediaMetadata;
  }

  public JSONObject bL()
  {
    JSONObject localJSONObject = new JSONObject();
    while (true)
    {
      try
      {
        localJSONObject.put("contentId", this.Fe);
        switch (this.Ff)
        {
        default:
          localJSONObject.put("streamType", localObject);
          if (this.Fg == null)
            continue;
          localJSONObject.put("contentType", this.Fg);
          if (this.Fh == null)
            continue;
          localJSONObject.put("metadata", this.Fh.bL());
          localJSONObject.put("duration", ik.o(this.Fi));
          if (this.Fj == null)
            continue;
          JSONArray localJSONArray = new JSONArray();
          Iterator localIterator = this.Fj.iterator();
          if (!localIterator.hasNext())
            continue;
          localJSONArray.put(((MediaTrack)localIterator.next()).bL());
          continue;
          localJSONObject.put("tracks", localJSONArray);
          if (this.Fk == null)
            continue;
          localJSONObject.put("textTrackStyle", this.Fk.bL());
          if (this.Fl != null)
          {
            localJSONObject.put("customData", this.Fl);
            break label224;
            localObject = "NONE";
            continue;
          }
        case 1:
        case 2:
        }
      }
      catch (JSONException localJSONException)
      {
      }
      label224: return localJSONObject;
      Object localObject = "BUFFERED";
      continue;
      localObject = "LIVE";
    }
  }

  void c(List<MediaTrack> paramList)
  {
    this.Fj = paramList;
  }

  public boolean equals(Object paramObject)
  {
    int i = 1;
    int j = 0;
    if (this == paramObject)
      j = i;
    do
      return j;
    while (!(paramObject instanceof MediaInfo));
    MediaInfo localMediaInfo = (MediaInfo)paramObject;
    int k;
    label36: int m;
    if (this.Fl == null)
    {
      k = i;
      if (localMediaInfo.Fl != null)
        break label165;
      m = i;
      label47: if ((k != m) || ((this.Fl != null) && (localMediaInfo.Fl != null) && (!jz.d(this.Fl, localMediaInfo.Fl))))
        break label169;
      if ((!ik.a(this.Fe, localMediaInfo.Fe)) || (this.Ff != localMediaInfo.Ff) || (!ik.a(this.Fg, localMediaInfo.Fg)) || (!ik.a(this.Fh, localMediaInfo.Fh)) || (this.Fi != localMediaInfo.Fi))
        break label171;
    }
    while (true)
    {
      j = i;
      break;
      k = 0;
      break label36;
      label165: m = 0;
      break label47;
      label169: break;
      label171: i = 0;
    }
  }

  void fw()
    throws IllegalArgumentException
  {
    if (TextUtils.isEmpty(this.Fe))
      throw new IllegalArgumentException("content ID cannot be null or empty");
    if (TextUtils.isEmpty(this.Fg))
      throw new IllegalArgumentException("content type cannot be null or empty");
    if (this.Ff == -1)
      throw new IllegalArgumentException("a valid stream type must be specified");
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

  public List<MediaTrack> getMediaTracks()
  {
    return this.Fj;
  }

  public MediaMetadata getMetadata()
  {
    return this.Fh;
  }

  public long getStreamDuration()
  {
    return this.Fi;
  }

  public int getStreamType()
  {
    return this.Ff;
  }

  public TextTrackStyle getTextTrackStyle()
  {
    return this.Fk;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this.Fe;
    arrayOfObject[1] = Integer.valueOf(this.Ff);
    arrayOfObject[2] = this.Fg;
    arrayOfObject[3] = this.Fh;
    arrayOfObject[4] = Long.valueOf(this.Fi);
    arrayOfObject[5] = String.valueOf(this.Fl);
    return m.hashCode(arrayOfObject);
  }

  void m(long paramLong)
    throws IllegalArgumentException
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("Stream duration cannot be negative");
    this.Fi = paramLong;
  }

  void setContentType(String paramString)
    throws IllegalArgumentException
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("content type cannot be null or empty");
    this.Fg = paramString;
  }

  void setCustomData(JSONObject paramJSONObject)
  {
    this.Fl = paramJSONObject;
  }

  void setStreamType(int paramInt)
    throws IllegalArgumentException
  {
    if ((paramInt < -1) || (paramInt > 2))
      throw new IllegalArgumentException("invalid stream type");
    this.Ff = paramInt;
  }

  public void setTextTrackStyle(TextTrackStyle paramTextTrackStyle)
  {
    this.Fk = paramTextTrackStyle;
  }

  public static class Builder
  {
    private final MediaInfo Fm;

    public Builder(String paramString)
      throws IllegalArgumentException
    {
      if (TextUtils.isEmpty(paramString))
        throw new IllegalArgumentException("Content ID cannot be empty");
      this.Fm = new MediaInfo(paramString);
    }

    public MediaInfo build()
      throws IllegalArgumentException
    {
      this.Fm.fw();
      return this.Fm;
    }

    public Builder setContentType(String paramString)
      throws IllegalArgumentException
    {
      this.Fm.setContentType(paramString);
      return this;
    }

    public Builder setCustomData(JSONObject paramJSONObject)
    {
      this.Fm.setCustomData(paramJSONObject);
      return this;
    }

    public Builder setMediaTracks(List<MediaTrack> paramList)
    {
      this.Fm.c(paramList);
      return this;
    }

    public Builder setMetadata(MediaMetadata paramMediaMetadata)
    {
      this.Fm.a(paramMediaMetadata);
      return this;
    }

    public Builder setStreamDuration(long paramLong)
      throws IllegalArgumentException
    {
      this.Fm.m(paramLong);
      return this;
    }

    public Builder setStreamType(int paramInt)
      throws IllegalArgumentException
    {
      this.Fm.setStreamType(paramInt);
      return this;
    }

    public Builder setTextTrackStyle(TextTrackStyle paramTextTrackStyle)
    {
      this.Fm.setTextTrackStyle(paramTextTrackStyle);
      return this;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.MediaInfo
 * JD-Core Version:    0.6.0
 */