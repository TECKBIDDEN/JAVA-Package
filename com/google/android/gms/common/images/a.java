package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.internal.iw;
import com.google.android.gms.internal.ix;
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.iz.a;

public abstract class a
{
  final a KA;
  protected int KB = 0;
  protected int KC = 0;
  protected ImageManager.OnImageLoadedListener KD;
  private boolean KE = true;
  private boolean KF = false;
  protected int KG;

  public a(Uri paramUri, int paramInt)
  {
    this.KA = new a(paramUri);
    this.KC = paramInt;
  }

  private Drawable a(Context paramContext, iz paramiz, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    Drawable localDrawable;
    if (this.KG > 0)
    {
      iz.a locala = new iz.a(paramInt, this.KG);
      localDrawable = (Drawable)paramiz.get(locala);
      if (localDrawable == null)
      {
        localDrawable = localResources.getDrawable(paramInt);
        if ((0x1 & this.KG) != 0)
          localDrawable = a(localResources, localDrawable);
        paramiz.put(locala, localDrawable);
      }
    }
    while (true)
    {
      return localDrawable;
      localDrawable = localResources.getDrawable(paramInt);
    }
  }

  protected Drawable a(Resources paramResources, Drawable paramDrawable)
  {
    return ix.a(paramResources, paramDrawable);
  }

  protected iw a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    if (paramDrawable1 != null)
      if (!(paramDrawable1 instanceof iw));
    for (paramDrawable1 = ((iw)paramDrawable1).gL(); ; paramDrawable1 = null)
      return new iw(paramDrawable1, paramDrawable2);
  }

  void a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    com.google.android.gms.common.internal.a.f(paramBitmap);
    if ((0x1 & this.KG) != 0)
      paramBitmap = ix.a(paramBitmap);
    BitmapDrawable localBitmapDrawable = new BitmapDrawable(paramContext.getResources(), paramBitmap);
    if (this.KD != null)
      this.KD.onImageLoaded(this.KA.uri, localBitmapDrawable, true);
    a(localBitmapDrawable, paramBoolean, false, true);
  }

  void a(Context paramContext, iz paramiz)
  {
    Drawable localDrawable = null;
    if (this.KB != 0)
      localDrawable = a(paramContext, paramiz, this.KB);
    a(localDrawable, false, true, false);
  }

  void a(Context paramContext, iz paramiz, boolean paramBoolean)
  {
    Drawable localDrawable = null;
    if (this.KC != 0)
      localDrawable = a(paramContext, paramiz, this.KC);
    if (this.KD != null)
      this.KD.onImageLoaded(this.KA.uri, localDrawable, false);
    a(localDrawable, paramBoolean, false, false);
  }

  protected abstract void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);

  public void aw(int paramInt)
  {
    this.KC = paramInt;
  }

  protected boolean b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((this.KE) && (!paramBoolean2) && ((!paramBoolean1) || (this.KF)));
    for (int i = 1; ; i = 0)
      return i;
  }

  static final class a
  {
    public final Uri uri;

    public a(Uri paramUri)
    {
      this.uri = paramUri;
    }

    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (!(paramObject instanceof a))
        bool = false;
      while (true)
      {
        return bool;
        if (this == paramObject)
        {
          bool = true;
          continue;
        }
        bool = m.equal(((a)paramObject).uri, this.uri);
      }
    }

    public int hashCode()
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.uri;
      return m.hashCode(arrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.a
 * JD-Core Version:    0.6.0
 */