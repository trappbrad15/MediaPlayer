/*   */ package javax.crypto;
/*   */ 
/*   */ import java.security.InvalidKeyException;
/*   */ import java.security.spec.InvalidKeySpecException;
/*   */ import java.security.spec.KeySpec;
/*   */ 
/*   */ public abstract class SecretKeyFactorySpi
/*   */ {
/*   */   public SecretKeyFactorySpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract SecretKey engineGenerateSecret(KeySpec paramKeySpec)
/*   */     throws InvalidKeySpecException;
/*   */ 
/*   */   protected abstract KeySpec engineGetKeySpec(SecretKey paramSecretKey, Class paramClass)
/*   */     throws InvalidKeySpecException;
/*   */ 
/*   */   protected abstract SecretKey engineTranslateKey(SecretKey paramSecretKey)
/*   */     throws InvalidKeyException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.crypto.SecretKeyFactorySpi
 * JD-Core Version:    0.6.2
 */