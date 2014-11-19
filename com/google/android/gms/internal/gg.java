package com.google.android.gms.internal;

@ez
public abstract class gg
{
  private final Runnable mk = new gg.1(this);
  private volatile Thread wf;

  public final void cancel()
  {
    onStop();
    if (this.wf != null)
      this.wf.interrupt();
  }

  public abstract void cp();

  public abstract void onStop();

  public final void start()
  {
    gi.a(this.mk);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gg
 * JD-Core Version:    0.6.0
 */