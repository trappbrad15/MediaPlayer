package java.security.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

public abstract interface RSAPrivateKey extends PrivateKey, RSAKey
{
  public static final long serialVersionUID = 5187144804936595022L;

  public abstract BigInteger getPrivateExponent();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.interfaces.RSAPrivateKey
 * JD-Core Version:    0.6.2
 */