package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.ads.AdSize;

@ez
public final class bb
{
  private final AdSize[] oj;
  private final String ok;

  public bb(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, R.styleable.AdsAttrs);
    String str1 = localTypedArray.getString(R.styleable.AdsAttrs_adSize);
    String str2 = localTypedArray.getString(R.styleable.AdsAttrs_adSizes);
    int j;
    if (!TextUtils.isEmpty(str1))
    {
      j = i;
      if (TextUtils.isEmpty(str2))
        break label114;
      label58: if ((j == 0) || (i != 0))
        break label119;
    }
    for (this.oj = q(str1); ; this.oj = q(str2))
    {
      this.ok = localTypedArray.getString(R.styleable.AdsAttrs_adUnitId);
      if (!TextUtils.isEmpty(this.ok))
        return;
      throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
      j = 0;
      break;
      label114: i = 0;
      break label58;
      label119: if ((j != 0) || (i == 0))
        break label140;
    }
    label140: if ((j != 0) && (i != 0))
      throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
  }

  private static AdSize[] q(String paramString)
  {
    String[] arrayOfString1 = paramString.split("\\s*,\\s*");
    AdSize[] arrayOfAdSize = new AdSize[arrayOfString1.length];
    int i = 0;
    if (i < arrayOfString1.length)
    {
      String str = arrayOfString1[i].trim();
      String[] arrayOfString2;
      if (str.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"))
      {
        arrayOfString2 = str.split("[xX]");
        arrayOfString2[0] = arrayOfString2[0].trim();
        arrayOfString2[1] = arrayOfString2[1].trim();
      }
      while (true)
      {
        try
        {
          if (!"FULL_WIDTH".equals(arrayOfString2[0]))
            continue;
          int j = -1;
          boolean bool = "AUTO_HEIGHT".equals(arrayOfString2[1]);
          if (!bool)
            continue;
          int m = -2;
          arrayOfAdSize[i] = new AdSize(j, m);
          i++;
          break;
          j = Integer.parseInt(arrayOfString2[0]);
          continue;
          int k = Integer.parseInt(arrayOfString2[1]);
          m = k;
          continue;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + str);
        }
        if ("BANNER".equals(str))
        {
          arrayOfAdSize[i] = AdSize.BANNER;
          continue;
        }
        if ("LARGE_BANNER".equals(str))
        {
          arrayOfAdSize[i] = AdSize.LARGE_BANNER;
          continue;
        }
        if ("FULL_BANNER".equals(str))
        {
          arrayOfAdSize[i] = AdSize.FULL_BANNER;
          continue;
        }
        if ("LEADERBOARD".equals(str))
        {
          arrayOfAdSize[i] = AdSize.LEADERBOARD;
          continue;
        }
        if ("MEDIUM_RECTANGLE".equals(str))
        {
          arrayOfAdSize[i] = AdSize.MEDIUM_RECTANGLE;
          continue;
        }
        if ("SMART_BANNER".equals(str))
        {
          arrayOfAdSize[i] = AdSize.SMART_BANNER;
          continue;
        }
        if (!"WIDE_SKYSCRAPER".equals(str))
          break label317;
        arrayOfAdSize[i] = AdSize.WIDE_SKYSCRAPER;
      }
      label317: throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + str);
    }
    if (arrayOfAdSize.length == 0)
      throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + paramString);
    return arrayOfAdSize;
  }

  public AdSize[] f(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.oj.length != 1))
      throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    return this.oj;
  }

  public String getAdUnitId()
  {
    return this.ok;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bb
 * JD-Core Version:    0.6.0
 */