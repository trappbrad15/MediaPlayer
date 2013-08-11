package org.w3c.dom;

public abstract interface DOMConfiguration
{
  public abstract void setParameter(String paramString, Object paramObject)
    throws DOMException;

  public abstract Object getParameter(String paramString)
    throws DOMException;

  public abstract boolean canSetParameter(String paramString, Object paramObject);

  public abstract DOMStringList getParameterNames();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.w3c.dom.DOMConfiguration
 * JD-Core Version:    0.6.2
 */