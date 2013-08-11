package org.apache.http;

public abstract interface HeaderElement
{
  public abstract String getName();

  public abstract String getValue();

  public abstract NameValuePair[] getParameters();

  public abstract NameValuePair getParameterByName(String paramString);

  public abstract int getParameterCount();

  public abstract NameValuePair getParameter(int paramInt);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.HeaderElement
 * JD-Core Version:    0.6.2
 */