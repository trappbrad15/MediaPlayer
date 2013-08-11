package org.apache.http.cookie;

import org.apache.http.params.HttpParams;

public abstract interface CookieSpecFactory
{
  public abstract CookieSpec newInstance(HttpParams paramHttpParams);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.cookie.CookieSpecFactory
 * JD-Core Version:    0.6.2
 */