/*   */ package java.security;
/*   */ 
/*   */ import java.security.spec.AlgorithmParameterSpec;
/*   */ 
/*   */ public abstract class AlgorithmParameterGeneratorSpi
/*   */ {
/*   */   public AlgorithmParameterGeneratorSpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract void engineInit(int paramInt, SecureRandom paramSecureRandom);
/*   */ 
/*   */   protected abstract void engineInit(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom)
/*   */     throws InvalidAlgorithmParameterException;
/*   */ 
/*   */   protected abstract AlgorithmParameters engineGenerateParameters();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.AlgorithmParameterGeneratorSpi
 * JD-Core Version:    0.6.2
 */