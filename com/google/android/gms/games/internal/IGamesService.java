package com.google.android.gms.games.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

public abstract interface IGamesService extends IInterface
{
  public abstract void N(boolean paramBoolean)
    throws RemoteException;

  public abstract void O(boolean paramBoolean)
    throws RemoteException;

  public abstract void P(boolean paramBoolean)
    throws RemoteException;

  public abstract int a(IGamesCallbacks paramIGamesCallbacks, byte[] paramArrayOfByte, String paramString1, String paramString2)
    throws RemoteException;

  public abstract Intent a(int paramInt1, int paramInt2, boolean paramBoolean)
    throws RemoteException;

  public abstract Intent a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, String paramString)
    throws RemoteException;

  public abstract Intent a(AchievementEntity paramAchievementEntity)
    throws RemoteException;

  public abstract Intent a(ZInvitationCluster paramZInvitationCluster, String paramString1, String paramString2)
    throws RemoteException;

  public abstract Intent a(GameRequestCluster paramGameRequestCluster, String paramString)
    throws RemoteException;

  public abstract Intent a(RoomEntity paramRoomEntity, int paramInt)
    throws RemoteException;

  public abstract Intent a(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
    throws RemoteException;

  public abstract Intent a(ParticipantEntity[] paramArrayOfParticipantEntity, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2)
    throws RemoteException;

  public abstract void a(long paramLong, String paramString)
    throws RemoteException;

  public abstract void a(IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;

  public abstract void a(Contents paramContents)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, int paramInt)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, int paramInt1, int paramInt2, int paramInt3)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, int paramInt1, int paramInt2, String[] paramArrayOfString, Bundle paramBundle)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, int paramInt, int[] paramArrayOfInt)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, long paramLong)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, long paramLong, String paramString)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, Bundle paramBundle, int paramInt1, int paramInt2)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, IBinder paramIBinder, int paramInt, String[] paramArrayOfString, Bundle paramBundle, boolean paramBoolean, long paramLong)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, IBinder paramIBinder, String paramString, boolean paramBoolean, long paramLong)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, int[] paramArrayOfInt)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, long paramLong)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString1, long paramLong, String paramString2)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, SnapshotMetadataChange paramSnapshotMetadataChange, Contents paramContents)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int paramInt1, int paramInt2)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, SnapshotMetadataChange paramSnapshotMetadataChange, Contents paramContents)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, String[] paramArrayOfString, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString1, byte[] paramArrayOfByte, String paramString2, ParticipantResult[] paramArrayOfParticipantResult)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, byte[] paramArrayOfByte, ParticipantResult[] paramArrayOfParticipantResult)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, int[] paramArrayOfInt)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String paramString, String[] paramArrayOfString, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean, Bundle paramBundle)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, int[] paramArrayOfInt)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void a(IGamesCallbacks paramIGamesCallbacks, String[] paramArrayOfString, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(String paramString, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;

  public abstract int b(byte[] paramArrayOfByte, String paramString, String[] paramArrayOfString)
    throws RemoteException;

  public abstract Intent b(int paramInt1, int paramInt2, boolean paramBoolean)
    throws RemoteException;

  public abstract Intent b(int[] paramArrayOfInt)
    throws RemoteException;

  public abstract void b(long paramLong, String paramString)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, long paramLong)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, long paramLong, String paramString)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, String paramString, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, String paramString, boolean paramBoolean)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean)
    throws RemoteException;

  public abstract void b(IGamesCallbacks paramIGamesCallbacks, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void b(String paramString1, String paramString2, int paramInt)
    throws RemoteException;

  public abstract String bB(String paramString)
    throws RemoteException;

  public abstract String bC(String paramString)
    throws RemoteException;

  public abstract void bD(String paramString)
    throws RemoteException;

  public abstract int bE(String paramString)
    throws RemoteException;

  public abstract Uri bF(String paramString)
    throws RemoteException;

  public abstract void bG(String paramString)
    throws RemoteException;

  public abstract ParcelFileDescriptor bH(String paramString)
    throws RemoteException;

  public abstract Intent bu(String paramString)
    throws RemoteException;

  public abstract Intent bz(String paramString)
    throws RemoteException;

  public abstract void c(long paramLong, String paramString)
    throws RemoteException;

  public abstract void c(IGamesCallbacks paramIGamesCallbacks)
    throws RemoteException;

  public abstract void c(IGamesCallbacks paramIGamesCallbacks, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void c(IGamesCallbacks paramIGamesCallbacks, long paramLong)
    throws RemoteException;

  public abstract void c(IGamesCallbacks paramIGamesCallbacks, long paramLong, String paramString)
    throws RemoteException;

  public abstract void c(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void c(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt)
    throws RemoteException;

  public abstract void c(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void c(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2)
    throws RemoteException;

  public abstract void c(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException;

  public abstract void c(IGamesCallbacks paramIGamesCallbacks, String paramString, boolean paramBoolean)
    throws RemoteException;

  public abstract void c(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean)
    throws RemoteException;

  public abstract void c(IGamesCallbacks paramIGamesCallbacks, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void c(String paramString1, String paramString2, int paramInt)
    throws RemoteException;

  public abstract void d(long paramLong, String paramString)
    throws RemoteException;

  public abstract void d(IGamesCallbacks paramIGamesCallbacks)
    throws RemoteException;

  public abstract void d(IGamesCallbacks paramIGamesCallbacks, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void d(IGamesCallbacks paramIGamesCallbacks, long paramLong)
    throws RemoteException;

  public abstract void d(IGamesCallbacks paramIGamesCallbacks, long paramLong, String paramString)
    throws RemoteException;

  public abstract void d(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void d(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void d(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2)
    throws RemoteException;

  public abstract void d(IGamesCallbacks paramIGamesCallbacks, String paramString, boolean paramBoolean)
    throws RemoteException;

  public abstract void d(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean)
    throws RemoteException;

  public abstract void dC(int paramInt)
    throws RemoteException;

  public abstract void e(IGamesCallbacks paramIGamesCallbacks)
    throws RemoteException;

  public abstract void e(IGamesCallbacks paramIGamesCallbacks, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void e(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void e(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void e(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2)
    throws RemoteException;

  public abstract void e(IGamesCallbacks paramIGamesCallbacks, String paramString, boolean paramBoolean)
    throws RemoteException;

  public abstract void e(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean)
    throws RemoteException;

  public abstract void f(IGamesCallbacks paramIGamesCallbacks)
    throws RemoteException;

  public abstract void f(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void f(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public abstract void f(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2)
    throws RemoteException;

  public abstract void f(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean)
    throws RemoteException;

  public abstract Bundle fD()
    throws RemoteException;

  public abstract void g(IGamesCallbacks paramIGamesCallbacks)
    throws RemoteException;

  public abstract void g(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void g(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean)
    throws RemoteException;

  public abstract ParcelFileDescriptor h(Uri paramUri)
    throws RemoteException;

  public abstract RoomEntity h(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void h(IGamesCallbacks paramIGamesCallbacks)
    throws RemoteException;

  public abstract void h(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean)
    throws RemoteException;

  public abstract void i(IGamesCallbacks paramIGamesCallbacks)
    throws RemoteException;

  public abstract void i(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void j(IGamesCallbacks paramIGamesCallbacks)
    throws RemoteException;

  public abstract void j(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract String jX()
    throws RemoteException;

  public abstract String jY()
    throws RemoteException;

  public abstract void k(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract Intent kA()
    throws RemoteException;

  public abstract void kB()
    throws RemoteException;

  public abstract boolean kC()
    throws RemoteException;

  public abstract Intent kb()
    throws RemoteException;

  public abstract Intent kc()
    throws RemoteException;

  public abstract Intent kd()
    throws RemoteException;

  public abstract Intent ke()
    throws RemoteException;

  public abstract Intent kj()
    throws RemoteException;

  public abstract Intent kk()
    throws RemoteException;

  public abstract int kl()
    throws RemoteException;

  public abstract String km()
    throws RemoteException;

  public abstract int kn()
    throws RemoteException;

  public abstract Intent ko()
    throws RemoteException;

  public abstract int kp()
    throws RemoteException;

  public abstract int kq()
    throws RemoteException;

  public abstract int kr()
    throws RemoteException;

  public abstract int ks()
    throws RemoteException;

  public abstract void ku()
    throws RemoteException;

  public abstract DataHolder kw()
    throws RemoteException;

  public abstract boolean kx()
    throws RemoteException;

  public abstract DataHolder ky()
    throws RemoteException;

  public abstract void kz()
    throws RemoteException;

  public abstract void l(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void m(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void n(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void n(String paramString, int paramInt)
    throws RemoteException;

  public abstract void o(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void o(String paramString, int paramInt)
    throws RemoteException;

  public abstract void p(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void p(String paramString, int paramInt)
    throws RemoteException;

  public abstract void q(long paramLong)
    throws RemoteException;

  public abstract void q(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void r(long paramLong)
    throws RemoteException;

  public abstract void r(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void r(String paramString, int paramInt)
    throws RemoteException;

  public abstract void s(long paramLong)
    throws RemoteException;

  public abstract void s(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void s(String paramString, int paramInt)
    throws RemoteException;

  public abstract void t(long paramLong)
    throws RemoteException;

  public abstract void t(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void u(long paramLong)
    throws RemoteException;

  public abstract void u(IGamesCallbacks paramIGamesCallbacks, String paramString)
    throws RemoteException;

  public abstract void u(String paramString1, String paramString2)
    throws RemoteException;

  public abstract void v(String paramString1, String paramString2)
    throws RemoteException;
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.IGamesService
 * JD-Core Version:    0.6.0
 */