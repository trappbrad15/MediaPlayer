/*   */ package javax.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.net.InetAddress;
/*   */ import java.net.ServerSocket;
/*   */ 
/*   */ public abstract class ServerSocketFactory
/*   */ {
/*   */   protected ServerSocketFactory()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static synchronized ServerSocketFactory getDefault() { throw new RuntimeException("Stub!"); } 
/* 6 */   public ServerSocket createServerSocket() throws IOException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract ServerSocket createServerSocket(int paramInt)
/*   */     throws IOException;
/*   */ 
/*   */   public abstract ServerSocket createServerSocket(int paramInt1, int paramInt2)
/*   */     throws IOException;
/*   */ 
/*   */   public abstract ServerSocket createServerSocket(int paramInt1, int paramInt2, InetAddress paramInetAddress)
/*   */     throws IOException;
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.net.ServerSocketFactory
 * JD-Core Version:    0.6.2
 */