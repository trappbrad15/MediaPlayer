/*   */ package java.security.spec;
/*   */ 
/*   */ public abstract class EncodedKeySpec
/*   */   implements KeySpec
/*   */ {
/*   */   public EncodedKeySpec(byte[] encodedKey)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public byte[] getEncoded() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract String getFormat();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.spec.EncodedKeySpec
 * JD-Core Version:    0.6.2
 */