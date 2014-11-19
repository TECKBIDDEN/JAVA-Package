package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.c.j;

class co
  implements Runnable
{
  private final String anR;
  private volatile String aon;
  private final bn aqg;
  private final String aqh;
  private bg<c.j> aqi;
  private volatile r aqj;
  private volatile String aqk;
  private final Context mContext;

  co(Context paramContext, String paramString, bn parambn, r paramr)
  {
    this.mContext = paramContext;
    this.aqg = parambn;
    this.anR = paramString;
    this.aqj = paramr;
    this.aqh = ("/r?id=" + paramString);
    this.aon = this.aqh;
    this.aqk = null;
  }

  public co(Context paramContext, String paramString, r paramr)
  {
    this(paramContext, paramString, new bn(), paramr);
  }

  private boolean oK()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected()))
      bh.V("...no network connectivity");
    for (int i = 0; ; i = 1)
      return i;
  }

  // ERROR //
  private void oL()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 94	com/google/android/gms/tagmanager/co:oK	()Z
    //   4: ifne +16 -> 20
    //   7: aload_0
    //   8: getfield 96	com/google/android/gms/tagmanager/co:aqi	Lcom/google/android/gms/tagmanager/bg;
    //   11: getstatic 102	com/google/android/gms/tagmanager/bg$a:apB	Lcom/google/android/gms/tagmanager/bg$a;
    //   14: invokeinterface 108 2 0
    //   19: return
    //   20: ldc 110
    //   22: invokestatic 87	com/google/android/gms/tagmanager/bh:V	(Ljava/lang/String;)V
    //   25: aload_0
    //   26: invokevirtual 113	com/google/android/gms/tagmanager/co:oM	()Ljava/lang/String;
    //   29: astore_1
    //   30: aload_0
    //   31: getfield 29	com/google/android/gms/tagmanager/co:aqg	Lcom/google/android/gms/tagmanager/bn;
    //   34: invokevirtual 117	com/google/android/gms/tagmanager/bn:ov	()Lcom/google/android/gms/tagmanager/bm;
    //   37: astore_2
    //   38: aload_2
    //   39: aload_1
    //   40: invokeinterface 123 2 0
    //   45: astore 6
    //   47: new 125	java/io/ByteArrayOutputStream
    //   50: dup
    //   51: invokespecial 126	java/io/ByteArrayOutputStream:<init>	()V
    //   54: astore 7
    //   56: aload 6
    //   58: aload 7
    //   60: invokestatic 132	com/google/android/gms/tagmanager/cr:b	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   63: aload 7
    //   65: invokevirtual 136	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   68: invokestatic 141	com/google/android/gms/internal/c$j:b	([B)Lcom/google/android/gms/internal/c$j;
    //   71: astore 9
    //   73: new 35	java/lang/StringBuilder
    //   76: dup
    //   77: invokespecial 36	java/lang/StringBuilder:<init>	()V
    //   80: ldc 143
    //   82: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: aload 9
    //   87: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: invokestatic 87	com/google/android/gms/tagmanager/bh:V	(Ljava/lang/String;)V
    //   96: aload 9
    //   98: getfield 150	com/google/android/gms/internal/c$j:gs	Lcom/google/android/gms/internal/c$f;
    //   101: ifnonnull +37 -> 138
    //   104: aload 9
    //   106: getfield 154	com/google/android/gms/internal/c$j:gr	[Lcom/google/android/gms/internal/c$i;
    //   109: arraylength
    //   110: ifne +28 -> 138
    //   113: new 35	java/lang/StringBuilder
    //   116: dup
    //   117: invokespecial 36	java/lang/StringBuilder:<init>	()V
    //   120: ldc 156
    //   122: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: aload_0
    //   126: getfield 31	com/google/android/gms/tagmanager/co:anR	Ljava/lang/String;
    //   129: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: invokestatic 87	com/google/android/gms/tagmanager/bh:V	(Ljava/lang/String;)V
    //   138: aload_0
    //   139: getfield 96	com/google/android/gms/tagmanager/co:aqi	Lcom/google/android/gms/tagmanager/bg;
    //   142: aload 9
    //   144: invokeinterface 160 2 0
    //   149: aload_2
    //   150: invokeinterface 163 1 0
    //   155: ldc 165
    //   157: invokestatic 87	com/google/android/gms/tagmanager/bh:V	(Ljava/lang/String;)V
    //   160: goto -141 -> 19
    //   163: astore 5
    //   165: new 35	java/lang/StringBuilder
    //   168: dup
    //   169: invokespecial 36	java/lang/StringBuilder:<init>	()V
    //   172: ldc 167
    //   174: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: aload_1
    //   178: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: ldc 169
    //   183: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: aload_0
    //   187: getfield 31	com/google/android/gms/tagmanager/co:anR	Ljava/lang/String;
    //   190: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: ldc 171
    //   195: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   201: invokestatic 174	com/google/android/gms/tagmanager/bh:W	(Ljava/lang/String;)V
    //   204: aload_0
    //   205: getfield 96	com/google/android/gms/tagmanager/co:aqi	Lcom/google/android/gms/tagmanager/bg;
    //   208: getstatic 177	com/google/android/gms/tagmanager/bg$a:apD	Lcom/google/android/gms/tagmanager/bg$a;
    //   211: invokeinterface 108 2 0
    //   216: aload_2
    //   217: invokeinterface 163 1 0
    //   222: goto -203 -> 19
    //   225: astore 4
    //   227: new 35	java/lang/StringBuilder
    //   230: dup
    //   231: invokespecial 36	java/lang/StringBuilder:<init>	()V
    //   234: ldc 179
    //   236: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: aload_1
    //   240: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: ldc 181
    //   245: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: aload 4
    //   250: invokevirtual 184	java/io/IOException:getMessage	()Ljava/lang/String;
    //   253: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   259: aload 4
    //   261: invokestatic 188	com/google/android/gms/tagmanager/bh:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   264: aload_0
    //   265: getfield 96	com/google/android/gms/tagmanager/co:aqi	Lcom/google/android/gms/tagmanager/bg;
    //   268: getstatic 191	com/google/android/gms/tagmanager/bg$a:apC	Lcom/google/android/gms/tagmanager/bg$a;
    //   271: invokeinterface 108 2 0
    //   276: aload_2
    //   277: invokeinterface 163 1 0
    //   282: goto -263 -> 19
    //   285: astore 8
    //   287: new 35	java/lang/StringBuilder
    //   290: dup
    //   291: invokespecial 36	java/lang/StringBuilder:<init>	()V
    //   294: ldc 193
    //   296: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: aload_1
    //   300: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: ldc 181
    //   305: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: aload 8
    //   310: invokevirtual 184	java/io/IOException:getMessage	()Ljava/lang/String;
    //   313: invokevirtual 42	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   319: aload 8
    //   321: invokestatic 188	com/google/android/gms/tagmanager/bh:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   324: aload_0
    //   325: getfield 96	com/google/android/gms/tagmanager/co:aqi	Lcom/google/android/gms/tagmanager/bg;
    //   328: getstatic 177	com/google/android/gms/tagmanager/bg$a:apD	Lcom/google/android/gms/tagmanager/bg$a;
    //   331: invokeinterface 108 2 0
    //   336: aload_2
    //   337: invokeinterface 163 1 0
    //   342: goto -323 -> 19
    //   345: astore_3
    //   346: aload_2
    //   347: invokeinterface 163 1 0
    //   352: aload_3
    //   353: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   38	47	163	java/io/FileNotFoundException
    //   38	47	225	java/io/IOException
    //   47	149	285	java/io/IOException
    //   38	47	345	finally
    //   47	149	345	finally
    //   165	216	345	finally
    //   227	276	345	finally
    //   287	336	345	finally
  }

  void a(bg<c.j> parambg)
  {
    this.aqi = parambg;
  }

  void cG(String paramString)
  {
    bh.S("Setting previous container version: " + paramString);
    this.aqk = paramString;
  }

  void cr(String paramString)
  {
    if (paramString == null);
    for (this.aon = this.aqh; ; this.aon = paramString)
    {
      return;
      bh.S("Setting CTFE URL path: " + paramString);
    }
  }

  String oM()
  {
    String str = this.aqj.ob() + this.aon + "&v=a65833898";
    if ((this.aqk != null) && (!this.aqk.trim().equals("")))
      str = str + "&pv=" + this.aqk;
    if (ce.oH().oI().equals(ce.a.apY))
      str = str + "&gtm_debug=x";
    return str;
  }

  public void run()
  {
    if (this.aqi == null)
      throw new IllegalStateException("callback must be set before execute");
    this.aqi.nZ();
    oL();
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.co
 * JD-Core Version:    0.6.0
 */