package java.security.interfaces;

import java.math.BigInteger;

public abstract interface DSAParams
{
  public abstract BigInteger getG();

  public abstract BigInteger getP();

  public abstract BigInteger getQ();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.interfaces.DSAParams
 * JD-Core Version:    0.6.2
 */