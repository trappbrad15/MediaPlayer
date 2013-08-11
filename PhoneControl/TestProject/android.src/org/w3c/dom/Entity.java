package org.w3c.dom;

public abstract interface Entity extends Node
{
  public abstract String getPublicId();

  public abstract String getSystemId();

  public abstract String getNotationName();

  public abstract String getInputEncoding();

  public abstract String getXmlEncoding();

  public abstract String getXmlVersion();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.w3c.dom.Entity
 * JD-Core Version:    0.6.2
 */