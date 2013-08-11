/*   */ package javax.crypto;
/*   */ 
/*   */ import java.security.InvalidAlgorithmParameterException;
/*   */ import java.security.SecureRandom;
/*   */ import java.security.spec.AlgorithmParameterSpec;
/*   */ 
/*   */ public abstract class KeyGeneratorSpi
/*   */ {
/*   */   public KeyGeneratorSpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract SecretKey engineGenerateKey();
/*   */ 
/*   */   protected abstract void engineInit(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom)
/*   */     throws InvalidAlgorithmParameterException;
/*   */ 
/*   */   protected abstract void engineInit(int paramInt, SecureRandom paramSecureRandom);
/*   */ 
/*   */   protected abstract void engineInit(SecureRandom paramSecureRandom);
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.crypto.KeyGeneratorSpi
 * JD-Core Version:    0.6.2
 */