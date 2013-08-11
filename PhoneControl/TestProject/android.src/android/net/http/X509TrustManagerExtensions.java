/*   */ package android.net.http;
/*   */ 
/*   */ import java.security.cert.CertificateException;
/*   */ import java.security.cert.X509Certificate;
/*   */ import java.util.List;
/*   */ import javax.net.ssl.X509TrustManager;
/*   */ 
/*   */ public class X509TrustManagerExtensions
/*   */ {
/*   */   public X509TrustManagerExtensions(X509TrustManager tm)
/*   */     throws IllegalArgumentException
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public List<X509Certificate> checkServerTrusted(X509Certificate[] chain, String authType, String host) throws CertificateException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.net.http.X509TrustManagerExtensions
 * JD-Core Version:    0.6.2
 */