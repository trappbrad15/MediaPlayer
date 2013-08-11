package org.w3c.dom;

public abstract interface DOMError
{
  public static final short SEVERITY_WARNING = 1;
  public static final short SEVERITY_ERROR = 2;
  public static final short SEVERITY_FATAL_ERROR = 3;

  public abstract short getSeverity();

  public abstract String getMessage();

  public abstract String getType();

  public abstract Object getRelatedException();

  public abstract Object getRelatedData();

  public abstract DOMLocator getLocation();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.w3c.dom.DOMError
 * JD-Core Version:    0.6.2
 */