/*   */ package javax.net.ssl;
/*   */ 
/*   */ import javax.net.ServerSocketFactory;
/*   */ 
/*   */ public abstract class SSLServerSocketFactory extends ServerSocketFactory
/*   */ {
/*   */   protected SSLServerSocketFactory()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public static synchronized ServerSocketFactory getDefault() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract String[] getDefaultCipherSuites();
/*   */ 
/*   */   public abstract String[] getSupportedCipherSuites();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.net.ssl.SSLServerSocketFactory
 * JD-Core Version:    0.6.2
 */