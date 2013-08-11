package org.apache.http;

public abstract interface HttpEntityEnclosingRequest extends HttpRequest
{
  public abstract boolean expectContinue();

  public abstract void setEntity(HttpEntity paramHttpEntity);

  public abstract HttpEntity getEntity();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.HttpEntityEnclosingRequest
 * JD-Core Version:    0.6.2
 */