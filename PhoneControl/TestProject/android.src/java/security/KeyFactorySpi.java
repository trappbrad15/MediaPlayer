/*   */ package java.security;
/*   */ 
/*   */ import java.security.spec.InvalidKeySpecException;
/*   */ import java.security.spec.KeySpec;
/*   */ 
/*   */ public abstract class KeyFactorySpi
/*   */ {
/*   */   public KeyFactorySpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract PublicKey engineGeneratePublic(KeySpec paramKeySpec)
/*   */     throws InvalidKeySpecException;
/*   */ 
/*   */   protected abstract PrivateKey engineGeneratePrivate(KeySpec paramKeySpec)
/*   */     throws InvalidKeySpecException;
/*   */ 
/*   */   protected abstract <T extends KeySpec> T engineGetKeySpec(Key paramKey, Class<T> paramClass)
/*   */     throws InvalidKeySpecException;
/*   */ 
/*   */   protected abstract Key engineTranslateKey(Key paramKey)
/*   */     throws InvalidKeyException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.KeyFactorySpi
 * JD-Core Version:    0.6.2
 */