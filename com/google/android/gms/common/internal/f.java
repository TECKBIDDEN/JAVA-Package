package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.HashSet;

public final class f
  implements Handler.Callback
{
  private static final Object LK = new Object();
  private static f LL;
  private final HashMap<String, a> LM = new HashMap();
  private final Context mD;
  private final Handler mHandler = new Handler(paramContext.getMainLooper(), this);

  private f(Context paramContext)
  {
    this.mD = paramContext.getApplicationContext();
  }

  public static f J(Context paramContext)
  {
    synchronized (LK)
    {
      if (LL == null)
        LL = new f(paramContext.getApplicationContext());
      return LL;
    }
  }

  // ERROR //
  public boolean a(String paramString, d<?>.f paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 46	com/google/android/gms/common/internal/f:LM	Ljava/util/HashMap;
    //   4: astore_3
    //   5: aload_3
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 46	com/google/android/gms/common/internal/f:LM	Ljava/util/HashMap;
    //   11: aload_1
    //   12: invokevirtual 64	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   15: checkcast 8	com/google/android/gms/common/internal/f$a
    //   18: astore 5
    //   20: aload 5
    //   22: ifnonnull +80 -> 102
    //   25: new 8	com/google/android/gms/common/internal/f$a
    //   28: dup
    //   29: aload_0
    //   30: aload_1
    //   31: invokespecial 67	com/google/android/gms/common/internal/f$a:<init>	(Lcom/google/android/gms/common/internal/f;Ljava/lang/String;)V
    //   34: astore 5
    //   36: aload 5
    //   38: aload_2
    //   39: invokevirtual 70	com/google/android/gms/common/internal/f$a:a	(Lcom/google/android/gms/common/internal/d$f;)V
    //   42: new 72	android/content/Intent
    //   45: dup
    //   46: aload_1
    //   47: invokespecial 75	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   50: ldc 77
    //   52: invokevirtual 81	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   55: astore 6
    //   57: aload 5
    //   59: aload_0
    //   60: getfield 52	com/google/android/gms/common/internal/f:mD	Landroid/content/Context;
    //   63: aload 6
    //   65: aload 5
    //   67: invokevirtual 85	com/google/android/gms/common/internal/f$a:gW	()Lcom/google/android/gms/common/internal/f$a$a;
    //   70: sipush 129
    //   73: invokevirtual 89	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   76: invokevirtual 92	com/google/android/gms/common/internal/f$a:J	(Z)V
    //   79: aload_0
    //   80: getfield 46	com/google/android/gms/common/internal/f:LM	Ljava/util/HashMap;
    //   83: aload_1
    //   84: aload 5
    //   86: invokevirtual 96	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   89: pop
    //   90: aload 5
    //   92: invokevirtual 100	com/google/android/gms/common/internal/f$a:isBound	()Z
    //   95: istore 8
    //   97: aload_3
    //   98: monitorexit
    //   99: iload 8
    //   101: ireturn
    //   102: aload_0
    //   103: getfield 41	com/google/android/gms/common/internal/f:mHandler	Landroid/os/Handler;
    //   106: iconst_0
    //   107: aload 5
    //   109: invokevirtual 104	android/os/Handler:removeMessages	(ILjava/lang/Object;)V
    //   112: aload 5
    //   114: aload_2
    //   115: invokevirtual 108	com/google/android/gms/common/internal/f$a:c	(Lcom/google/android/gms/common/internal/d$f;)Z
    //   118: ifeq +37 -> 155
    //   121: new 110	java/lang/IllegalStateException
    //   124: dup
    //   125: new 112	java/lang/StringBuilder
    //   128: dup
    //   129: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   132: ldc 115
    //   134: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: aload_1
    //   138: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: invokespecial 124	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   147: athrow
    //   148: astore 4
    //   150: aload_3
    //   151: monitorexit
    //   152: aload 4
    //   154: athrow
    //   155: aload 5
    //   157: aload_2
    //   158: invokevirtual 70	com/google/android/gms/common/internal/f$a:a	(Lcom/google/android/gms/common/internal/d$f;)V
    //   161: aload 5
    //   163: invokevirtual 128	com/google/android/gms/common/internal/f$a:getState	()I
    //   166: tableswitch	default:+79 -> 245, 1:+22->188, 2:+39->205
    //   189: aload 5
    //   191: invokevirtual 132	com/google/android/gms/common/internal/f$a:getComponentName	()Landroid/content/ComponentName;
    //   194: aload 5
    //   196: invokevirtual 136	com/google/android/gms/common/internal/f$a:getBinder	()Landroid/os/IBinder;
    //   199: invokevirtual 142	com/google/android/gms/common/internal/d$f:onServiceConnected	(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    //   202: goto -112 -> 90
    //   205: new 72	android/content/Intent
    //   208: dup
    //   209: aload_1
    //   210: invokespecial 75	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   213: ldc 77
    //   215: invokevirtual 81	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   218: astore 9
    //   220: aload 5
    //   222: aload_0
    //   223: getfield 52	com/google/android/gms/common/internal/f:mD	Landroid/content/Context;
    //   226: aload 9
    //   228: aload 5
    //   230: invokevirtual 85	com/google/android/gms/common/internal/f$a:gW	()Lcom/google/android/gms/common/internal/f$a$a;
    //   233: sipush 129
    //   236: invokevirtual 89	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   239: invokevirtual 92	com/google/android/gms/common/internal/f$a:J	(Z)V
    //   242: goto -152 -> 90
    //   245: goto -155 -> 90
    //
    // Exception table:
    //   from	to	target	type
    //   7	152	148	finally
    //   155	242	148	finally
  }

  // ERROR //
  public void b(String paramString, d<?>.f paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 46	com/google/android/gms/common/internal/f:LM	Ljava/util/HashMap;
    //   4: astore_3
    //   5: aload_3
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 46	com/google/android/gms/common/internal/f:LM	Ljava/util/HashMap;
    //   11: aload_1
    //   12: invokevirtual 64	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   15: checkcast 8	com/google/android/gms/common/internal/f$a
    //   18: astore 5
    //   20: aload 5
    //   22: ifnonnull +37 -> 59
    //   25: new 110	java/lang/IllegalStateException
    //   28: dup
    //   29: new 112	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   36: ldc 146
    //   38: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_1
    //   42: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokespecial 124	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   51: athrow
    //   52: astore 4
    //   54: aload_3
    //   55: monitorexit
    //   56: aload 4
    //   58: athrow
    //   59: aload 5
    //   61: aload_2
    //   62: invokevirtual 108	com/google/android/gms/common/internal/f$a:c	(Lcom/google/android/gms/common/internal/d$f;)Z
    //   65: ifne +30 -> 95
    //   68: new 110	java/lang/IllegalStateException
    //   71: dup
    //   72: new 112	java/lang/StringBuilder
    //   75: dup
    //   76: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   79: ldc 148
    //   81: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: aload_1
    //   85: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   91: invokespecial 124	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   94: athrow
    //   95: aload 5
    //   97: aload_2
    //   98: invokevirtual 150	com/google/android/gms/common/internal/f$a:b	(Lcom/google/android/gms/common/internal/d$f;)V
    //   101: aload 5
    //   103: invokevirtual 153	com/google/android/gms/common/internal/f$a:gY	()Z
    //   106: ifeq +28 -> 134
    //   109: aload_0
    //   110: getfield 41	com/google/android/gms/common/internal/f:mHandler	Landroid/os/Handler;
    //   113: iconst_0
    //   114: aload 5
    //   116: invokevirtual 157	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   119: astore 6
    //   121: aload_0
    //   122: getfield 41	com/google/android/gms/common/internal/f:mHandler	Landroid/os/Handler;
    //   125: aload 6
    //   127: ldc2_w 158
    //   130: invokevirtual 163	android/os/Handler:sendMessageDelayed	(Landroid/os/Message;J)Z
    //   133: pop
    //   134: aload_3
    //   135: monitorexit
    //   136: return
    //
    // Exception table:
    //   from	to	target	type
    //   7	56	52	finally
    //   59	136	52	finally
  }

  public boolean handleMessage(Message paramMessage)
  {
    int i;
    switch (paramMessage.what)
    {
    default:
      i = 0;
    case 0:
    }
    while (true)
    {
      return i;
      a locala = (a)paramMessage.obj;
      synchronized (this.LM)
      {
        if (locala.gY())
        {
          this.mD.unbindService(locala.gW());
          this.LM.remove(locala.gX());
        }
        i = 1;
      }
    }
  }

  final class a
  {
    private final String LN;
    private final a LO;
    private final HashSet<d<?>.f> LP;
    private boolean LQ;
    private IBinder LR;
    private ComponentName LS;
    private int mState;

    public a(String arg2)
    {
      Object localObject;
      this.LN = localObject;
      this.LO = new a();
      this.LP = new HashSet();
      this.mState = 0;
    }

    public void J(boolean paramBoolean)
    {
      this.LQ = paramBoolean;
    }

    public void a(d<?>.f paramd)
    {
      this.LP.add(paramd);
    }

    public void b(d<?>.f paramd)
    {
      this.LP.remove(paramd);
    }

    public boolean c(d<?>.f paramd)
    {
      return this.LP.contains(paramd);
    }

    public a gW()
    {
      return this.LO;
    }

    public String gX()
    {
      return this.LN;
    }

    public boolean gY()
    {
      return this.LP.isEmpty();
    }

    public IBinder getBinder()
    {
      return this.LR;
    }

    public ComponentName getComponentName()
    {
      return this.LS;
    }

    public int getState()
    {
      return this.mState;
    }

    public boolean isBound()
    {
      return this.LQ;
    }

    public class a
      implements ServiceConnection
    {
      public a()
      {
      }

      // ERROR //
      public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 15	com/google/android/gms/common/internal/f$a$a:LU	Lcom/google/android/gms/common/internal/f$a;
        //   4: getfield 24	com/google/android/gms/common/internal/f$a:LT	Lcom/google/android/gms/common/internal/f;
        //   7: invokestatic 29	com/google/android/gms/common/internal/f:a	(Lcom/google/android/gms/common/internal/f;)Ljava/util/HashMap;
        //   10: astore_3
        //   11: aload_3
        //   12: monitorenter
        //   13: aload_0
        //   14: getfield 15	com/google/android/gms/common/internal/f$a$a:LU	Lcom/google/android/gms/common/internal/f$a;
        //   17: aload_2
        //   18: invokestatic 32	com/google/android/gms/common/internal/f$a:a	(Lcom/google/android/gms/common/internal/f$a;Landroid/os/IBinder;)Landroid/os/IBinder;
        //   21: pop
        //   22: aload_0
        //   23: getfield 15	com/google/android/gms/common/internal/f$a$a:LU	Lcom/google/android/gms/common/internal/f$a;
        //   26: aload_1
        //   27: invokestatic 35	com/google/android/gms/common/internal/f$a:a	(Lcom/google/android/gms/common/internal/f$a;Landroid/content/ComponentName;)Landroid/content/ComponentName;
        //   30: pop
        //   31: aload_0
        //   32: getfield 15	com/google/android/gms/common/internal/f$a$a:LU	Lcom/google/android/gms/common/internal/f$a;
        //   35: invokestatic 38	com/google/android/gms/common/internal/f$a:a	(Lcom/google/android/gms/common/internal/f$a;)Ljava/util/HashSet;
        //   38: invokevirtual 44	java/util/HashSet:iterator	()Ljava/util/Iterator;
        //   41: astore 7
        //   43: aload 7
        //   45: invokeinterface 50 1 0
        //   50: ifeq +28 -> 78
        //   53: aload 7
        //   55: invokeinterface 54 1 0
        //   60: checkcast 56	com/google/android/gms/common/internal/d$f
        //   63: aload_1
        //   64: aload_2
        //   65: invokevirtual 58	com/google/android/gms/common/internal/d$f:onServiceConnected	(Landroid/content/ComponentName;Landroid/os/IBinder;)V
        //   68: goto -25 -> 43
        //   71: astore 4
        //   73: aload_3
        //   74: monitorexit
        //   75: aload 4
        //   77: athrow
        //   78: aload_0
        //   79: getfield 15	com/google/android/gms/common/internal/f$a$a:LU	Lcom/google/android/gms/common/internal/f$a;
        //   82: iconst_1
        //   83: invokestatic 61	com/google/android/gms/common/internal/f$a:a	(Lcom/google/android/gms/common/internal/f$a;I)I
        //   86: pop
        //   87: aload_3
        //   88: monitorexit
        //   89: return
        //
        // Exception table:
        //   from	to	target	type
        //   13	75	71	finally
        //   78	89	71	finally
      }

      // ERROR //
      public void onServiceDisconnected(ComponentName paramComponentName)
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 15	com/google/android/gms/common/internal/f$a$a:LU	Lcom/google/android/gms/common/internal/f$a;
        //   4: getfield 24	com/google/android/gms/common/internal/f$a:LT	Lcom/google/android/gms/common/internal/f;
        //   7: invokestatic 29	com/google/android/gms/common/internal/f:a	(Lcom/google/android/gms/common/internal/f;)Ljava/util/HashMap;
        //   10: astore_2
        //   11: aload_2
        //   12: monitorenter
        //   13: aload_0
        //   14: getfield 15	com/google/android/gms/common/internal/f$a$a:LU	Lcom/google/android/gms/common/internal/f$a;
        //   17: aconst_null
        //   18: invokestatic 32	com/google/android/gms/common/internal/f$a:a	(Lcom/google/android/gms/common/internal/f$a;Landroid/os/IBinder;)Landroid/os/IBinder;
        //   21: pop
        //   22: aload_0
        //   23: getfield 15	com/google/android/gms/common/internal/f$a$a:LU	Lcom/google/android/gms/common/internal/f$a;
        //   26: aload_1
        //   27: invokestatic 35	com/google/android/gms/common/internal/f$a:a	(Lcom/google/android/gms/common/internal/f$a;Landroid/content/ComponentName;)Landroid/content/ComponentName;
        //   30: pop
        //   31: aload_0
        //   32: getfield 15	com/google/android/gms/common/internal/f$a$a:LU	Lcom/google/android/gms/common/internal/f$a;
        //   35: invokestatic 38	com/google/android/gms/common/internal/f$a:a	(Lcom/google/android/gms/common/internal/f$a;)Ljava/util/HashSet;
        //   38: invokevirtual 44	java/util/HashSet:iterator	()Ljava/util/Iterator;
        //   41: astore 6
        //   43: aload 6
        //   45: invokeinterface 50 1 0
        //   50: ifeq +25 -> 75
        //   53: aload 6
        //   55: invokeinterface 54 1 0
        //   60: checkcast 56	com/google/android/gms/common/internal/d$f
        //   63: aload_1
        //   64: invokevirtual 65	com/google/android/gms/common/internal/d$f:onServiceDisconnected	(Landroid/content/ComponentName;)V
        //   67: goto -24 -> 43
        //   70: astore_3
        //   71: aload_2
        //   72: monitorexit
        //   73: aload_3
        //   74: athrow
        //   75: aload_0
        //   76: getfield 15	com/google/android/gms/common/internal/f$a$a:LU	Lcom/google/android/gms/common/internal/f$a;
        //   79: iconst_2
        //   80: invokestatic 61	com/google/android/gms/common/internal/f$a:a	(Lcom/google/android/gms/common/internal/f$a;I)I
        //   83: pop
        //   84: aload_2
        //   85: monitorexit
        //   86: return
        //
        // Exception table:
        //   from	to	target	type
        //   13	73	70	finally
        //   75	86	70	finally
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.f
 * JD-Core Version:    0.6.0
 */