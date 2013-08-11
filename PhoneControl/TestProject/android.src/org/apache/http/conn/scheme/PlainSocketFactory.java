/*    */ package org.apache.http.conn.scheme;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public final class PlainSocketFactory
/*    */   implements SocketFactory
/*    */ {
/*    */   public PlainSocketFactory(HostNameResolver nameResolver)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public PlainSocketFactory() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static PlainSocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); } 
/*  8 */   public Socket createSocket() { throw new RuntimeException("Stub!"); } 
/*  9 */   public Socket connectSocket(Socket sock, String host, int port, InetAddress localAddress, int localPort, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public final boolean isSecure(Socket sock) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.conn.scheme.PlainSocketFactory
 * JD-Core Version:    0.6.2
 */