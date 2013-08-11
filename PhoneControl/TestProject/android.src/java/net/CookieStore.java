package java.net;

import java.util.List;

public abstract interface CookieStore
{
  public abstract void add(URI paramURI, HttpCookie paramHttpCookie);

  public abstract List<HttpCookie> get(URI paramURI);

  public abstract List<HttpCookie> getCookies();

  public abstract List<URI> getURIs();

  public abstract boolean remove(URI paramURI, HttpCookie paramHttpCookie);

  public abstract boolean removeAll();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.CookieStore
 * JD-Core Version:    0.6.2
 */