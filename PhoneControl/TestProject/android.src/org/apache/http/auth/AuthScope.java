/*    */ package org.apache.http.auth;
/*    */ 
/*    */ public class AuthScope
/*    */ {
/* 21 */   public static final String ANY_HOST = null;
/*    */   public static final int ANY_PORT = -1;
/* 21 */   public static final String ANY_REALM = null; public static final String ANY_SCHEME = null; public static final AuthScope ANY = null;
/*    */ 
/*    */   public AuthScope(String host, int port, String realm, String scheme)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public AuthScope(String host, int port, String realm) { throw new RuntimeException("Stub!"); } 
/*  6 */   public AuthScope(String host, int port) { throw new RuntimeException("Stub!"); } 
/*  7 */   public AuthScope(AuthScope authscope) { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getHost() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int getPort() { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getRealm() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getScheme() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int match(AuthScope that) { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 14 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.auth.AuthScope
 * JD-Core Version:    0.6.2
 */