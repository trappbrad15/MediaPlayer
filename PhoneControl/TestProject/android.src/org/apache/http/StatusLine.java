package org.apache.http;

public abstract interface StatusLine
{
  public abstract ProtocolVersion getProtocolVersion();

  public abstract int getStatusCode();

  public abstract String getReasonPhrase();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.StatusLine
 * JD-Core Version:    0.6.2
 */