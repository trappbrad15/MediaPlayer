package org.apache.http.client.methods;

import java.net.URI;
import org.apache.http.HttpRequest;

public abstract interface HttpUriRequest extends HttpRequest
{
  public abstract String getMethod();

  public abstract URI getURI();

  public abstract void abort()
    throws UnsupportedOperationException;

  public abstract boolean isAborted();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.client.methods.HttpUriRequest
 * JD-Core Version:    0.6.2
 */