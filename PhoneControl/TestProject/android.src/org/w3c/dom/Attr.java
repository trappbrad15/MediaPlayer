package org.w3c.dom;

public abstract interface Attr extends Node
{
  public abstract String getName();

  public abstract boolean getSpecified();

  public abstract String getValue();

  public abstract void setValue(String paramString)
    throws DOMException;

  public abstract Element getOwnerElement();

  public abstract TypeInfo getSchemaTypeInfo();

  public abstract boolean isId();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.w3c.dom.Attr
 * JD-Core Version:    0.6.2
 */