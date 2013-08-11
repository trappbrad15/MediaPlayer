package javax.crypto.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

public abstract interface DHPublicKey extends DHKey, PublicKey
{
  public static final long serialVersionUID = -6628103563352519193L;

  public abstract BigInteger getY();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.crypto.interfaces.DHPublicKey
 * JD-Core Version:    0.6.2
 */