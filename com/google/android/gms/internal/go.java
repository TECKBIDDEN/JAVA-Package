package com.google.android.gms.internal;

import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@ez
public class go
{
  public static final a<Void> wy = new go.1();

  public <T> Future<T> a(String paramString, a<T> parama)
  {
    return gi.submit(new Callable(paramString, parama)
    {
      // ERROR //
      public T call()
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_1
        //   2: new 37	java/net/URL
        //   5: dup
        //   6: aload_0
        //   7: getfield 24	com/google/android/gms/internal/go$2:wz	Ljava/lang/String;
        //   10: invokespecial 40	java/net/URL:<init>	(Ljava/lang/String;)V
        //   13: invokevirtual 44	java/net/URL:openConnection	()Ljava/net/URLConnection;
        //   16: checkcast 46	java/net/HttpURLConnection
        //   19: astore 6
        //   21: aload 6
        //   23: invokevirtual 49	java/net/HttpURLConnection:connect	()V
        //   26: aload 6
        //   28: invokevirtual 53	java/net/HttpURLConnection:getResponseCode	()I
        //   31: istore 10
        //   33: iload 10
        //   35: sipush 200
        //   38: if_icmplt +44 -> 82
        //   41: iload 10
        //   43: sipush 299
        //   46: if_icmpgt +36 -> 82
        //   49: aload_0
        //   50: getfield 26	com/google/android/gms/internal/go$2:wA	Lcom/google/android/gms/internal/go$a;
        //   53: aload 6
        //   55: invokevirtual 57	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
        //   58: invokeinterface 63 2 0
        //   63: astore 11
        //   65: aload 6
        //   67: ifnull +8 -> 75
        //   70: aload 6
        //   72: invokevirtual 66	java/net/HttpURLConnection:disconnect	()V
        //   75: aload 11
        //   77: astore 4
        //   79: aload 4
        //   81: areturn
        //   82: aload 6
        //   84: ifnull +8 -> 92
        //   87: aload 6
        //   89: invokevirtual 66	java/net/HttpURLConnection:disconnect	()V
        //   92: aload_0
        //   93: getfield 26	com/google/android/gms/internal/go$2:wA	Lcom/google/android/gms/internal/go$a;
        //   96: invokeinterface 69 1 0
        //   101: astore 4
        //   103: goto -24 -> 79
        //   106: astore 5
        //   108: ldc 71
        //   110: aload 5
        //   112: invokestatic 77	com/google/android/gms/internal/gs:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   115: aload_1
        //   116: ifnull -24 -> 92
        //   119: aload_1
        //   120: invokevirtual 66	java/net/HttpURLConnection:disconnect	()V
        //   123: goto -31 -> 92
        //   126: astore_3
        //   127: ldc 71
        //   129: aload_3
        //   130: invokestatic 77	com/google/android/gms/internal/gs:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   133: aload_1
        //   134: ifnull -42 -> 92
        //   137: aload_1
        //   138: invokevirtual 66	java/net/HttpURLConnection:disconnect	()V
        //   141: goto -49 -> 92
        //   144: astore_2
        //   145: aload_1
        //   146: ifnull +7 -> 153
        //   149: aload_1
        //   150: invokevirtual 66	java/net/HttpURLConnection:disconnect	()V
        //   153: aload_2
        //   154: athrow
        //   155: astore 9
        //   157: aload 6
        //   159: astore_1
        //   160: aload 9
        //   162: astore_2
        //   163: goto -18 -> 145
        //   166: astore 8
        //   168: aload 6
        //   170: astore_1
        //   171: aload 8
        //   173: astore_3
        //   174: goto -47 -> 127
        //   177: astore 7
        //   179: aload 6
        //   181: astore_1
        //   182: aload 7
        //   184: astore 5
        //   186: goto -78 -> 108
        //
        // Exception table:
        //   from	to	target	type
        //   2	21	106	java/net/MalformedURLException
        //   2	21	126	java/io/IOException
        //   2	21	144	finally
        //   108	115	144	finally
        //   127	133	144	finally
        //   21	65	155	finally
        //   21	65	166	java/io/IOException
        //   21	65	177	java/net/MalformedURLException
      }
    });
  }

  public static abstract interface a<T>
  {
    public abstract T b(InputStream paramInputStream);

    public abstract T cK();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.go
 * JD-Core Version:    0.6.0
 */