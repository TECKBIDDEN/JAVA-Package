package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

public abstract interface IGamesCallbacks extends IInterface
{
  public abstract void A(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void B(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void C(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void D(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void E(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void F(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void G(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void H(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void I(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void J(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void K(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void L(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void M(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void N(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void O(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void P(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void Q(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void a(int paramInt, String paramString, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(DataHolder paramDataHolder1, DataHolder paramDataHolder2)
    throws RemoteException;

  public abstract void a(DataHolder paramDataHolder, Contents paramContents)
    throws RemoteException;

  public abstract void a(DataHolder paramDataHolder, String paramString, Contents paramContents1, Contents paramContents2, Contents paramContents3)
    throws RemoteException;

  public abstract void a(DataHolder paramDataHolder, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void b(int paramInt1, int paramInt2, String paramString)
    throws RemoteException;

  public abstract void b(int paramInt, Bundle paramBundle)
    throws RemoteException;

  public abstract void b(DataHolder paramDataHolder, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void c(int paramInt, Bundle paramBundle)
    throws RemoteException;

  public abstract void c(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void c(DataHolder paramDataHolder, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void d(int paramInt, Bundle paramBundle)
    throws RemoteException;

  public abstract void d(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void d(DataHolder paramDataHolder, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void dx(int paramInt)
    throws RemoteException;

  public abstract void dy(int paramInt)
    throws RemoteException;

  public abstract void dz(int paramInt)
    throws RemoteException;

  public abstract void e(int paramInt, Bundle paramBundle)
    throws RemoteException;

  public abstract void e(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void e(DataHolder paramDataHolder, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void f(int paramInt, Bundle paramBundle)
    throws RemoteException;

  public abstract void f(int paramInt, String paramString)
    throws RemoteException;

  public abstract void f(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void f(DataHolder paramDataHolder, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void fq()
    throws RemoteException;

  public abstract void g(int paramInt, String paramString)
    throws RemoteException;

  public abstract void g(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void h(int paramInt, String paramString)
    throws RemoteException;

  public abstract void h(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void i(int paramInt, String paramString)
    throws RemoteException;

  public abstract void i(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void j(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void k(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void l(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void m(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void n(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void o(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void onInvitationRemoved(String paramString)
    throws RemoteException;

  public abstract void onLeftRoom(int paramInt, String paramString)
    throws RemoteException;

  public abstract void onP2PConnected(String paramString)
    throws RemoteException;

  public abstract void onP2PDisconnected(String paramString)
    throws RemoteException;

  public abstract void onRealTimeMessageReceived(RealTimeMessage paramRealTimeMessage)
    throws RemoteException;

  public abstract void onRequestRemoved(String paramString)
    throws RemoteException;

  public abstract void onTurnBasedMatchRemoved(String paramString)
    throws RemoteException;

  public abstract void p(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void q(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void r(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void s(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void t(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void u(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void v(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void w(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void x(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void y(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void z(DataHolder paramDataHolder)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.IGamesCallbacks
 * JD-Core Version:    0.6.0
 */