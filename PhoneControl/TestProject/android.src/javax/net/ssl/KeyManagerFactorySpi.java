/*   */ package javax.net.ssl;
/*   */ 
/*   */ import java.security.InvalidAlgorithmParameterException;
/*   */ import java.security.KeyStore;
/*   */ import java.security.KeyStoreException;
/*   */ import java.security.NoSuchAlgorithmException;
/*   */ import java.security.UnrecoverableKeyException;
/*   */ 
/*   */ public abstract class KeyManagerFactorySpi
/*   */ {
/*   */   public KeyManagerFactorySpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract void engineInit(KeyStore paramKeyStore, char[] paramArrayOfChar)
/*   */     throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException;
/*   */ 
/*   */   protected abstract void engineInit(ManagerFactoryParameters paramManagerFactoryParameters)
/*   */     throws InvalidAlgorithmParameterException;
/*   */ 
/*   */   protected abstract KeyManager[] engineGetKeyManagers();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.net.ssl.KeyManagerFactorySpi
 * JD-Core Version:    0.6.2
 */