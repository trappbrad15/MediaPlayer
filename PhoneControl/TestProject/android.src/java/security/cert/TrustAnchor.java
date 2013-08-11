/*    */ package java.security.cert;
/*    */ 
/*    */ import java.security.PublicKey;
/*    */ import javax.security.auth.x500.X500Principal;
/*    */ 
/*    */ public class TrustAnchor
/*    */ {
/*    */   public TrustAnchor(X509Certificate trustedCert, byte[] nameConstraints)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public TrustAnchor(String caName, PublicKey caPublicKey, byte[] nameConstraints) { throw new RuntimeException("Stub!"); } 
/*  6 */   public TrustAnchor(X500Principal caPrincipal, PublicKey caPublicKey, byte[] nameConstraints) { throw new RuntimeException("Stub!"); } 
/*  7 */   public final byte[] getNameConstraints() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final X509Certificate getTrustedCert() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final X500Principal getCA() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final String getCAName() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final PublicKey getCAPublicKey() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.cert.TrustAnchor
 * JD-Core Version:    0.6.2
 */