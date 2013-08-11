/*   */ package org.apache.http.conn;
/*   */ 
/*   */ import java.io.InterruptedIOException;
/*   */ 
/*   */ public class ConnectTimeoutException extends InterruptedIOException
/*   */ {
/*   */   public ConnectTimeoutException()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public ConnectTimeoutException(String message) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.conn.ConnectTimeoutException
 * JD-Core Version:    0.6.2
 */