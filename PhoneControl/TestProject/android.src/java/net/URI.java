/*    */ package java.net;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public final class URI
/*    */   implements Comparable<URI>, Serializable
/*    */ {
/*    */   public URI(String spec)
/*    */     throws URISyntaxException
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public URI(String scheme, String schemeSpecificPart, String fragment) throws URISyntaxException { throw new RuntimeException("Stub!"); } 
/*  7 */   public URI(String scheme, String userInfo, String host, int port, String path, String query, String fragment) throws URISyntaxException { throw new RuntimeException("Stub!"); } 
/*  8 */   public URI(String scheme, String host, String path, String fragment) throws URISyntaxException { throw new RuntimeException("Stub!"); } 
/*  9 */   public URI(String scheme, String authority, String path, String query, String fragment) throws URISyntaxException { throw new RuntimeException("Stub!"); } 
/* 10 */   public int compareTo(URI uri) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static URI create(String uri) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 13 */   public String getScheme() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String getSchemeSpecificPart() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String getRawSchemeSpecificPart() { throw new RuntimeException("Stub!"); } 
/* 16 */   public String getAuthority() { throw new RuntimeException("Stub!"); } 
/* 17 */   public String getRawAuthority() { throw new RuntimeException("Stub!"); } 
/* 18 */   public String getUserInfo() { throw new RuntimeException("Stub!"); } 
/* 19 */   public String getRawUserInfo() { throw new RuntimeException("Stub!"); } 
/* 20 */   public String getHost() { throw new RuntimeException("Stub!"); } 
/* 21 */   public int getPort() { throw new RuntimeException("Stub!"); } 
/* 22 */   public String getPath() { throw new RuntimeException("Stub!"); } 
/* 23 */   public String getRawPath() { throw new RuntimeException("Stub!"); } 
/* 24 */   public String getQuery() { throw new RuntimeException("Stub!"); } 
/* 25 */   public String getRawQuery() { throw new RuntimeException("Stub!"); } 
/* 26 */   public String getFragment() { throw new RuntimeException("Stub!"); } 
/* 27 */   public String getRawFragment() { throw new RuntimeException("Stub!"); } 
/* 28 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean isAbsolute() { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean isOpaque() { throw new RuntimeException("Stub!"); } 
/* 31 */   public URI normalize() { throw new RuntimeException("Stub!"); } 
/* 32 */   public URI parseServerAuthority() throws URISyntaxException { throw new RuntimeException("Stub!"); } 
/* 33 */   public URI relativize(URI relative) { throw new RuntimeException("Stub!"); } 
/* 34 */   public URI resolve(URI relative) { throw new RuntimeException("Stub!"); } 
/* 35 */   public URI resolve(String relative) { throw new RuntimeException("Stub!"); } 
/* 36 */   public String toASCIIString() { throw new RuntimeException("Stub!"); } 
/* 37 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 38 */   public URL toURL() throws MalformedURLException { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.net.URI
 * JD-Core Version:    0.6.2
 */