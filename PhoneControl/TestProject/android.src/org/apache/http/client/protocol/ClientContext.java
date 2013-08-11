package org.apache.http.client.protocol;

public abstract interface ClientContext
{
  public static final String COOKIESPEC_REGISTRY = "http.cookiespec-registry";
  public static final String AUTHSCHEME_REGISTRY = "http.authscheme-registry";
  public static final String COOKIE_STORE = "http.cookie-store";
  public static final String COOKIE_SPEC = "http.cookie-spec";
  public static final String COOKIE_ORIGIN = "http.cookie-origin";
  public static final String CREDS_PROVIDER = "http.auth.credentials-provider";
  public static final String TARGET_AUTH_STATE = "http.auth.target-scope";
  public static final String PROXY_AUTH_STATE = "http.auth.proxy-scope";
  public static final String AUTH_SCHEME_PREF = "http.auth.scheme-pref";
  public static final String USER_TOKEN = "http.user-token";
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.client.protocol.ClientContext
 * JD-Core Version:    0.6.2
 */