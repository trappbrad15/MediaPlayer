package java.security.cert;

public abstract interface CertPathBuilderResult extends Cloneable
{
  public abstract Object clone();

  public abstract CertPath getCertPath();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.cert.CertPathBuilderResult
 * JD-Core Version:    0.6.2
 */