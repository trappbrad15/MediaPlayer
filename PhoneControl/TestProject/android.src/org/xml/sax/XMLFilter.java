package org.xml.sax;

public abstract interface XMLFilter extends XMLReader
{
  public abstract void setParent(XMLReader paramXMLReader);

  public abstract XMLReader getParent();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.xml.sax.XMLFilter
 * JD-Core Version:    0.6.2
 */