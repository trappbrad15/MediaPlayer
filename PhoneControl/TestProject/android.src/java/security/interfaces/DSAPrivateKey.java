package java.security.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

public abstract interface DSAPrivateKey extends DSAKey, PrivateKey
{
  public static final long serialVersionUID = 7776497482533790279L;

  public abstract BigInteger getX();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.interfaces.DSAPrivateKey
 * JD-Core Version:    0.6.2
 */