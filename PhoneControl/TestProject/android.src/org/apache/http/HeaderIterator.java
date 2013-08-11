package org.apache.http;

import java.util.Iterator;

public abstract interface HeaderIterator extends Iterator
{
  public abstract boolean hasNext();

  public abstract Header nextHeader();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.HeaderIterator
 * JD-Core Version:    0.6.2
 */