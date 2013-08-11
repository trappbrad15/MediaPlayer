package org.apache.http.cookie;

import java.util.Date;

public abstract interface SetCookie extends Cookie
{
  public abstract void setValue(String paramString);

  public abstract void setComment(String paramString);

  public abstract void setExpiryDate(Date paramDate);

  public abstract void setDomain(String paramString);

  public abstract void setPath(String paramString);

  public abstract void setSecure(boolean paramBoolean);

  public abstract void setVersion(int paramInt);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.cookie.SetCookie
 * JD-Core Version:    0.6.2
 */