/*    */ package org.apache.http.conn;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ import org.apache.http.conn.scheme.SocketFactory;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public final class MultihomePlainSocketFactory
/*    */   implements SocketFactory
/*    */ {
/*    */   MultihomePlainSocketFactory()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static MultihomePlainSocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); } 
/*  7 */   public Socket createSocket() { throw new RuntimeException("Stub!"); } 
/*  8 */   public Socket connectSocket(Socket sock, String host, int port, InetAddress localAddress, int localPort, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public final boolean isSecure(Socket sock) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.conn.MultihomePlainSocketFactory
 * JD-Core Version:    0.6.2
 */