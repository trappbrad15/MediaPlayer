package java.security.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

public abstract interface DSAPublicKey extends DSAKey, PublicKey
{
  public static final long serialVersionUID = 1234526332779022332L;

  public abstract BigInteger getY();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.interfaces.DSAPublicKey
 * JD-Core Version:    0.6.2
 */