package org.w3c.dom.ls;

import org.w3c.dom.DOMException;

public abstract interface DOMImplementationLS
{
  public static final short MODE_SYNCHRONOUS = 1;
  public static final short MODE_ASYNCHRONOUS = 2;

  public abstract LSParser createLSParser(short paramShort, String paramString)
    throws DOMException;

  public abstract LSSerializer createLSSerializer();

  public abstract LSInput createLSInput();

  public abstract LSOutput createLSOutput();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.w3c.dom.ls.DOMImplementationLS
 * JD-Core Version:    0.6.2
 */