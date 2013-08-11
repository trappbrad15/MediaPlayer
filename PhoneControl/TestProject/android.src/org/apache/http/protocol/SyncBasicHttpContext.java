/*   */ package org.apache.http.protocol;
/*   */ 
/*   */ public class SyncBasicHttpContext extends BasicHttpContext
/*   */ {
/*   */   public SyncBasicHttpContext(HttpContext parentContext)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public synchronized Object getAttribute(String id) { throw new RuntimeException("Stub!"); } 
/* 7 */   public synchronized void setAttribute(String id, Object obj) { throw new RuntimeException("Stub!"); } 
/* 8 */   public synchronized Object removeAttribute(String id) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.protocol.SyncBasicHttpContext
 * JD-Core Version:    0.6.2
 */