/*   */ package java.net;
/*   */ 
/*   */ import java.security.Principal;
/*   */ import java.security.cert.Certificate;
/*   */ import java.util.List;
/*   */ import javax.net.ssl.SSLPeerUnverifiedException;
/*   */ 
/*   */ public abstract class SecureCacheResponse extends CacheResponse
/*   */ {
/*   */   public SecureCacheResponse()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract String getCipherSuite();
/*   */ 
/*   */   public abstract List<Certificate> getLocalCertificateChain();
/*   */ 
/*   */   public abstract List<Certificate> getServerCertificateChain()
/*   */     throws SSLPeerUnverifiedException;
/*   */ 
/*   */   public abstract Principal getPeerPrincipal()
/*   */     throws SSLPeerUnverifiedException;
/*   */ 
/*   */   public abstract Principal getLocalPrincipal();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.SecureCacheResponse
 * JD-Core Version:    0.6.2
 */