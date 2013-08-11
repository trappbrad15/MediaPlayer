package javax.net.ssl;

import java.util.Enumeration;

public abstract interface SSLSessionContext
{
  public abstract Enumeration<byte[]> getIds();

  public abstract SSLSession getSession(byte[] paramArrayOfByte);

  public abstract int getSessionCacheSize();

  public abstract int getSessionTimeout();

  public abstract void setSessionCacheSize(int paramInt)
    throws IllegalArgumentException;

  public abstract void setSessionTimeout(int paramInt)
    throws IllegalArgumentException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.net.ssl.SSLSessionContext
 * JD-Core Version:    0.6.2
 */