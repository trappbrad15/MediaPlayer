/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public final class URL
/*    */   implements Serializable
/*    */ {
/*    */   public URL(String spec)
/*    */     throws MalformedURLException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public URL(URL context, String spec) throws MalformedURLException { throw new RuntimeException("Stub!"); } 
/*  7 */   public URL(URL context, String spec, URLStreamHandler handler) throws MalformedURLException { throw new RuntimeException("Stub!"); } 
/*  8 */   public URL(String protocol, String host, String file) throws MalformedURLException { throw new RuntimeException("Stub!"); } 
/*  9 */   public URL(String protocol, String host, int port, String file) throws MalformedURLException { throw new RuntimeException("Stub!"); } 
/* 10 */   public URL(String protocol, String host, int port, String file, URLStreamHandler handler) throws MalformedURLException { throw new RuntimeException("Stub!"); } 
/* 11 */   public static synchronized void setURLStreamHandlerFactory(URLStreamHandlerFactory factory) { throw new RuntimeException("Stub!"); } 
/* 12 */   protected void set(String protocol, String host, int port, String file, String ref) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean sameFile(URL otherURL) { throw new RuntimeException("Stub!"); } 
/* 15 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 16 */   public final Object getContent() throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   public final Object getContent(Class[] types) throws IOException {
/* 18 */     throw new RuntimeException("Stub!"); } 
/* 19 */   public final InputStream openStream() throws IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public URLConnection openConnection() throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public URLConnection openConnection(Proxy proxy) throws IOException { throw new RuntimeException("Stub!"); } 
/* 22 */   public URI toURI() throws URISyntaxException { throw new RuntimeException("Stub!"); } 
/* 23 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 24 */   public String toExternalForm() { throw new RuntimeException("Stub!"); } 
/* 25 */   public String getProtocol() { throw new RuntimeException("Stub!"); } 
/* 26 */   public String getAuthority() { throw new RuntimeException("Stub!"); } 
/* 27 */   public String getUserInfo() { throw new RuntimeException("Stub!"); } 
/* 28 */   public String getHost() { throw new RuntimeException("Stub!"); } 
/* 29 */   public int getPort() { throw new RuntimeException("Stub!"); } 
/* 30 */   public int getDefaultPort() { throw new RuntimeException("Stub!"); } 
/* 31 */   public String getFile() { throw new RuntimeException("Stub!"); } 
/* 32 */   public String getPath() { throw new RuntimeException("Stub!"); } 
/* 33 */   public String getQuery() { throw new RuntimeException("Stub!"); } 
/* 34 */   public String getRef() { throw new RuntimeException("Stub!"); } 
/* 35 */   protected void set(String protocol, String host, int port, String authority, String userInfo, String path, String query, String ref) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.URL
 * JD-Core Version:    0.6.2
 */