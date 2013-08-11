/*   */ package java.security.cert;
/*   */ 
/*   */ import java.security.InvalidAlgorithmParameterException;
/*   */ 
/*   */ public abstract class CertPathValidatorSpi
/*   */ {
/*   */   public CertPathValidatorSpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract CertPathValidatorResult engineValidate(CertPath paramCertPath, CertPathParameters paramCertPathParameters)
/*   */     throws CertPathValidatorException, InvalidAlgorithmParameterException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.cert.CertPathValidatorSpi
 * JD-Core Version:    0.6.2
 */