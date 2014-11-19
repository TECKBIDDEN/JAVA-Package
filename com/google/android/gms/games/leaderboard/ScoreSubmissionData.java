package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.m.a;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.games.internal.constants.TimeSpan;
import java.util.HashMap;

public final class ScoreSubmissionData
{
  private static final String[] abh;
  private int HF;
  private String Vz;
  private HashMap<Integer, Result> abN;
  private String abj;

  static
  {
    String[] arrayOfString = new String[8];
    arrayOfString[0] = "leaderboardId";
    arrayOfString[1] = "playerId";
    arrayOfString[2] = "timeSpan";
    arrayOfString[3] = "hasResult";
    arrayOfString[4] = "rawScore";
    arrayOfString[5] = "formattedScore";
    arrayOfString[6] = "newBest";
    arrayOfString[7] = "scoreTag";
    abh = arrayOfString;
  }

  public ScoreSubmissionData(DataHolder paramDataHolder)
  {
    this.HF = paramDataHolder.getStatusCode();
    this.abN = new HashMap();
    int i = paramDataHolder.getCount();
    if (i == 3);
    for (boolean bool = true; ; bool = false)
    {
      n.K(bool);
      for (int j = 0; j < i; j++)
      {
        int k = paramDataHolder.ar(j);
        if (j == 0)
        {
          this.abj = paramDataHolder.c("leaderboardId", j, k);
          this.Vz = paramDataHolder.c("playerId", j, k);
        }
        if (!paramDataHolder.d("hasResult", j, k))
          continue;
        a(new Result(paramDataHolder.a("rawScore", j, k), paramDataHolder.c("formattedScore", j, k), paramDataHolder.c("scoreTag", j, k), paramDataHolder.d("newBest", j, k)), paramDataHolder.b("timeSpan", j, k));
      }
    }
  }

  private void a(Result paramResult, int paramInt)
  {
    this.abN.put(Integer.valueOf(paramInt), paramResult);
  }

  public String getLeaderboardId()
  {
    return this.abj;
  }

  public String getPlayerId()
  {
    return this.Vz;
  }

  public Result getScoreResult(int paramInt)
  {
    return (Result)this.abN.get(Integer.valueOf(paramInt));
  }

  public String toString()
  {
    m.a locala = m.h(this).a("PlayerId", this.Vz).a("StatusCode", Integer.valueOf(this.HF));
    int i = 0;
    if (i < 3)
    {
      Result localResult = (Result)this.abN.get(Integer.valueOf(i));
      locala.a("TimesSpan", TimeSpan.dH(i));
      if (localResult == null);
      for (String str = "null"; ; str = localResult.toString())
      {
        locala.a("Result", str);
        i++;
        break;
      }
    }
    return locala.toString();
  }

  public static final class Result
  {
    public final String formattedScore;
    public final boolean newBest;
    public final long rawScore;
    public final String scoreTag;

    public Result(long paramLong, String paramString1, String paramString2, boolean paramBoolean)
    {
      this.rawScore = paramLong;
      this.formattedScore = paramString1;
      this.scoreTag = paramString2;
      this.newBest = paramBoolean;
    }

    public String toString()
    {
      return m.h(this).a("RawScore", Long.valueOf(this.rawScore)).a("FormattedScore", this.formattedScore).a("ScoreTag", this.scoreTag).a("NewBest", Boolean.valueOf(this.newBest)).toString();
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.leaderboard.ScoreSubmissionData
 * JD-Core Version:    0.6.0
 */