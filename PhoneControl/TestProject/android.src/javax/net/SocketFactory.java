/*   */ package javax.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.net.InetAddress;
/*   */ import java.net.Socket;
/*   */ import java.net.UnknownHostException;
/*   */ 
/*   */ public abstract class SocketFactory
/*   */ {
/*   */   protected SocketFactory()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static synchronized SocketFactory getDefault() { throw new RuntimeException("Stub!"); } 
/* 6 */   public Socket createSocket() throws IOException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract Socket createSocket(String paramString, int paramInt)
/*   */     throws IOException, UnknownHostException;
/*   */ 
/*   */   public abstract Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2)
/*   */     throws IOException, UnknownHostException;
/*   */ 
/*   */   public abstract Socket createSocket(InetAddress paramInetAddress, int paramInt)
/*   */     throws IOException;
/*   */ 
/*   */   public abstract Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2)
/*   */     throws IOException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.net.SocketFactory
 * JD-Core Version:    0.6.2
 */