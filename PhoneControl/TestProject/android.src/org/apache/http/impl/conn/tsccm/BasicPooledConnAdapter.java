/*   */ package org.apache.http.impl.conn.tsccm;
/*   */ 
/*   */ import org.apache.http.conn.ClientConnectionManager;
/*   */ import org.apache.http.impl.conn.AbstractPoolEntry;
/*   */ import org.apache.http.impl.conn.AbstractPooledConnAdapter;
/*   */ 
/*   */ public class BasicPooledConnAdapter extends AbstractPooledConnAdapter
/*   */ {
/*   */   protected BasicPooledConnAdapter(ThreadSafeClientConnManager tsccm, AbstractPoolEntry entry)
/*   */   {
/* 5 */     super((ClientConnectionManager)null, (AbstractPoolEntry)null); throw new RuntimeException("Stub!"); } 
/* 6 */   protected ClientConnectionManager getManager() { throw new RuntimeException("Stub!"); } 
/* 7 */   protected AbstractPoolEntry getPoolEntry() { throw new RuntimeException("Stub!"); } 
/* 8 */   protected void detach() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter
 * JD-Core Version:    0.6.2
 */