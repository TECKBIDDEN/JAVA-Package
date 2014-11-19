package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.kc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager
{
  private static final Object Kl = new Object();
  private static HashSet<Uri> Km = new HashSet();
  private static ImageManager Kn;
  private static ImageManager Ko;
  private final ExecutorService Kp;
  private final ImageManager.b Kq;
  private final iz Kr;
  private final Map<a, ImageReceiver> Ks;
  private final Map<Uri, ImageReceiver> Kt;
  private final Map<Uri, Long> Ku;
  private final Context mContext;
  private final Handler mHandler;

  private ImageManager(Context paramContext, boolean paramBoolean)
  {
    this.mContext = paramContext.getApplicationContext();
    this.mHandler = new Handler(Looper.getMainLooper());
    this.Kp = Executors.newFixedThreadPool(4);
    if (paramBoolean)
    {
      this.Kq = new ImageManager.b(this.mContext);
      if (kc.hE())
        gH();
    }
    while (true)
    {
      this.Kr = new iz();
      this.Ks = new HashMap();
      this.Kt = new HashMap();
      this.Ku = new HashMap();
      return;
      this.Kq = null;
    }
  }

  private Bitmap a(a.a parama)
  {
    if (this.Kq == null);
    for (Bitmap localBitmap = null; ; localBitmap = (Bitmap)this.Kq.get(parama))
      return localBitmap;
  }

  public static ImageManager c(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean)
      if (Ko == null)
        Ko = new ImageManager(paramContext, true);
    for (ImageManager localImageManager = Ko; ; localImageManager = Kn)
    {
      return localImageManager;
      if (Kn != null)
        continue;
      Kn = new ImageManager(paramContext, false);
    }
  }

  public static ImageManager create(Context paramContext)
  {
    return c(paramContext, false);
  }

  private void gH()
  {
    this.mContext.registerComponentCallbacks(new e(this.Kq));
  }

  public void a(a parama)
  {
    com.google.android.gms.common.internal.a.aT("ImageManager.loadImage() must be called in the main thread");
    new d(parama).run();
  }

  public void loadImage(ImageView paramImageView, int paramInt)
  {
    a(new a.b(paramImageView, paramInt));
  }

  public void loadImage(ImageView paramImageView, Uri paramUri)
  {
    a(new a.b(paramImageView, paramUri));
  }

  public void loadImage(ImageView paramImageView, Uri paramUri, int paramInt)
  {
    a.b localb = new a.b(paramImageView, paramUri);
    localb.aw(paramInt);
    a(localb);
  }

  public void loadImage(OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri)
  {
    a(new a.c(paramOnImageLoadedListener, paramUri));
  }

  public void loadImage(OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri, int paramInt)
  {
    a.c localc = new a.c(paramOnImageLoadedListener, paramUri);
    localc.aw(paramInt);
    a(localc);
  }

  private final class ImageReceiver extends ResultReceiver
  {
    private final ArrayList<a> Kv;
    private final Uri mUri;

    ImageReceiver(Uri arg2)
    {
      super();
      Object localObject;
      this.mUri = localObject;
      this.Kv = new ArrayList();
    }

    public void b(a parama)
    {
      com.google.android.gms.common.internal.a.aT("ImageReceiver.addImageRequest() must be called in the main thread");
      this.Kv.add(parama);
    }

    public void c(a parama)
    {
      com.google.android.gms.common.internal.a.aT("ImageReceiver.removeImageRequest() must be called in the main thread");
      this.Kv.remove(parama);
    }

    public void gK()
    {
      Intent localIntent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
      localIntent.putExtra("com.google.android.gms.extras.uri", this.mUri);
      localIntent.putExtra("com.google.android.gms.extras.resultReceiver", this);
      localIntent.putExtra("com.google.android.gms.extras.priority", 3);
      ImageManager.b(ImageManager.this).sendBroadcast(localIntent);
    }

    public void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      ParcelFileDescriptor localParcelFileDescriptor = (ParcelFileDescriptor)paramBundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
      ImageManager.f(ImageManager.this).execute(new ImageManager.c(ImageManager.this, this.mUri, localParcelFileDescriptor));
    }
  }

  public static abstract interface OnImageLoadedListener
  {
    public abstract void onImageLoaded(Uri paramUri, Drawable paramDrawable, boolean paramBoolean);
  }

  private static final class a
  {
    static int a(ActivityManager paramActivityManager)
    {
      return paramActivityManager.getLargeMemoryClass();
    }
  }

  private final class c
    implements Runnable
  {
    private final ParcelFileDescriptor Kx;
    private final Uri mUri;

    public c(Uri paramParcelFileDescriptor, ParcelFileDescriptor arg3)
    {
      this.mUri = paramParcelFileDescriptor;
      Object localObject;
      this.Kx = localObject;
    }

    public void run()
    {
      com.google.android.gms.common.internal.a.aU("LoadBitmapFromDiskRunnable can't be executed in the main thread");
      boolean bool = false;
      Object localObject = null;
      if (this.Kx != null);
      try
      {
        Bitmap localBitmap = BitmapFactory.decodeFileDescriptor(this.Kx.getFileDescriptor());
        localObject = localBitmap;
      }
      catch (IOException localIOException)
      {
        try
        {
          this.Kx.close();
          localCountDownLatch = new CountDownLatch(1);
          ImageManager.g(ImageManager.this).post(new ImageManager.f(ImageManager.this, this.mUri, localObject, bool, localCountDownLatch));
        }
        catch (IOException localIOException)
        {
          try
          {
            while (true)
            {
              CountDownLatch localCountDownLatch;
              localCountDownLatch.await();
              return;
              localOutOfMemoryError = localOutOfMemoryError;
              Log.e("ImageManager", "OOM while loading bitmap for uri: " + this.mUri, localOutOfMemoryError);
              bool = true;
            }
            localIOException = localIOException;
            Log.e("ImageManager", "closed failed", localIOException);
          }
          catch (InterruptedException localInterruptedException)
          {
            while (true)
              Log.w("ImageManager", "Latch interrupted while posting " + this.mUri);
          }
        }
      }
    }
  }

  private final class d
    implements Runnable
  {
    private final a Ky;

    public d(a arg2)
    {
      Object localObject;
      this.Ky = localObject;
    }

    public void run()
    {
      com.google.android.gms.common.internal.a.aT("LoadImageRunnable must be executed on the main thread");
      ImageManager.ImageReceiver localImageReceiver1 = (ImageManager.ImageReceiver)ImageManager.a(ImageManager.this).get(this.Ky);
      if (localImageReceiver1 != null)
      {
        ImageManager.a(ImageManager.this).remove(this.Ky);
        localImageReceiver1.c(this.Ky);
      }
      a.a locala = this.Ky.KA;
      if (locala.uri == null)
        this.Ky.a(ImageManager.b(ImageManager.this), ImageManager.c(ImageManager.this), true);
      while (true)
      {
        return;
        Bitmap localBitmap = ImageManager.a(ImageManager.this, locala);
        if (localBitmap != null)
        {
          this.Ky.a(ImageManager.b(ImageManager.this), localBitmap, true);
          continue;
        }
        Long localLong = (Long)ImageManager.d(ImageManager.this).get(locala.uri);
        if (localLong != null)
        {
          if (SystemClock.elapsedRealtime() - localLong.longValue() < 3600000L)
          {
            this.Ky.a(ImageManager.b(ImageManager.this), ImageManager.c(ImageManager.this), true);
            continue;
          }
          ImageManager.d(ImageManager.this).remove(locala.uri);
        }
        this.Ky.a(ImageManager.b(ImageManager.this), ImageManager.c(ImageManager.this));
        ImageManager.ImageReceiver localImageReceiver2 = (ImageManager.ImageReceiver)ImageManager.e(ImageManager.this).get(locala.uri);
        if (localImageReceiver2 == null)
        {
          localImageReceiver2 = new ImageManager.ImageReceiver(ImageManager.this, locala.uri);
          ImageManager.e(ImageManager.this).put(locala.uri, localImageReceiver2);
        }
        localImageReceiver2.b(this.Ky);
        if (!(this.Ky instanceof a.c))
          ImageManager.a(ImageManager.this).put(this.Ky, localImageReceiver2);
        synchronized (ImageManager.gI())
        {
          if (!ImageManager.gJ().contains(locala.uri))
          {
            ImageManager.gJ().add(locala.uri);
            localImageReceiver2.gK();
          }
        }
      }
    }
  }

  private static final class e
    implements ComponentCallbacks2
  {
    private final ImageManager.b Kq;

    public e(ImageManager.b paramb)
    {
      this.Kq = paramb;
    }

    public void onConfigurationChanged(Configuration paramConfiguration)
    {
    }

    public void onLowMemory()
    {
      this.Kq.evictAll();
    }

    public void onTrimMemory(int paramInt)
    {
      if (paramInt >= 60)
        this.Kq.evictAll();
      while (true)
      {
        return;
        if (paramInt >= 20)
        {
          this.Kq.trimToSize(this.Kq.size() / 2);
          continue;
        }
      }
    }
  }

  private final class f
    implements Runnable
  {
    private boolean Kz;
    private final Bitmap mBitmap;
    private final Uri mUri;
    private final CountDownLatch mg;

    public f(Uri paramBitmap, Bitmap paramBoolean, boolean paramCountDownLatch, CountDownLatch arg5)
    {
      this.mUri = paramBitmap;
      this.mBitmap = paramBoolean;
      this.Kz = paramCountDownLatch;
      Object localObject;
      this.mg = localObject;
    }

    private void a(ImageManager.ImageReceiver paramImageReceiver, boolean paramBoolean)
    {
      ArrayList localArrayList = ImageManager.ImageReceiver.a(paramImageReceiver);
      int i = localArrayList.size();
      int j = 0;
      if (j < i)
      {
        a locala = (a)localArrayList.get(j);
        if (paramBoolean)
          locala.a(ImageManager.b(ImageManager.this), this.mBitmap, false);
        while (true)
        {
          if (!(locala instanceof a.c))
            ImageManager.a(ImageManager.this).remove(locala);
          j++;
          break;
          ImageManager.d(ImageManager.this).put(this.mUri, Long.valueOf(SystemClock.elapsedRealtime()));
          locala.a(ImageManager.b(ImageManager.this), ImageManager.c(ImageManager.this), false);
        }
      }
    }

    public void run()
    {
      com.google.android.gms.common.internal.a.aT("OnBitmapLoadedRunnable must be executed in the main thread");
      boolean bool;
      if (this.mBitmap != null)
      {
        bool = true;
        if (ImageManager.h(ImageManager.this) == null)
          break label97;
        if (!this.Kz)
          break label67;
        ImageManager.h(ImageManager.this).evictAll();
        System.gc();
        this.Kz = false;
        ImageManager.g(ImageManager.this).post(this);
      }
      while (true)
      {
        return;
        bool = false;
        break;
        label67: if (bool)
          ImageManager.h(ImageManager.this).put(new a.a(this.mUri), this.mBitmap);
        label97: ImageManager.ImageReceiver localImageReceiver = (ImageManager.ImageReceiver)ImageManager.e(ImageManager.this).remove(this.mUri);
        if (localImageReceiver != null)
          a(localImageReceiver, bool);
        this.mg.countDown();
        synchronized (ImageManager.gI())
        {
          ImageManager.gJ().remove(this.mUri);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager
 * JD-Core Version:    0.6.0
 */