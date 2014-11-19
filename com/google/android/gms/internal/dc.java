package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.R.string;
import java.util.Map;

@ez
public class dc
{
  private final Context mContext;
  private final gv md;
  private final Map<String, String> qM;
  private String qN;
  private long qO;
  private long qP;
  private String qQ;
  private String qR;

  public dc(gv paramgv, Map<String, String> paramMap)
  {
    this.md = paramgv;
    this.qM = paramMap;
    this.mContext = paramgv.dA();
    bG();
  }

  private String A(String paramString)
  {
    if (TextUtils.isEmpty((CharSequence)this.qM.get(paramString)));
    for (String str = ""; ; str = (String)this.qM.get(paramString))
      return str;
  }

  private void bG()
  {
    this.qN = A("description");
    this.qQ = A("summary");
    this.qO = gj.O((String)this.qM.get("start"));
    this.qP = gj.O((String)this.qM.get("end"));
    this.qR = A("location");
  }

  Intent bH()
  {
    Intent localIntent = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
    localIntent.putExtra("title", this.qQ);
    localIntent.putExtra("eventLocation", this.qR);
    localIntent.putExtra("description", this.qN);
    localIntent.putExtra("beginTime", this.qO);
    localIntent.putExtra("endTime", this.qP);
    localIntent.setFlags(268435456);
    return localIntent;
  }

  public void execute()
  {
    if (!new bl(this.mContext).bo())
      gs.W("This feature is not available on this version of the device.");
    while (true)
    {
      return;
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.mContext);
      localBuilder.setTitle(gb.c(R.string.create_calendar_title, "Create calendar event"));
      localBuilder.setMessage(gb.c(R.string.create_calendar_message, "Allow Ad to create a calendar event?"));
      localBuilder.setPositiveButton(gb.c(R.string.accept, "Accept"), new dc.1(this));
      localBuilder.setNegativeButton(gb.c(R.string.decline, "Decline"), new dc.2(this));
      localBuilder.create().show();
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dc
 * JD-Core Version:    0.6.0
 */