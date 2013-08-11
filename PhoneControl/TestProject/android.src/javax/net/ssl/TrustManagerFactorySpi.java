/*   */ package javax.net.ssl;
/*   */ 
/*   */ import java.security.InvalidAlgorithmParameterException;
/*   */ import java.security.KeyStore;
/*   */ import java.security.KeyStoreException;
/*   */ 
/*   */ public abstract class TrustManagerFactorySpi
/*   */ {
/*   */   public TrustManagerFactorySpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract void engineInit(KeyStore paramKeyStore)
/*   */     throws KeyStoreException;
/*   */ 
/*   */   protected abstract void engineInit(ManagerFactoryParameters paramManagerFactoryParameters)
/*   */     throws InvalidAlgorithmParameterException;
/*   */ 
/*   */   protected abstract TrustManager[] engineGetTrustManagers();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.net.ssl.TrustManagerFactorySpi
 * JD-Core Version:    0.6.2
 */