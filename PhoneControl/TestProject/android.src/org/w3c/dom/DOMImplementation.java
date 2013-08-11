package org.w3c.dom;

public abstract interface DOMImplementation
{
  public abstract boolean hasFeature(String paramString1, String paramString2);

  public abstract DocumentType createDocumentType(String paramString1, String paramString2, String paramString3)
    throws DOMException;

  public abstract Document createDocument(String paramString1, String paramString2, DocumentType paramDocumentType)
    throws DOMException;

  public abstract Object getFeature(String paramString1, String paramString2);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.w3c.dom.DOMImplementation
 * JD-Core Version:    0.6.2
 */