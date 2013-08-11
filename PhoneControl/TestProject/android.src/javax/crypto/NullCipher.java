/*   */ package javax.crypto;
/*   */ 
/*   */ import java.security.Provider;
/*   */ 
/*   */ public class NullCipher extends Cipher
/*   */ {
/*   */   public NullCipher()
/*   */   {
/* 5 */     super((CipherSpi)null, (Provider)null, (String)null); throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.crypto.NullCipher
 * JD-Core Version:    0.6.2
 */