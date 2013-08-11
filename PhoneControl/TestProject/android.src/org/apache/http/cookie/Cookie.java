package org.apache.http.cookie;

import java.util.Date;

public abstract interface Cookie
{
  public abstract String getName();

  public abstract String getValue();

  public abstract String getComment();

  public abstract String getCommentURL();

  public abstract Date getExpiryDate();

  public abstract boolean isPersistent();

  public abstract String getDomain();

  public abstract String getPath();

  public abstract int[] getPorts();

  public abstract boolean isSecure();

  public abstract int getVersion();

  public abstract boolean isExpired(Date paramDate);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.cookie.Cookie
 * JD-Core Version:    0.6.2
 */