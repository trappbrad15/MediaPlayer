/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ public abstract class URLStreamHandler
/*    */ {
/*    */   public URLStreamHandler()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract URLConnection openConnection(URL paramURL) throws IOException;
/*    */ 
/*  6 */   protected URLConnection openConnection(URL u, Proxy proxy) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   protected void parseURL(URL url, String spec, int start, int end) { throw new RuntimeException("Stub!"); } 
/*  9 */   @Deprecated
/*    */   protected void setURL(URL u, String protocol, String host, int port, String file, String ref) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected void setURL(URL u, String protocol, String host, int port, String authority, String userInfo, String path, String query, String ref) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected String toExternalForm(URL url) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected boolean equals(URL a, URL b) { throw new RuntimeException("Stub!"); } 
/* 13 */   protected int getDefaultPort() { throw new RuntimeException("Stub!"); } 
/* 14 */   protected InetAddress getHostAddress(URL url) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected int hashCode(URL url) { throw new RuntimeException("Stub!"); } 
/* 16 */   protected boolean hostsEqual(URL a, URL b) { throw new RuntimeException("Stub!"); } 
/* 17 */   protected boolean sameFile(URL a, URL b) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.URLStreamHandler
 * JD-Core Version:    0.6.2
 */