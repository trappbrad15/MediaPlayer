package org.w3c.dom;

public abstract interface ProcessingInstruction extends Node
{
  public abstract String getTarget();

  public abstract String getData();

  public abstract void setData(String paramString)
    throws DOMException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.w3c.dom.ProcessingInstruction
 * JD-Core Version:    0.6.2
 */