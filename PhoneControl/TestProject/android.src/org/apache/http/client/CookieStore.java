package org.apache.http.client;

import java.util.Date;
import java.util.List;
import org.apache.http.cookie.Cookie;

public abstract interface CookieStore
{
  public abstract void addCookie(Cookie paramCookie);

  public abstract List<Cookie> getCookies();

  public abstract boolean clearExpired(Date paramDate);

  public abstract void clear();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.client.CookieStore
 * JD-Core Version:    0.6.2
 */