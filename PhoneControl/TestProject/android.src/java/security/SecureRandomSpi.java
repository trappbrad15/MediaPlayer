/*   */ package java.security;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ 
/*   */ public abstract class SecureRandomSpi
/*   */   implements Serializable
/*   */ {
/*   */   public SecureRandomSpi()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   protected abstract void engineSetSeed(byte[] paramArrayOfByte);
/*   */ 
/*   */   protected abstract void engineNextBytes(byte[] paramArrayOfByte);
/*   */ 
/*   */   protected abstract byte[] engineGenerateSeed(int paramInt);
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.SecureRandomSpi
 * JD-Core Version:    0.6.2
 */