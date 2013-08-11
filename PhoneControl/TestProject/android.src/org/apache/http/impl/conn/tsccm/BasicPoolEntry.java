/*   */ package org.apache.http.impl.conn.tsccm;
/*   */ 
/*   */ import java.lang.ref.ReferenceQueue;
/*   */ import org.apache.http.conn.ClientConnectionOperator;
/*   */ import org.apache.http.conn.OperatedClientConnection;
/*   */ import org.apache.http.conn.routing.HttpRoute;
/*   */ import org.apache.http.impl.conn.AbstractPoolEntry;
/*   */ 
/*   */ public class BasicPoolEntry extends AbstractPoolEntry
/*   */ {
/*   */   public BasicPoolEntry(ClientConnectionOperator op, HttpRoute route, ReferenceQueue<Object> queue)
/*   */   {
/* 5 */     super((ClientConnectionOperator)null, (HttpRoute)null); throw new RuntimeException("Stub!"); } 
/* 6 */   protected final OperatedClientConnection getConnection() { throw new RuntimeException("Stub!"); } 
/* 7 */   protected final HttpRoute getPlannedRoute() { throw new RuntimeException("Stub!"); } 
/* 8 */   protected final BasicPoolEntryRef getWeakRef() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.conn.tsccm.BasicPoolEntry
 * JD-Core Version:    0.6.2
 */