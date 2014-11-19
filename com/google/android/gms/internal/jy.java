package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class jy
{
  public static long a(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean)
    throws IOException
  {
    return a(paramInputStream, paramOutputStream, paramBoolean, 1024);
  }

  public static long a(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean, int paramInt)
    throws IOException
  {
    byte[] arrayOfByte = new byte[paramInt];
    long l = 0L;
    try
    {
      int i = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length);
      if (i != -1)
      {
        l += i;
        paramOutputStream.write(arrayOfByte, 0, i);
      }
    }
    finally
    {
      if (paramBoolean)
      {
        b(paramInputStream);
        b(paramOutputStream);
      }
    }
    return l;
  }

  public static void a(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    if (paramParcelFileDescriptor != null);
    try
    {
      paramParcelFileDescriptor.close();
      label8: return;
    }
    catch (IOException localIOException)
    {
      break label8;
    }
  }

  public static byte[] a(InputStream paramInputStream, boolean paramBoolean)
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    a(paramInputStream, localByteArrayOutputStream, paramBoolean);
    return localByteArrayOutputStream.toByteArray();
  }

  public static void b(Closeable paramCloseable)
  {
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      label10: return;
    }
    catch (IOException localIOException)
    {
      break label10;
    }
  }

  public static byte[] d(InputStream paramInputStream)
    throws IOException
  {
    return a(paramInputStream, true);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jy
 * JD-Core Version:    0.6.0
 */