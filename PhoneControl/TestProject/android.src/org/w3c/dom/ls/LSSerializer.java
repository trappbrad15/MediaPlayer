package org.w3c.dom.ls;

import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

public abstract interface LSSerializer
{
  public abstract DOMConfiguration getDomConfig();

  public abstract String getNewLine();

  public abstract void setNewLine(String paramString);

  public abstract boolean write(Node paramNode, LSOutput paramLSOutput)
    throws LSException;

  public abstract boolean writeToURI(Node paramNode, String paramString)
    throws LSException;

  public abstract String writeToString(Node paramNode)
    throws DOMException, LSException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.w3c.dom.ls.LSSerializer
 * JD-Core Version:    0.6.2
 */