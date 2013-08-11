/*   */ package java.security.cert;
/*   */ 
/*   */ import java.security.PublicKey;
/*   */ 
/*   */ public class PKIXCertPathBuilderResult extends PKIXCertPathValidatorResult
/*   */   implements CertPathBuilderResult
/*   */ {
/*   */   public PKIXCertPathBuilderResult(CertPath certPath, TrustAnchor trustAnchor, PolicyNode policyTree, PublicKey subjectPublicKey)
/*   */   {
/* 6 */     super((TrustAnchor)null, (PolicyNode)null, (PublicKey)null); throw new RuntimeException("Stub!"); } 
/* 7 */   public CertPath getCertPath() { throw new RuntimeException("Stub!"); } 
/* 8 */   public String toString() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.cert.PKIXCertPathBuilderResult
 * JD-Core Version:    0.6.2
 */