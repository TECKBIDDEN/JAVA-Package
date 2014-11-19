package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@ez
public class df
{
  private final boolean rb;
  private final boolean rc;
  private final boolean rd;
  private final boolean re;
  private final boolean rf;

  private df(a parama)
  {
    this.rb = a.a(parama);
    this.rc = a.b(parama);
    this.rd = a.c(parama);
    this.re = a.d(parama);
    this.rf = a.e(parama);
  }

  public JSONObject bL()
  {
    try
    {
      JSONObject localJSONObject2 = new JSONObject().put("sms", this.rb).put("tel", this.rc).put("calendar", this.rd).put("storePicture", this.re).put("inlineVideo", this.rf);
      localJSONObject1 = localJSONObject2;
      return localJSONObject1;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        gs.b("Error occured while obtaining the MRAID capabilities.", localJSONException);
        JSONObject localJSONObject1 = null;
      }
    }
  }

  public static final class a
  {
    private boolean rb;
    private boolean rc;
    private boolean rd;
    private boolean re;
    private boolean rf;

    public df bM()
    {
      return new df(this, null);
    }

    public a i(boolean paramBoolean)
    {
      this.rb = paramBoolean;
      return this;
    }

    public a j(boolean paramBoolean)
    {
      this.rc = paramBoolean;
      return this;
    }

    public a k(boolean paramBoolean)
    {
      this.rd = paramBoolean;
      return this;
    }

    public a l(boolean paramBoolean)
    {
      this.re = paramBoolean;
      return this;
    }

    public a m(boolean paramBoolean)
    {
      this.rf = paramBoolean;
      return this;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.df
 * JD-Core Version:    0.6.0
 */