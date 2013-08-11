package org.apache.http;

import org.apache.http.util.CharArrayBuffer;

public abstract interface FormattedHeader extends Header
{
  public abstract CharArrayBuffer getBuffer();

  public abstract int getValuePos();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.FormattedHeader
 * JD-Core Version:    0.6.2
 */