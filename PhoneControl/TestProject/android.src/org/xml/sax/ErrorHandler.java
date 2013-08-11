package org.xml.sax;

public abstract interface ErrorHandler
{
  public abstract void warning(SAXParseException paramSAXParseException)
    throws SAXException;

  public abstract void error(SAXParseException paramSAXParseException)
    throws SAXException;

  public abstract void fatalError(SAXParseException paramSAXParseException)
    throws SAXException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.xml.sax.ErrorHandler
 * JD-Core Version:    0.6.2
 */