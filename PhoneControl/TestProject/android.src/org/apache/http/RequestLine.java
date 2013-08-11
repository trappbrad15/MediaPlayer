package org.apache.http;

public abstract interface RequestLine
{
  public abstract String getMethod();

  public abstract ProtocolVersion getProtocolVersion();

  public abstract String getUri();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.RequestLine
 * JD-Core Version:    0.6.2
 */