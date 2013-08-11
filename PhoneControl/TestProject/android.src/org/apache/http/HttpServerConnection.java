package org.apache.http;

import java.io.IOException;

public abstract interface HttpServerConnection extends HttpConnection
{
  public abstract HttpRequest receiveRequestHeader()
    throws HttpException, IOException;

  public abstract void receiveRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
    throws HttpException, IOException;

  public abstract void sendResponseHeader(HttpResponse paramHttpResponse)
    throws HttpException, IOException;

  public abstract void sendResponseEntity(HttpResponse paramHttpResponse)
    throws HttpException, IOException;

  public abstract void flush()
    throws IOException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.HttpServerConnection
 * JD-Core Version:    0.6.2
 */