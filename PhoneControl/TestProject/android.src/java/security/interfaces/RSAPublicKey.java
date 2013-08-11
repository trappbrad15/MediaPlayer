package java.security.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

public abstract interface RSAPublicKey extends PublicKey, RSAKey
{
  public static final long serialVersionUID = -8727434096241101194L;

  public abstract BigInteger getPublicExponent();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.interfaces.RSAPublicKey
 * JD-Core Version:    0.6.2
 */