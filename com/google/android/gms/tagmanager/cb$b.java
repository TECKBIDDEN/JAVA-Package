package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import com.google.android.gms.internal.ju;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

class cb$b extends SQLiteOpenHelper
{
  private boolean Bf;
  private long Bg = 0L;

  cb$b(cb paramcb, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }

  private void a(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor = paramSQLiteDatabase.rawQuery("SELECT * FROM gtm_hits WHERE 0", null);
    HashSet localHashSet = new HashSet();
    try
    {
      String[] arrayOfString = localCursor.getColumnNames();
      for (int i = 0; i < arrayOfString.length; i++)
        localHashSet.add(arrayOfString[i]);
      localCursor.close();
      if ((!localHashSet.remove("hit_id")) || (!localHashSet.remove("hit_url")) || (!localHashSet.remove("hit_time")) || (!localHashSet.remove("hit_first_send_time")))
        throw new SQLiteException("Database column missing");
    }
    finally
    {
      localCursor.close();
    }
    if (!localHashSet.isEmpty())
      throw new SQLiteException("Database has extra columns");
  }

  // ERROR //
  private boolean a(String paramString, SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iconst_1
    //   3: anewarray 79	java/lang/String
    //   6: astore 9
    //   8: aload 9
    //   10: iconst_0
    //   11: ldc 81
    //   13: aastore
    //   14: iconst_1
    //   15: anewarray 79	java/lang/String
    //   18: astore 10
    //   20: aload 10
    //   22: iconst_0
    //   23: aload_1
    //   24: aastore
    //   25: aload_2
    //   26: ldc 83
    //   28: aload 9
    //   30: ldc 85
    //   32: aload 10
    //   34: aconst_null
    //   35: aconst_null
    //   36: aconst_null
    //   37: invokevirtual 89	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   40: astore 11
    //   42: aload 11
    //   44: invokeinterface 92 1 0
    //   49: istore 13
    //   51: iload 13
    //   53: istore 8
    //   55: aload 11
    //   57: ifnull +10 -> 67
    //   60: aload 11
    //   62: invokeinterface 52 1 0
    //   67: iload 8
    //   69: ireturn
    //   70: astore 5
    //   72: aconst_null
    //   73: astore 6
    //   75: new 94	java/lang/StringBuilder
    //   78: dup
    //   79: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   82: ldc 97
    //   84: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload_1
    //   88: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: invokestatic 110	com/google/android/gms/tagmanager/bh:W	(Ljava/lang/String;)V
    //   97: aload 6
    //   99: ifnull +10 -> 109
    //   102: aload 6
    //   104: invokeinterface 52 1 0
    //   109: iconst_0
    //   110: istore 8
    //   112: goto -45 -> 67
    //   115: astore 4
    //   117: aload_3
    //   118: ifnull +9 -> 127
    //   121: aload_3
    //   122: invokeinterface 52 1 0
    //   127: aload 4
    //   129: athrow
    //   130: astore 4
    //   132: aload 11
    //   134: astore_3
    //   135: goto -18 -> 117
    //   138: astore 7
    //   140: aload 6
    //   142: astore_3
    //   143: aload 7
    //   145: astore 4
    //   147: goto -30 -> 117
    //   150: astore 12
    //   152: aload 11
    //   154: astore 6
    //   156: goto -81 -> 75
    //
    // Exception table:
    //   from	to	target	type
    //   2	42	70	android/database/sqlite/SQLiteException
    //   2	42	115	finally
    //   42	51	130	finally
    //   75	97	138	finally
    //   42	51	150	android/database/sqlite/SQLiteException
  }

  public SQLiteDatabase getWritableDatabase()
  {
    if ((this.Bf) && (3600000L + this.Bg > cb.a(this.apO).currentTimeMillis()))
      throw new SQLiteException("Database creation failed");
    Object localObject = null;
    this.Bf = true;
    this.Bg = cb.a(this.apO).currentTimeMillis();
    try
    {
      SQLiteDatabase localSQLiteDatabase = super.getWritableDatabase();
      localObject = localSQLiteDatabase;
      if (localObject == null)
        localObject = super.getWritableDatabase();
      this.Bf = false;
      return localObject;
    }
    catch (SQLiteException localSQLiteException)
    {
      while (true)
        cb.c(this.apO).getDatabasePath(cb.b(this.apO)).delete();
    }
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    ak.ag(paramSQLiteDatabase.getPath());
  }

  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor;
    if (Build.VERSION.SDK_INT < 15)
      localCursor = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
    while (true)
    {
      try
      {
        localCursor.moveToFirst();
        localCursor.close();
        if (!a("gtm_hits", paramSQLiteDatabase))
        {
          paramSQLiteDatabase.execSQL(cb.oG());
          return;
        }
      }
      finally
      {
        localCursor.close();
      }
      a(paramSQLiteDatabase);
    }
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.cb.b
 * JD-Core Version:    0.6.0
 */