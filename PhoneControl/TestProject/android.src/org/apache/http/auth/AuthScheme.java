package org.apache.http.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;

public abstract interface AuthScheme
{
  public abstract void processChallenge(Header paramHeader)
    throws MalformedChallengeException;

  public abstract String getSchemeName();

  public abstract String getParameter(String paramString);

  public abstract String getRealm();

  public abstract boolean isConnectionBased();

  public abstract boolean isComplete();

  public abstract Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest)
    throws AuthenticationException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.auth.AuthScheme
 * JD-Core Version:    0.6.2
 */