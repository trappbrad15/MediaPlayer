package org.apache.http.protocol;

public abstract interface HttpContext
{
  public static final String RESERVED_PREFIX = "http.";

  public abstract Object getAttribute(String paramString);

  public abstract void setAttribute(String paramString, Object paramObject);

  public abstract Object removeAttribute(String paramString);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.protocol.HttpContext
 * JD-Core Version:    0.6.2
 */