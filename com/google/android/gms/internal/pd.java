package com.google.android.gms.internal;

public class pd
{
  private final byte[] awl = new byte[256];
  private int awm;
  private int awn;

  public pd(byte[] paramArrayOfByte)
  {
    for (int i = 0; i < 256; i++)
      this.awl[i] = (byte)i;
    int j = 0;
    for (int k = 0; k < 256; k++)
    {
      j = 0xFF & j + this.awl[k] + paramArrayOfByte[(k % paramArrayOfByte.length)];
      int m = this.awl[k];
      this.awl[k] = this.awl[j];
      this.awl[j] = m;
    }
    this.awm = 0;
    this.awn = 0;
  }

  public void o(byte[] paramArrayOfByte)
  {
    int i = this.awm;
    int j = this.awn;
    for (int k = 0; k < paramArrayOfByte.length; k++)
    {
      i = 0xFF & i + 1;
      j = 0xFF & j + this.awl[i];
      int m = this.awl[i];
      this.awl[i] = this.awl[j];
      this.awl[j] = m;
      paramArrayOfByte[k] = (byte)(paramArrayOfByte[k] ^ this.awl[(0xFF & this.awl[i] + this.awl[j])]);
    }
    this.awm = i;
    this.awn = j;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pd
 * JD-Core Version:    0.6.0
 */