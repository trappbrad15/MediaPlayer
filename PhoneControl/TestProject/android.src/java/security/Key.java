package java.security;

import java.io.Serializable;

public abstract interface Key extends Serializable
{
  public static final long serialVersionUID = 6603384152749567654L;

  public abstract String getAlgorithm();

  public abstract String getFormat();

  public abstract byte[] getEncoded();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.Key
 * JD-Core Version:    0.6.2
 */