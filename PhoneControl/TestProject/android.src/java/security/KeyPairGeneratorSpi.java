/*   */ package java.security;
/*   */ 
/*   */ import java.security.spec.AlgorithmParameterSpec;
/*   */ 
/*   */ public abstract class KeyPairGeneratorSpi
/*   */ {
/*   */   public KeyPairGeneratorSpi()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/*   */   public abstract KeyPair generateKeyPair();
/*   */ 
/*   */   public abstract void initialize(int paramInt, SecureRandom paramSecureRandom);
/*   */ 
/* 7 */   public void initialize(AlgorithmParameterSpec params, SecureRandom random) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.KeyPairGeneratorSpi
 * JD-Core Version:    0.6.2
 */