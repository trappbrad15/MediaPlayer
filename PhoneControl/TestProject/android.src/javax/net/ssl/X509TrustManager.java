package javax.net.ssl;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public abstract interface X509TrustManager extends TrustManager
{
  public abstract void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
    throws CertificateException;

  public abstract void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
    throws CertificateException;

  public abstract X509Certificate[] getAcceptedIssuers();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.net.ssl.X509TrustManager
 * JD-Core Version:    0.6.2
 */