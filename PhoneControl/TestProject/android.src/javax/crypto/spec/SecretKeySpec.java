/*    */ package javax.crypto.spec;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.security.spec.KeySpec;
/*    */ import javax.crypto.SecretKey;
/*    */ 
/*    */ public class SecretKeySpec
/*    */   implements SecretKey, KeySpec, Serializable
/*    */ {
/*    */   public SecretKeySpec(byte[] key, String algorithm)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public SecretKeySpec(byte[] key, int offset, int len, String algorithm) { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getAlgorithm() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getFormat() { throw new RuntimeException("Stub!"); } 
/*  9 */   public byte[] getEncoded() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.crypto.spec.SecretKeySpec
 * JD-Core Version:    0.6.2
 */