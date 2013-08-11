package org.apache.http.conn;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;

public abstract interface ClientConnectionManager
{
  public abstract SchemeRegistry getSchemeRegistry();

  public abstract ClientConnectionRequest requestConnection(HttpRoute paramHttpRoute, Object paramObject);

  public abstract void releaseConnection(ManagedClientConnection paramManagedClientConnection, long paramLong, TimeUnit paramTimeUnit);

  public abstract void closeIdleConnections(long paramLong, TimeUnit paramTimeUnit);

  public abstract void closeExpiredConnections();

  public abstract void shutdown();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.conn.ClientConnectionManager
 * JD-Core Version:    0.6.2
 */