package org.xml.sax.ext;

import org.xml.sax.SAXException;

public abstract interface LexicalHandler
{
  public abstract void startDTD(String paramString1, String paramString2, String paramString3)
    throws SAXException;

  public abstract void endDTD()
    throws SAXException;

  public abstract void startEntity(String paramString)
    throws SAXException;

  public abstract void endEntity(String paramString)
    throws SAXException;

  public abstract void startCDATA()
    throws SAXException;

  public abstract void endCDATA()
    throws SAXException;

  public abstract void comment(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws SAXException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.xml.sax.ext.LexicalHandler
 * JD-Core Version:    0.6.2
 */