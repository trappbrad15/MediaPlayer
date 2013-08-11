package java.security;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
public abstract interface Certificate
{
  public abstract void decode(InputStream paramInputStream)
    throws KeyException, IOException;

  public abstract void encode(OutputStream paramOutputStream)
    throws KeyException, IOException;

  public abstract String getFormat();

  public abstract Principal getGuarantor();

  public abstract Principal getPrincipal();

  public abstract PublicKey getPublicKey();

  public abstract String toString(boolean paramBoolean);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.Certificate
 * JD-Core Version:    0.6.2
 */