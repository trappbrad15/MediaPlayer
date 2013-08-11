/*   */ package java.security.cert;
/*   */ 
/*   */ import java.security.InvalidAlgorithmParameterException;
/*   */ 
/*   */ public abstract class CertPathBuilderSpi
/*   */ {
/*   */   public CertPathBuilderSpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract CertPathBuilderResult engineBuild(CertPathParameters paramCertPathParameters)
/*   */     throws CertPathBuilderException, InvalidAlgorithmParameterException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.cert.CertPathBuilderSpi
 * JD-Core Version:    0.6.2
 */