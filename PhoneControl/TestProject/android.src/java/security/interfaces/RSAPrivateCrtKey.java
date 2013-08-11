package java.security.interfaces;

import java.math.BigInteger;

public abstract interface RSAPrivateCrtKey extends RSAPrivateKey
{
  public static final long serialVersionUID = -5682214253527700368L;

  public abstract BigInteger getCrtCoefficient();

  public abstract BigInteger getPrimeP();

  public abstract BigInteger getPrimeQ();

  public abstract BigInteger getPrimeExponentP();

  public abstract BigInteger getPrimeExponentQ();

  public abstract BigInteger getPublicExponent();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.interfaces.RSAPrivateCrtKey
 * JD-Core Version:    0.6.2
 */