package com.google.android.gms.internal;

import java.io.IOException;

public class pl extends IOException
{
  public pl(String paramString)
  {
    super(paramString);
  }

  static pl qA()
  {
    return new pl("CodedInputStream encountered a malformed varint.");
  }

  static pl qB()
  {
    return new pl("Protocol message contained an invalid tag (zero).");
  }

  static pl qC()
  {
    return new pl("Protocol message end-group tag did not match expected tag.");
  }

  static pl qD()
  {
    return new pl("Protocol message tag had invalid wire type.");
  }

  static pl qE()
  {
    return new pl("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
  }

  static pl qy()
  {
    return new pl("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
  }

  static pl qz()
  {
    return new pl("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pl
 * JD-Core Version:    0.6.0
 */