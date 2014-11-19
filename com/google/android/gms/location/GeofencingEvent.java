package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.internal.mb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GeofencingEvent
{
  private final int aee;
  private final List<Geofence> aef;
  private final Location aeg;
  private final int tc;

  private GeofencingEvent(int paramInt1, int paramInt2, List<Geofence> paramList, Location paramLocation)
  {
    this.tc = paramInt1;
    this.aee = paramInt2;
    this.aef = paramList;
    this.aeg = paramLocation;
  }

  public static GeofencingEvent fromIntent(Intent paramIntent)
  {
    if (paramIntent == null);
    for (GeofencingEvent localGeofencingEvent = null; ; localGeofencingEvent = new GeofencingEvent(paramIntent.getIntExtra("gms_error_code", -1), getGeofenceTransition(paramIntent), getTriggeringGeofences(paramIntent), (Location)paramIntent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location")))
      return localGeofencingEvent;
  }

  private static int getGeofenceTransition(Intent paramIntent)
  {
    int i = -1;
    int j = paramIntent.getIntExtra("com.google.android.location.intent.extra.transition", i);
    if (j == i);
    while (true)
    {
      return i;
      if ((j != 1) && (j != 2) && (j != 4))
        continue;
      i = j;
    }
  }

  private static List<Geofence> getTriggeringGeofences(Intent paramIntent)
  {
    ArrayList localArrayList1 = (ArrayList)paramIntent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
    if (localArrayList1 == null);
    ArrayList localArrayList2;
    for (Object localObject = null; ; localObject = localArrayList2)
    {
      return localObject;
      localArrayList2 = new ArrayList(localArrayList1.size());
      Iterator localIterator = localArrayList1.iterator();
      while (localIterator.hasNext())
        localArrayList2.add(mb.h((byte[])localIterator.next()));
    }
  }

  public int getErrorCode()
  {
    return this.tc;
  }

  public int getGeofenceTransition()
  {
    return this.aee;
  }

  public List<Geofence> getTriggeringGeofences()
  {
    return this.aef;
  }

  public Location getTriggeringLocation()
  {
    return this.aeg;
  }

  public boolean hasError()
  {
    if (this.tc != -1);
    for (int i = 1; ; i = 0)
      return i;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.GeofencingEvent
 * JD-Core Version:    0.6.0
 */