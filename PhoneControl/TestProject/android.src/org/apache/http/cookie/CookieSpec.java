package org.apache.http.cookie;

import java.util.List;
import org.apache.http.Header;

public abstract interface CookieSpec
{
  public abstract int getVersion();

  public abstract List<Cookie> parse(Header paramHeader, CookieOrigin paramCookieOrigin)
    throws MalformedCookieException;

  public abstract void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
    throws MalformedCookieException;

  public abstract boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin);

  public abstract List<Header> formatCookies(List<Cookie> paramList);

  public abstract Header getVersionHeader();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.cookie.CookieSpec
 * JD-Core Version:    0.6.2
 */