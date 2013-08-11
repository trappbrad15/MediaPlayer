/*   */ package javax.crypto.spec;
/*   */ 
/*   */ import java.math.BigInteger;
/*   */ import java.security.spec.AlgorithmParameterSpec;
/*   */ 
/*   */ public class DHParameterSpec
/*   */   implements AlgorithmParameterSpec
/*   */ {
/*   */   public DHParameterSpec(BigInteger p, BigInteger g)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public DHParameterSpec(BigInteger p, BigInteger g, int l) { throw new RuntimeException("Stub!"); } 
/* 7 */   public BigInteger getP() { throw new RuntimeException("Stub!"); } 
/* 8 */   public BigInteger getG() { throw new RuntimeException("Stub!"); } 
/* 9 */   public int getL() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.crypto.spec.DHParameterSpec
 * JD-Core Version:    0.6.2
 */