/*   */ package javax.crypto;
/*   */ 
/*   */ import java.security.InvalidAlgorithmParameterException;
/*   */ import java.security.InvalidKeyException;
/*   */ import java.security.Key;
/*   */ import java.security.NoSuchAlgorithmException;
/*   */ import java.security.SecureRandom;
/*   */ import java.security.spec.AlgorithmParameterSpec;
/*   */ 
/*   */ public abstract class KeyAgreementSpi
/*   */ {
/*   */   public KeyAgreementSpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract Key engineDoPhase(Key paramKey, boolean paramBoolean)
/*   */     throws InvalidKeyException, IllegalStateException;
/*   */ 
/*   */   protected abstract byte[] engineGenerateSecret()
/*   */     throws IllegalStateException;
/*   */ 
/*   */   protected abstract int engineGenerateSecret(byte[] paramArrayOfByte, int paramInt)
/*   */     throws IllegalStateException, ShortBufferException;
/*   */ 
/*   */   protected abstract SecretKey engineGenerateSecret(String paramString)
/*   */     throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException;
/*   */ 
/*   */   protected abstract void engineInit(Key paramKey, SecureRandom paramSecureRandom)
/*   */     throws InvalidKeyException;
/*   */ 
/*   */   protected abstract void engineInit(Key paramKey, AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom)
/*   */     throws InvalidKeyException, InvalidAlgorithmParameterException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.crypto.KeyAgreementSpi
 * JD-Core Version:    0.6.2
 */