package org.apache.http;

public abstract interface Header
{
  public abstract String getName();

  public abstract String getValue();

  public abstract HeaderElement[] getElements()
    throws ParseException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.Header
 * JD-Core Version:    0.6.2
 */