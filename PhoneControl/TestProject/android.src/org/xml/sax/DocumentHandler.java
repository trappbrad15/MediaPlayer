package org.xml.sax;

@Deprecated
public abstract interface DocumentHandler
{
  public abstract void setDocumentLocator(Locator paramLocator);

  public abstract void startDocument()
    throws SAXException;

  public abstract void endDocument()
    throws SAXException;

  public abstract void startElement(String paramString, AttributeList paramAttributeList)
    throws SAXException;

  public abstract void endElement(String paramString)
    throws SAXException;

  public abstract void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws SAXException;

  public abstract void ignorableWhitespace(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws SAXException;

  public abstract void processingInstruction(String paramString1, String paramString2)
    throws SAXException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.xml.sax.DocumentHandler
 * JD-Core Version:    0.6.2
 */