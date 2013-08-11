package java.security.interfaces;

import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;

public abstract interface RSAMultiPrimePrivateCrtKey extends RSAPrivateKey
{
  public static final long serialVersionUID = 618058533534628008L;

  public abstract BigInteger getCrtCoefficient();

  public abstract RSAOtherPrimeInfo[] getOtherPrimeInfo();

  public abstract BigInteger getPrimeP();

  public abstract BigInteger getPrimeQ();

  public abstract BigInteger getPrimeExponentP();

  public abstract BigInteger getPrimeExponentQ();

  public abstract BigInteger getPublicExponent();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.interfaces.RSAMultiPrimePrivateCrtKey
 * JD-Core Version:    0.6.2
 */