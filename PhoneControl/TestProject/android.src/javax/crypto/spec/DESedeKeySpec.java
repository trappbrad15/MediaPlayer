/*   */ package javax.crypto.spec;
/*   */ 
/*   */ import java.security.InvalidKeyException;
/*   */ import java.security.spec.KeySpec;
/*   */ 
/*   */ public class DESedeKeySpec
/*   */   implements KeySpec
/*   */ {
/*   */   public static final int DES_EDE_KEY_LEN = 24;
/*   */ 
/*   */   public DESedeKeySpec(byte[] key)
/*   */     throws InvalidKeyException
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public DESedeKeySpec(byte[] key, int offset) throws InvalidKeyException { throw new RuntimeException("Stub!"); } 
/* 7 */   public byte[] getKey() { throw new RuntimeException("Stub!"); } 
/* 8 */   public static boolean isParityAdjusted(byte[] key, int offset) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.crypto.spec.DESedeKeySpec
 * JD-Core Version:    0.6.2
 */