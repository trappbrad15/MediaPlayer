/*    */ package javax.crypto.spec;
/*    */ 
/*    */ import java.security.spec.KeySpec;
/*    */ 
/*    */ public class PBEKeySpec
/*    */   implements KeySpec
/*    */ {
/*    */   public PBEKeySpec(char[] password)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public PBEKeySpec(char[] password, byte[] salt, int iterationCount, int keyLength) { throw new RuntimeException("Stub!"); } 
/*  7 */   public PBEKeySpec(char[] password, byte[] salt, int iterationCount) { throw new RuntimeException("Stub!"); } 
/*  8 */   public final void clearPassword() { throw new RuntimeException("Stub!"); } 
/*  9 */   public final char[] getPassword() { throw new RuntimeException("Stub!"); } 
/* 10 */   public final byte[] getSalt() { throw new RuntimeException("Stub!"); } 
/* 11 */   public final int getIterationCount() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final int getKeyLength() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.crypto.spec.PBEKeySpec
 * JD-Core Version:    0.6.2
 */