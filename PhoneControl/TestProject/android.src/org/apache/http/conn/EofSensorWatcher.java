package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;

public abstract interface EofSensorWatcher
{
  public abstract boolean eofDetected(InputStream paramInputStream)
    throws IOException;

  public abstract boolean streamClosed(InputStream paramInputStream)
    throws IOException;

  public abstract boolean streamAbort(InputStream paramInputStream)
    throws IOException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.conn.EofSensorWatcher
 * JD-Core Version:    0.6.2
 */