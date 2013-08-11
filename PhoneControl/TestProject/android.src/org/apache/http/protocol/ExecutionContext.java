package org.apache.http.protocol;

public abstract interface ExecutionContext
{
  public static final String HTTP_CONNECTION = "http.connection";
  public static final String HTTP_REQUEST = "http.request";
  public static final String HTTP_RESPONSE = "http.response";
  public static final String HTTP_TARGET_HOST = "http.target_host";
  public static final String HTTP_PROXY_HOST = "http.proxy_host";
  public static final String HTTP_REQ_SENT = "http.request_sent";
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.protocol.ExecutionContext
 * JD-Core Version:    0.6.2
 */