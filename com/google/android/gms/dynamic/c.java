package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

public abstract interface c extends IInterface
{
  public abstract void d(d paramd)
    throws RemoteException;

  public abstract void e(d paramd)
    throws RemoteException;

  public abstract Bundle getArguments()
    throws RemoteException;

  public abstract int getId()
    throws RemoteException;

  public abstract boolean getRetainInstance()
    throws RemoteException;

  public abstract String getTag()
    throws RemoteException;

  public abstract int getTargetRequestCode()
    throws RemoteException;

  public abstract boolean getUserVisibleHint()
    throws RemoteException;

  public abstract d getView()
    throws RemoteException;

  public abstract boolean isAdded()
    throws RemoteException;

  public abstract boolean isDetached()
    throws RemoteException;

  public abstract boolean isHidden()
    throws RemoteException;

  public abstract boolean isInLayout()
    throws RemoteException;

  public abstract boolean isRemoving()
    throws RemoteException;

  public abstract boolean isResumed()
    throws RemoteException;

  public abstract boolean isVisible()
    throws RemoteException;

  public abstract d iu()
    throws RemoteException;

  public abstract c iv()
    throws RemoteException;

  public abstract d iw()
    throws RemoteException;

  public abstract c ix()
    throws RemoteException;

  public abstract void setHasOptionsMenu(boolean paramBoolean)
    throws RemoteException;

  public abstract void setMenuVisibility(boolean paramBoolean)
    throws RemoteException;

  public abstract void setRetainInstance(boolean paramBoolean)
    throws RemoteException;

  public abstract void setUserVisibleHint(boolean paramBoolean)
    throws RemoteException;

  public abstract void startActivity(Intent paramIntent)
    throws RemoteException;

  public abstract void startActivityForResult(Intent paramIntent, int paramInt)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.c
 * JD-Core Version:    0.6.0
 */