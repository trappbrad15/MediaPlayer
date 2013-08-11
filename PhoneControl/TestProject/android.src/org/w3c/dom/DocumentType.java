package org.w3c.dom;

public abstract interface DocumentType extends Node
{
  public abstract String getName();

  public abstract NamedNodeMap getEntities();

  public abstract NamedNodeMap getNotations();

  public abstract String getPublicId();

  public abstract String getSystemId();

  public abstract String getInternalSubset();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.w3c.dom.DocumentType
 * JD-Core Version:    0.6.2
 */