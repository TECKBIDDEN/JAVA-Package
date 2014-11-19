package com.google.android.gms.location;

import java.util.Comparator;

class DetectedActivity$1
  implements Comparator<DetectedActivity>
{
  public int a(DetectedActivity paramDetectedActivity1, DetectedActivity paramDetectedActivity2)
  {
    int i = Integer.valueOf(paramDetectedActivity2.getConfidence()).compareTo(Integer.valueOf(paramDetectedActivity1.getConfidence()));
    if (i == 0)
      i = Integer.valueOf(paramDetectedActivity1.getType()).compareTo(Integer.valueOf(paramDetectedActivity2.getType()));
    return i;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.DetectedActivity.1
 * JD-Core Version:    0.6.0
 */