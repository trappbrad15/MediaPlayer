package org.apache.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract interface HttpEntity
{
  public abstract boolean isRepeatable();

  public abstract boolean isChunked();

  public abstract long getContentLength();

  public abstract Header getContentType();

  public abstract Header getContentEncoding();

  public abstract InputStream getContent()
    throws IOException, IllegalStateException;

  public abstract void writeTo(OutputStream paramOutputStream)
    throws IOException;

  public abstract boolean isStreaming();

  public abstract void consumeContent()
    throws IOException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.HttpEntity
 * JD-Core Version:    0.6.2
 */