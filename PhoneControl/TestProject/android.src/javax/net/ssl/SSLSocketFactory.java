/*   */ package javax.net.ssl;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.net.Socket;
/*   */ import javax.net.SocketFactory;
/*   */ 
/*   */ public abstract class SSLSocketFactory extends SocketFactory
/*   */ {
/*   */   public SSLSocketFactory()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public static synchronized SocketFactory getDefault() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract String[] getDefaultCipherSuites();
/*   */ 
/*   */   public abstract String[] getSupportedCipherSuites();
/*   */ 
/*   */   public abstract Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
/*   */     throws IOException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.net.ssl.SSLSocketFactory
 * JD-Core Version:    0.6.2
 */