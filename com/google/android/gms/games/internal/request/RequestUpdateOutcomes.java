package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import java.util.HashMap;
import java.util.Set;

public final class RequestUpdateOutcomes
{
  private static final String[] abh;
  private final int HF;
  private final HashMap<String, Integer> abi;

  static
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "requestId";
    arrayOfString[1] = "outcome";
    abh = arrayOfString;
  }

  private RequestUpdateOutcomes(int paramInt, HashMap<String, Integer> paramHashMap)
  {
    this.HF = paramInt;
    this.abi = paramHashMap;
  }

  public static RequestUpdateOutcomes V(DataHolder paramDataHolder)
  {
    Builder localBuilder = new Builder();
    localBuilder.dR(paramDataHolder.getStatusCode());
    int i = paramDataHolder.getCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramDataHolder.ar(j);
      localBuilder.x(paramDataHolder.c("requestId", j, k), paramDataHolder.b("outcome", j, k));
    }
    return localBuilder.lw();
  }

  public Set<String> getRequestIds()
  {
    return this.abi.keySet();
  }

  public int getRequestOutcome(String paramString)
  {
    n.b(this.abi.containsKey(paramString), "Request " + paramString + " was not part of the update operation!");
    return ((Integer)this.abi.get(paramString)).intValue();
  }

  public static final class Builder
  {
    private int HF = 0;
    private HashMap<String, Integer> abi = new HashMap();

    public Builder dR(int paramInt)
    {
      this.HF = paramInt;
      return this;
    }

    public RequestUpdateOutcomes lw()
    {
      return new RequestUpdateOutcomes(this.HF, this.abi, null);
    }

    public Builder x(String paramString, int paramInt)
    {
      if (RequestUpdateResultOutcome.isValid(paramInt))
        this.abi.put(paramString, Integer.valueOf(paramInt));
      return this;
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.request.RequestUpdateOutcomes
 * JD-Core Version:    0.6.0
 */