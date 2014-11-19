package com.google.android.gms.tagmanager;

import java.util.Arrays;

class v$b
{
  final String JH;
  final byte[] aoO;

  v$b(String paramString, byte[] paramArrayOfByte)
  {
    this.JH = paramString;
    this.aoO = paramArrayOfByte;
  }

  public String toString()
  {
    return "KeyAndSerialized: key = " + this.JH + " serialized hash = " + Arrays.hashCode(this.aoO);
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.v.b
 * JD-Core Version:    0.6.0
 */