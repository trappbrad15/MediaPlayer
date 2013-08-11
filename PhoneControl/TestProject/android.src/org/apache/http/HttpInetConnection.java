package org.apache.http;

import java.net.InetAddress;

public abstract interface HttpInetConnection extends HttpConnection
{
  public abstract InetAddress getLocalAddress();

  public abstract int getLocalPort();

  public abstract InetAddress getRemoteAddress();

  public abstract int getRemotePort();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.HttpInetConnection
 * JD-Core Version:    0.6.2
 */