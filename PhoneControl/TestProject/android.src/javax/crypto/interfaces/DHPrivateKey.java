package javax.crypto.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

public abstract interface DHPrivateKey extends DHKey, PrivateKey
{
  public static final long serialVersionUID = 2211791113380396553L;

  public abstract BigInteger getX();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.crypto.interfaces.DHPrivateKey
 * JD-Core Version:    0.6.2
 */