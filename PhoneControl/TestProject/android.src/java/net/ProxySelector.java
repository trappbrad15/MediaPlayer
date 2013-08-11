/*   */ package java.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.util.List;
/*   */ 
/*   */ public abstract class ProxySelector
/*   */ {
/*   */   public ProxySelector()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static ProxySelector getDefault() { throw new RuntimeException("Stub!"); } 
/* 6 */   public static void setDefault(ProxySelector selector) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract List<Proxy> select(URI paramURI);
/*   */ 
/*   */   public abstract void connectFailed(URI paramURI, SocketAddress paramSocketAddress, IOException paramIOException);
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.ProxySelector
 * JD-Core Version:    0.6.2
 */