package org.apache.http.impl.conn.tsccm;

import java.lang.ref.Reference;

public abstract interface RefQueueHandler
{
  public abstract void handleReference(Reference<?> paramReference);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.conn.tsccm.RefQueueHandler
 * JD-Core Version:    0.6.2
 */