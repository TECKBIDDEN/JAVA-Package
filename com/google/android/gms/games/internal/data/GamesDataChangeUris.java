package com.google.android.gms.games.internal.data;

import android.net.Uri;
import android.net.Uri.Builder;

public final class GamesDataChangeUris
{
  private static final Uri aac = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
  public static final Uri aad = aac.buildUpon().appendPath("invitations").build();
  public static final Uri aae = aac.buildUpon().appendEncodedPath("players").build();
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.data.GamesDataChangeUris
 * JD-Core Version:    0.6.0
 */