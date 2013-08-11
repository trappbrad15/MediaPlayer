package java.security.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

public abstract interface ECPrivateKey extends PrivateKey, ECKey
{
  public static final long serialVersionUID = -7896394956925609184L;

  public abstract BigInteger getS();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.interfaces.ECPrivateKey
 * JD-Core Version:    0.6.2
 */