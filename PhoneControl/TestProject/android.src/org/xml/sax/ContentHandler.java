package org.xml.sax;

public abstract interface ContentHandler
{
  public abstract void setDocumentLocator(Locator paramLocator);

  public abstract void startDocument()
    throws SAXException;

  public abstract void endDocument()
    throws SAXException;

  public abstract void startPrefixMapping(String paramString1, String paramString2)
    throws SAXException;

  public abstract void endPrefixMapping(String paramString)
    throws SAXException;

  public abstract void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
    throws SAXException;

  public abstract void endElement(String paramString1, String paramString2, String paramString3)
    throws SAXException;

  public abstract void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws SAXException;

  public abstract void ignorableWhitespace(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws SAXException;

  public abstract void processingInstruction(String paramString1, String paramString2)
    throws SAXException;

  public abstract void skippedEntity(String paramString)
    throws SAXException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.xml.sax.ContentHandler
 * JD-Core Version:    0.6.2
 */