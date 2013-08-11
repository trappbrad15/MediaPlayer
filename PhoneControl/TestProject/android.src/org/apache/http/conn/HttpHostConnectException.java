/*   */ package org.apache.http.conn;
/*   */ 
/*   */ import java.net.ConnectException;
/*   */ import org.apache.http.HttpHost;
/*   */ 
/*   */ public class HttpHostConnectException extends ConnectException
/*   */ {
/*   */   public HttpHostConnectException(HttpHost host, ConnectException cause)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public HttpHost getHost() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.conn.HttpHostConnectException
 * JD-Core Version:    0.6.2
 */