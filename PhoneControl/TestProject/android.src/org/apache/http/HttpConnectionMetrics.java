package org.apache.http;

public abstract interface HttpConnectionMetrics
{
  public abstract long getRequestCount();

  public abstract long getResponseCount();

  public abstract long getSentBytesCount();

  public abstract long getReceivedBytesCount();

  public abstract Object getMetric(String paramString);

  public abstract void reset();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.HttpConnectionMetrics
 * JD-Core Version:    0.6.2
 */