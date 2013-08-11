/*   */ package org.apache.http.impl.conn;
/*   */ 
/*   */ import java.util.concurrent.TimeUnit;
/*   */ import org.apache.http.HttpConnection;
/*   */ 
/*   */ public class IdleConnectionHandler
/*   */ {
/*   */   public IdleConnectionHandler()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public void add(HttpConnection connection, long validDuration, TimeUnit unit) { throw new RuntimeException("Stub!"); } 
/* 6 */   public boolean remove(HttpConnection connection) { throw new RuntimeException("Stub!"); } 
/* 7 */   public void removeAll() { throw new RuntimeException("Stub!"); } 
/* 8 */   public void closeIdleConnections(long idleTime) { throw new RuntimeException("Stub!"); } 
/* 9 */   public void closeExpiredConnections() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.conn.IdleConnectionHandler
 * JD-Core Version:    0.6.2
 */