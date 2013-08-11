package org.w3c.dom;

public abstract interface NamedNodeMap
{
  public abstract Node getNamedItem(String paramString);

  public abstract Node setNamedItem(Node paramNode)
    throws DOMException;

  public abstract Node removeNamedItem(String paramString)
    throws DOMException;

  public abstract Node item(int paramInt);

  public abstract int getLength();

  public abstract Node getNamedItemNS(String paramString1, String paramString2)
    throws DOMException;

  public abstract Node setNamedItemNS(Node paramNode)
    throws DOMException;

  public abstract Node removeNamedItemNS(String paramString1, String paramString2)
    throws DOMException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.w3c.dom.NamedNodeMap
 * JD-Core Version:    0.6.2
 */