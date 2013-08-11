/*   */ package javax.net.ssl;
/*   */ 
/*   */ import java.security.Principal;
/*   */ 
/*   */ public abstract class X509ExtendedKeyManager
/*   */   implements X509KeyManager
/*   */ {
/*   */   protected X509ExtendedKeyManager()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public String chooseEngineClientAlias(String[] keyType, Principal[] issuers, SSLEngine engine) { throw new RuntimeException("Stub!"); } 
/* 7 */   public String chooseEngineServerAlias(String keyType, Principal[] issuers, SSLEngine engine) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.net.ssl.X509ExtendedKeyManager
 * JD-Core Version:    0.6.2
 */