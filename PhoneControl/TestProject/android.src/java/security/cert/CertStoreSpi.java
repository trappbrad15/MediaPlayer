/*   */ package java.security.cert;
/*   */ 
/*   */ import java.security.InvalidAlgorithmParameterException;
/*   */ import java.util.Collection;
/*   */ 
/*   */ public abstract class CertStoreSpi
/*   */ {
/*   */   public CertStoreSpi(CertStoreParameters params)
/*   */     throws InvalidAlgorithmParameterException
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract Collection<? extends Certificate> engineGetCertificates(CertSelector paramCertSelector)
/*   */     throws CertStoreException;
/*   */ 
/*   */   public abstract Collection<? extends CRL> engineGetCRLs(CRLSelector paramCRLSelector)
/*   */     throws CertStoreException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.cert.CertStoreSpi
 * JD-Core Version:    0.6.2
 */