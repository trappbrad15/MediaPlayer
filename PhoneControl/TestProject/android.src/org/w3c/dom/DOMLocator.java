package org.w3c.dom;

public abstract interface DOMLocator
{
  public abstract int getLineNumber();

  public abstract int getColumnNumber();

  public abstract int getByteOffset();

  public abstract int getUtf16Offset();

  public abstract Node getRelatedNode();

  public abstract String getUri();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.w3c.dom.DOMLocator
 * JD-Core Version:    0.6.2
 */